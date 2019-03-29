package com.github.j5ik2o.reactive.aws.kinesis.cats

import cats.data.ReaderT
import com.amazonaws.services.kinesis.AmazonKinesisAsync
import com.github.j5ik2o.reactive.aws.kinesis.model._

import scala.concurrent.{ ExecutionContext, Future }

private[kinesis] class KinesisAsyncClientV1Impl(override val underlying: AmazonKinesisAsync)
    extends KinesisAsyncClientV1 {
  import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClientV1._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.AddTagsToStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.AddTagsToStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.CreateStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.CreateStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DecreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DecreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeleteStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeleteStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeregisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DeregisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamSummaryRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DescribeStreamSummaryResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DisableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.DisableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.EnableEnhancedMonitoringRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.EnableEnhancedMonitoringResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetRecordsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetRecordsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetShardIteratorRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.GetShardIteratorResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.IncreaseStreamRetentionPeriodRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.IncreaseStreamRetentionPeriodResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListShardsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListShardsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamConsumersRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamConsumersResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListStreamsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListTagsForStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.ListTagsForStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.MergeShardsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.MergeShardsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordsRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.PutRecordsResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RegisterStreamConsumerRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RegisterStreamConsumerResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RemoveTagsFromStreamRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.RemoveTagsFromStreamResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.SplitShardRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.SplitShardResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StartStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StartStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StopStreamEncryptionRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.StopStreamEncryptionResponseOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.UpdateShardCountRequestOps._
  import com.github.j5ik2o.reactive.aws.kinesis.model.v1.UpdateShardCountResponseOps._

  override def addTagsToStream(
      request: AddTagsToStreamRequest
  ): ReaderT[Future, ExecutionContext, AddTagsToStreamResponse] = ReaderT { implicit ec =>
    underlying.addTagsToStreamAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def createStream(request: CreateStreamRequest): ReaderT[Future, ExecutionContext, CreateStreamResponse] =
    ReaderT { implicit ec =>
      underlying.createStreamAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def decreaseStreamRetentionPeriod(
      request: DecreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, DecreaseStreamRetentionPeriodResponse] =
    ReaderT { implicit ec =>
      underlying.decreaseStreamRetentionPeriodAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def deleteStream(request: DeleteStreamRequest): ReaderT[Future, ExecutionContext, DeleteStreamResponse] =
    ReaderT { implicit ec =>
      underlying.deleteStreamAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def deregisterStreamConsumer(
      request: DeregisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DeregisterStreamConsumerResponse] = ReaderT { implicit ec =>
    underlying.deregisterStreamConsumerAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(
      request: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] = ReaderT { implicit ec =>
    underlying.describeLimitsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeStream(
      request: DescribeStreamRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamResponse] = ReaderT { implicit ec =>
    underlying.describeStreamAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamConsumer(
      request: DescribeStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamConsumerResponse] = ReaderT { implicit ec =>
    underlying.describeStreamConsumerAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeStreamSummary(
      request: DescribeStreamSummaryRequest
  ): ReaderT[Future, ExecutionContext, DescribeStreamSummaryResponse] = ReaderT { implicit ec =>
    underlying.describeStreamSummaryAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def disableEnhancedMonitoring(
      request: DisableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, DisableEnhancedMonitoringResponse] = ReaderT { implicit ec =>
    underlying.disableEnhancedMonitoringAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def enableEnhancedMonitoring(
      request: EnableEnhancedMonitoringRequest
  ): ReaderT[Future, ExecutionContext, EnableEnhancedMonitoringResponse] = ReaderT { implicit ec =>
    underlying.enableEnhancedMonitoringAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def getRecords(request: GetRecordsRequest): ReaderT[Future, ExecutionContext, GetRecordsResponse] = ReaderT {
    implicit ec =>
      underlying.getRecordsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def getShardIterator(
      request: GetShardIteratorRequest
  ): ReaderT[Future, ExecutionContext, GetShardIteratorResponse] =
    ReaderT { implicit ec =>
      underlying.getShardIteratorAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def increaseStreamRetentionPeriod(
      request: IncreaseStreamRetentionPeriodRequest
  ): ReaderT[Future, ExecutionContext, IncreaseStreamRetentionPeriodResponse] = ReaderT { implicit ec =>
    underlying.increaseStreamRetentionPeriodAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def listShards(request: ListShardsRequest): ReaderT[Future, ExecutionContext, ListShardsResponse] = ReaderT {
    implicit ec =>
      underlying.listShardsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def listStreamConsumers(
      request: ListStreamConsumersRequest
  ): ReaderT[Future, ExecutionContext, ListStreamConsumersResponse] = ReaderT { implicit ec =>
    underlying.listStreamConsumersAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def listStreams(request: ListStreamsRequest): ReaderT[Future, ExecutionContext, ListStreamsResponse] =
    ReaderT { implicit ec =>
      underlying.listStreamsAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def listTagsForStream(
      request: ListTagsForStreamRequest
  ): ReaderT[Future, ExecutionContext, ListTagsForStreamResponse] = ReaderT { implicit ec =>
    underlying.listTagsForStreamAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def mergeShards(request: MergeShardsRequest): ReaderT[Future, ExecutionContext, MergeShardsResponse] =
    ReaderT { implicit ec =>
      underlying.mergeShardsAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def putRecord(request: PutRecordRequest): ReaderT[Future, ExecutionContext, PutRecordResponse] = ReaderT {
    implicit ec =>
      underlying.putRecordAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def putRecords(request: PutRecordsRequest): ReaderT[Future, ExecutionContext, PutRecordsResponse] = ReaderT {
    implicit ec =>
      underlying.putRecordsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def registerStreamConsumer(
      request: RegisterStreamConsumerRequest
  ): ReaderT[Future, ExecutionContext, RegisterStreamConsumerResponse] = ReaderT { implicit ec =>
    underlying.registerStreamConsumerAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def removeTagsFromStream(
      request: RemoveTagsFromStreamRequest
  ): ReaderT[Future, ExecutionContext, RemoveTagsFromStreamResponse] = ReaderT { implicit ec =>
    underlying.removeTagsFromStreamAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def splitShard(request: SplitShardRequest): ReaderT[Future, ExecutionContext, SplitShardResponse] = ReaderT {
    implicit ec =>
      underlying.splitShardAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def startStreamEncryption(
      request: StartStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StartStreamEncryptionResponse] = ReaderT { implicit ec =>
    underlying.startStreamEncryptionAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def stopStreamEncryption(
      request: StopStreamEncryptionRequest
  ): ReaderT[Future, ExecutionContext, StopStreamEncryptionResponse] = ReaderT { implicit ec =>
    underlying.stopStreamEncryptionAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def updateShardCount(
      request: UpdateShardCountRequest
  ): ReaderT[Future, ExecutionContext, UpdateShardCountResponse] = ReaderT { implicit ec =>
    underlying.updateShardCountAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def subscribeToShard(
      subscribeToShardRequest: SubscribeToShardRequest,
      asyncResponseHandler: SubscribeToShardResponseHandler
  ): ReaderT[Future, ExecutionContext, Unit] = ???
}
