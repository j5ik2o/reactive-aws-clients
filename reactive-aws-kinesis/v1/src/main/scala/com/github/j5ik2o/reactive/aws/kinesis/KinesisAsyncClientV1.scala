package com.github.j5ik2o.reactive.aws.kinesis

import java.util.concurrent.{ CompletableFuture, Future => JavaFuture }
import java.util.function.Supplier

import com.amazonaws.services.kinesis.AmazonKinesisAsync

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object KinesisAsyncClientV1 {

  def apply(underlying: AmazonKinesisAsync)(implicit ec: ExecutionContext): KinesisAsyncClientV1 =
    new KinesisAsyncClientV1Impl(underlying)

  implicit class JavaFutureOps[A](val jf: JavaFuture[A]) extends AnyVal {
    def toFuture: Future[A] = {
      FutureConverters.toScala(
        CompletableFuture.supplyAsync(new Supplier[A] {
          override def get(): A = jf.get()
        })
      )
    }
  }

}

trait KinesisAsyncClientV1 extends KinesisClient[Future] {
  val underlying: AmazonKinesisAsync
}
