// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateSpecificationRequestBuilderOps(val self: FleetLaunchTemplateSpecificationRequest.Builder)
    extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): FleetLaunchTemplateSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): FleetLaunchTemplateSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionAsScala(value: Option[String]): FleetLaunchTemplateSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

}

final class FleetLaunchTemplateSpecificationRequestOps(val self: FleetLaunchTemplateSpecificationRequest)
    extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionAsScala: Option[String] = Option(self.version)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetLaunchTemplateSpecificationRequestOps {

  implicit def toFleetLaunchTemplateSpecificationRequestBuilderOps(
      v: FleetLaunchTemplateSpecificationRequest.Builder
  ): FleetLaunchTemplateSpecificationRequestBuilderOps = new FleetLaunchTemplateSpecificationRequestBuilderOps(v)

  implicit def toFleetLaunchTemplateSpecificationRequestOps(
      v: FleetLaunchTemplateSpecificationRequest
  ): FleetLaunchTemplateSpecificationRequestOps = new FleetLaunchTemplateSpecificationRequestOps(v)

}
