// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class OnDemandOptionsRequestBuilderOps(val self: OnDemandOptionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala(
      value: Option[FleetOnDemandAllocationStrategy]
  ): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.allocationStrategy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleInstanceTypeAsScala(value: Option[Boolean]): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.singleInstanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleAvailabilityZoneAsScala(value: Option[Boolean]): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.singleAvailabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTargetCapacityAsScala(value: Option[Int]): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.minTargetCapacity(v)
    }
  }

}

final class OnDemandOptionsRequestOps(val self: OnDemandOptionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala: Option[FleetOnDemandAllocationStrategy] = Option(self.allocationStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleInstanceTypeAsScala: Option[Boolean] = Option(self.singleInstanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleAvailabilityZoneAsScala: Option[Boolean] = Option(self.singleAvailabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTargetCapacityAsScala: Option[Int] = Option(self.minTargetCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOnDemandOptionsRequestOps {

  implicit def toOnDemandOptionsRequestBuilderOps(v: OnDemandOptionsRequest.Builder): OnDemandOptionsRequestBuilderOps =
    new OnDemandOptionsRequestBuilderOps(v)

  implicit def toOnDemandOptionsRequestOps(v: OnDemandOptionsRequest): OnDemandOptionsRequestOps =
    new OnDemandOptionsRequestOps(v)

}
