// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetShardIteratorRequestBuilderOps(val self: GetShardIteratorRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamArnAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v => self.streamArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardIdAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v => self.shardId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardIteratorTypeAsScala(value: Option[ShardIteratorType]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v => self.shardIteratorType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceNumberAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v => self.sequenceNumber(v) }
  }

}

final class GetShardIteratorRequestOps(val self: GetShardIteratorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamArnAsScala: Option[String] = Option(self.streamArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardIdAsScala: Option[String] = Option(self.shardId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardIteratorTypeAsScala: Option[ShardIteratorType] = Option(self.shardIteratorType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
