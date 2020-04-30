// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import software.amazon.awssdk.services.kinesis.model._

trait KinesisClient[M[_]] extends KinesisClientSupport[M] {

    def addTagsToStream(addTagsToStreamRequest: AddTagsToStreamRequest): M[AddTagsToStreamResponse]

    def createStream(createStreamRequest: CreateStreamRequest): M[CreateStreamResponse]

    def decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest): M[DecreaseStreamRetentionPeriodResponse]

    def deleteStream(deleteStreamRequest: DeleteStreamRequest): M[DeleteStreamResponse]

    def deregisterStreamConsumer(deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest): M[DeregisterStreamConsumerResponse]

    def describeLimits(describeLimitsRequest: DescribeLimitsRequest): M[DescribeLimitsResponse]

    def describeLimits(): M[DescribeLimitsResponse]

    def describeStream(describeStreamRequest: DescribeStreamRequest): M[DescribeStreamResponse]

    def describeStreamConsumer(describeStreamConsumerRequest: DescribeStreamConsumerRequest): M[DescribeStreamConsumerResponse]

    def describeStreamSummary(describeStreamSummaryRequest: DescribeStreamSummaryRequest): M[DescribeStreamSummaryResponse]

    def disableEnhancedMonitoring(disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest): M[DisableEnhancedMonitoringResponse]

    def enableEnhancedMonitoring(enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest): M[EnableEnhancedMonitoringResponse]

    def getRecords(getRecordsRequest: GetRecordsRequest): M[GetRecordsResponse]

    def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): M[GetShardIteratorResponse]

    def increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest): M[IncreaseStreamRetentionPeriodResponse]

    def listShards(listShardsRequest: ListShardsRequest): M[ListShardsResponse]

    def listStreamConsumers(listStreamConsumersRequest: ListStreamConsumersRequest): M[ListStreamConsumersResponse]

    def listStreams(listStreamsRequest: ListStreamsRequest): M[ListStreamsResponse]

    def listStreams(): M[ListStreamsResponse]

    def listTagsForStream(listTagsForStreamRequest: ListTagsForStreamRequest): M[ListTagsForStreamResponse]

    def mergeShards(mergeShardsRequest: MergeShardsRequest): M[MergeShardsResponse]

    def putRecord(putRecordRequest: PutRecordRequest): M[PutRecordResponse]

    def putRecords(putRecordsRequest: PutRecordsRequest): M[PutRecordsResponse]

    def registerStreamConsumer(registerStreamConsumerRequest: RegisterStreamConsumerRequest): M[RegisterStreamConsumerResponse]

    def removeTagsFromStream(removeTagsFromStreamRequest: RemoveTagsFromStreamRequest): M[RemoveTagsFromStreamResponse]

    def splitShard(splitShardRequest: SplitShardRequest): M[SplitShardResponse]

    def startStreamEncryption(startStreamEncryptionRequest: StartStreamEncryptionRequest): M[StartStreamEncryptionResponse]

    def stopStreamEncryption(stopStreamEncryptionRequest: StopStreamEncryptionRequest): M[StopStreamEncryptionResponse]

    def updateShardCount(updateShardCountRequest: UpdateShardCountRequest): M[UpdateShardCountResponse]

}
