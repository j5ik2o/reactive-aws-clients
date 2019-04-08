// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.streams.monix

import com.github.j5ik2o.reactive.aws.dynamodb.streams.{ DynamoDbStreamsAsyncClient, DynamoDbStreamsClient }
import monix.eval.Task
import monix.reactive.Observable
import software.amazon.awssdk.services.dynamodb.model._

object DynamoDbStreamsMonixClient {

  def apply(underlying: DynamoDbStreamsAsyncClient): DynamoDbStreamsMonixClient =
    new DynamoDbStreamsMonixClientImpl(underlying)

}

trait DynamoDbStreamsMonixClient extends DynamoDbStreamsClient[Task] {

  val underlying: DynamoDbStreamsAsyncClient

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Task[DescribeStreamResponse] =
    Task.deferFuture {
      underlying.describeStream(describeStreamRequest)
    }

  def describeStreamPaginator(describeStreamRequest: DescribeStreamRequest): Observable[DescribeStreamResponse] =
    Observable.fromReactivePublisher(underlying.describeStreamPaginator(describeStreamRequest))

  override def getRecords(getRecordsRequest: GetRecordsRequest): Task[GetRecordsResponse] =
    Task.deferFuture {
      underlying.getRecords(getRecordsRequest)
    }

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): Task[GetShardIteratorResponse] =
    Task.deferFuture {
      underlying.getShardIterator(getShardIteratorRequest)
    }

  override def listStreams(listStreamsRequest: ListStreamsRequest): Task[ListStreamsResponse] =
    Task.deferFuture {
      underlying.listStreams(listStreamsRequest)
    }

  override def listStreams(): Task[ListStreamsResponse] =
    Task.deferFuture {
      underlying.listStreams()
    }

  def listStreamsPaginator(): Observable[ListStreamsResponse] =
    Observable.fromReactivePublisher(underlying.listStreamsPaginator())

  def listStreamsPaginator(listStreamsRequest: ListStreamsRequest): Observable[ListStreamsResponse] =
    Observable.fromReactivePublisher(underlying.listStreamsPaginator(listStreamsRequest))

}
