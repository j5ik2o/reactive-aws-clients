// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateOverridesBuilderOps(val self: FleetLaunchTemplateOverrides.Builder) extends AnyVal {

  final def instanceTypeAsScala(value: Option[InstanceType]): FleetLaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def maxPriceAsScala(value: Option[String]): FleetLaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.maxPrice(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): FleetLaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): FleetLaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def weightedCapacityAsScala(value: Option[Double]): FleetLaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.weightedCapacity(v)
    }
  }

  final def priorityAsScala(value: Option[Double]): FleetLaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  }

  final def placementAsScala(value: Option[PlacementResponse]): FleetLaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

}

final class FleetLaunchTemplateOverridesOps(val self: FleetLaunchTemplateOverrides) extends AnyVal {

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def maxPriceAsScala: Option[String] = Option(self.maxPrice)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def weightedCapacityAsScala: Option[Double] = Option(self.weightedCapacity)

  final def priorityAsScala: Option[Double] = Option(self.priority)

  final def placementAsScala: Option[PlacementResponse] = Option(self.placement)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetLaunchTemplateOverridesOps {

  implicit def toFleetLaunchTemplateOverridesBuilderOps(
      v: FleetLaunchTemplateOverrides.Builder
  ): FleetLaunchTemplateOverridesBuilderOps = new FleetLaunchTemplateOverridesBuilderOps(v)

  implicit def toFleetLaunchTemplateOverridesOps(v: FleetLaunchTemplateOverrides): FleetLaunchTemplateOverridesOps =
    new FleetLaunchTemplateOverridesOps(v)

}
