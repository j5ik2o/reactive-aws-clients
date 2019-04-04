// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.monix

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import monix.eval.Task
import monix.reactive.Observable

object KinesisMonixClient {

  def apply(underlying: KinesisAsyncClient): KinesisMonixClient = new KinesisMonixClientImpl(underlying)

}

trait KinesisMonixClient extends KinesisClient[Task] {

  val underlying: KinesisAsyncClient

  override def addTagsToStream(
      addTagsToStreamRequest: AddTagsToStreamRequest
  ): Task[AddTagsToStreamResponse] = Task.deferFuture {
    underlying.addTagsToStream(addTagsToStreamRequest)
  }
  override def createStream(
      createStreamRequest: CreateStreamRequest
  ): Task[CreateStreamResponse] = Task.deferFuture {
    underlying.createStream(createStreamRequest)
  }
  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Task[DecreaseStreamRetentionPeriodResponse] = Task.deferFuture {
    underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest)
  }
  override def deleteStream(
      deleteStreamRequest: DeleteStreamRequest
  ): Task[DeleteStreamResponse] = Task.deferFuture {
    underlying.deleteStream(deleteStreamRequest)
  }
  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Task[DeregisterStreamConsumerResponse] = Task.deferFuture {
    underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest)
  }
  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): Task[DescribeLimitsResponse] = Task.deferFuture {
    underlying.describeLimits(describeLimitsRequest)
  }
  override def describeStream(
      describeStreamRequest: DescribeStreamRequest
  ): Task[DescribeStreamResponse] = Task.deferFuture {
    underlying.describeStream(describeStreamRequest)
  }
  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Task[DescribeStreamConsumerResponse] = Task.deferFuture {
    underlying.describeStreamConsumer(describeStreamConsumerRequest)
  }
  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Task[DescribeStreamSummaryResponse] = Task.deferFuture {
    underlying.describeStreamSummary(describeStreamSummaryRequest)
  }
  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Task[DisableEnhancedMonitoringResponse] = Task.deferFuture {
    underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest)
  }
  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Task[EnableEnhancedMonitoringResponse] = Task.deferFuture {
    underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest)
  }
  override def getRecords(
      getRecordsRequest: GetRecordsRequest
  ): Task[GetRecordsResponse] = Task.deferFuture {
    underlying.getRecords(getRecordsRequest)
  }
  override def getShardIterator(
      getShardIteratorRequest: GetShardIteratorRequest
  ): Task[GetShardIteratorResponse] = Task.deferFuture {
    underlying.getShardIterator(getShardIteratorRequest)
  }
  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Task[IncreaseStreamRetentionPeriodResponse] = Task.deferFuture {
    underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest)
  }
  override def listShards(
      listShardsRequest: ListShardsRequest
  ): Task[ListShardsResponse] = Task.deferFuture {
    underlying.listShards(listShardsRequest)
  }
  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Task[ListStreamConsumersResponse] = Task.deferFuture {
    underlying.listStreamConsumers(listStreamConsumersRequest)
  }
  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Observable[ListStreamConsumersResponse] =
    Observable.fromReactivePublisher(underlying.listStreamConsumersPaginator(listStreamConsumersRequest))
  override def listStreams(
      listStreamsRequest: ListStreamsRequest
  ): Task[ListStreamsResponse] = Task.deferFuture {
    underlying.listStreams(listStreamsRequest)
  }
  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Task[ListTagsForStreamResponse] = Task.deferFuture {
    underlying.listTagsForStream(listTagsForStreamRequest)
  }
  override def mergeShards(
      mergeShardsRequest: MergeShardsRequest
  ): Task[MergeShardsResponse] = Task.deferFuture {
    underlying.mergeShards(mergeShardsRequest)
  }
  override def putRecord(
      putRecordRequest: PutRecordRequest
  ): Task[PutRecordResponse] = Task.deferFuture {
    underlying.putRecord(putRecordRequest)
  }
  override def putRecords(
      putRecordsRequest: PutRecordsRequest
  ): Task[PutRecordsResponse] = Task.deferFuture {
    underlying.putRecords(putRecordsRequest)
  }
  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Task[RegisterStreamConsumerResponse] = Task.deferFuture {
    underlying.registerStreamConsumer(registerStreamConsumerRequest)
  }
  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Task[RemoveTagsFromStreamResponse] = Task.deferFuture {
    underlying.removeTagsFromStream(removeTagsFromStreamRequest)
  }
  override def splitShard(
      splitShardRequest: SplitShardRequest
  ): Task[SplitShardResponse] = Task.deferFuture {
    underlying.splitShard(splitShardRequest)
  }
  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Task[StartStreamEncryptionResponse] = Task.deferFuture {
    underlying.startStreamEncryption(startStreamEncryptionRequest)
  }
  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Task[StopStreamEncryptionResponse] = Task.deferFuture {
    underlying.stopStreamEncryption(stopStreamEncryptionRequest)
  }
  override def updateShardCount(
      updateShardCountRequest: UpdateShardCountRequest
  ): Task[UpdateShardCountResponse] = Task.deferFuture {
    underlying.updateShardCount(updateShardCountRequest)
  }

}
