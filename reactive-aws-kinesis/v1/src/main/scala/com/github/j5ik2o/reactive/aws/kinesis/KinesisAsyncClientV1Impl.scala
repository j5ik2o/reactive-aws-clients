package com.github.j5ik2o.reactive.aws.kinesis
import com.amazonaws.services.kinesis.AmazonKinesisAsync
import com.github.j5ik2o.reactive.aws.kinesis.model._

import scala.concurrent.{ ExecutionContext, Future }

class KinesisAsyncClientV1Impl(override val underlying: AmazonKinesisAsync)(
    implicit ec: ExecutionContext
) extends KinesisAsyncClientV1 {

  import KinesisAsyncClientV1._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.AddTagsToStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.AddTagsToStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.CreateStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.CreateStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DecreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DecreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeleteStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeleteStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeregisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeregisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamSummaryRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamSummaryResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DisableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DisableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.EnableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.EnableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetRecordsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetRecordsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetShardIteratorRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetShardIteratorResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.IncreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.IncreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListShardsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListShardsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamConsumersRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamConsumersResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListTagsForStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListTagsForStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.MergeShardsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.MergeShardsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RegisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RegisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RemoveTagsFromStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RemoveTagsFromStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.SplitShardRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.SplitShardResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StartStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StartStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StopStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StopStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.UpdateShardCountRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.UpdateShardCountResponseOps._

  override def addTagsToStream(request: AddTagsToStreamRequest): Future[AddTagsToStreamResponse] =
    underlying.addTagsToStreamAsync(request.toJava).toFuture.map(_.toScala)

  override def createStream(request: CreateStreamRequest): Future[CreateStreamResponse] =
    underlying.createStreamAsync(request.toJava).toFuture.map(_.toScala)

  override def decreaseStreamRetentionPeriod(
      request: DecreaseStreamRetentionPeriodRequest
  ): Future[DecreaseStreamRetentionPeriodResponse] =
    underlying.decreaseStreamRetentionPeriodAsync(request.toJava).toFuture.map(_.toScala)

  override def deleteStream(request: DeleteStreamRequest): Future[DeleteStreamResponse] =
    underlying.deleteStreamAsync(request.toJava).toFuture.map(_.toScala)

  override def deregisterStreamConsumer(
      request: DeregisterStreamConsumerRequest
  ): Future[DeregisterStreamConsumerResponse] =
    underlying.deregisterStreamConsumerAsync(request.toJava).toFuture.map(_.toScala)

  override def describeLimits(request: DescribeLimitsRequest): Future[DescribeLimitsResponse] =
    underlying.describeLimitsAsync(request.toJava).toFuture.map(_.toScala)

  override def describeStream(request: DescribeStreamRequest): Future[DescribeStreamResponse] =
    underlying.describeStreamAsync(request.toJava).toFuture.map(_.toScala)

  override def describeStreamConsumer(request: DescribeStreamConsumerRequest): Future[DescribeStreamConsumerResponse] =
    underlying.describeStreamConsumerAsync(request.toJava).toFuture.map(_.toScala)

  override def describeStreamSummary(request: DescribeStreamSummaryRequest): Future[DescribeStreamSummaryResponse] =
    underlying.describeStreamSummaryAsync(request.toJava).toFuture.map(_.toScala)

  override def disableEnhancedMonitoring(
      request: DisableEnhancedMonitoringRequest
  ): Future[DisableEnhancedMonitoringResponse] =
    underlying.disableEnhancedMonitoringAsync(request.toJava).toFuture.map(_.toScala)

  override def enableEnhancedMonitoring(
      request: EnableEnhancedMonitoringRequest
  ): Future[EnableEnhancedMonitoringResponse] =
    underlying.enableEnhancedMonitoringAsync(request.toJava).toFuture.map(_.toScala)

  override def getRecords(request: GetRecordsRequest): Future[GetRecordsResponse] =
    underlying.getRecordsAsync(request.toJava).toFuture.map(_.toScala)

  override def getShardIterator(request: GetShardIteratorRequest): Future[GetShardIteratorResponse] =
    underlying.getShardIteratorAsync(request.toJava).toFuture.map(_.toScala)

  override def increaseStreamRetentionPeriod(
      request: IncreaseStreamRetentionPeriodRequest
  ): Future[IncreaseStreamRetentionPeriodResponse] =
    underlying.increaseStreamRetentionPeriodAsync(request.toJava).toFuture.map(_.toScala)

  override def listShards(request: ListShardsRequest): Future[ListShardsResponse] =
    underlying.listShardsAsync(request.toJava).toFuture.map(_.toScala)

  override def listStreamConsumers(request: ListStreamConsumersRequest): Future[ListStreamConsumersResponse] =
    underlying.listStreamConsumersAsync(request.toJava).toFuture.map(_.toScala)

  override def listStreams(request: ListStreamsRequest): Future[ListStreamsResponse] =
    underlying.listStreamsAsync(request.toJava).toFuture.map(_.toScala)

  override def listTagsForStream(request: ListTagsForStreamRequest): Future[ListTagsForStreamResponse] =
    underlying.listTagsForStreamAsync(request.toJava).toFuture.map(_.toScala)

  override def mergeShards(request: MergeShardsRequest): Future[MergeShardsResponse] =
    underlying.mergeShardsAsync(request.toJava).toFuture.map(_.toScala)

  override def putRecord(request: PutRecordRequest): Future[PutRecordResponse] =
    underlying.putRecordAsync(request.toJava).toFuture.map(_.toScala)

  override def putRecords(request: PutRecordsRequest): Future[PutRecordsResponse] =
    underlying.putRecordsAsync(request.toJava).toFuture.map(_.toScala)

  override def registerStreamConsumer(request: RegisterStreamConsumerRequest): Future[RegisterStreamConsumerResponse] =
    underlying.registerStreamConsumerAsync(request.toJava).toFuture.map(_.toScala)

  override def removeTagsFromStream(request: RemoveTagsFromStreamRequest): Future[RemoveTagsFromStreamResponse] =
    underlying.removeTagsFromStreamAsync(request.toJava).toFuture.map(_.toScala)

  override def splitShard(request: SplitShardRequest): Future[SplitShardResponse] =
    underlying.splitShardAsync(request.toJava).toFuture.map(_.toScala)

  override def startStreamEncryption(request: StartStreamEncryptionRequest): Future[StartStreamEncryptionResponse] =
    underlying.startStreamEncryptionAsync(request.toJava).toFuture.map(_.toScala)

  override def stopStreamEncryption(request: StopStreamEncryptionRequest): Future[StopStreamEncryptionResponse] =
    underlying.stopStreamEncryptionAsync(request.toJava).toFuture.map(_.toScala)

  override def updateShardCount(request: UpdateShardCountRequest): Future[UpdateShardCountResponse] =
    underlying.updateShardCountAsync(request.toJava).toFuture.map(_.toScala)
}
