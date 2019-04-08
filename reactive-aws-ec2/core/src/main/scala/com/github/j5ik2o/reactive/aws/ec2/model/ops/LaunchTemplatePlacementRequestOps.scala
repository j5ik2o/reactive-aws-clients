// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplatePlacementRequestBuilderOps(val self: LaunchTemplatePlacementRequest.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): LaunchTemplatePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def affinityAsScala(value: Option[String]): LaunchTemplatePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.affinity(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): LaunchTemplatePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def hostIdAsScala(value: Option[String]): LaunchTemplatePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.hostId(v)
    }
  }

  final def tenancyAsScala(value: Option[Tenancy]): LaunchTemplatePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.tenancy(v)
    }
  }

  final def spreadDomainAsScala(value: Option[String]): LaunchTemplatePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.spreadDomain(v)
    }
  }

}

final class LaunchTemplatePlacementRequestOps(val self: LaunchTemplatePlacementRequest) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def affinityAsScala: Option[String] = Option(self.affinity)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def hostIdAsScala: Option[String] = Option(self.hostId)

  final def tenancyAsScala: Option[Tenancy] = Option(self.tenancy)

  final def spreadDomainAsScala: Option[String] = Option(self.spreadDomain)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplatePlacementRequestOps {

  implicit def toLaunchTemplatePlacementRequestBuilderOps(
      v: LaunchTemplatePlacementRequest.Builder
  ): LaunchTemplatePlacementRequestBuilderOps = new LaunchTemplatePlacementRequestBuilderOps(v)

  implicit def toLaunchTemplatePlacementRequestOps(
      v: LaunchTemplatePlacementRequest
  ): LaunchTemplatePlacementRequestOps = new LaunchTemplatePlacementRequestOps(v)

}
