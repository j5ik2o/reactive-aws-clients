package com.github.j5ik2o.reactive.aws.kinesis

import java.util.concurrent.{ ExecutionException, Future => JavaFuture }

import com.amazonaws.services.kinesis.AmazonKinesisAsync

import scala.concurrent.{ ExecutionContext, Future, Promise }
import scala.util.{ Failure, Try }

object KinesisAsyncClientV1 {

  def apply(underlying: AmazonKinesisAsync)(implicit ec: ExecutionContext): KinesisAsyncClientV1 =
    new KinesisAsyncClientV1Impl(underlying)

  implicit class JavaFutureOps[A](val jf: JavaFuture[A]) extends AnyVal {
    def toFuture(implicit ec: ExecutionContext): Future[A] = {
      val promise = Promise[A]()
      ec.execute(new Runnable {
        override def run(): Unit = {
          promise.complete(
            Try(jf.get()) match {
              case Failure(e: ExecutionException) =>
                Failure(e.getCause)
              case x =>
                x
            }
          )

        }
      })
      promise.future
    }
  }

}

trait KinesisAsyncClientV1 extends KinesisClient[Future] {
  val underlying: AmazonKinesisAsync
}
