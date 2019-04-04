// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class GetShardIteratorRequestBuilderOps(val self: GetShardIteratorRequest.Builder) extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withShardIdAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  } // String

  final def withShardIteratorTypeAsScala(value: Option[ShardIteratorType]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.shardIteratorType(v)
    }
  } // String

  final def withStartingSequenceNumberAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.startingSequenceNumber(v)
    }
  } // String

  final def withTimestampAsScala(value: Option[java.time.Instant]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // Instant

}

final class GetShardIteratorRequestOps(val self: GetShardIteratorRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def shardIdAsScala: Option[String] = Option(self.shardId) // String

  final def shardIteratorTypeAsScala: Option[ShardIteratorType] = Option(self.shardIteratorType) // String

  final def startingSequenceNumberAsScala: Option[String] = Option(self.startingSequenceNumber) // String

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetShardIteratorRequestOps {

  implicit def toGetShardIteratorRequestBuilderOps(
      v: GetShardIteratorRequest.Builder
  ): GetShardIteratorRequestBuilderOps = new GetShardIteratorRequestBuilderOps(v)

  implicit def toGetShardIteratorRequestOps(v: GetShardIteratorRequest): GetShardIteratorRequestOps =
    new GetShardIteratorRequestOps(v)

}
