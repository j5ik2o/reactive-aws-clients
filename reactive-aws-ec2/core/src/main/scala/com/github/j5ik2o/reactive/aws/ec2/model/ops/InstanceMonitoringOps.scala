// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceMonitoringBuilderOps(val self: InstanceMonitoring.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): InstanceMonitoring.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def monitoringAsScala(value: Option[Monitoring]): InstanceMonitoring.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

}

final class InstanceMonitoringOps(val self: InstanceMonitoring) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def monitoringAsScala: Option[Monitoring] = Option(self.monitoring)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceMonitoringOps {

  implicit def toInstanceMonitoringBuilderOps(v: InstanceMonitoring.Builder): InstanceMonitoringBuilderOps =
    new InstanceMonitoringBuilderOps(v)

  implicit def toInstanceMonitoringOps(v: InstanceMonitoring): InstanceMonitoringOps = new InstanceMonitoringOps(v)

}
