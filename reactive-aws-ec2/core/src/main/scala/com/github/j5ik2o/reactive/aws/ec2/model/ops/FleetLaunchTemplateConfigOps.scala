// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateConfigBuilderOps(val self: FleetLaunchTemplateConfig.Builder) extends AnyVal {

  final def launchTemplateSpecificationAsScala(
      value: Option[FleetLaunchTemplateSpecification]
  ): FleetLaunchTemplateConfig.Builder = {
    value.fold(self) { v =>
      self.launchTemplateSpecification(v)
    }
  }

  final def overridesAsScala(value: Option[Seq[FleetLaunchTemplateOverrides]]): FleetLaunchTemplateConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.overrides(v.asJava)
    }
  }

}

final class FleetLaunchTemplateConfigOps(val self: FleetLaunchTemplateConfig) extends AnyVal {

  final def launchTemplateSpecificationAsScala: Option[FleetLaunchTemplateSpecification] =
    Option(self.launchTemplateSpecification)

  final def overridesAsScala: Option[Seq[FleetLaunchTemplateOverrides]] = Option(self.overrides).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetLaunchTemplateConfigOps {

  implicit def toFleetLaunchTemplateConfigBuilderOps(
      v: FleetLaunchTemplateConfig.Builder
  ): FleetLaunchTemplateConfigBuilderOps = new FleetLaunchTemplateConfigBuilderOps(v)

  implicit def toFleetLaunchTemplateConfigOps(v: FleetLaunchTemplateConfig): FleetLaunchTemplateConfigOps =
    new FleetLaunchTemplateConfigOps(v)

}
