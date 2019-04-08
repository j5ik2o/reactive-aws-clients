// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutMetricFilterResponseBuilderOps(val self: PutMetricFilterResponse.Builder) extends AnyVal {}

final class PutMetricFilterResponseOps(val self: PutMetricFilterResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricFilterResponseOps {

  implicit def toPutMetricFilterResponseBuilderOps(
      v: PutMetricFilterResponse.Builder
  ): PutMetricFilterResponseBuilderOps = new PutMetricFilterResponseBuilderOps(v)

  implicit def toPutMetricFilterResponseOps(v: PutMetricFilterResponse): PutMetricFilterResponseOps =
    new PutMetricFilterResponseOps(v)

}
