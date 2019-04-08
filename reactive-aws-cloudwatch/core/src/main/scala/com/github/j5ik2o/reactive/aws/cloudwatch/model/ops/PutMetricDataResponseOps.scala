// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutMetricDataResponseBuilderOps(val self: PutMetricDataResponse.Builder) extends AnyVal {}

final class PutMetricDataResponseOps(val self: PutMetricDataResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricDataResponseOps {

  implicit def toPutMetricDataResponseBuilderOps(v: PutMetricDataResponse.Builder): PutMetricDataResponseBuilderOps =
    new PutMetricDataResponseBuilderOps(v)

  implicit def toPutMetricDataResponseOps(v: PutMetricDataResponse): PutMetricDataResponseOps =
    new PutMetricDataResponseOps(v)

}
