// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import java.util.concurrent.CompletableFuture

import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._
import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient => JavaKinesisAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object KinesisAsyncClient {

  def apply(underlying: JavaKinesisAsyncClient): KinesisAsyncClient =
    new KinesisAsyncClientImpl(underlying)

}

trait KinesisAsyncClient extends KinesisClient[Future] {

  val underlying: JavaKinesisAsyncClient

  import KinesisAsyncClient._

  override def addTagsToStream(addTagsToStreamRequest: AddTagsToStreamRequest): Future[AddTagsToStreamResponse] = {
    underlying.addTagsToStream(addTagsToStreamRequest).toScala
  }

  override def createStream(createStreamRequest: CreateStreamRequest): Future[CreateStreamResponse] = {
    underlying.createStream(createStreamRequest).toScala
  }

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Future[DecreaseStreamRetentionPeriodResponse] = {
    underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest).toScala
  }

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): Future[DeleteStreamResponse] = {
    underlying.deleteStream(deleteStreamRequest).toScala
  }

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Future[DeregisterStreamConsumerResponse] = {
    underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest).toScala
  }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] = {
    underlying.describeLimits(describeLimitsRequest).toScala
  }

  override def describeLimits(): Future[DescribeLimitsResponse] = {
    underlying.describeLimits().toScala
  }

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Future[DescribeStreamResponse] = {
    underlying.describeStream(describeStreamRequest).toScala
  }

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Future[DescribeStreamConsumerResponse] = {
    underlying.describeStreamConsumer(describeStreamConsumerRequest).toScala
  }

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Future[DescribeStreamSummaryResponse] = {
    underlying.describeStreamSummary(describeStreamSummaryRequest).toScala
  }

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Future[DisableEnhancedMonitoringResponse] = {
    underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest).toScala
  }

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Future[EnableEnhancedMonitoringResponse] = {
    underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest).toScala
  }

  override def getRecords(getRecordsRequest: GetRecordsRequest): Future[GetRecordsResponse] = {
    underlying.getRecords(getRecordsRequest).toScala
  }

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): Future[GetShardIteratorResponse] = {
    underlying.getShardIterator(getShardIteratorRequest).toScala
  }

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Future[IncreaseStreamRetentionPeriodResponse] = {
    underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest).toScala
  }

  override def listShards(listShardsRequest: ListShardsRequest): Future[ListShardsResponse] = {
    underlying.listShards(listShardsRequest).toScala
  }

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Future[ListStreamConsumersResponse] = {
    underlying.listStreamConsumers(listStreamConsumersRequest).toScala
  }

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersPublisher = {
    underlying.listStreamConsumersPaginator(listStreamConsumersRequest)
  }

  override def listStreams(listStreamsRequest: ListStreamsRequest): Future[ListStreamsResponse] = {
    underlying.listStreams(listStreamsRequest).toScala
  }

  override def listStreams(): Future[ListStreamsResponse] = {
    underlying.listStreams().toScala
  }

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Future[ListTagsForStreamResponse] = {
    underlying.listTagsForStream(listTagsForStreamRequest).toScala
  }

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): Future[MergeShardsResponse] = {
    underlying.mergeShards(mergeShardsRequest).toScala
  }

  override def putRecord(putRecordRequest: PutRecordRequest): Future[PutRecordResponse] = {
    underlying.putRecord(putRecordRequest).toScala
  }

  override def putRecords(putRecordsRequest: PutRecordsRequest): Future[PutRecordsResponse] = {
    underlying.putRecords(putRecordsRequest).toScala
  }

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Future[RegisterStreamConsumerResponse] = {
    underlying.registerStreamConsumer(registerStreamConsumerRequest).toScala
  }

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Future[RemoveTagsFromStreamResponse] = {
    underlying.removeTagsFromStream(removeTagsFromStreamRequest).toScala
  }

  override def splitShard(splitShardRequest: SplitShardRequest): Future[SplitShardResponse] = {
    underlying.splitShard(splitShardRequest).toScala
  }

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Future[StartStreamEncryptionResponse] = {
    underlying.startStreamEncryption(startStreamEncryptionRequest).toScala
  }

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Future[StopStreamEncryptionResponse] = {
    underlying.stopStreamEncryption(stopStreamEncryptionRequest).toScala
  }

  override def updateShardCount(updateShardCountRequest: UpdateShardCountRequest): Future[UpdateShardCountResponse] = {
    underlying.updateShardCount(updateShardCountRequest).toScala
  }

}
