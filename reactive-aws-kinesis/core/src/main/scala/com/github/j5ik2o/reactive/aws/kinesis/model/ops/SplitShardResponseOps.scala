// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SplitShardResponseBuilderOps(val self: SplitShardResponse.Builder) extends AnyVal {


}

final class SplitShardResponseOps(val self: SplitShardResponse) extends AnyVal {


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSplitShardResponseOps {

implicit def toSplitShardResponseBuilderOps(v: SplitShardResponse.Builder): SplitShardResponseBuilderOps = new SplitShardResponseBuilderOps(v)

implicit def toSplitShardResponseOps(v: SplitShardResponse): SplitShardResponseOps = new SplitShardResponseOps(v)

}

