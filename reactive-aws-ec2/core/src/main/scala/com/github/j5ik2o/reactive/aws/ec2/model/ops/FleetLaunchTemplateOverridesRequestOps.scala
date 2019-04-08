// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateOverridesRequestBuilderOps(val self: FleetLaunchTemplateOverridesRequest.Builder)
    extends AnyVal {

  final def instanceTypeAsScala(value: Option[InstanceType]): FleetLaunchTemplateOverridesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def maxPriceAsScala(value: Option[String]): FleetLaunchTemplateOverridesRequest.Builder = {
    value.fold(self) { v =>
      self.maxPrice(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): FleetLaunchTemplateOverridesRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): FleetLaunchTemplateOverridesRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def weightedCapacityAsScala(value: Option[Double]): FleetLaunchTemplateOverridesRequest.Builder = {
    value.fold(self) { v =>
      self.weightedCapacity(v)
    }
  }

  final def priorityAsScala(value: Option[Double]): FleetLaunchTemplateOverridesRequest.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  }

  final def placementAsScala(value: Option[Placement]): FleetLaunchTemplateOverridesRequest.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

}

final class FleetLaunchTemplateOverridesRequestOps(val self: FleetLaunchTemplateOverridesRequest) extends AnyVal {

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def maxPriceAsScala: Option[String] = Option(self.maxPrice)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def weightedCapacityAsScala: Option[Double] = Option(self.weightedCapacity)

  final def priorityAsScala: Option[Double] = Option(self.priority)

  final def placementAsScala: Option[Placement] = Option(self.placement)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetLaunchTemplateOverridesRequestOps {

  implicit def toFleetLaunchTemplateOverridesRequestBuilderOps(
      v: FleetLaunchTemplateOverridesRequest.Builder
  ): FleetLaunchTemplateOverridesRequestBuilderOps = new FleetLaunchTemplateOverridesRequestBuilderOps(v)

  implicit def toFleetLaunchTemplateOverridesRequestOps(
      v: FleetLaunchTemplateOverridesRequest
  ): FleetLaunchTemplateOverridesRequestOps = new FleetLaunchTemplateOverridesRequestOps(v)

}
