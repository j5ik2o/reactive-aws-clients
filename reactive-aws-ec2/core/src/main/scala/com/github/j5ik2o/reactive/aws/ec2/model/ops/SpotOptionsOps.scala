// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotOptionsBuilderOps(val self: SpotOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala(value: Option[SpotAllocationStrategy]): SpotOptions.Builder = {
    value.fold(self) { v => self.allocationStrategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala(
      value: Option[SpotInstanceInterruptionBehavior]
  ): SpotOptions.Builder = {
    value.fold(self) { v => self.instanceInterruptionBehavior(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancePoolsToUseCountAsScala(value: Option[Int]): SpotOptions.Builder = {
    value.fold(self) { v => self.instancePoolsToUseCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleInstanceTypeAsScala(value: Option[Boolean]): SpotOptions.Builder = {
    value.fold(self) { v => self.singleInstanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleAvailabilityZoneAsScala(value: Option[Boolean]): SpotOptions.Builder = {
    value.fold(self) { v => self.singleAvailabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTargetCapacityAsScala(value: Option[Int]): SpotOptions.Builder = {
    value.fold(self) { v => self.minTargetCapacity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxTotalPriceAsScala(value: Option[String]): SpotOptions.Builder = {
    value.fold(self) { v => self.maxTotalPrice(v) }
  }

}

final class SpotOptionsOps(val self: SpotOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala: Option[SpotAllocationStrategy] = Option(self.allocationStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala: Option[SpotInstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancePoolsToUseCountAsScala: Option[Int] = Option(self.instancePoolsToUseCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleInstanceTypeAsScala: Option[Boolean] = Option(self.singleInstanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleAvailabilityZoneAsScala: Option[Boolean] = Option(self.singleAvailabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTargetCapacityAsScala: Option[Int] = Option(self.minTargetCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxTotalPriceAsScala: Option[String] = Option(self.maxTotalPrice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotOptionsOps {

  implicit def toSpotOptionsBuilderOps(v: SpotOptions.Builder): SpotOptionsBuilderOps = new SpotOptionsBuilderOps(v)

  implicit def toSpotOptionsOps(v: SpotOptions): SpotOptionsOps = new SpotOptionsOps(v)

}
