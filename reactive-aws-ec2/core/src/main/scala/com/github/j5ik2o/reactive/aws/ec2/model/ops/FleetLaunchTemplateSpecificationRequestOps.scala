// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateSpecificationRequestBuilderOps(val self: FleetLaunchTemplateSpecificationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): FleetLaunchTemplateSpecificationRequest.Builder = {
    value.fold(self) { v => self.launchTemplateId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): FleetLaunchTemplateSpecificationRequest.Builder = {
    value.fold(self) { v => self.launchTemplateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): FleetLaunchTemplateSpecificationRequest.Builder = {
    value.fold(self) { v => self.version(v) }
  }

}

final class FleetLaunchTemplateSpecificationRequestOps(val self: FleetLaunchTemplateSpecificationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
