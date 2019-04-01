package com.github.j5ik2o.reactive.aws.model

import java.io.File
import java.nio.ByteBuffer
import java.nio.file.Path
import java.util.concurrent.CompletableFuture
import java.util.function.BiConsumer

import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.core.async.{ SdkPublisher, AsyncResponseTransformer => JavaAsyncResponseTransformer }
import software.amazon.awssdk.core.{ ResponseBytes => JavaResponseBytes }

import scala.collection.mutable.ArrayBuffer
import scala.compat.java8.FunctionConverters._
import scala.compat.java8.FutureConverters._
import scala.concurrent.{ Future, Promise }

trait AsyncResponseTransformer[A, Result] {
  self =>
  def prepare(): Future[Result]
  def onResponse(response: A): Unit
  def onStream(publisher: Publisher[ByteBuffer]): Unit
  def exceptionOccurred(error: Throwable): Unit
  def toJava: JavaAsyncResponseTransformer[A, Result] =
    new JavaAsyncResponseTransformer[A, Result] {
      override def prepare(): CompletableFuture[Result]                = self.prepare().toJava.toCompletableFuture
      override def onResponse(response: A): Unit                       = self.onResponse(response)
      override def onStream(publisher: SdkPublisher[ByteBuffer]): Unit = self.onStream(publisher)
      override def exceptionOccurred(error: Throwable): Unit           = self.exceptionOccurred(error)
    }
}

@SuppressWarnings(
  Array("org.wartremover.warts.Equals",
        "org.wartremover.warts.MutableDataStructures",
        "org.wartremover.warts.Null",
        "org.wartremover.warts.Var")
)
object AsyncResponseTransformers {

  def toFile[A](file: File): AsyncResponseTransformer[A, A] = new AsyncResponseTransformer[A, A] {
    override def toJava: JavaAsyncResponseTransformer[A, A]       = JavaAsyncResponseTransformer.toFile[A](file)
    override def prepare(): Future[A]                             = toJava.prepare().toScala
    override def onResponse(response: A): Unit                    = toJava.onResponse(response)
    override def onStream(publisher: Publisher[ByteBuffer]): Unit = toJava.onStream(SdkPublisher.adapt(publisher))
    override def exceptionOccurred(error: Throwable): Unit        = toJava.exceptionOccurred(error)
  }

  def toFile[A](file: Path): AsyncResponseTransformer[A, A] = new AsyncResponseTransformer[A, A] {
    override def toJava: JavaAsyncResponseTransformer[A, A]       = JavaAsyncResponseTransformer.toFile[A](file)
    override def prepare(): Future[A]                             = toJava.prepare().toScala
    override def onResponse(response: A): Unit                    = toJava.onResponse(response)
    override def onStream(publisher: Publisher[ByteBuffer]): Unit = toJava.onStream(SdkPublisher.adapt(publisher))
    override def exceptionOccurred(error: Throwable): Unit        = toJava.exceptionOccurred(error)
  }

  def toBytes[A]: AsyncResponseTransformer[A, ResponseBytes[A]] =
    new AsyncResponseTransformer[A, ResponseBytes[A]] {
      private val java =
        JavaAsyncResponseTransformer.toBytes[A]
      override def prepare(): Future[ResponseBytes[A]] = {
        val p = Promise[ResponseBytes[A]]()
        java
          .prepare().whenCompleteAsync(
            new BiConsumer[JavaResponseBytes[A], Throwable] {
              override def accept(t: JavaResponseBytes[A], u: Throwable): Unit = {
                if (u != null)
                  p.failure(u)
                else
                  p.success(ResponseBytes(t.response(), t.asByteArray()))
              }
            }
          )
        p.future
      }
      override def onResponse(response: A): Unit                    = java.onResponse(response)
      override def onStream(publisher: Publisher[ByteBuffer]): Unit = java.onStream(SdkPublisher.adapt(publisher))
      override def exceptionOccurred(error: Throwable): Unit        = java.exceptionOccurred(error)
    }

  def toIterableArrayBytes[A]: AsyncResponseTransformer[A, ResponseWithIterable[A]] =
    new AsyncResponseTransformer[A, ResponseWithIterable[A]] { self =>
      override def toJava: ToArrayBytes[A]                          = new ToArrayBytes[A]
      override def prepare(): Future[ResponseWithIterable[A]]       = toJava.prepare().toScala
      override def onResponse(response: A): Unit                    = toJava.onResponse(response)
      override def onStream(publisher: Publisher[ByteBuffer]): Unit = toJava.onStream(SdkPublisher.adapt(publisher))
      override def exceptionOccurred(error: Throwable): Unit        = toJava.exceptionOccurred(error)
    }

  private class ToArrayBytes[A] extends JavaAsyncResponseTransformer[A, ResponseWithIterable[A]] {

    private val buffer                      = ArrayBuffer.empty[Array[Byte]]
    private var cf: CompletableFuture[Unit] = new CompletableFuture[Unit]
    private var response: A                 = _

    override def prepare(): CompletableFuture[ResponseWithIterable[A]] = {
      cf.thenApply(((_: Unit) => ResponseWithIterable(response, buffer)).asJava)
    }

    override def onResponse(response: A): Unit = {
      this.response = response
    }

    override def onStream(publisher: SdkPublisher[ByteBuffer]): Unit = {
      publisher.subscribe(new Source(cf))
      cf.complete(())
    }

    override def exceptionOccurred(error: Throwable): Unit = {
      cf.completeExceptionally(error)
    }

    class Source(resultFuture: CompletableFuture[Unit]) extends Subscriber[ByteBuffer] {
      private var subscription: Subscription = _

      override def onSubscribe(s: Subscription): Unit = {
        if (this.subscription != null) {
          s.cancel()
        } else {
          this.subscription = s
          subscription.request(Long.MaxValue)
        }
      }

      override def onNext(t: ByteBuffer): Unit = {
        buffer.append(t.array())
        subscription.request(1)
      }

      override def onError(t: Throwable): Unit = {
//        resultFuture.completeExceptionally(t)
      }

      override def onComplete(): Unit = {
//        resultFuture.complete(())
      }
    }
  }

}
