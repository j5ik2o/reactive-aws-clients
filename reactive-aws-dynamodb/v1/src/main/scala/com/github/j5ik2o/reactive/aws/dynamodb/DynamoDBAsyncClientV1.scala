package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.concurrent.{ CompletableFuture, Future => JavaFuture }
import java.util.function.Supplier

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object DynamoDBAsyncClientV1 {

  def apply(underlying: AmazonDynamoDBAsync)(implicit ec: ExecutionContext): DynamoDBAsyncClientV1 =
    new DynamoDBAsyncClientV1Impl(underlying)

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

trait DynamoDBAsyncClientV1 extends DynamoDBClient[Future] {
  val underlying: AmazonDynamoDBAsync
}
