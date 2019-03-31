package com.github.j5ik2o.reactive.aws.model

import java.nio.ByteBuffer
import java.util.concurrent.CompletableFuture

import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.core.async.{ AsyncResponseTransformer, SdkPublisher }

import scala.collection.mutable.ArrayBuffer
import scala.compat.java8.FunctionConverters._

@SuppressWarnings(
  Array("org.wartremover.warts.Equals",
        "org.wartremover.warts.MutableDataStructures",
        "org.wartremover.warts.Null",
        "org.wartremover.warts.Var")
)
object AsyncResponseTransformers {

  def toArrayBytes[A]: AsyncResponseTransformer[A, ResponseWithArrayBytes[A]] = new ToArrayBytes[A]()

  private class ToArrayBytes[A] extends AsyncResponseTransformer[A, ResponseWithArrayBytes[A]] {

    private val buffer                      = ArrayBuffer.empty[Array[Byte]]
    private var cf: CompletableFuture[Unit] = _
    private var response: A                 = _

    override def prepare(): CompletableFuture[ResponseWithArrayBytes[A]] = {
      cf = new CompletableFuture[Unit]
      cf.thenApply(((_: Unit) => ResponseWithArrayBytes(response, buffer)).asJava)
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
        // resultFuture.completeExceptionally(t)
      }

      override def onComplete(): Unit = {
        // resultFuture.complete(())
      }
    }
  }

}
