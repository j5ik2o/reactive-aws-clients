// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutMetricAlarmResponseBuilderOps(val self: PutMetricAlarmResponse.Builder) extends AnyVal {}

final class PutMetricAlarmResponseOps(val self: PutMetricAlarmResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricAlarmResponseOps {

  implicit def toPutMetricAlarmResponseBuilderOps(v: PutMetricAlarmResponse.Builder): PutMetricAlarmResponseBuilderOps =
    new PutMetricAlarmResponseBuilderOps(v)

  implicit def toPutMetricAlarmResponseOps(v: PutMetricAlarmResponse): PutMetricAlarmResponseOps =
    new PutMetricAlarmResponseOps(v)

}
