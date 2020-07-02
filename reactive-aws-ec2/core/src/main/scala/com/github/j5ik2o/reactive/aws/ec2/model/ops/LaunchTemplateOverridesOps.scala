// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateOverridesBuilderOps(val self: LaunchTemplateOverrides.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala(value: Option[String]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v => self.spotPrice(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def weightedCapacityAsScala(value: Option[Double]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v => self.weightedCapacity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala(value: Option[Double]): LaunchTemplateOverrides.Builder = {
    value.fold(self) { v => self.priority(v) }
  }

}

final class LaunchTemplateOverridesOps(val self: LaunchTemplateOverrides) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def weightedCapacityAsScala: Option[Double] = Option(self.weightedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
