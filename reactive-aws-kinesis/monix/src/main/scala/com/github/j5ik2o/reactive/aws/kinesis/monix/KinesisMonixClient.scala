package com.github.j5ik2o.reactive.aws.kinesis.monix

import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient
import com.github.j5ik2o.reactive.aws.kinesis.model._
import monix.eval.Task

import scala.concurrent.Future

object KinesisMonixClient {

  def apply(underlying: KinesisClient[Future]): KinesisClient[Task] =
    new KinesisMonixClientImpl(underlying)

}

trait KinesisMonixClient extends KinesisClient[Task] {

  val underlying: KinesisClient[Future]

  override def addTagsToStream(request: AddTagsToStreamRequest): Task[AddTagsToStreamResponse] = Task.deferFuture {
    underlying.addTagsToStream(request)
  }

  override def createStream(request: CreateStreamRequest): Task[CreateStreamResponse] = Task.deferFuture {
    underlying.createStream(request)
  }

  override def decreaseStreamRetentionPeriod(
      request: DecreaseStreamRetentionPeriodRequest
  ): Task[DecreaseStreamRetentionPeriodResponse] = Task.deferFuture {
    underlying.decreaseStreamRetentionPeriod(request)
  }

  override def deleteStream(request: DeleteStreamRequest): Task[DeleteStreamResponse] = Task.deferFuture {
    underlying.deleteStream(request)
  }

  override def deregisterStreamConsumer(
      request: DeregisterStreamConsumerRequest
  ): Task[DeregisterStreamConsumerResponse] = Task.deferFuture {
    underlying.deregisterStreamConsumer(request)
  }

  override def describeLimits(request: DescribeLimitsRequest): Task[DescribeLimitsResponse] = Task.deferFuture {
    underlying.describeLimits(request)
  }

  override def describeStream(request: DescribeStreamRequest): Task[DescribeStreamResponse] = Task.deferFuture {
    underlying.describeStream(request)
  }

  override def describeStreamConsumer(request: DescribeStreamConsumerRequest): Task[DescribeStreamConsumerResponse] =
    Task.deferFuture {
      underlying.describeStreamConsumer(request)
    }

  override def describeStreamSummary(request: DescribeStreamSummaryRequest): Task[DescribeStreamSummaryResponse] =
    Task.deferFuture {
      underlying.describeStreamSummary(request)
    }

  override def disableEnhancedMonitoring(
      request: DisableEnhancedMonitoringRequest
  ): Task[DisableEnhancedMonitoringResponse] = Task.deferFuture {
    underlying.disableEnhancedMonitoring(request)
  }

  override def enableEnhancedMonitoring(
      request: EnableEnhancedMonitoringRequest
  ): Task[EnableEnhancedMonitoringResponse] = Task.deferFuture {
    underlying.enableEnhancedMonitoring(request)
  }

  override def getRecords(request: GetRecordsRequest): Task[GetRecordsResponse] = Task.deferFuture {
    underlying.getRecords(request)
  }

  override def getShardIterator(request: GetShardIteratorRequest): Task[GetShardIteratorResponse] = Task.deferFuture {
    underlying.getShardIterator(request)
  }

  override def increaseStreamRetentionPeriod(
      request: IncreaseStreamRetentionPeriodRequest
  ): Task[IncreaseStreamRetentionPeriodResponse] = Task.deferFuture {
    underlying.increaseStreamRetentionPeriod(request)
  }

  override def listShards(request: ListShardsRequest): Task[ListShardsResponse] = Task.deferFuture {
    underlying.listShards(request)
  }

  override def listStreamConsumers(request: ListStreamConsumersRequest): Task[ListStreamConsumersResponse] =
    Task.deferFuture {
      underlying.listStreamConsumers(request)
    }

  override def listStreams(request: ListStreamsRequest): Task[ListStreamsResponse] = Task.deferFuture {
    underlying.listStreams(request)
  }

  override def listTagsForStream(request: ListTagsForStreamRequest): Task[ListTagsForStreamResponse] =
    Task.deferFuture {
      underlying.listTagsForStream(request)
    }

  override def mergeShards(request: MergeShardsRequest): Task[MergeShardsResponse] = Task.deferFuture {
    underlying.mergeShards(request)
  }

  override def putRecord(request: PutRecordRequest): Task[PutRecordResponse] = Task.deferFuture {
    underlying.putRecord(request)
  }

  override def putRecords(request: PutRecordsRequest): Task[PutRecordsResponse] = Task.deferFuture {
    underlying.putRecords(request)
  }

  override def registerStreamConsumer(request: RegisterStreamConsumerRequest): Task[RegisterStreamConsumerResponse] =
    Task.deferFuture {
      underlying.registerStreamConsumer(request)
    }

  override def removeTagsFromStream(request: RemoveTagsFromStreamRequest): Task[RemoveTagsFromStreamResponse] =
    Task.deferFuture {
      underlying.removeTagsFromStream(request)
    }

  override def splitShard(request: SplitShardRequest): Task[SplitShardResponse] = Task.deferFuture {
    underlying.splitShard(request)
  }

  override def startStreamEncryption(request: StartStreamEncryptionRequest): Task[StartStreamEncryptionResponse] =
    Task.deferFuture {
      underlying.startStreamEncryption(request)
    }

  override def stopStreamEncryption(request: StopStreamEncryptionRequest): Task[StopStreamEncryptionResponse] =
    Task.deferFuture {
      underlying.stopStreamEncryption(request)
    }

  override def updateShardCount(request: UpdateShardCountRequest): Task[UpdateShardCountResponse] = Task.deferFuture {
    underlying.updateShardCount(request)
  }

}
