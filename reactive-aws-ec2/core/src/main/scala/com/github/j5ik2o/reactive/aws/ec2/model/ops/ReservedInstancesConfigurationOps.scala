// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesConfigurationBuilderOps(val self: ReservedInstancesConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala(value: Option[String]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala(value: Option[Scope]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

}

final class ReservedInstancesConfigurationOps(val self: ReservedInstancesConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala: Option[String] = Option(self.platform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala: Option[Scope] = Option(self.scope)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesConfigurationOps {

  implicit def toReservedInstancesConfigurationBuilderOps(
      v: ReservedInstancesConfiguration.Builder
  ): ReservedInstancesConfigurationBuilderOps = new ReservedInstancesConfigurationBuilderOps(v)

  implicit def toReservedInstancesConfigurationOps(
      v: ReservedInstancesConfiguration
  ): ReservedInstancesConfigurationOps = new ReservedInstancesConfigurationOps(v)

}
