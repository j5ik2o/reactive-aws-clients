// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class SetAlarmStateResponseBuilderOps(val self: SetAlarmStateResponse.Builder) extends AnyVal {}

final class SetAlarmStateResponseOps(val self: SetAlarmStateResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetAlarmStateResponseOps {

  implicit def toSetAlarmStateResponseBuilderOps(v: SetAlarmStateResponse.Builder): SetAlarmStateResponseBuilderOps =
    new SetAlarmStateResponseBuilderOps(v)

  implicit def toSetAlarmStateResponseOps(v: SetAlarmStateResponse): SetAlarmStateResponseOps =
    new SetAlarmStateResponseOps(v)

}
