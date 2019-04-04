// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object KinesisReaderTFutureClient {

  def apply(underlying: KinesisAsyncClient): KinesisReaderTFutureClient =
    new KinesisReaderTFutureClientImpl(underlying)

}

trait KinesisReaderTFutureClient extends KinesisClient[ReaderT[Future, ExecutionContext, ?]] {

  val underlying: KinesisAsyncClient

  override def addTagsToStream(
      addTagsToStreamRequest: AddTagsToStreamRequest
  ): ReaderT[Future, ExecutionContext, AddTagsToStreamResponse] =
    ReaderT { implicit ec =>
      underlying.addTagsToStream(addTagsToStreamRequest)
    }
  override def createStream(
      createStreamRequest: CreateStreamRequest
  ): ReaderT[Future, ExecutionContext, CreateStreamResponse] =
    ReaderT { implicit ec =>
      underlying.createStream(createStreamRequest)
    }
  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, DecreaseStreamRetentionPeriodResponse] =
    ReaderT { implicit ec =>
      underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest)
    }
  override def deleteStream(
      deleteStreamRequest: DeleteStreamRequest
  ): ReaderT[Future, ExecutionContext, DeleteStreamResponse] =
    ReaderT { implicit ec =>
      underlying.deleteStream(deleteStreamRequest)
    }
  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DeregisterStreamConsumerResponse] =
    ReaderT { implicit ec =>
      underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest)
    }
  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] =
    ReaderT { implicit ec =>
      underlying.describeLimits(describeLimitsRequest)
    }
  override def describeStream(
      describeStreamRequest: DescribeStreamRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamResponse] =
    ReaderT { implicit ec =>
      underlying.describeStream(describeStreamRequest)
    }
  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamConsumerResponse] =
    ReaderT { implicit ec =>
      underlying.describeStreamConsumer(describeStreamConsumerRequest)
    }
  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamSummaryResponse] =
    ReaderT { implicit ec =>
      underlying.describeStreamSummary(describeStreamSummaryRequest)
    }
  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, DisableEnhancedMonitoringResponse] =
    ReaderT { implicit ec =>
      underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest)
    }
  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, EnableEnhancedMonitoringResponse] =
    ReaderT { implicit ec =>
      underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest)
    }
  override def getRecords(
      getRecordsRequest: GetRecordsRequest
  ): ReaderT[Future, ExecutionContext, GetRecordsResponse] =
    ReaderT { implicit ec =>
      underlying.getRecords(getRecordsRequest)
    }
  override def getShardIterator(
      getShardIteratorRequest: GetShardIteratorRequest
  ): ReaderT[Future, ExecutionContext, GetShardIteratorResponse] =
    ReaderT { implicit ec =>
      underlying.getShardIterator(getShardIteratorRequest)
    }
  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, IncreaseStreamRetentionPeriodResponse] =
    ReaderT { implicit ec =>
      underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest)
    }
  override def listShards(
      listShardsRequest: ListShardsRequest
  ): ReaderT[Future, ExecutionContext, ListShardsResponse] =
    ReaderT { implicit ec =>
      underlying.listShards(listShardsRequest)
    }
  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ReaderT[Future, ExecutionContext, ListStreamConsumersResponse] =
    ReaderT { implicit ec =>
      underlying.listStreamConsumers(listStreamConsumersRequest)
    }
  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersPublisher =
    underlying.listStreamConsumersPaginator(listStreamConsumersRequest)
  override def listStreams(
      listStreamsRequest: ListStreamsRequest
  ): ReaderT[Future, ExecutionContext, ListStreamsResponse] =
    ReaderT { implicit ec =>
      underlying.listStreams(listStreamsRequest)
    }
  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): ReaderT[Future, ExecutionContext, ListTagsForStreamResponse] =
    ReaderT { implicit ec =>
      underlying.listTagsForStream(listTagsForStreamRequest)
    }
  override def mergeShards(
      mergeShardsRequest: MergeShardsRequest
  ): ReaderT[Future, ExecutionContext, MergeShardsResponse] =
    ReaderT { implicit ec =>
      underlying.mergeShards(mergeShardsRequest)
    }
  override def putRecord(
      putRecordRequest: PutRecordRequest
  ): ReaderT[Future, ExecutionContext, PutRecordResponse] =
    ReaderT { implicit ec =>
      underlying.putRecord(putRecordRequest)
    }
  override def putRecords(
      putRecordsRequest: PutRecordsRequest
  ): ReaderT[Future, ExecutionContext, PutRecordsResponse] =
    ReaderT { implicit ec =>
      underlying.putRecords(putRecordsRequest)
    }
  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, RegisterStreamConsumerResponse] =
    ReaderT { implicit ec =>
      underlying.registerStreamConsumer(registerStreamConsumerRequest)
    }
  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): ReaderT[Future, ExecutionContext, RemoveTagsFromStreamResponse] =
    ReaderT { implicit ec =>
      underlying.removeTagsFromStream(removeTagsFromStreamRequest)
    }
  override def splitShard(
      splitShardRequest: SplitShardRequest
  ): ReaderT[Future, ExecutionContext, SplitShardResponse] =
    ReaderT { implicit ec =>
      underlying.splitShard(splitShardRequest)
    }
  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StartStreamEncryptionResponse] =
    ReaderT { implicit ec =>
      underlying.startStreamEncryption(startStreamEncryptionRequest)
    }
  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StopStreamEncryptionResponse] =
    ReaderT { implicit ec =>
      underlying.stopStreamEncryption(stopStreamEncryptionRequest)
    }
  override def updateShardCount(
      updateShardCountRequest: UpdateShardCountRequest
  ): ReaderT[Future, ExecutionContext, UpdateShardCountResponse] =
    ReaderT { implicit ec =>
      underlying.updateShardCount(updateShardCountRequest)
    }
}
