// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._
import software.amazon.awssdk.services.kinesis.{ KinesisClient => JavaKinesisSyncClient }

object KinesisSyncClient {

  def apply(underlying: JavaKinesisSyncClient): KinesisSyncClient = new KinesisSyncClientImpl(underlying)

}

trait KinesisSyncClient extends KinesisClient[Either[Throwable, ?]] {
  val underlying: JavaKinesisSyncClient

  private def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

  override def addTagsToStream(
      addTagsToStreamRequest: AddTagsToStreamRequest
  ): Either[Throwable, AddTagsToStreamResponse] = {
    toEither(underlying.addTagsToStream(addTagsToStreamRequest))
  }

  override def createStream(createStreamRequest: CreateStreamRequest): Either[Throwable, CreateStreamResponse] = {
    toEither(underlying.createStream(createStreamRequest))
  }

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Either[Throwable, DecreaseStreamRetentionPeriodResponse] = {
    toEither(underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest))
  }

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): Either[Throwable, DeleteStreamResponse] = {
    toEither(underlying.deleteStream(deleteStreamRequest))
  }

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Either[Throwable, DeregisterStreamConsumerResponse] = {
    toEither(underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest))
  }

  override def describeLimits(): Either[Throwable, DescribeLimitsResponse] = {
    toEither(underlying.describeLimits())
  }

  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): Either[Throwable, DescribeLimitsResponse] = {
    toEither(underlying.describeLimits(describeLimitsRequest))
  }

  override def describeStream(
      describeStreamRequest: DescribeStreamRequest
  ): Either[Throwable, DescribeStreamResponse] = {
    toEither(underlying.describeStream(describeStreamRequest))
  }

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Either[Throwable, DescribeStreamConsumerResponse] = {
    toEither(underlying.describeStreamConsumer(describeStreamConsumerRequest))
  }

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Either[Throwable, DescribeStreamSummaryResponse] = {
    toEither(underlying.describeStreamSummary(describeStreamSummaryRequest))
  }

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Either[Throwable, DisableEnhancedMonitoringResponse] = {
    toEither(underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest))
  }

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Either[Throwable, EnableEnhancedMonitoringResponse] = {
    toEither(underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest))
  }

  override def getRecords(getRecordsRequest: GetRecordsRequest): Either[Throwable, GetRecordsResponse] = {
    toEither(underlying.getRecords(getRecordsRequest))
  }

  override def getShardIterator(
      getShardIteratorRequest: GetShardIteratorRequest
  ): Either[Throwable, GetShardIteratorResponse] = {
    toEither(underlying.getShardIterator(getShardIteratorRequest))
  }

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Either[Throwable, IncreaseStreamRetentionPeriodResponse] = {
    toEither(underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest))
  }

  override def listShards(listShardsRequest: ListShardsRequest): Either[Throwable, ListShardsResponse] = {
    toEither(underlying.listShards(listShardsRequest))
  }

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Either[Throwable, ListStreamConsumersResponse] = {
    toEither(underlying.listStreamConsumers(listStreamConsumersRequest))
  }

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersIterable = {
    underlying.listStreamConsumersPaginator(listStreamConsumersRequest)
  }

  override def listStreams(): Either[Throwable, ListStreamsResponse] = {
    toEither(underlying.listStreams())
  }

  override def listStreams(listStreamsRequest: ListStreamsRequest): Either[Throwable, ListStreamsResponse] = {
    toEither(underlying.listStreams(listStreamsRequest))
  }

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Either[Throwable, ListTagsForStreamResponse] = {
    toEither(underlying.listTagsForStream(listTagsForStreamRequest))
  }

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): Either[Throwable, MergeShardsResponse] = {
    toEither(underlying.mergeShards(mergeShardsRequest))
  }

  override def putRecord(putRecordRequest: PutRecordRequest): Either[Throwable, PutRecordResponse] = {
    toEither(underlying.putRecord(putRecordRequest))
  }

  override def putRecords(putRecordsRequest: PutRecordsRequest): Either[Throwable, PutRecordsResponse] = {
    toEither(underlying.putRecords(putRecordsRequest))
  }

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Either[Throwable, RegisterStreamConsumerResponse] = {
    toEither(underlying.registerStreamConsumer(registerStreamConsumerRequest))
  }

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Either[Throwable, RemoveTagsFromStreamResponse] = {
    toEither(underlying.removeTagsFromStream(removeTagsFromStreamRequest))
  }

  override def splitShard(splitShardRequest: SplitShardRequest): Either[Throwable, SplitShardResponse] = {
    toEither(underlying.splitShard(splitShardRequest))
  }

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Either[Throwable, StartStreamEncryptionResponse] = {
    toEither(underlying.startStreamEncryption(startStreamEncryptionRequest))
  }

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Either[Throwable, StopStreamEncryptionResponse] = {
    toEither(underlying.stopStreamEncryption(stopStreamEncryptionRequest))
  }

  override def updateShardCount(
      updateShardCountRequest: UpdateShardCountRequest
  ): Either[Throwable, UpdateShardCountResponse] = {
    toEither(underlying.updateShardCount(updateShardCountRequest))
  }

}
