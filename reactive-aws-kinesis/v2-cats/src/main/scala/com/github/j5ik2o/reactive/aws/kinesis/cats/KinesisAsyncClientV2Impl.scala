package com.github.j5ik2o.reactive.aws.kinesis.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.kinesis.model._
import software.amazon.awssdk.services.kinesis

import scala.concurrent.{ ExecutionContext, Future }

private[kinesis] class KinesisAsyncClientV2Impl(override val underlying: kinesis.KinesisAsyncClient)
    extends KinesisAsyncClientV2 {
//  import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient._
//  override def addTagsToStream(
//      request: AddTagsToStreamRequest
//  ): ReaderT[Future, ExecutionContext, AddTagsToStreamResponse] = ReaderT { implicit ec =>
//    underlying.addTagsToStream(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def createStream(request: CreateStreamRequest): ReaderT[Future, ExecutionContext, CreateStreamResponse] =
//    ReaderT { implicit ec =>
//      underlying.createStream(request.toJava).toFuture.map(_.toScala)
//    }
//
//  override def decreaseStreamRetentionPeriod(
//      request: DecreaseStreamRetentionPeriodRequest
//  ): ReaderT[Future, ExecutionContext, DecreaseStreamRetentionPeriodResponse] = ReaderT { implicit ec =>
//    underlying.decreaseStreamRetentionPeriod(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def deleteStream(request: DeleteStreamRequest): ReaderT[Future, ExecutionContext, DeleteStreamResponse] =
//    ReaderT { implicit ec =>
//      underlying.deleteStream(request.toJava).toFuture.map(_.toScala)
//    }
//
//  override def deregisterStreamConsumer(
//      request: DeregisterStreamConsumerRequest
//  ): ReaderT[Future, ExecutionContext, DeregisterStreamConsumerResponse] = ReaderT { implicit ec =>
//    underlying.deregisterStreamConsumer(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def describeLimits(
//      request: DescribeLimitsRequest
//  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] = ReaderT { implicit ec =>
//    underlying.describeLimits(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def describeStream(
//      request: DescribeStreamRequest
//  ): ReaderT[Future, ExecutionContext, DescribeStreamResponse] = ReaderT { implicit ec =>
//    underlying.describeStream(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def describeStreamConsumer(
//      request: DescribeStreamConsumerRequest
//  ): ReaderT[Future, ExecutionContext, DescribeStreamConsumerResponse] = ReaderT { implicit ec =>
//    underlying.describeStreamConsumer(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def describeStreamSummary(
//      request: DescribeStreamSummaryRequest
//  ): ReaderT[Future, ExecutionContext, DescribeStreamSummaryResponse] = ReaderT { implicit ec =>
//    underlying.describeStreamSummary(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def disableEnhancedMonitoring(
//      request: DisableEnhancedMonitoringRequest
//  ): ReaderT[Future, ExecutionContext, DisableEnhancedMonitoringResponse] = ReaderT { implicit ec =>
//    underlying.disableEnhancedMonitoring(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def enableEnhancedMonitoring(
//      request: EnableEnhancedMonitoringRequest
//  ): ReaderT[Future, ExecutionContext, EnableEnhancedMonitoringResponse] = ReaderT { implicit ec =>
//    underlying.enableEnhancedMonitoring(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def getRecords(request: GetRecordsRequest): ReaderT[Future, ExecutionContext, GetRecordsResponse] = ReaderT {
//    implicit ec =>
//      underlying.getRecords(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def getShardIterator(
//      request: GetShardIteratorRequest
//  ): ReaderT[Future, ExecutionContext, GetShardIteratorResponse] = ReaderT { implicit ec =>
//    underlying.getShardIterator(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def increaseStreamRetentionPeriod(
//      request: IncreaseStreamRetentionPeriodRequest
//  ): ReaderT[Future, ExecutionContext, IncreaseStreamRetentionPeriodResponse] = ReaderT { implicit ec =>
//    underlying.increaseStreamRetentionPeriod(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def listShards(request: ListShardsRequest): ReaderT[Future, ExecutionContext, ListShardsResponse] = ReaderT {
//    implicit ec =>
//      underlying.listShards(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def listStreamConsumers(
//      request: ListStreamConsumersRequest
//  ): ReaderT[Future, ExecutionContext, ListStreamConsumersResponse] = ReaderT { implicit ec =>
//    underlying.listStreamConsumers(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def listStreams(request: ListStreamsRequest): ReaderT[Future, ExecutionContext, ListStreamsResponse] =
//    ReaderT { implicit ec =>
//      underlying.listStreams(request.toJava).toFuture.map(_.toScala)
//    }
//
//  override def listTagsForStream(
//      request: ListTagsForStreamRequest
//  ): ReaderT[Future, ExecutionContext, ListTagsForStreamResponse] = ReaderT { implicit ec =>
//    underlying.listTagsForStream(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def mergeShards(request: MergeShardsRequest): ReaderT[Future, ExecutionContext, MergeShardsResponse] =
//    ReaderT { implicit ec =>
//      underlying.mergeShards(request.toJava).toFuture.map(_.toScala)
//    }
//
//  override def putRecord(request: PutRecordRequest): ReaderT[Future, ExecutionContext, PutRecordResponse] = ReaderT {
//    implicit ec =>
//      underlying.putRecord(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def putRecords(request: PutRecordsRequest): ReaderT[Future, ExecutionContext, PutRecordsResponse] = ReaderT {
//    implicit ec =>
//      underlying.putRecords(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def registerStreamConsumer(
//      request: RegisterStreamConsumerRequest
//  ): ReaderT[Future, ExecutionContext, RegisterStreamConsumerResponse] = ReaderT { implicit ec =>
//    underlying.registerStreamConsumer(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def removeTagsFromStream(
//      request: RemoveTagsFromStreamRequest
//  ): ReaderT[Future, ExecutionContext, RemoveTagsFromStreamResponse] = ReaderT { implicit ec =>
//    underlying.removeTagsFromStream(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def splitShard(request: SplitShardRequest): ReaderT[Future, ExecutionContext, SplitShardResponse] = ReaderT {
//    implicit ec =>
//      underlying.splitShard(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def startStreamEncryption(
//      request: StartStreamEncryptionRequest
//  ): ReaderT[Future, ExecutionContext, StartStreamEncryptionResponse] = ReaderT { implicit ec =>
//    underlying.startStreamEncryption(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def stopStreamEncryption(
//      request: StopStreamEncryptionRequest
//  ): ReaderT[Future, ExecutionContext, StopStreamEncryptionResponse] = ReaderT { implicit ec =>
//    underlying.stopStreamEncryption(request.toJava).toFuture.map(_.toScala)
//  }
//
//  override def updateShardCount(
//      request: UpdateShardCountRequest
//  ): ReaderT[Future, ExecutionContext, UpdateShardCountResponse] = ReaderT { implicit ec =>
//    underlying.updateShardCount(request.toJava).toFuture.map(_.toScala)
//  }
  override def addTagsToStream(
      addTagsToStreamRequest: AddTagsToStreamRequest
  ): ReaderT[Future, ExecutionContext, AddTagsToStreamResponse] = ???

  override def createStream(
      createStreamRequest: CreateStreamRequest
  ): ReaderT[Future, ExecutionContext, CreateStreamResponse] = ???

  override def decreaseStreamRetentionPeriod(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, DecreaseStreamRetentionPeriodResponse] = ???

  override def deleteStream(
      deleteStreamRequest: DeleteStreamRequest
  ): ReaderT[Future, ExecutionContext, DeleteStreamResponse] = ???

  override def deregisterStreamConsumer(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DeregisterStreamConsumerResponse] = ???

  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] = ???

  override def describeStream(
      describeStreamRequest: DescribeStreamRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamResponse] = ???

  override def describeStreamConsumer(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamConsumerResponse] = ???

  override def describeStreamSummary(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamSummaryResponse] = ???

  override def disableEnhancedMonitoring(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, DisableEnhancedMonitoringResponse] = ???

  override def enableEnhancedMonitoring(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, EnableEnhancedMonitoringResponse] = ???

  override def getRecords(getRecordsRequest: GetRecordsRequest): ReaderT[Future, ExecutionContext, GetRecordsResponse] =
    ???

  override def getShardIterator(
      getShardIteratorRequest: GetShardIteratorRequest
  ): ReaderT[Future, ExecutionContext, GetShardIteratorResponse] = ???

  override def increaseStreamRetentionPeriod(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, IncreaseStreamRetentionPeriodResponse] = ???

  override def listShards(listShardsRequest: ListShardsRequest): ReaderT[Future, ExecutionContext, ListShardsResponse] =
    ???

  override def listStreamConsumers(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ReaderT[Future, ExecutionContext, ListStreamConsumersResponse] = ???

  override def listStreams(
      listStreamsRequest: ListStreamsRequest
  ): ReaderT[Future, ExecutionContext, ListStreamsResponse] = ???

  override def listTagsForStream(
      listTagsForStreamRequest: ListTagsForStreamRequest
  ): ReaderT[Future, ExecutionContext, ListTagsForStreamResponse] = ???

  override def mergeShards(
      mergeShardsRequest: MergeShardsRequest
  ): ReaderT[Future, ExecutionContext, MergeShardsResponse] = ???

  override def putRecord(putRecordRequest: PutRecordRequest): ReaderT[Future, ExecutionContext, PutRecordResponse] = ???

  override def putRecords(putRecordsRequest: PutRecordsRequest): ReaderT[Future, ExecutionContext, PutRecordsResponse] =
    ???

  override def registerStreamConsumer(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, RegisterStreamConsumerResponse] = ???

  override def removeTagsFromStream(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest
  ): ReaderT[Future, ExecutionContext, RemoveTagsFromStreamResponse] = ???

  override def splitShard(splitShardRequest: SplitShardRequest): ReaderT[Future, ExecutionContext, SplitShardResponse] =
    ???

  override def startStreamEncryption(
      startStreamEncryptionRequest: StartStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StartStreamEncryptionResponse] = ???

  override def stopStreamEncryption(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StopStreamEncryptionResponse] = ???

  override def subscribeToShard(
      subscribeToShardRequest: SubscribeToShardRequest,
      asyncResponseHandler: SubscribeToShardResponseHandler
  ): ReaderT[Future, ExecutionContext, Unit] = ???

  override def updateShardCount(
      updateShardCountRequest: UpdateShardCountRequest
  ): ReaderT[Future, ExecutionContext, UpdateShardCountResponse] = ???
}
