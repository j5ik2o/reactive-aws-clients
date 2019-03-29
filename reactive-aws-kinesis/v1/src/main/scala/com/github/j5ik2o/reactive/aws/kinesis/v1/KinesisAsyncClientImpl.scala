// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1

import com.amazonaws.services.kinesis.AmazonKinesisAsync
import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.v1.model._

import scala.concurrent.{ ExecutionContext, Future }

private[kinesis] class KinesisAsyncClientImpl(override val underlying: AmazonKinesisAsync)(
    implicit ec: ExecutionContext
) extends KinesisAsyncClient {
  import KinesisAsyncClient._

  override def addTagsToStream(addTagsToStreamRequest: AddTagsToStreamRequest): Future[AddTagsToStreamResponse] = {
    import AddTagsToStreamRequestOps._
    import AddTagsToStreamResponseOps._
    underlying.addTagsToStreamAsync(addTagsToStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def createStream(createStreamRequest: CreateStreamRequest): Future[CreateStreamResponse] = {
    import CreateStreamRequestOps._
    import CreateStreamResponseOps._
    underlying.createStreamAsync(createStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Future[DecreaseStreamRetentionPeriodResponse] = {
    import DecreaseStreamRetentionPeriodRequestOps._
    import DecreaseStreamRetentionPeriodResponseOps._
    underlying.decreaseStreamRetentionPeriodAsync(decreaseStreamRetentionPeriodRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): Future[DeleteStreamResponse] = {
    import DeleteStreamRequestOps._
    import DeleteStreamResponseOps._
    underlying.deleteStreamAsync(deleteStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Future[DeregisterStreamConsumerResponse] = {
    import DeregisterStreamConsumerRequestOps._
    import DeregisterStreamConsumerResponseOps._
    underlying.deregisterStreamConsumerAsync(deregisterStreamConsumerRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] = {
    import DescribeLimitsRequestOps._
    import DescribeLimitsResponseOps._
    underlying.describeLimitsAsync(describeLimitsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Future[DescribeStreamResponse] = {
    import DescribeStreamRequestOps._
    import DescribeStreamResponseOps._
    underlying.describeStreamAsync(describeStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Future[DescribeStreamConsumerResponse] = {
    import DescribeStreamConsumerRequestOps._
    import DescribeStreamConsumerResponseOps._
    underlying.describeStreamConsumerAsync(describeStreamConsumerRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Future[DescribeStreamSummaryResponse] = {
    import DescribeStreamSummaryRequestOps._
    import DescribeStreamSummaryResponseOps._
    underlying.describeStreamSummaryAsync(describeStreamSummaryRequest.toJava).toFuture.map(_.toScala)
  }

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Future[DisableEnhancedMonitoringResponse] = {
    import DisableEnhancedMonitoringRequestOps._
    import DisableEnhancedMonitoringResponseOps._
    underlying.disableEnhancedMonitoringAsync(disableEnhancedMonitoringRequest.toJava).toFuture.map(_.toScala)
  }

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Future[EnableEnhancedMonitoringResponse] = {
    import EnableEnhancedMonitoringRequestOps._
    import EnableEnhancedMonitoringResponseOps._
    underlying.enableEnhancedMonitoringAsync(enableEnhancedMonitoringRequest.toJava).toFuture.map(_.toScala)
  }

  override def getRecords(getRecordsRequest: GetRecordsRequest): Future[GetRecordsResponse] = {
    import GetRecordsRequestOps._
    import GetRecordsResponseOps._
    underlying.getRecordsAsync(getRecordsRequest.toJava).toFuture.map(_.toScala)
  }

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): Future[GetShardIteratorResponse] = {
    import GetShardIteratorRequestOps._
    import GetShardIteratorResponseOps._
    underlying.getShardIteratorAsync(getShardIteratorRequest.toJava).toFuture.map(_.toScala)
  }

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Future[IncreaseStreamRetentionPeriodResponse] = {
    import IncreaseStreamRetentionPeriodRequestOps._
    import IncreaseStreamRetentionPeriodResponseOps._
    underlying.increaseStreamRetentionPeriodAsync(increaseStreamRetentionPeriodRequest.toJava).toFuture.map(_.toScala)
  }

  override def listShards(listShardsRequest: ListShardsRequest): Future[ListShardsResponse] = {
    import ListShardsRequestOps._
    import ListShardsResponseOps._
    underlying.listShardsAsync(listShardsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Future[ListStreamConsumersResponse] = {
    import ListStreamConsumersRequestOps._
    import ListStreamConsumersResponseOps._
    underlying.listStreamConsumersAsync(listStreamConsumersRequest.toJava).toFuture.map(_.toScala)
  }

  override def listStreams(listStreamsRequest: ListStreamsRequest): Future[ListStreamsResponse] = {
    import ListStreamsRequestOps._
    import ListStreamsResponseOps._
    underlying.listStreamsAsync(listStreamsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listStreams(): Future[ListStreamsResponse] = {

    import ListStreamsResponseOps._
    underlying.listStreamsAsync().toFuture.map(_.toScala)
  }

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Future[ListTagsForStreamResponse] = {
    import ListTagsForStreamRequestOps._
    import ListTagsForStreamResponseOps._
    underlying.listTagsForStreamAsync(listTagsForStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): Future[MergeShardsResponse] = {
    import MergeShardsRequestOps._
    import MergeShardsResponseOps._
    underlying.mergeShardsAsync(mergeShardsRequest.toJava).toFuture.map(_.toScala)
  }

  override def putRecord(putRecordRequest: PutRecordRequest): Future[PutRecordResponse] = {
    import PutRecordRequestOps._
    import PutRecordResponseOps._
    underlying.putRecordAsync(putRecordRequest.toJava).toFuture.map(_.toScala)
  }

  override def putRecords(putRecordsRequest: PutRecordsRequest): Future[PutRecordsResponse] = {
    import PutRecordsRequestOps._
    import PutRecordsResponseOps._
    underlying.putRecordsAsync(putRecordsRequest.toJava).toFuture.map(_.toScala)
  }

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Future[RegisterStreamConsumerResponse] = {
    import RegisterStreamConsumerRequestOps._
    import RegisterStreamConsumerResponseOps._
    underlying.registerStreamConsumerAsync(registerStreamConsumerRequest.toJava).toFuture.map(_.toScala)
  }

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Future[RemoveTagsFromStreamResponse] = {
    import RemoveTagsFromStreamRequestOps._
    import RemoveTagsFromStreamResponseOps._
    underlying.removeTagsFromStreamAsync(removeTagsFromStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def splitShard(splitShardRequest: SplitShardRequest): Future[SplitShardResponse] = {
    import SplitShardRequestOps._
    import SplitShardResponseOps._
    underlying.splitShardAsync(splitShardRequest.toJava).toFuture.map(_.toScala)
  }

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Future[StartStreamEncryptionResponse] = {
    import StartStreamEncryptionRequestOps._
    import StartStreamEncryptionResponseOps._
    underlying.startStreamEncryptionAsync(startStreamEncryptionRequest.toJava).toFuture.map(_.toScala)
  }

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Future[StopStreamEncryptionResponse] = {
    import StopStreamEncryptionRequestOps._
    import StopStreamEncryptionResponseOps._
    underlying.stopStreamEncryptionAsync(stopStreamEncryptionRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateShardCount(updateShardCountRequest: UpdateShardCountRequest): Future[UpdateShardCountResponse] = {
    import UpdateShardCountRequestOps._
    import UpdateShardCountResponseOps._
    underlying.updateShardCountAsync(updateShardCountRequest.toJava).toFuture.map(_.toScala)
  }

}
