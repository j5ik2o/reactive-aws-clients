// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class GetShardIteratorResponseBuilderOps(val self: GetShardIteratorResponse.Builder) extends AnyVal {

  final def shardIteratorAsScala(value: Option[String]): GetShardIteratorResponse.Builder = {
    value.fold(self) { v =>
      self.shardIterator(v)
    }
  }

}

final class GetShardIteratorResponseOps(val self: GetShardIteratorResponse) extends AnyVal {

  final def shardIteratorAsScala: Option[String] = Option(self.shardIterator)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetShardIteratorResponseOps {

  implicit def toGetShardIteratorResponseBuilderOps(
      v: GetShardIteratorResponse.Builder
  ): GetShardIteratorResponseBuilderOps = new GetShardIteratorResponseBuilderOps(v)

  implicit def toGetShardIteratorResponseOps(v: GetShardIteratorResponse): GetShardIteratorResponseOps =
    new GetShardIteratorResponseOps(v)

}
