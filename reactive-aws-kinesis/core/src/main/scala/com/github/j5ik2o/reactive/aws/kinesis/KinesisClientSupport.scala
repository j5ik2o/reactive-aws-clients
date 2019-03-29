package com.github.j5ik2o.reactive.aws.kinesis

import com.github.j5ik2o.reactive.aws.kinesis.model._

trait KinesisClientSupport[M[_]] { this: KinesisClient[M] =>

  def createStream(streamName: String, shardCount: Int): M[CreateStreamResponse] =
    createStream(CreateStreamRequest().withStreamName(Some(streamName)).withShardCount(Some(shardCount)))

  def deleteStream(streamName: String): M[DeleteStreamResponse] =
    deleteStream(DeleteStreamRequest().withStreamName(Some(streamName)))

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
  def getShardIterator(streamName: String,
                       shardId: String,
                       shardIteratorType: ShardIteratorType): M[GetShardIteratorResponse] =
    getShardIterator(
      GetShardIteratorRequest()
        .withStreamName(Some(streamName)).withShardId(Some(shardId)).withShardIteratorType(Some(shardIteratorType))
    )

  override def describeLimits(): M[DescribeLimitsResponse] =
    describeLimits(DescribeLimitsRequest())

  override def listStreams(): M[ListStreamsResponse] =
    listStreams(ListStreamsRequest())

  def listStreams(exclusiveStartStreamName: String): M[ListStreamsResponse] =
    listStreams(ListStreamsRequest().withExclusiveStartStreamName(Some(exclusiveStartStreamName)))

  def listStreams(limit: Int, exclusiveStartStreamName: String): M[ListStreamsResponse] =
    listStreams(
      ListStreamsRequest().withLimit(Some(limit)).withExclusiveStartStreamName(Some(exclusiveStartStreamName))
    )

  def mergeShards(streamName: String, shardToMerge: String, adjacentShardToMerge: String): M[MergeShardsResponse] =
    mergeShards(
      MergeShardsRequest()
        .withStreamName(Some(streamName)).withShardToMerge(Some(shardToMerge)).withAdjacentShardToMerge(
          Some(adjacentShardToMerge)
        )
    )

  def putRecord(streamName: String, data: Array[Byte], partitionKey: String): M[PutRecordResponse] =
    putRecord(
      PutRecordRequest().withStreamName(Some(streamName)).withData(Some(data)).withPartitionKey(Some(partitionKey))
    )

  def putRecord(streamName: String,
                data: Array[Byte],
                partitionKey: String,
                sequenceNumberForOrdering: String): M[PutRecordResponse] =
    putRecord(
      PutRecordRequest()
        .withStreamName(Some(streamName)).withData(Some(data)).withPartitionKey(Some(partitionKey)).withSequenceNumberForOrdering(
          Some(sequenceNumberForOrdering)
        )
    )

  def splitShard(streamName: String, shardToSplit: String, newStartingHashKey: String): M[SplitShardResponse] =
    splitShard(
      SplitShardRequest()
        .withStreamName(Some(streamName)).withShardToSplit(Some(shardToSplit)).withNewStartingHashKey(
          Some(newStartingHashKey)
        )
    )

}
