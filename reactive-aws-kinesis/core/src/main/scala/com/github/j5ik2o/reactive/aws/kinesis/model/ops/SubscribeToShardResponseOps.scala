// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SubscribeToShardResponseBuilderOps(val self: SubscribeToShardResponse.Builder) extends AnyVal {}

final class SubscribeToShardResponseOps(val self: SubscribeToShardResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubscribeToShardResponseOps {

  implicit def toSubscribeToShardResponseBuilderOps(
      v: SubscribeToShardResponse.Builder
  ): SubscribeToShardResponseBuilderOps = new SubscribeToShardResponseBuilderOps(v)

  implicit def toSubscribeToShardResponseOps(v: SubscribeToShardResponse): SubscribeToShardResponseOps =
    new SubscribeToShardResponseOps(v)

}
