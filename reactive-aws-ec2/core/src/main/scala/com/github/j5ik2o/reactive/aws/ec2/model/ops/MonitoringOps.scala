// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class MonitoringBuilderOps(val self: Monitoring.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[MonitoringState]): Monitoring.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class MonitoringOps(val self: Monitoring) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[MonitoringState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMonitoringOps {

  implicit def toMonitoringBuilderOps(v: Monitoring.Builder): MonitoringBuilderOps = new MonitoringBuilderOps(v)

  implicit def toMonitoringOps(v: Monitoring): MonitoringOps = new MonitoringOps(v)

}
