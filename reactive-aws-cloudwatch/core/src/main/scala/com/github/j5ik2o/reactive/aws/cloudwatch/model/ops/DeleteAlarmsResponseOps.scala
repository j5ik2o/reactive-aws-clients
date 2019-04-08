// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DeleteAlarmsResponseBuilderOps(val self: DeleteAlarmsResponse.Builder) extends AnyVal {}

final class DeleteAlarmsResponseOps(val self: DeleteAlarmsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAlarmsResponseOps {

  implicit def toDeleteAlarmsResponseBuilderOps(v: DeleteAlarmsResponse.Builder): DeleteAlarmsResponseBuilderOps =
    new DeleteAlarmsResponseBuilderOps(v)

  implicit def toDeleteAlarmsResponseOps(v: DeleteAlarmsResponse): DeleteAlarmsResponseOps =
    new DeleteAlarmsResponseOps(v)

}
