// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.streams.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dynamodb.streams.DynamoDbStreamsAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

import scala.concurrent.Future

object DynamoDbStreamsAkkaClient {

  def apply(asyncClient: DynamoDbStreamsAsyncClient): DynamoDbStreamsAkkaClient = new DynamoDbStreamsAkkaClient {
    override val underlying: DynamoDbStreamsAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait DynamoDbStreamsAkkaClient {

  import DynamoDbStreamsAkkaClient._

  val underlying: DynamoDbStreamsAsyncClient

  def describeStreamSource(describeStreamRequest: DescribeStreamRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeStreamResponse, NotUsed] =
    Source.single(describeStreamRequest).via(describeStreamFlow(parallelism))

  def describeStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStreamRequest, DescribeStreamResponse, NotUsed] =
    Flow[DescribeStreamRequest].mapAsync(parallelism) { describeStreamRequest =>
      underlying.describeStream(describeStreamRequest)
    }

  def describeStreamPaginatorFlow: Flow[DescribeStreamRequest, DescribeStreamResponse, NotUsed] =
    Flow[DescribeStreamRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeStreamPaginator(request))
    }

  def getRecordsSource(getRecordsRequest: GetRecordsRequest,
                       parallelism: Int = DefaultParallelism): Source[GetRecordsResponse, NotUsed] =
    Source.single(getRecordsRequest).via(getRecordsFlow(parallelism))

  def getRecordsFlow(parallelism: Int = DefaultParallelism): Flow[GetRecordsRequest, GetRecordsResponse, NotUsed] =
    Flow[GetRecordsRequest].mapAsync(parallelism) { getRecordsRequest =>
      underlying.getRecords(getRecordsRequest)
    }

  def getShardIteratorSource(getShardIteratorRequest: GetShardIteratorRequest,
                             parallelism: Int = DefaultParallelism): Source[GetShardIteratorResponse, NotUsed] =
    Source.single(getShardIteratorRequest).via(getShardIteratorFlow(parallelism))

  def getShardIteratorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetShardIteratorRequest, GetShardIteratorResponse, NotUsed] =
    Flow[GetShardIteratorRequest].mapAsync(parallelism) { getShardIteratorRequest =>
      underlying.getShardIterator(getShardIteratorRequest)
    }

  def listStreamsSource(listStreamsRequest: ListStreamsRequest,
                        parallelism: Int = DefaultParallelism): Source[ListStreamsResponse, NotUsed] =
    Source.single(listStreamsRequest).via(listStreamsFlow(parallelism))

  def listStreamsFlow(parallelism: Int = DefaultParallelism): Flow[ListStreamsRequest, ListStreamsResponse, NotUsed] =
    Flow[ListStreamsRequest].mapAsync(parallelism) { listStreamsRequest =>
      underlying.listStreams(listStreamsRequest)
    }

  def listStreamsSource(): Source[ListStreamsResponse, NotUsed] =
    Source.fromFuture(underlying.listStreams())

  def listStreamsPaginatorSource: Source[ListStreamsResponse, NotUsed] =
    Source.fromPublisher(underlying.listStreamsPaginator())

  def listStreamsPaginatorFlow: Flow[ListStreamsRequest, ListStreamsResponse, NotUsed] =
    Flow[ListStreamsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listStreamsPaginator(request))
    }

}
