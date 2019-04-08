// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetShardIteratorResponseBuilderOps(val self: GetShardIteratorResponse.Builder) extends AnyVal {

  final def shardIteratorAsScala(value: Option[String]): GetShardIteratorResponse.Builder = {
    value.fold(self) { v =>
      self.shardIterator(v)
    }
  } // String

}

final class GetShardIteratorResponseOps(val self: GetShardIteratorResponse) extends AnyVal {

  final def shardIteratorAsScala: Option[String] = Option(self.shardIterator) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetShardIteratorResponseOps {

  implicit def toGetShardIteratorResponseBuilderOps(
      v: GetShardIteratorResponse.Builder
  ): GetShardIteratorResponseBuilderOps = new GetShardIteratorResponseBuilderOps(v)

  implicit def toGetShardIteratorResponseOps(v: GetShardIteratorResponse): GetShardIteratorResponseOps =
    new GetShardIteratorResponseOps(v)

}
