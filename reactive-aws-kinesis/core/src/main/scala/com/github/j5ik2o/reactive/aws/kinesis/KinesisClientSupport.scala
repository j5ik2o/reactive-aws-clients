package com.github.j5ik2o.reactive.aws.kinesis

import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.kinesis.model._

trait KinesisClientSupport[M[_]] { this: KinesisClient[M] =>

  def createStream(streamName: String, shardCount: Int): M[CreateStreamResponse] =
    createStream(CreateStreamRequest.builder().streamName(streamName).shardCount(shardCount).build())

  def deleteStream(streamName: String): M[DeleteStreamResponse] =
    deleteStream(DeleteStreamRequest.builder().streamName(streamName).build())

  def describeStream(streamName: String): M[DescribeStreamResponse] =
    describeStream(
      DescribeStreamRequest
        .builder()
        .streamName(streamName).build()
    )

  def describeStream(streamName: String, exclusiveStartShardId: String): M[DescribeStreamResponse] =
    describeStream(
      DescribeStreamRequest
        .builder()
        .streamName(streamName)
        .exclusiveStartShardId(exclusiveStartShardId).build()
    )

  def describeStream(streamName: String, limit: Int, exclusiveStartShardId: String): M[DescribeStreamResponse] =
    describeStream(
      DescribeStreamRequest
        .builder()
        .streamName(streamName)
        .limit(limit)
        .exclusiveStartShardId(exclusiveStartShardId).build()
    )
  def getShardIterator(
      streamName: String,
      shardId: String,
      shardIteratorType: ShardIteratorType
  ): M[GetShardIteratorResponse] =
    getShardIterator(
      GetShardIteratorRequest
        .builder()
        .streamName(streamName).shardId(shardId).shardIteratorType(shardIteratorType).build()
    )

  override def describeLimits(): M[DescribeLimitsResponse] =
    describeLimits(DescribeLimitsRequest.builder().build())

  override def listStreams(): M[ListStreamsResponse] =
    listStreams(ListStreamsRequest.builder().build())

  def listStreams(exclusiveStartStreamName: String): M[ListStreamsResponse] =
    listStreams(ListStreamsRequest.builder().exclusiveStartStreamName(exclusiveStartStreamName).build())

  def listStreams(limit: Int, exclusiveStartStreamName: String): M[ListStreamsResponse] =
    listStreams(
      ListStreamsRequest.builder().limit(limit).exclusiveStartStreamName(exclusiveStartStreamName).build()
    )

  def mergeShards(streamName: String, shardToMerge: String, adjacentShardToMerge: String): M[MergeShardsResponse] =
    mergeShards(
      MergeShardsRequest
        .builder()
        .streamName(streamName).shardToMerge(shardToMerge).adjacentShardToMerge(
          adjacentShardToMerge
        ).build()
    )

  def putRecord(streamName: String, data: SdkBytes, partitionKey: String): M[PutRecordResponse] =
    putRecord(
      PutRecordRequest.builder().streamName(streamName).data(data).partitionKey(partitionKey).build()
    )

  def putRecord(
      streamName: String,
      data: SdkBytes,
      partitionKey: String,
      sequenceNumberForOrdering: String
  ): M[PutRecordResponse] =
    putRecord(
      PutRecordRequest
        .builder()
        .streamName(streamName).data(data).partitionKey(partitionKey).sequenceNumberForOrdering(
          sequenceNumberForOrdering
        ).build()
    )

  def splitShard(streamName: String, shardToSplit: String, newStartingHashKey: String): M[SplitShardResponse] =
    splitShard(
      SplitShardRequest
        .builder()
        .streamName(streamName).shardToSplit(shardToSplit).newStartingHashKey(
          newStartingHashKey
        ).build()
    )

}
