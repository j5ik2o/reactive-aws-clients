package com.github.j5ik2o.reactive.aws.kinesis.akka

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Source}
import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient
import com.github.j5ik2o.reactive.aws.kinesis.model._

import scala.concurrent.Future

object KinesisStreamClient {

  def apply(underlying: KinesisClient[Future]): KinesisStreamClient = new KinesisStreamClientImpl(underlying)

}

trait KinesisStreamClient {

  val underlying: KinesisClient[Future]

  def addTagsToStreamFlow(parallelism: Int = 1): Flow[AddTagsToStreamRequest, AddTagsToStreamResponse, NotUsed] =
    Flow[AddTagsToStreamRequest].mapAsync(parallelism)(underlying.addTagsToStream)

  def createStreamFlow(parallelism: Int = 1): Flow[CreateStreamRequest, CreateStreamResponse, NotUsed] =
    Flow[CreateStreamRequest].mapAsync(parallelism)(underlying.createStream)

  def decreaseStreamRetentionPeriodFlow(
      parallelism: Int = 1
  ): Flow[DecreaseStreamRetentionPeriodRequest, DecreaseStreamRetentionPeriodResponse, NotUsed] =
    Flow[DecreaseStreamRetentionPeriodRequest].mapAsync(parallelism)(underlying.decreaseStreamRetentionPeriod)

  def deleteStreamFlow(parallelism: Int = 1): Flow[DeleteStreamRequest, DeleteStreamResponse, NotUsed] =
    Flow[DeleteStreamRequest].mapAsync(parallelism)(underlying.deleteStream)

  def deregisterStreamConsumerFlow(
      parallelism: Int = 1
  ): Flow[DeregisterStreamConsumerRequest, DeregisterStreamConsumerResponse, NotUsed] =
    Flow[DeregisterStreamConsumerRequest].mapAsync(parallelism)(underlying.deregisterStreamConsumer)

  def describeLimitsFlow(parallelism: Int = 1): Flow[DescribeLimitsRequest, DescribeLimitsResponse, NotUsed] =
    Flow[DescribeLimitsRequest].mapAsync(parallelism)(underlying.describeLimits)

  def describeStreamFlow(parallelism: Int = 1): Flow[DescribeStreamRequest, DescribeStreamResponse, NotUsed] =
    Flow[DescribeStreamRequest].mapAsync(parallelism)(underlying.describeStream)

  def describeStreamConsumerFlow(
      parallelism: Int = 1
  ): Flow[DescribeStreamConsumerRequest, DescribeStreamConsumerResponse, NotUsed] =
    Flow[DescribeStreamConsumerRequest].mapAsync(parallelism)(underlying.describeStreamConsumer)

  def describeStreamSummaryFlow(
      parallelism: Int = 1
  ): Flow[DescribeStreamSummaryRequest, DescribeStreamSummaryResponse, NotUsed] =
    Flow[DescribeStreamSummaryRequest].mapAsync(parallelism)(underlying.describeStreamSummary)

  def disableEnhancedMonitoringFlow(
      parallelism: Int = 1
  ): Flow[DisableEnhancedMonitoringRequest, DisableEnhancedMonitoringResponse, NotUsed] =
    Flow[DisableEnhancedMonitoringRequest].mapAsync(parallelism)(underlying.disableEnhancedMonitoring)

  def enableEnhancedMonitoringFlow(
      parallelism: Int = 1
  ): Flow[EnableEnhancedMonitoringRequest, EnableEnhancedMonitoringResponse, NotUsed] =
    Flow[EnableEnhancedMonitoringRequest].mapAsync(parallelism)(underlying.enableEnhancedMonitoring)

  def getRecordsFlow(parallelism: Int = 1): Flow[GetRecordsRequest, GetRecordsResponse, NotUsed] =
    Flow[GetRecordsRequest].mapAsync(parallelism)(underlying.getRecords)

  def getShardIteratorFlow(parallelism: Int = 1): Flow[GetShardIteratorRequest, GetShardIteratorResponse, NotUsed] =
    Flow[GetShardIteratorRequest].mapAsync(parallelism)(underlying.getShardIterator)

  def increaseStreamRetentionPeriodFlow(
      parallelism: Int = 1
  ): Flow[IncreaseStreamRetentionPeriodRequest, IncreaseStreamRetentionPeriodResponse, NotUsed] =
    Flow[IncreaseStreamRetentionPeriodRequest].mapAsync(parallelism)(underlying.increaseStreamRetentionPeriod)

  def listShardsFlow(parallelism: Int = 1): Flow[ListShardsRequest, ListShardsResponse, NotUsed] =
    Flow[ListShardsRequest].mapAsync(parallelism)(underlying.listShards)

  def listStreamConsumersFlow(
      parallelism: Int = 1
  ): Flow[ListStreamConsumersRequest, ListStreamConsumersResponse, NotUsed] =
    Flow[ListStreamConsumersRequest].mapAsync(parallelism)(underlying.listStreamConsumers)

  def listStreamsFlow(parallelism: Int = 1): Flow[ListStreamsRequest, ListStreamsResponse, NotUsed] =
    Flow[ListStreamsRequest].mapAsync(parallelism)(underlying.listStreams)

  def listStreamsSource: Source[ListStreamsResponse, NotUsed] =
    Source.fromFuture(underlying.listStreams())

  def listTagsForStreamFlow(parallelism: Int = 1): Flow[ListTagsForStreamRequest, ListTagsForStreamResponse, NotUsed] =
    Flow[ListTagsForStreamRequest].mapAsync(parallelism)(underlying.listTagsForStream)

  def mergeShardsFlow(parallelism: Int = 1): Flow[MergeShardsRequest, MergeShardsResponse, NotUsed] =
    Flow[MergeShardsRequest].mapAsync(parallelism)(underlying.mergeShards)

  def putRecordFlow(parallelism: Int = 1): Flow[PutRecordRequest, PutRecordResponse, NotUsed] =
    Flow[PutRecordRequest].mapAsync(parallelism)(underlying.putRecord)

  def putRecordsFlow(parallelism: Int = 1): Flow[PutRecordsRequest, PutRecordsResponse, NotUsed] =
    Flow[PutRecordsRequest].mapAsync(parallelism)(underlying.putRecords)

  def registerStreamConsumerFlow(
      parallelism: Int = 1
  ): Flow[RegisterStreamConsumerRequest, RegisterStreamConsumerResponse, NotUsed] =
    Flow[RegisterStreamConsumerRequest].mapAsync(parallelism)(underlying.registerStreamConsumer)

  def removeTagsFromStreamFlow(
      parallelism: Int = 1
  ): Flow[RemoveTagsFromStreamRequest, RemoveTagsFromStreamResponse, NotUsed] =
    Flow[RemoveTagsFromStreamRequest].mapAsync(parallelism)(underlying.removeTagsFromStream)

  def splitShardFlow(parallelism: Int = 1): Flow[SplitShardRequest, SplitShardResponse, NotUsed] =
    Flow[SplitShardRequest].mapAsync(parallelism)(underlying.splitShard)

  def startStreamEncryptionFlow(
      parallelism: Int = 1
  ): Flow[StartStreamEncryptionRequest, StartStreamEncryptionResponse, NotUsed] =
    Flow[StartStreamEncryptionRequest].mapAsync(parallelism)(underlying.startStreamEncryption)

  def stopStreamEncryptionFlow(
      parallelism: Int = 1
  ): Flow[StopStreamEncryptionRequest, StopStreamEncryptionResponse, NotUsed] =
    Flow[StopStreamEncryptionRequest].mapAsync(parallelism)(underlying.stopStreamEncryption)

  def updateShardCountFlow(parallelism: Int = 1): Flow[UpdateShardCountRequest, UpdateShardCountResponse, NotUsed] =
    Flow[UpdateShardCountRequest].mapAsync(parallelism)(underlying.updateShardCount)
}
