// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotFleetMonitoringBuilderOps(val self: SpotFleetMonitoring.Builder) extends AnyVal {

  final def enabledAsScala(value: Option[Boolean]): SpotFleetMonitoring.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

}

final class SpotFleetMonitoringOps(val self: SpotFleetMonitoring) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotFleetMonitoringOps {

  implicit def toSpotFleetMonitoringBuilderOps(v: SpotFleetMonitoring.Builder): SpotFleetMonitoringBuilderOps =
    new SpotFleetMonitoringBuilderOps(v)

  implicit def toSpotFleetMonitoringOps(v: SpotFleetMonitoring): SpotFleetMonitoringOps = new SpotFleetMonitoringOps(v)

}
