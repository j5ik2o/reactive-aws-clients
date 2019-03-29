package com.github.j5ik2o.reactive.aws.kinesis.v1

import java.util.concurrent.{ CompletableFuture, Future => JavaFuture }
import java.util.function.Supplier

import com.amazonaws.services.kinesis.AmazonKinesisAsync
import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object KinesisAsyncClient {

  def apply(underlying: AmazonKinesisAsync)(implicit ec: ExecutionContext): KinesisAsyncClient =
    new KinesisAsyncClientImpl(underlying)

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

trait KinesisAsyncClient extends KinesisClient[Future] {
  val underlying: AmazonKinesisAsync
}
