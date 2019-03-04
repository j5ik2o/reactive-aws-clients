package com.github.j5ik2o.reactive.kinesis
import java.nio.ByteBuffer

import com.github.j5ik2o.reactive.kinesis.model._

trait KinesisClient[M[_]] {

  def addTagsToStream(request: AddTagsToStreamRequest): M[AddTagsToStreamResponse]

  def createStream(request: CreateStreamRequest): M[CreateStreamResponse]

  def createStream(streamName: String, shardCount: Int): M[CreateStreamResponse] =
    createStream(CreateStreamRequest().withStreamName(Some(streamName)).withShardCount(Some(shardCount)))

  def decreaseStreamRetentionPeriod(
      request: DecreaseStreamRetentionPeriodRequest
  ): M[DecreaseStreamRetentionPeriodResponse]

  def deleteStream(request: DeleteStreamRequest): M[DeleteStreamResponse]

  def deleteStream(streamName: String): M[DeleteStreamResponse] =
    deleteStream(DeleteStreamRequest().withStreamName(Some(streamName)))

  def deregisterStreamConsumer(request: DeregisterStreamConsumerRequest): M[DeregisterStreamConsumerResponse]

  def describeLimits(request: DescribeLimitsRequest): M[DescribeLimitsResponse]

  def describeStream(request: DescribeStreamRequest): M[DescribeStreamResponse]

  def describeStream(streamName: String): M[DescribeStreamResponse] =
    describeStream(
      DescribeStreamRequest()
        .withStreamName(Some(streamName))
    )

  def describeStream(streamName: String, exclusiveStartShardId: String): M[DescribeStreamResponse] =
    describeStream(
      DescribeStreamRequest()
        .withStreamName(Some(streamName))
        .withExclusiveStartShardId(Some(exclusiveStartShardId))
    )

  def describeStream(streamName: String, limit: Int, exclusiveStartShardId: String): M[DescribeStreamResponse] =
    describeStream(
      DescribeStreamRequest()
        .withStreamName(Some(streamName))
        .withLimit(Some(limit))
        .withExclusiveStartShardId(Some(exclusiveStartShardId))
    )

  def describeStreamConsumer(request: DescribeStreamConsumerRequest): M[DescribeStreamConsumerResponse]

  def describeStreamSummary(request: DescribeStreamSummaryRequest): M[DescribeStreamSummaryResponse]

  def disableEnhancedMonitoring(request: DisableEnhancedMonitoringRequest): M[DisableEnhancedMonitoringResponse]

  def enableEnhancedMonitoring(request: EnableEnhancedMonitoringRequest): M[EnableEnhancedMonitoringResponse]

  def getRecords(request: GetRecordsRequest): M[GetRecordsResponse]

  def getShardIterator(request: GetShardIteratorRequest): M[GetShardIteratorResponse]

  def getShardIterator(streamName: String,
                       shardId: String,
                       shardIteratorType: ShardIteratorType): M[GetShardIteratorResponse] =
    getShardIterator(
      GetShardIteratorRequest()
        .withStreamName(Some(streamName)).withShardId(Some(shardId)).withShardIteratorType(Some(shardIteratorType))
    )

  def increaseStreamRetentionPeriod(
      request: IncreaseStreamRetentionPeriodRequest
  ): M[IncreaseStreamRetentionPeriodResponse]

  def listShards(request: ListShardsRequest): M[ListShardsResponse]

  def listStreamConsumers(request: ListStreamConsumersRequest): M[ListStreamConsumersResponse]

  def listStreams(request: ListStreamsRequest): M[ListStreamsResponse]

  def listStreams(): M[ListStreamsResponse] =
    listStreams(ListStreamsRequest())

  def listStreams(exclusiveStartStreamName: String): M[ListStreamsResponse] =
    listStreams(ListStreamsRequest().withExclusiveStartStreamName(Some(exclusiveStartStreamName)))

  def listStreams(limit: Int, exclusiveStartStreamName: String): M[ListStreamsResponse] =
    listStreams(
      ListStreamsRequest().withLimit(Some(limit)).withExclusiveStartStreamName(Some(exclusiveStartStreamName))
    )

  def listTagsForStream(request: ListTagsForStreamRequest): M[ListTagsForStreamResponse]

  def mergeShards(request: MergeShardsRequest): M[MergeShardsResponse]

  def mergeShards(streamName: String, shardToMerge: String, adjacentShardToMerge: String): M[MergeShardsResponse] =
    mergeShards(
      MergeShardsRequest()
        .withStreamName(Some(streamName)).withShardToMerge(Some(shardToMerge)).withAdjacentShardToMerge(
          Some(adjacentShardToMerge)
        )
    )

  def putRecord(request: PutRecordRequest): M[PutRecordResponse]

  def putRecord(streamName: String, data: ByteBuffer, partitionKey: String): M[PutRecordResponse] =
    putRecord(
      PutRecordRequest().withStreamName(Some(streamName)).withData(Some(data)).withPartitionKey(Some(partitionKey))
    )

  def putRecord(streamName: String,
                data: ByteBuffer,
                partitionKey: String,
                sequenceNumberForOrdering: String): M[PutRecordResponse] =
    putRecord(
      PutRecordRequest()
        .withStreamName(Some(streamName)).withData(Some(data)).withPartitionKey(Some(partitionKey)).withSequenceNumberForOrdering(
          Some(sequenceNumberForOrdering)
        )
    )

  def putRecords(request: PutRecordsRequest): M[PutRecordsResponse]

  def registerStreamConsumer(request: RegisterStreamConsumerRequest): M[RegisterStreamConsumerResponse]

  def removeTagsFromStream(request: RemoveTagsFromStreamRequest): M[RemoveTagsFromStreamResponse]

  def splitShard(request: SplitShardRequest): M[SplitShardResponse]

  def splitShard(streamName: String, shardToSplit: String, newStartingHashKey: String): M[SplitShardResponse] =
    splitShard(
      SplitShardRequest()
        .withStreamName(Some(streamName)).withShardToSplit(Some(shardToSplit)).withNewStartingHashKey(
          Some(newStartingHashKey)
        )
    )

  def startStreamEncryption(request: StartStreamEncryptionRequest): M[StartStreamEncryptionResponse]

  def stopStreamEncryption(request: StopStreamEncryptionRequest): M[StopStreamEncryptionResponse]

  def updateShardCount(request: UpdateShardCountRequest): M[UpdateShardCountResponse]

}
