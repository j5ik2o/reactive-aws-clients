// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class OnDemandOptionsBuilderOps(val self: OnDemandOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala(value: Option[FleetOnDemandAllocationStrategy]): OnDemandOptions.Builder = {
    value.fold(self) { v => self.allocationStrategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationOptionsAsScala(value: Option[CapacityReservationOptions]): OnDemandOptions.Builder = {
    value.fold(self) { v => self.capacityReservationOptions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleInstanceTypeAsScala(value: Option[Boolean]): OnDemandOptions.Builder = {
    value.fold(self) { v => self.singleInstanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleAvailabilityZoneAsScala(value: Option[Boolean]): OnDemandOptions.Builder = {
    value.fold(self) { v => self.singleAvailabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTargetCapacityAsScala(value: Option[Int]): OnDemandOptions.Builder = {
    value.fold(self) { v => self.minTargetCapacity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxTotalPriceAsScala(value: Option[String]): OnDemandOptions.Builder = {
    value.fold(self) { v => self.maxTotalPrice(v) }
  }

}

final class OnDemandOptionsOps(val self: OnDemandOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala: Option[FleetOnDemandAllocationStrategy] = Option(self.allocationStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationOptionsAsScala: Option[CapacityReservationOptions] =
    Option(self.capacityReservationOptions)

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
trait ToOnDemandOptionsOps {

  implicit def toOnDemandOptionsBuilderOps(v: OnDemandOptions.Builder): OnDemandOptionsBuilderOps =
    new OnDemandOptionsBuilderOps(v)

  implicit def toOnDemandOptionsOps(v: OnDemandOptions): OnDemandOptionsOps = new OnDemandOptionsOps(v)

}
