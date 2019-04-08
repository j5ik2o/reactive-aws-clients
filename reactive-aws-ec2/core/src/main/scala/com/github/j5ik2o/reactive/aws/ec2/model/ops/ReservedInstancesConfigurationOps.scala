// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesConfigurationBuilderOps(val self: ReservedInstancesConfiguration.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def instanceCountAsScala(value: Option[Int]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def platformAsScala(value: Option[String]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def scopeAsScala(value: Option[Scope]): ReservedInstancesConfiguration.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

}

final class ReservedInstancesConfigurationOps(val self: ReservedInstancesConfiguration) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def platformAsScala: Option[String] = Option(self.platform)

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
