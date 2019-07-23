// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotPlacementBuilderOps(val self: SpotPlacement.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): SpotPlacement.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): SpotPlacement.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala(value: Option[Tenancy]): SpotPlacement.Builder = {
    value.fold(self) { v =>
      self.tenancy(v)
    }
  }

}

final class SpotPlacementOps(val self: SpotPlacement) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala: Option[Tenancy] = Option(self.tenancy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotPlacementOps {

  implicit def toSpotPlacementBuilderOps(v: SpotPlacement.Builder): SpotPlacementBuilderOps =
    new SpotPlacementBuilderOps(v)

  implicit def toSpotPlacementOps(v: SpotPlacement): SpotPlacementOps = new SpotPlacementOps(v)

}
