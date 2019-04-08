// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DisableAlarmActionsResponseBuilderOps(val self: DisableAlarmActionsResponse.Builder) extends AnyVal {}

final class DisableAlarmActionsResponseOps(val self: DisableAlarmActionsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableAlarmActionsResponseOps {

  implicit def toDisableAlarmActionsResponseBuilderOps(
      v: DisableAlarmActionsResponse.Builder
  ): DisableAlarmActionsResponseBuilderOps = new DisableAlarmActionsResponseBuilderOps(v)

  implicit def toDisableAlarmActionsResponseOps(v: DisableAlarmActionsResponse): DisableAlarmActionsResponseOps =
    new DisableAlarmActionsResponseOps(v)

}
