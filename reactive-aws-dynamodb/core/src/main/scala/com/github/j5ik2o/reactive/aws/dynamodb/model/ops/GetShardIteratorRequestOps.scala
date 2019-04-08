// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetShardIteratorRequestBuilderOps(val self: GetShardIteratorRequest.Builder) extends AnyVal {

  final def streamArnAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.streamArn(v)
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

  final def sequenceNumberAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  }

}

final class GetShardIteratorRequestOps(val self: GetShardIteratorRequest) extends AnyVal {

  final def streamArnAsScala: Option[String] = Option(self.streamArn)

  final def shardIdAsScala: Option[String] = Option(self.shardId)

  final def shardIteratorTypeAsScala: Option[ShardIteratorType] = Option(self.shardIteratorType)

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetShardIteratorRequestOps {

  implicit def toGetShardIteratorRequestBuilderOps(
      v: GetShardIteratorRequest.Builder
  ): GetShardIteratorRequestBuilderOps = new GetShardIteratorRequestBuilderOps(v)

  implicit def toGetShardIteratorRequestOps(v: GetShardIteratorRequest): GetShardIteratorRequestOps =
    new GetShardIteratorRequestOps(v)

}
