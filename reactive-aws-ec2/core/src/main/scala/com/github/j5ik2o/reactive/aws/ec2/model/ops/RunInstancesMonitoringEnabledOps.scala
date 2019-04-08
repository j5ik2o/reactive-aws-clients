// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RunInstancesMonitoringEnabledBuilderOps(val self: RunInstancesMonitoringEnabled.Builder) extends AnyVal {

  final def enabledAsScala(value: Option[Boolean]): RunInstancesMonitoringEnabled.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

}

final class RunInstancesMonitoringEnabledOps(val self: RunInstancesMonitoringEnabled) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunInstancesMonitoringEnabledOps {

  implicit def toRunInstancesMonitoringEnabledBuilderOps(
      v: RunInstancesMonitoringEnabled.Builder
  ): RunInstancesMonitoringEnabledBuilderOps = new RunInstancesMonitoringEnabledBuilderOps(v)

  implicit def toRunInstancesMonitoringEnabledOps(v: RunInstancesMonitoringEnabled): RunInstancesMonitoringEnabledOps =
    new RunInstancesMonitoringEnabledOps(v)

}
