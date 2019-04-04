// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeLimitsRequestBuilderOps(val self: DescribeLimitsRequest.Builder) extends AnyVal {}

final class DescribeLimitsRequestOps(val self: DescribeLimitsRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLimitsRequestOps {

  implicit def toDescribeLimitsRequestBuilderOps(v: DescribeLimitsRequest.Builder): DescribeLimitsRequestBuilderOps =
    new DescribeLimitsRequestBuilderOps(v)

  implicit def toDescribeLimitsRequestOps(v: DescribeLimitsRequest): DescribeLimitsRequestOps =
    new DescribeLimitsRequestOps(v)

}
