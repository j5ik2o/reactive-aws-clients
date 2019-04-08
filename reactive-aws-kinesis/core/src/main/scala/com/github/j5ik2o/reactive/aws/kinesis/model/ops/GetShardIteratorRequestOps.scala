// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class GetShardIteratorRequestBuilderOps(val self: GetShardIteratorRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def shardIdAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  }

  final def shardIteratorTypeAsScala(value: Option[ShardIteratorType]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.shardIteratorType(v)
    }
  }

  final def startingSequenceNumberAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.startingSequenceNumber(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class GetShardIteratorRequestOps(val self: GetShardIteratorRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def shardIdAsScala: Option[String] = Option(self.shardId)

  final def shardIteratorTypeAsScala: Option[ShardIteratorType] = Option(self.shardIteratorType)

  final def startingSequenceNumberAsScala: Option[String] = Option(self.startingSequenceNumber)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetShardIteratorRequestOps {

  implicit def toGetShardIteratorRequestBuilderOps(
      v: GetShardIteratorRequest.Builder
  ): GetShardIteratorRequestBuilderOps = new GetShardIteratorRequestBuilderOps(v)

  implicit def toGetShardIteratorRequestOps(v: GetShardIteratorRequest): GetShardIteratorRequestOps =
    new GetShardIteratorRequestOps(v)

}
