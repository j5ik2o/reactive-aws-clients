package com.github.j5ik2o.reactive.aws.kinesis

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs.ListStreamConsumersPublisher
import com.github.j5ik2o.reactive.aws.kinesis.model.v2.rs.ListStreamConsumersPublisherImpl
import software.amazon.awssdk.services.kinesis.KinesisAsyncClient

import scala.concurrent.{ ExecutionContext, Future }

private[kinesis] class KinesisAsyncClientV2Impl(override val underlying: KinesisAsyncClient)(
    implicit ec: ExecutionContext
) extends KinesisAsyncClientV2 {

  import KinesisAsyncClientV2._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.AddTagsToStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.AddTagsToStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.CreateStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.CreateStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DecreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DecreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DeleteStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DeleteStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DeregisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DeregisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeStreamSummaryRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DescribeStreamSummaryResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DisableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.DisableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.EnableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.EnableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.GetRecordsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.GetRecordsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.GetShardIteratorRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.GetShardIteratorResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.IncreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.IncreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListShardsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListShardsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListStreamConsumersRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListStreamConsumersResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListStreamsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListStreamsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListTagsForStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListTagsForStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.MergeShardsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.MergeShardsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.PutRecordRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.PutRecordResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.PutRecordsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.PutRecordsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.RegisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.RegisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.RemoveTagsFromStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.RemoveTagsFromStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.SplitShardRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.SplitShardResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.StartStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.StartStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.StopStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.StopStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.UpdateShardCountRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.UpdateShardCountResponseOps._

  override def addTagsToStream(request: AddTagsToStreamRequest): Future[AddTagsToStreamResponse] =
    underlying.addTagsToStream(request.toJava).toFuture.map(_.toScala)

  override def createStream(request: CreateStreamRequest): Future[CreateStreamResponse] =
    underlying.createStream(request.toJava).toFuture.map(_.toScala)

  override def decreaseStreamRetentionPeriod(
      request: DecreaseStreamRetentionPeriodRequest
  ): Future[DecreaseStreamRetentionPeriodResponse] =
    underlying.decreaseStreamRetentionPeriod(request.toJava).toFuture.map(_.toScala)

  override def deleteStream(request: DeleteStreamRequest): Future[DeleteStreamResponse] =
    underlying.deleteStream(request.toJava).toFuture.map(_.toScala)

  override def deregisterStreamConsumer(
      request: DeregisterStreamConsumerRequest
  ): Future[DeregisterStreamConsumerResponse] =
    underlying.deregisterStreamConsumer(request.toJava).toFuture.map(_.toScala)

  override def describeLimits(request: DescribeLimitsRequest): Future[DescribeLimitsResponse] =
    underlying.describeLimits(request.toJava).toFuture.map(_.toScala)

  override def describeStream(request: DescribeStreamRequest): Future[DescribeStreamResponse] =
    underlying.describeStream(request.toJava).toFuture.map(_.toScala)

  override def describeStreamConsumer(request: DescribeStreamConsumerRequest): Future[DescribeStreamConsumerResponse] =
    underlying.describeStreamConsumer(request.toJava).toFuture.map(_.toScala)

  override def describeStreamSummary(request: DescribeStreamSummaryRequest): Future[DescribeStreamSummaryResponse] =
    underlying.describeStreamSummary(request.toJava).toFuture.map(_.toScala)

  override def disableEnhancedMonitoring(
      request: DisableEnhancedMonitoringRequest
  ): Future[DisableEnhancedMonitoringResponse] =
    underlying.disableEnhancedMonitoring(request.toJava).toFuture.map(_.toScala)

  override def enableEnhancedMonitoring(
      request: EnableEnhancedMonitoringRequest
  ): Future[EnableEnhancedMonitoringResponse] =
    underlying.enableEnhancedMonitoring(request.toJava).toFuture.map(_.toScala)

  override def getRecords(request: GetRecordsRequest): Future[GetRecordsResponse] =
    underlying.getRecords(request.toJava).toFuture.map(_.toScala)

  override def getShardIterator(request: GetShardIteratorRequest): Future[GetShardIteratorResponse] =
    underlying.getShardIterator(request.toJava).toFuture.map(_.toScala)

  override def increaseStreamRetentionPeriod(
      request: IncreaseStreamRetentionPeriodRequest
  ): Future[IncreaseStreamRetentionPeriodResponse] =
    underlying.increaseStreamRetentionPeriod(request.toJava).toFuture.map(_.toScala)

  override def listShards(request: ListShardsRequest): Future[ListShardsResponse] =
    underlying.listShards(request.toJava).toFuture.map(_.toScala)

  override def listStreamConsumers(request: ListStreamConsumersRequest): Future[ListStreamConsumersResponse] =
    underlying.listStreamConsumers(request.toJava).toFuture.map(_.toScala)

  override def listStreamConsumersPaginator(request: ListStreamConsumersRequest): ListStreamConsumersPublisher =
    new ListStreamConsumersPublisherImpl(underlying.listStreamConsumersPaginator(request.toJava))

  override def listStreams(request: ListStreamsRequest): Future[ListStreamsResponse] =
    underlying.listStreams(request.toJava).toFuture.map(_.toScala)

  override def listTagsForStream(request: ListTagsForStreamRequest): Future[ListTagsForStreamResponse] =
    underlying.listTagsForStream(request.toJava).toFuture.map(_.toScala)

  override def mergeShards(request: MergeShardsRequest): Future[MergeShardsResponse] =
    underlying.mergeShards(request.toJava).toFuture.map(_.toScala)

  override def putRecord(request: PutRecordRequest): Future[PutRecordResponse] =
    underlying.putRecord(request.toJava).toFuture.map(_.toScala)

  override def putRecords(request: PutRecordsRequest): Future[PutRecordsResponse] =
    underlying.putRecords(request.toJava).toFuture.map(_.toScala)

  override def registerStreamConsumer(request: RegisterStreamConsumerRequest): Future[RegisterStreamConsumerResponse] =
    underlying.registerStreamConsumer(request.toJava).toFuture.map(_.toScala)

  override def removeTagsFromStream(request: RemoveTagsFromStreamRequest): Future[RemoveTagsFromStreamResponse] =
    underlying.removeTagsFromStream(request.toJava).toFuture.map(_.toScala)

  override def splitShard(request: SplitShardRequest): Future[SplitShardResponse] =
    underlying.splitShard(request.toJava).toFuture.map(_.toScala)

  override def startStreamEncryption(request: StartStreamEncryptionRequest): Future[StartStreamEncryptionResponse] =
    underlying.startStreamEncryption(request.toJava).toFuture.map(_.toScala)

  override def stopStreamEncryption(request: StopStreamEncryptionRequest): Future[StopStreamEncryptionResponse] =
    underlying.stopStreamEncryption(request.toJava).toFuture.map(_.toScala)

  override def updateShardCount(
      request: UpdateShardCountRequest
  ): Future[UpdateShardCountResponse] = underlying.updateShardCount(request.toJava).toFuture.map(_.toScala)
}
