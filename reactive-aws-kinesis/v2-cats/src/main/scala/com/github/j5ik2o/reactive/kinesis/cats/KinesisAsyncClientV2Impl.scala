package com.github.j5ik2o.reactive.kinesis.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.kinesis.model._
import software.amazon.awssdk.services.kinesis

import scala.concurrent.{ ExecutionContext, Future }

private[kinesis] class KinesisAsyncClientV2Impl(override val underlying: kinesis.KinesisAsyncClient)
    extends KinesisAsyncClientV2 {
  import com.github.j5ik2o.reactive.kinesis.KinesisAsyncClientV2._
  import com.github.j5ik2o.reactive.kinesis.model.v2.AddTagsToStreamRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.AddTagsToStreamResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.CreateStreamRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.CreateStreamResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DecreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DecreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DeleteStreamRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DeleteStreamResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DeregisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DeregisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeStreamRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeStreamResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeStreamSummaryRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DescribeStreamSummaryResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DisableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.DisableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.EnableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.EnableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.GetRecordsRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.GetRecordsResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.GetShardIteratorRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.GetShardIteratorResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.IncreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.IncreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListShardsRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListShardsResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListStreamConsumersRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListStreamConsumersResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListStreamsRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListStreamsResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListTagsForStreamRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.ListTagsForStreamResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.MergeShardsRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.MergeShardsResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.PutRecordRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.PutRecordResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.PutRecordsRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.PutRecordsResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.RegisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.RegisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.RemoveTagsFromStreamRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.RemoveTagsFromStreamResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.SplitShardRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.SplitShardResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.StartStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.StartStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.StopStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.StopStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.UpdateShardCountRequestOps._
  import com.github.j5ik2o.reactive.kinesis.model.v2.UpdateShardCountResponseOps._

  override def addTagsToStream(
      request: AddTagsToStreamRequest
  ): ReaderT[Future, ExecutionContext, AddTagsToStreamResponse] = ReaderT { implicit ec =>
    underlying.addTagsToStream(request.toJava).toFuture.map(_.toScala)
  }

  override def createStream(request: CreateStreamRequest): ReaderT[Future, ExecutionContext, CreateStreamResponse] =
    ReaderT { implicit ec =>
      underlying.createStream(request.toJava).toFuture.map(_.toScala)
    }

  override def decreaseStreamRetentionPeriod(
      request: DecreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, DecreaseStreamRetentionPeriodResponse] = ReaderT { implicit ec =>
    underlying.decreaseStreamRetentionPeriod(request.toJava).toFuture.map(_.toScala)
  }

  override def deleteStream(request: DeleteStreamRequest): ReaderT[Future, ExecutionContext, DeleteStreamResponse] =
    ReaderT { implicit ec =>
      underlying.deleteStream(request.toJava).toFuture.map(_.toScala)
    }

  override def deregisterStreamConsumer(
      request: DeregisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DeregisterStreamConsumerResponse] = ReaderT { implicit ec =>
    underlying.deregisterStreamConsumer(request.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(
      request: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] = ReaderT { implicit ec =>
    underlying.describeLimits(request.toJava).toFuture.map(_.toScala)
  }

  override def describeStream(
      request: DescribeStreamRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamResponse] = ReaderT { implicit ec =>
    underlying.describeStream(request.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamConsumer(
      request: DescribeStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamConsumerResponse] = ReaderT { implicit ec =>
    underlying.describeStreamConsumer(request.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamSummary(
      request: DescribeStreamSummaryRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamSummaryResponse] = ReaderT { implicit ec =>
    underlying.describeStreamSummary(request.toJava).toFuture.map(_.toScala)
  }

  override def disableEnhancedMonitoring(
      request: DisableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, DisableEnhancedMonitoringResponse] = ReaderT { implicit ec =>
    underlying.disableEnhancedMonitoring(request.toJava).toFuture.map(_.toScala)
  }

  override def enableEnhancedMonitoring(
      request: EnableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, EnableEnhancedMonitoringResponse] = ReaderT { implicit ec =>
    underlying.enableEnhancedMonitoring(request.toJava).toFuture.map(_.toScala)
  }

  override def getRecords(request: GetRecordsRequest): ReaderT[Future, ExecutionContext, GetRecordsResponse] = ReaderT {
    implicit ec =>
      underlying.getRecords(request.toJava).toFuture.map(_.toScala)
  }

  override def getShardIterator(
      request: GetShardIteratorRequest
  ): ReaderT[Future, ExecutionContext, GetShardIteratorResponse] = ReaderT { implicit ec =>
    underlying.getShardIterator(request.toJava).toFuture.map(_.toScala)
  }

  override def increaseStreamRetentionPeriod(
      request: IncreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, IncreaseStreamRetentionPeriodResponse] = ReaderT { implicit ec =>
    underlying.increaseStreamRetentionPeriod(request.toJava).toFuture.map(_.toScala)
  }

  override def listShards(request: ListShardsRequest): ReaderT[Future, ExecutionContext, ListShardsResponse] = ReaderT {
    implicit ec =>
      underlying.listShards(request.toJava).toFuture.map(_.toScala)
  }

  override def listStreamConsumers(
      request: ListStreamConsumersRequest
  ): ReaderT[Future, ExecutionContext, ListStreamConsumersResponse] = ReaderT { implicit ec =>
    underlying.listStreamConsumers(request.toJava).toFuture.map(_.toScala)
  }

  override def listStreams(request: ListStreamsRequest): ReaderT[Future, ExecutionContext, ListStreamsResponse] =
    ReaderT { implicit ec =>
      underlying.listStreams(request.toJava).toFuture.map(_.toScala)
    }

  override def listTagsForStream(
      request: ListTagsForStreamRequest
  ): ReaderT[Future, ExecutionContext, ListTagsForStreamResponse] = ReaderT { implicit ec =>
    underlying.listTagsForStream(request.toJava).toFuture.map(_.toScala)
  }

  override def mergeShards(request: MergeShardsRequest): ReaderT[Future, ExecutionContext, MergeShardsResponse] =
    ReaderT { implicit ec =>
      underlying.mergeShards(request.toJava).toFuture.map(_.toScala)
    }

  override def putRecord(request: PutRecordRequest): ReaderT[Future, ExecutionContext, PutRecordResponse] = ReaderT {
    implicit ec =>
      underlying.putRecord(request.toJava).toFuture.map(_.toScala)
  }

  override def putRecords(request: PutRecordsRequest): ReaderT[Future, ExecutionContext, PutRecordsResponse] = ReaderT {
    implicit ec =>
      underlying.putRecords(request.toJava).toFuture.map(_.toScala)
  }

  override def registerStreamConsumer(
      request: RegisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, RegisterStreamConsumerResponse] = ReaderT { implicit ec =>
    underlying.registerStreamConsumer(request.toJava).toFuture.map(_.toScala)
  }

  override def removeTagsFromStream(
      request: RemoveTagsFromStreamRequest
  ): ReaderT[Future, ExecutionContext, RemoveTagsFromStreamResponse] = ReaderT { implicit ec =>
    underlying.removeTagsFromStream(request.toJava).toFuture.map(_.toScala)
  }

  override def splitShard(request: SplitShardRequest): ReaderT[Future, ExecutionContext, SplitShardResponse] = ReaderT {
    implicit ec =>
      underlying.splitShard(request.toJava).toFuture.map(_.toScala)
  }

  override def startStreamEncryption(
      request: StartStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StartStreamEncryptionResponse] = ReaderT { implicit ec =>
    underlying.startStreamEncryption(request.toJava).toFuture.map(_.toScala)
  }

  override def stopStreamEncryption(
      request: StopStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StopStreamEncryptionResponse] = ReaderT { implicit ec =>
    underlying.stopStreamEncryption(request.toJava).toFuture.map(_.toScala)
  }

  override def updateShardCount(
      request: UpdateShardCountRequest
  ): ReaderT[Future, ExecutionContext, UpdateShardCountResponse] = ReaderT { implicit ec =>
    underlying.updateShardCount(request.toJava).toFuture.map(_.toScala)
  }

}
