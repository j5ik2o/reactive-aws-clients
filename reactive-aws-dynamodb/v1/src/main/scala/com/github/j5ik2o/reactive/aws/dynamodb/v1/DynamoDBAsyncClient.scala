package com.github.j5ik2o.reactive.aws.dynamodb.v1

import java.util.concurrent.{ CompletableFuture, Future => JavaFuture }
import java.util.function.Supplier

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object DynamoDBAsyncClient {

  def apply(underlying: AmazonDynamoDBAsync)(implicit ec: ExecutionContext): DynamoDBAsyncClient =
    new DynamoDBAsyncClientImpl(underlying)

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

trait DynamoDBAsyncClient extends DynamoDBClient[Future] {
  val underlying: AmazonDynamoDBAsync
}
