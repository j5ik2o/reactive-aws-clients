// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class MergeShardsResponseBuilderOps(val self: MergeShardsResponse.Builder) extends AnyVal {}

final class MergeShardsResponseOps(val self: MergeShardsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMergeShardsResponseOps {

  implicit def toMergeShardsResponseBuilderOps(v: MergeShardsResponse.Builder): MergeShardsResponseBuilderOps =
    new MergeShardsResponseBuilderOps(v)

  implicit def toMergeShardsResponseOps(v: MergeShardsResponse): MergeShardsResponseOps = new MergeShardsResponseOps(v)

}
