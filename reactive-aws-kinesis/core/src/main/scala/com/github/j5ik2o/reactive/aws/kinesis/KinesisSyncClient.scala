// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._
import software.amazon.awssdk.services.kinesis.{ KinesisClient => JavaKinesisSyncClient }

object KinesisSyncClient extends ToEitherSupport {

  def apply(underlying: JavaKinesisSyncClient): KinesisSyncClient = new KinesisSyncClientImpl(underlying)

}

trait KinesisSyncClient extends KinesisClient[Either[Throwable, ?]] {
  val underlying: JavaKinesisSyncClient
  import KinesisSyncClient._

  override def addTagsToStream(
      addTagsToStreamRequest: AddTagsToStreamRequest
  ): Either[Throwable, AddTagsToStreamResponse] =
    underlying.addTagsToStream(addTagsToStreamRequest).toEither

  override def createStream(createStreamRequest: CreateStreamRequest): Either[Throwable, CreateStreamResponse] =
    underlying.createStream(createStreamRequest).toEither

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Either[Throwable, DecreaseStreamRetentionPeriodResponse] =
    underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest).toEither

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): Either[Throwable, DeleteStreamResponse] =
    underlying.deleteStream(deleteStreamRequest).toEither

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Either[Throwable, DeregisterStreamConsumerResponse] =
    underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest).toEither

  override def describeLimits(): Either[Throwable, DescribeLimitsResponse] =
    underlying.describeLimits().toEither

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Either[Throwable, DescribeLimitsResponse] =
    underlying.describeLimits(describeLimitsRequest).toEither

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Either[Throwable, DescribeStreamResponse] =
    underlying.describeStream(describeStreamRequest).toEither

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Either[Throwable, DescribeStreamConsumerResponse] =
    underlying.describeStreamConsumer(describeStreamConsumerRequest).toEither

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Either[Throwable, DescribeStreamSummaryResponse] =
    underlying.describeStreamSummary(describeStreamSummaryRequest).toEither

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Either[Throwable, DisableEnhancedMonitoringResponse] =
    underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest).toEither

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Either[Throwable, EnableEnhancedMonitoringResponse] =
    underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest).toEither

  override def getRecords(getRecordsRequest: GetRecordsRequest): Either[Throwable, GetRecordsResponse] =
    underlying.getRecords(getRecordsRequest).toEither

  override def getShardIterator(
      getShardIteratorRequest: GetShardIteratorRequest
  ): Either[Throwable, GetShardIteratorResponse] =
    underlying.getShardIterator(getShardIteratorRequest).toEither

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Either[Throwable, IncreaseStreamRetentionPeriodResponse] =
    underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest).toEither

  override def listShards(listShardsRequest: ListShardsRequest): Either[Throwable, ListShardsResponse] =
    underlying.listShards(listShardsRequest).toEither

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Either[Throwable, ListStreamConsumersResponse] =
    underlying.listStreamConsumers(listStreamConsumersRequest).toEither

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersIterable =
    underlying.listStreamConsumersPaginator(listStreamConsumersRequest)

  override def listStreams(): Either[Throwable, ListStreamsResponse] =
    underlying.listStreams().toEither

  override def listStreams(listStreamsRequest: ListStreamsRequest): Either[Throwable, ListStreamsResponse] =
    underlying.listStreams(listStreamsRequest).toEither

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Either[Throwable, ListTagsForStreamResponse] =
    underlying.listTagsForStream(listTagsForStreamRequest).toEither

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): Either[Throwable, MergeShardsResponse] =
    underlying.mergeShards(mergeShardsRequest).toEither

  override def putRecord(putRecordRequest: PutRecordRequest): Either[Throwable, PutRecordResponse] =
    underlying.putRecord(putRecordRequest).toEither

  override def putRecords(putRecordsRequest: PutRecordsRequest): Either[Throwable, PutRecordsResponse] =
    underlying.putRecords(putRecordsRequest).toEither

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Either[Throwable, RegisterStreamConsumerResponse] =
    underlying.registerStreamConsumer(registerStreamConsumerRequest).toEither

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Either[Throwable, RemoveTagsFromStreamResponse] =
    underlying.removeTagsFromStream(removeTagsFromStreamRequest).toEither

  override def splitShard(splitShardRequest: SplitShardRequest): Either[Throwable, SplitShardResponse] =
    underlying.splitShard(splitShardRequest).toEither

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Either[Throwable, StartStreamEncryptionResponse] =
    underlying.startStreamEncryption(startStreamEncryptionRequest).toEither

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Either[Throwable, StopStreamEncryptionResponse] =
    underlying.stopStreamEncryption(stopStreamEncryptionRequest).toEither

  override def updateShardCount(
      updateShardCountRequest: UpdateShardCountRequest
  ): Either[Throwable, UpdateShardCountResponse] =
    underlying.updateShardCount(updateShardCountRequest).toEither

}
