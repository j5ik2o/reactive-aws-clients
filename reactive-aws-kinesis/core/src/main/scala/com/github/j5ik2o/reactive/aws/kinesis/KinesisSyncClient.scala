// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.ops._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._
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
    import AddTagsToStreamRequestOps._
    import AddTagsToStreamResponseOps._
    toEither(underlying.addTagsToStream(addTagsToStreamRequest.toJava)).right.map(_.toScala)
  }

  override def createStream(createStreamRequest: CreateStreamRequest): Either[Throwable, CreateStreamResponse] = {
    import CreateStreamRequestOps._
    import CreateStreamResponseOps._
    toEither(underlying.createStream(createStreamRequest.toJava)).right.map(_.toScala)
  }

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Either[Throwable, DecreaseStreamRetentionPeriodResponse] = {
    import DecreaseStreamRetentionPeriodRequestOps._
    import DecreaseStreamRetentionPeriodResponseOps._
    toEither(underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest.toJava)).right.map(_.toScala)
  }

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): Either[Throwable, DeleteStreamResponse] = {
    import DeleteStreamRequestOps._
    import DeleteStreamResponseOps._
    toEither(underlying.deleteStream(deleteStreamRequest.toJava)).right.map(_.toScala)
  }

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Either[Throwable, DeregisterStreamConsumerResponse] = {
    import DeregisterStreamConsumerRequestOps._
    import DeregisterStreamConsumerResponseOps._
    toEither(underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest.toJava)).right.map(_.toScala)
  }

  override def describeLimits(): Either[Throwable, DescribeLimitsResponse] = {

    import DescribeLimitsResponseOps._
    toEither(underlying.describeLimits()).right.map(_.toScala)
  }

  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): Either[Throwable, DescribeLimitsResponse] = {
    import DescribeLimitsRequestOps._
    import DescribeLimitsResponseOps._
    toEither(underlying.describeLimits(describeLimitsRequest.toJava)).right.map(_.toScala)
  }

  override def describeStream(
      describeStreamRequest: DescribeStreamRequest
  ): Either[Throwable, DescribeStreamResponse] = {
    import DescribeStreamRequestOps._
    import DescribeStreamResponseOps._
    toEither(underlying.describeStream(describeStreamRequest.toJava)).right.map(_.toScala)
  }

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Either[Throwable, DescribeStreamConsumerResponse] = {
    import DescribeStreamConsumerRequestOps._
    import DescribeStreamConsumerResponseOps._
    toEither(underlying.describeStreamConsumer(describeStreamConsumerRequest.toJava)).right.map(_.toScala)
  }

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Either[Throwable, DescribeStreamSummaryResponse] = {
    import DescribeStreamSummaryRequestOps._
    import DescribeStreamSummaryResponseOps._
    toEither(underlying.describeStreamSummary(describeStreamSummaryRequest.toJava)).right.map(_.toScala)
  }

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Either[Throwable, DisableEnhancedMonitoringResponse] = {
    import DisableEnhancedMonitoringRequestOps._
    import DisableEnhancedMonitoringResponseOps._
    toEither(underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest.toJava)).right.map(_.toScala)
  }

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Either[Throwable, EnableEnhancedMonitoringResponse] = {
    import EnableEnhancedMonitoringRequestOps._
    import EnableEnhancedMonitoringResponseOps._
    toEither(underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest.toJava)).right.map(_.toScala)
  }

  override def getRecords(getRecordsRequest: GetRecordsRequest): Either[Throwable, GetRecordsResponse] = {
    import GetRecordsRequestOps._
    import GetRecordsResponseOps._
    toEither(underlying.getRecords(getRecordsRequest.toJava)).right.map(_.toScala)
  }

  override def getShardIterator(
      getShardIteratorRequest: GetShardIteratorRequest
  ): Either[Throwable, GetShardIteratorResponse] = {
    import GetShardIteratorRequestOps._
    import GetShardIteratorResponseOps._
    toEither(underlying.getShardIterator(getShardIteratorRequest.toJava)).right.map(_.toScala)
  }

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Either[Throwable, IncreaseStreamRetentionPeriodResponse] = {
    import IncreaseStreamRetentionPeriodRequestOps._
    import IncreaseStreamRetentionPeriodResponseOps._
    toEither(underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest.toJava)).right.map(_.toScala)
  }

  override def listShards(listShardsRequest: ListShardsRequest): Either[Throwable, ListShardsResponse] = {
    import ListShardsRequestOps._
    import ListShardsResponseOps._
    toEither(underlying.listShards(listShardsRequest.toJava)).right.map(_.toScala)
  }

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Either[Throwable, ListStreamConsumersResponse] = {
    import ListStreamConsumersRequestOps._
    import ListStreamConsumersResponseOps._
    toEither(underlying.listStreamConsumers(listStreamConsumersRequest.toJava)).right.map(_.toScala)
  }

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersIterable = {
    import ListStreamConsumersRequestOps._
    new ListStreamConsumersIterableImpl(underlying.listStreamConsumersPaginator(listStreamConsumersRequest.toJava))
  }

  override def listStreams(): Either[Throwable, ListStreamsResponse] = {

    import ListStreamsResponseOps._
    toEither(underlying.listStreams()).right.map(_.toScala)
  }

  override def listStreams(listStreamsRequest: ListStreamsRequest): Either[Throwable, ListStreamsResponse] = {
    import ListStreamsRequestOps._
    import ListStreamsResponseOps._
    toEither(underlying.listStreams(listStreamsRequest.toJava)).right.map(_.toScala)
  }

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Either[Throwable, ListTagsForStreamResponse] = {
    import ListTagsForStreamRequestOps._
    import ListTagsForStreamResponseOps._
    toEither(underlying.listTagsForStream(listTagsForStreamRequest.toJava)).right.map(_.toScala)
  }

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): Either[Throwable, MergeShardsResponse] = {
    import MergeShardsRequestOps._
    import MergeShardsResponseOps._
    toEither(underlying.mergeShards(mergeShardsRequest.toJava)).right.map(_.toScala)
  }

  override def putRecord(putRecordRequest: PutRecordRequest): Either[Throwable, PutRecordResponse] = {
    import PutRecordRequestOps._
    import PutRecordResponseOps._
    toEither(underlying.putRecord(putRecordRequest.toJava)).right.map(_.toScala)
  }

  override def putRecords(putRecordsRequest: PutRecordsRequest): Either[Throwable, PutRecordsResponse] = {
    import PutRecordsRequestOps._
    import PutRecordsResponseOps._
    toEither(underlying.putRecords(putRecordsRequest.toJava)).right.map(_.toScala)
  }

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Either[Throwable, RegisterStreamConsumerResponse] = {
    import RegisterStreamConsumerRequestOps._
    import RegisterStreamConsumerResponseOps._
    toEither(underlying.registerStreamConsumer(registerStreamConsumerRequest.toJava)).right.map(_.toScala)
  }

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Either[Throwable, RemoveTagsFromStreamResponse] = {
    import RemoveTagsFromStreamRequestOps._
    import RemoveTagsFromStreamResponseOps._
    toEither(underlying.removeTagsFromStream(removeTagsFromStreamRequest.toJava)).right.map(_.toScala)
  }

  override def splitShard(splitShardRequest: SplitShardRequest): Either[Throwable, SplitShardResponse] = {
    import SplitShardRequestOps._
    import SplitShardResponseOps._
    toEither(underlying.splitShard(splitShardRequest.toJava)).right.map(_.toScala)
  }

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Either[Throwable, StartStreamEncryptionResponse] = {
    import StartStreamEncryptionRequestOps._
    import StartStreamEncryptionResponseOps._
    toEither(underlying.startStreamEncryption(startStreamEncryptionRequest.toJava)).right.map(_.toScala)
  }

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Either[Throwable, StopStreamEncryptionResponse] = {
    import StopStreamEncryptionRequestOps._
    import StopStreamEncryptionResponseOps._
    toEither(underlying.stopStreamEncryption(stopStreamEncryptionRequest.toJava)).right.map(_.toScala)
  }

  override def updateShardCount(
      updateShardCountRequest: UpdateShardCountRequest
  ): Either[Throwable, UpdateShardCountResponse] = {
    import UpdateShardCountRequestOps._
    import UpdateShardCountResponseOps._
    toEither(underlying.updateShardCount(updateShardCountRequest.toJava)).right.map(_.toScala)
  }

}
