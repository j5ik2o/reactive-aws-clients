// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import java.util.concurrent.CompletableFuture

import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._
import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient => JavaKinesisAsyncClient }

import scala.compat.java8.FutureConverters
import scala.concurrent.Future

object KinesisAsyncClient {

  def apply(underlying: JavaKinesisAsyncClient): KinesisAsyncClient =
    new KinesisAsyncClientImpl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait KinesisAsyncClient extends KinesisClient[Future] {

  val underlying: JavaKinesisAsyncClient

  import KinesisAsyncClient._

  override def addTagsToStream(addTagsToStreamRequest: AddTagsToStreamRequest): Future[AddTagsToStreamResponse] = {
    underlying.addTagsToStream(addTagsToStreamRequest).toFuture
  }

  override def createStream(createStreamRequest: CreateStreamRequest): Future[CreateStreamResponse] = {
    underlying.createStream(createStreamRequest).toFuture
  }

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Future[DecreaseStreamRetentionPeriodResponse] = {
    underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest).toFuture
  }

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): Future[DeleteStreamResponse] = {
    underlying.deleteStream(deleteStreamRequest).toFuture
  }

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Future[DeregisterStreamConsumerResponse] = {
    underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest).toFuture
  }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] = {
    underlying.describeLimits(describeLimitsRequest).toFuture
  }

  override def describeLimits(): Future[DescribeLimitsResponse] = {
    underlying.describeLimits().toFuture
  }

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Future[DescribeStreamResponse] = {
    underlying.describeStream(describeStreamRequest).toFuture
  }

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Future[DescribeStreamConsumerResponse] = {
    underlying.describeStreamConsumer(describeStreamConsumerRequest).toFuture
  }

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Future[DescribeStreamSummaryResponse] = {
    underlying.describeStreamSummary(describeStreamSummaryRequest).toFuture
  }

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Future[DisableEnhancedMonitoringResponse] = {
    underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest).toFuture
  }

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Future[EnableEnhancedMonitoringResponse] = {
    underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest).toFuture
  }

  override def getRecords(getRecordsRequest: GetRecordsRequest): Future[GetRecordsResponse] = {
    underlying.getRecords(getRecordsRequest).toFuture
  }

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): Future[GetShardIteratorResponse] = {
    underlying.getShardIterator(getShardIteratorRequest).toFuture
  }

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Future[IncreaseStreamRetentionPeriodResponse] = {
    underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest).toFuture
  }

  override def listShards(listShardsRequest: ListShardsRequest): Future[ListShardsResponse] = {
    underlying.listShards(listShardsRequest).toFuture
  }

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Future[ListStreamConsumersResponse] = {
    underlying.listStreamConsumers(listStreamConsumersRequest).toFuture
  }

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersPublisher = {
    underlying.listStreamConsumersPaginator(listStreamConsumersRequest)
  }

  override def listStreams(listStreamsRequest: ListStreamsRequest): Future[ListStreamsResponse] = {
    underlying.listStreams(listStreamsRequest).toFuture
  }

  override def listStreams(): Future[ListStreamsResponse] = {
    underlying.listStreams().toFuture
  }

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Future[ListTagsForStreamResponse] = {
    underlying.listTagsForStream(listTagsForStreamRequest).toFuture
  }

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): Future[MergeShardsResponse] = {
    underlying.mergeShards(mergeShardsRequest).toFuture
  }

  override def putRecord(putRecordRequest: PutRecordRequest): Future[PutRecordResponse] = {
    underlying.putRecord(putRecordRequest).toFuture
  }

  override def putRecords(putRecordsRequest: PutRecordsRequest): Future[PutRecordsResponse] = {
    underlying.putRecords(putRecordsRequest).toFuture
  }

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Future[RegisterStreamConsumerResponse] = {
    underlying.registerStreamConsumer(registerStreamConsumerRequest).toFuture
  }

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Future[RemoveTagsFromStreamResponse] = {
    underlying.removeTagsFromStream(removeTagsFromStreamRequest).toFuture
  }

  override def splitShard(splitShardRequest: SplitShardRequest): Future[SplitShardResponse] = {
    underlying.splitShard(splitShardRequest).toFuture
  }

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Future[StartStreamEncryptionResponse] = {
    underlying.startStreamEncryption(startStreamEncryptionRequest).toFuture
  }

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Future[StopStreamEncryptionResponse] = {
    underlying.stopStreamEncryption(stopStreamEncryptionRequest).toFuture
  }

  override def updateShardCount(updateShardCountRequest: UpdateShardCountRequest): Future[UpdateShardCountResponse] = {
    underlying.updateShardCount(updateShardCountRequest).toFuture
  }

}
