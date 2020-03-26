// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplatePlacementBuilderOps(val self: LaunchTemplatePlacement.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def affinityAsScala(value: Option[String]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.affinity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdAsScala(value: Option[String]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.hostId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala(value: Option[Tenancy]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.tenancy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spreadDomainAsScala(value: Option[String]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.spreadDomain(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostResourceGroupArnAsScala(value: Option[String]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.hostResourceGroupArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionNumberAsScala(value: Option[Int]): LaunchTemplatePlacement.Builder = {
    value.fold(self) { v =>
      self.partitionNumber(v)
    }
  }

}

final class LaunchTemplatePlacementOps(val self: LaunchTemplatePlacement) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def affinityAsScala: Option[String] = Option(self.affinity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdAsScala: Option[String] = Option(self.hostId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala: Option[Tenancy] = Option(self.tenancy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spreadDomainAsScala: Option[String] = Option(self.spreadDomain)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostResourceGroupArnAsScala: Option[String] = Option(self.hostResourceGroupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionNumberAsScala: Option[Int] = Option(self.partitionNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplatePlacementOps {

  implicit def toLaunchTemplatePlacementBuilderOps(
      v: LaunchTemplatePlacement.Builder
  ): LaunchTemplatePlacementBuilderOps = new LaunchTemplatePlacementBuilderOps(v)

  implicit def toLaunchTemplatePlacementOps(v: LaunchTemplatePlacement): LaunchTemplatePlacementOps =
    new LaunchTemplatePlacementOps(v)

}
