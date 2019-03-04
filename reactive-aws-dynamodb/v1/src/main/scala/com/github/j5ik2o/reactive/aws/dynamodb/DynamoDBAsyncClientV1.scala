package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.concurrent.{ ExecutionException, Future => JavaFuture }

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync

import scala.concurrent.{ ExecutionContext, Future, Promise }
import scala.util.{ Failure, Try }

object DynamoDBAsyncClientV1 {

  def apply(underlying: AmazonDynamoDBAsync)(implicit ec: ExecutionContext): DynamoDBAsyncClientV1 =
    new DynamoDBAsyncClientV1Impl(underlying)

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

trait DynamoDBAsyncClientV1 extends DynamoDBClient[Future] {
  val underlying: AmazonDynamoDBAsync
}
