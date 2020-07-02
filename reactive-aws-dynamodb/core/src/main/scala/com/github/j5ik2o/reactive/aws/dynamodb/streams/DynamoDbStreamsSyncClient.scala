// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.streams

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.streams.{ DynamoDbStreamsClient => JavaDynamoDbStreamsClient }
import software.amazon.awssdk.services.dynamodb.streams.paginators._

object DynamoDbStreamsSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaDynamoDbStreamsClient): DynamoDbStreamsSyncClient =
    new DynamoDbStreamsSyncClient {
      override val underlying: JavaDynamoDbStreamsClient = javaClient
    }

}

trait DynamoDbStreamsSyncClient extends DynamoDbStreamsClient[Either[Throwable, ?]] {
  val underlying: JavaDynamoDbStreamsClient
  import DynamoDbStreamsSyncClient._

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Either[Throwable, DescribeStreamResponse] =
    underlying.describeStream(describeStreamRequest).toEither

  def describeStreamPaginator(describeStreamRequest: DescribeStreamRequest): DescribeStreamIterable =
    underlying.describeStreamPaginator(describeStreamRequest)

  override def getRecords(getRecordsRequest: GetRecordsRequest): Either[Throwable, GetRecordsResponse] =
    underlying.getRecords(getRecordsRequest).toEither

  override def getShardIterator(
      getShardIteratorRequest: GetShardIteratorRequest
  ): Either[Throwable, GetShardIteratorResponse] =
    underlying.getShardIterator(getShardIteratorRequest).toEither

  override def listStreams(): Either[Throwable, ListStreamsResponse] =
    underlying.listStreams().toEither

  override def listStreams(listStreamsRequest: ListStreamsRequest): Either[Throwable, ListStreamsResponse] =
    underlying.listStreams(listStreamsRequest).toEither

  def listStreamsPaginator(): ListStreamsIterable =
    underlying.listStreamsPaginator()

  def listStreamsPaginator(listStreamsRequest: ListStreamsRequest): ListStreamsIterable =
    underlying.listStreamsPaginator(listStreamsRequest)

}
