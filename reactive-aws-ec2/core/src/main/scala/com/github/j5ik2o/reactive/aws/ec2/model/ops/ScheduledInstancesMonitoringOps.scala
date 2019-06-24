// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesMonitoringBuilderOps(val self: ScheduledInstancesMonitoring.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): ScheduledInstancesMonitoring.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

}

final class ScheduledInstancesMonitoringOps(val self: ScheduledInstancesMonitoring) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesMonitoringOps {

  implicit def toScheduledInstancesMonitoringBuilderOps(
      v: ScheduledInstancesMonitoring.Builder
  ): ScheduledInstancesMonitoringBuilderOps = new ScheduledInstancesMonitoringBuilderOps(v)

  implicit def toScheduledInstancesMonitoringOps(v: ScheduledInstancesMonitoring): ScheduledInstancesMonitoringOps =
    new ScheduledInstancesMonitoringOps(v)

}
