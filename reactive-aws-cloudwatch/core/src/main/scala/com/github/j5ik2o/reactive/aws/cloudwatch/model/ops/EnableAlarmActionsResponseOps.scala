// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class EnableAlarmActionsResponseBuilderOps(val self: EnableAlarmActionsResponse.Builder) extends AnyVal {}

final class EnableAlarmActionsResponseOps(val self: EnableAlarmActionsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableAlarmActionsResponseOps {

  implicit def toEnableAlarmActionsResponseBuilderOps(
      v: EnableAlarmActionsResponse.Builder
  ): EnableAlarmActionsResponseBuilderOps = new EnableAlarmActionsResponseBuilderOps(v)

  implicit def toEnableAlarmActionsResponseOps(v: EnableAlarmActionsResponse): EnableAlarmActionsResponseOps =
    new EnableAlarmActionsResponseOps(v)

}
