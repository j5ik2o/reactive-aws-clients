// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateOverridesBuilderOps(val self: LaunchTemplateOverrides.Builder) extends AnyVal {

  final def instanceTypeAsScala(value: Option[InstanceType]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def spotPriceAsScala(value: Option[String]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def weightedCapacityAsScala(value: Option[Double]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.weightedCapacity(v)
    }
  }

  final def priorityAsScala(value: Option[Double]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  }

}

final class LaunchTemplateOverridesOps(val self: LaunchTemplateOverrides) extends AnyVal {

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def weightedCapacityAsScala: Option[Double] = Option(self.weightedCapacity)

  final def priorityAsScala: Option[Double] = Option(self.priority)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateOverridesOps {

  implicit def toLaunchTemplateOverridesBuilderOps(
      v: LaunchTemplateOverrides.Builder
  ): LaunchTemplateOverridesBuilderOps = new LaunchTemplateOverridesBuilderOps(v)

  implicit def toLaunchTemplateOverridesOps(v: LaunchTemplateOverrides): LaunchTemplateOverridesOps =
    new LaunchTemplateOverridesOps(v)

}
