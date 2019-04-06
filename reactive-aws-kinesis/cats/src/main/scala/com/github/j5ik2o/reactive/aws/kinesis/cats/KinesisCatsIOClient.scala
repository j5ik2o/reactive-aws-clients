// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import software.amazon.awssdk.services.kinesis.model._
import software.amazon.awssdk.services.kinesis.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object KinesisCatsIOClient {

  def apply(underlying: KinesisAsyncClient): KinesisCatsIOClient =
    new KinesisCatsIOClientImpl(underlying)

}

trait KinesisCatsIOClient extends KinesisClient[IO] {

  val underlying: KinesisAsyncClient

  override def addTagsToStream(addTagsToStreamRequest: AddTagsToStreamRequest): IO[AddTagsToStreamResponse] =
    IO.fromFuture {
      IO(underlying.addTagsToStream(addTagsToStreamRequest))
    }

  override def createStream(createStreamRequest: CreateStreamRequest): IO[CreateStreamResponse] =
    IO.fromFuture {
      IO(underlying.createStream(createStreamRequest))
    }

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): IO[DecreaseStreamRetentionPeriodResponse] =
    IO.fromFuture {
      IO(underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest))
    }

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): IO[DeleteStreamResponse] =
    IO.fromFuture {
      IO(underlying.deleteStream(deleteStreamRequest))
    }

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): IO[DeregisterStreamConsumerResponse] =
    IO.fromFuture {
      IO(underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest))
    }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): IO[DescribeLimitsResponse] =
    IO.fromFuture {
      IO(underlying.describeLimits(describeLimitsRequest))
    }

  override def describeStream(describeStreamRequest: DescribeStreamRequest): IO[DescribeStreamResponse] =
    IO.fromFuture {
      IO(underlying.describeStream(describeStreamRequest))
    }

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): IO[DescribeStreamConsumerResponse] =
    IO.fromFuture {
      IO(underlying.describeStreamConsumer(describeStreamConsumerRequest))
    }

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): IO[DescribeStreamSummaryResponse] =
    IO.fromFuture {
      IO(underlying.describeStreamSummary(describeStreamSummaryRequest))
    }

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): IO[DisableEnhancedMonitoringResponse] =
    IO.fromFuture {
      IO(underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest))
    }

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): IO[EnableEnhancedMonitoringResponse] =
    IO.fromFuture {
      IO(underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest))
    }

  override def getRecords(getRecordsRequest: GetRecordsRequest): IO[GetRecordsResponse] =
    IO.fromFuture {
      IO(underlying.getRecords(getRecordsRequest))
    }

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): IO[GetShardIteratorResponse] =
    IO.fromFuture {
      IO(underlying.getShardIterator(getShardIteratorRequest))
    }

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): IO[IncreaseStreamRetentionPeriodResponse] =
    IO.fromFuture {
      IO(underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest))
    }

  override def listShards(listShardsRequest: ListShardsRequest): IO[ListShardsResponse] =
    IO.fromFuture {
      IO(underlying.listShards(listShardsRequest))
    }

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): IO[ListStreamConsumersResponse] =
    IO.fromFuture {
      IO(underlying.listStreamConsumers(listStreamConsumersRequest))
    }

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersPublisher =
    underlying.listStreamConsumersPaginator(listStreamConsumersRequest)

  override def listStreams(listStreamsRequest: ListStreamsRequest): IO[ListStreamsResponse] =
    IO.fromFuture {
      IO(underlying.listStreams(listStreamsRequest))
    }

  override def listTagsForStream(listTagsForStreamRequest: ListTagsForStreamRequest): IO[ListTagsForStreamResponse] =
    IO.fromFuture {
      IO(underlying.listTagsForStream(listTagsForStreamRequest))
    }

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): IO[MergeShardsResponse] =
    IO.fromFuture {
      IO(underlying.mergeShards(mergeShardsRequest))
    }

  override def putRecord(putRecordRequest: PutRecordRequest): IO[PutRecordResponse] =
    IO.fromFuture {
      IO(underlying.putRecord(putRecordRequest))
    }

  override def putRecords(putRecordsRequest: PutRecordsRequest): IO[PutRecordsResponse] =
    IO.fromFuture {
      IO(underlying.putRecords(putRecordsRequest))
    }

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): IO[RegisterStreamConsumerResponse] =
    IO.fromFuture {
      IO(underlying.registerStreamConsumer(registerStreamConsumerRequest))
    }

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): IO[RemoveTagsFromStreamResponse] =
    IO.fromFuture {
      IO(underlying.removeTagsFromStream(removeTagsFromStreamRequest))
    }

  override def splitShard(splitShardRequest: SplitShardRequest): IO[SplitShardResponse] =
    IO.fromFuture {
      IO(underlying.splitShard(splitShardRequest))
    }

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): IO[StartStreamEncryptionResponse] =
    IO.fromFuture {
      IO(underlying.startStreamEncryption(startStreamEncryptionRequest))
    }

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): IO[StopStreamEncryptionResponse] =
    IO.fromFuture {
      IO(underlying.stopStreamEncryption(stopStreamEncryptionRequest))
    }

  override def updateShardCount(updateShardCountRequest: UpdateShardCountRequest): IO[UpdateShardCountResponse] =
    IO.fromFuture {
      IO(underlying.updateShardCount(updateShardCountRequest))
    }

}
