// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateConfigRequestBuilderOps(val self: FleetLaunchTemplateConfigRequest.Builder)
    extends AnyVal {

  final def launchTemplateSpecificationAsScala(
      value: Option[FleetLaunchTemplateSpecificationRequest]
  ): FleetLaunchTemplateConfigRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateSpecification(v)
    }
  }

  final def overridesAsScala(
      value: Option[Seq[FleetLaunchTemplateOverridesRequest]]
  ): FleetLaunchTemplateConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.overrides(v.asJava)
    }
  }

}

final class FleetLaunchTemplateConfigRequestOps(val self: FleetLaunchTemplateConfigRequest) extends AnyVal {

  final def launchTemplateSpecificationAsScala: Option[FleetLaunchTemplateSpecificationRequest] =
    Option(self.launchTemplateSpecification)

  final def overridesAsScala: Option[Seq[FleetLaunchTemplateOverridesRequest]] = Option(self.overrides).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetLaunchTemplateConfigRequestOps {

  implicit def toFleetLaunchTemplateConfigRequestBuilderOps(
      v: FleetLaunchTemplateConfigRequest.Builder
  ): FleetLaunchTemplateConfigRequestBuilderOps = new FleetLaunchTemplateConfigRequestBuilderOps(v)

  implicit def toFleetLaunchTemplateConfigRequestOps(
      v: FleetLaunchTemplateConfigRequest
  ): FleetLaunchTemplateConfigRequestOps = new FleetLaunchTemplateConfigRequestOps(v)

}
