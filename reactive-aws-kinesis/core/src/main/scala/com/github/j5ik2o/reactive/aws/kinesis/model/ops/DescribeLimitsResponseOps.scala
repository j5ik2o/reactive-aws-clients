// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeLimitsResponseBuilderOps(val self: DescribeLimitsResponse.Builder) extends AnyVal {

  final def shardLimitAsScala(value: Option[Int]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.shardLimit(v)
    }
  } // Int

  final def openShardCountAsScala(value: Option[Int]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.openShardCount(v)
    }
  } // Int

}

final class DescribeLimitsResponseOps(val self: DescribeLimitsResponse) extends AnyVal {

  final def shardLimitAsScala: Option[Int] = Option(self.shardLimit) // Int

  final def openShardCountAsScala: Option[Int] = Option(self.openShardCount) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLimitsResponseOps {

  implicit def toDescribeLimitsResponseBuilderOps(v: DescribeLimitsResponse.Builder): DescribeLimitsResponseBuilderOps =
    new DescribeLimitsResponseBuilderOps(v)

  implicit def toDescribeLimitsResponseOps(v: DescribeLimitsResponse): DescribeLimitsResponseOps =
    new DescribeLimitsResponseOps(v)

}
