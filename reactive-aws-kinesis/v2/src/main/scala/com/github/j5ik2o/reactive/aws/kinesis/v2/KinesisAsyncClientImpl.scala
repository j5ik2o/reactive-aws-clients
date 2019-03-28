// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._
import com.github.j5ik2o.reactive.aws.kinesis.v2.model._
import com.github.j5ik2o.reactive.aws.kinesis.v2.model.rs._
import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient => JavaKinesisAsyncClient }

import scala.concurrent.{ ExecutionContext, Future }

private[kinesis] class KinesisAsyncClientImpl(override val underlying: JavaKinesisAsyncClient)(
    implicit ec: ExecutionContext
) extends KinesisAsyncClient {

  import KinesisAsyncClient._

  override def addTagsToStream(addTagsToStreamRequest: AddTagsToStreamRequest): Future[AddTagsToStreamResponse] = {
    import AddTagsToStreamRequestOps._
    import AddTagsToStreamResponseOps._
    underlying.addTagsToStream(addTagsToStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def createStream(createStreamRequest: CreateStreamRequest): Future[CreateStreamResponse] = {
    import CreateStreamRequestOps._
    import CreateStreamResponseOps._
    underlying.createStream(createStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): Future[DecreaseStreamRetentionPeriodResponse] = {
    import DecreaseStreamRetentionPeriodRequestOps._
    import DecreaseStreamRetentionPeriodResponseOps._
    underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteStream(deleteStreamRequest: DeleteStreamRequest): Future[DeleteStreamResponse] = {
    import DeleteStreamRequestOps._
    import DeleteStreamResponseOps._
    underlying.deleteStream(deleteStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): Future[DeregisterStreamConsumerResponse] = {
    import DeregisterStreamConsumerRequestOps._
    import DeregisterStreamConsumerResponseOps._
    underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] = {
    import DescribeLimitsRequestOps._
    import DescribeLimitsResponseOps._
    underlying.describeLimits(describeLimitsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(): Future[DescribeLimitsResponse] = {

    import DescribeLimitsResponseOps._
    underlying.describeLimits().toFuture.map(_.toScala)
  }

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Future[DescribeStreamResponse] = {
    import DescribeStreamRequestOps._
    import DescribeStreamResponseOps._
    underlying.describeStream(describeStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): Future[DescribeStreamConsumerResponse] = {
    import DescribeStreamConsumerRequestOps._
    import DescribeStreamConsumerResponseOps._
    underlying.describeStreamConsumer(describeStreamConsumerRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): Future[DescribeStreamSummaryResponse] = {
    import DescribeStreamSummaryRequestOps._
    import DescribeStreamSummaryResponseOps._
    underlying.describeStreamSummary(describeStreamSummaryRequest.toJava).toFuture.map(_.toScala)
  }

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): Future[DisableEnhancedMonitoringResponse] = {
    import DisableEnhancedMonitoringRequestOps._
    import DisableEnhancedMonitoringResponseOps._
    underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest.toJava).toFuture.map(_.toScala)
  }

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): Future[EnableEnhancedMonitoringResponse] = {
    import EnableEnhancedMonitoringRequestOps._
    import EnableEnhancedMonitoringResponseOps._
    underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest.toJava).toFuture.map(_.toScala)
  }

  override def getRecords(getRecordsRequest: GetRecordsRequest): Future[GetRecordsResponse] = {
    import GetRecordsRequestOps._
    import GetRecordsResponseOps._
    underlying.getRecords(getRecordsRequest.toJava).toFuture.map(_.toScala)
  }

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): Future[GetShardIteratorResponse] = {
    import GetShardIteratorRequestOps._
    import GetShardIteratorResponseOps._
    underlying.getShardIterator(getShardIteratorRequest.toJava).toFuture.map(_.toScala)
  }

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): Future[IncreaseStreamRetentionPeriodResponse] = {
    import IncreaseStreamRetentionPeriodRequestOps._
    import IncreaseStreamRetentionPeriodResponseOps._
    underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest.toJava).toFuture.map(_.toScala)
  }

  override def listShards(listShardsRequest: ListShardsRequest): Future[ListShardsResponse] = {
    import ListShardsRequestOps._
    import ListShardsResponseOps._
    underlying.listShards(listShardsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Future[ListStreamConsumersResponse] = {
    import ListStreamConsumersRequestOps._
    import ListStreamConsumersResponseOps._
    underlying.listStreamConsumers(listStreamConsumersRequest.toJava).toFuture.map(_.toScala)
  }

  override def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersPublisher = {
    import ListStreamConsumersRequestOps._
    new ListStreamConsumersPublisherImpl(underlying.listStreamConsumersPaginator(listStreamConsumersRequest.toJava))
  }

  override def listStreams(listStreamsRequest: ListStreamsRequest): Future[ListStreamsResponse] = {
    import ListStreamsRequestOps._
    import ListStreamsResponseOps._
    underlying.listStreams(listStreamsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listStreams(): Future[ListStreamsResponse] = {

    import ListStreamsResponseOps._
    underlying.listStreams().toFuture.map(_.toScala)
  }

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): Future[ListTagsForStreamResponse] = {
    import ListTagsForStreamRequestOps._
    import ListTagsForStreamResponseOps._
    underlying.listTagsForStream(listTagsForStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def mergeShards(mergeShardsRequest: MergeShardsRequest): Future[MergeShardsResponse] = {
    import MergeShardsRequestOps._
    import MergeShardsResponseOps._
    underlying.mergeShards(mergeShardsRequest.toJava).toFuture.map(_.toScala)
  }

  override def putRecord(putRecordRequest: PutRecordRequest): Future[PutRecordResponse] = {
    import PutRecordRequestOps._
    import PutRecordResponseOps._
    underlying.putRecord(putRecordRequest.toJava).toFuture.map(_.toScala)
  }

  override def putRecords(putRecordsRequest: PutRecordsRequest): Future[PutRecordsResponse] = {
    import PutRecordsRequestOps._
    import PutRecordsResponseOps._
    underlying.putRecords(putRecordsRequest.toJava).toFuture.map(_.toScala)
  }

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): Future[RegisterStreamConsumerResponse] = {
    import RegisterStreamConsumerRequestOps._
    import RegisterStreamConsumerResponseOps._
    underlying.registerStreamConsumer(registerStreamConsumerRequest.toJava).toFuture.map(_.toScala)
  }

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): Future[RemoveTagsFromStreamResponse] = {
    import RemoveTagsFromStreamRequestOps._
    import RemoveTagsFromStreamResponseOps._
    underlying.removeTagsFromStream(removeTagsFromStreamRequest.toJava).toFuture.map(_.toScala)
  }

  override def splitShard(splitShardRequest: SplitShardRequest): Future[SplitShardResponse] = {
    import SplitShardRequestOps._
    import SplitShardResponseOps._
    underlying.splitShard(splitShardRequest.toJava).toFuture.map(_.toScala)
  }

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): Future[StartStreamEncryptionResponse] = {
    import StartStreamEncryptionRequestOps._
    import StartStreamEncryptionResponseOps._
    underlying.startStreamEncryption(startStreamEncryptionRequest.toJava).toFuture.map(_.toScala)
  }

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): Future[StopStreamEncryptionResponse] = {
    import StopStreamEncryptionRequestOps._
    import StopStreamEncryptionResponseOps._
    underlying.stopStreamEncryption(stopStreamEncryptionRequest.toJava).toFuture.map(_.toScala)
  }

  override def subscribeToShard(subscribeToShardRequest: SubscribeToShardRequest,
                                asyncResponseHandler: SubscribeToShardResponseHandler): Future[Unit] = {
    import SubscribeToShardRequestOps._, SubscribeToShardResponseHandlerOps._
    underlying.subscribeToShard(subscribeToShardRequest.toJava, asyncResponseHandler.toJava).toFuture.map(_ => ())
  }

  override def updateShardCount(updateShardCountRequest: UpdateShardCountRequest): Future[UpdateShardCountResponse] = {
    import UpdateShardCountRequestOps._
    import UpdateShardCountResponseOps._
    underlying.updateShardCount(updateShardCountRequest.toJava).toFuture.map(_.toScala)
  }

}
