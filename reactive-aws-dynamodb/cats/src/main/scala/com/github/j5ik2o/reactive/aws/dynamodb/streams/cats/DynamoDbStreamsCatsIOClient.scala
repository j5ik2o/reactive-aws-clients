// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.streams.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.dynamodb.streams.{ DynamoDbStreamsAsyncClient, DynamoDbStreamsClient }
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.streams.paginators.{ DescribeStreamPublisher, ListStreamsPublisher }

import scala.concurrent.{ ExecutionContext, Future }

object DynamoDbStreamsCatsIOClient {

  def apply(asyncClient: DynamoDbStreamsAsyncClient)(implicit ec: ExecutionContext): DynamoDbStreamsCatsIOClient =
    new DynamoDbStreamsCatsIOClient {
      override val executionContext: ExecutionContext     = ec
      override val underlying: DynamoDbStreamsAsyncClient = asyncClient
    }

}

trait DynamoDbStreamsCatsIOClient extends DynamoDbStreamsClient[IO] {

  val underlying: DynamoDbStreamsAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def describeStream(describeStreamRequest: DescribeStreamRequest): IO[DescribeStreamResponse] =
    IO.fromFuture {
      IO(underlying.describeStream(describeStreamRequest))
    }

  def describeStreamPaginator(describeStreamRequest: DescribeStreamRequest): DescribeStreamPublisher =
    underlying.describeStreamPaginator(describeStreamRequest)

  override def getRecords(getRecordsRequest: GetRecordsRequest): IO[GetRecordsResponse] =
    IO.fromFuture {
      IO(underlying.getRecords(getRecordsRequest))
    }

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): IO[GetShardIteratorResponse] =
    IO.fromFuture {
      IO(underlying.getShardIterator(getShardIteratorRequest))
    }

  override def listStreams(listStreamsRequest: ListStreamsRequest): IO[ListStreamsResponse] =
    IO.fromFuture {
      IO(underlying.listStreams(listStreamsRequest))
    }

  override def listStreams(): IO[ListStreamsResponse] =
    IO.fromFuture {
      IO(underlying.listStreams())
    }

  def listStreamsPaginator(): ListStreamsPublisher =
    underlying.listStreamsPaginator()

  def listStreamsPaginator(listStreamsRequest: ListStreamsRequest): ListStreamsPublisher =
    underlying.listStreamsPaginator(listStreamsRequest)

}
