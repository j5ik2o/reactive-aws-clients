// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class OnDemandOptionsRequestBuilderOps(val self: OnDemandOptionsRequest.Builder) extends AnyVal {

  final def allocationStrategyAsScala(
      value: Option[FleetOnDemandAllocationStrategy]
  ): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.allocationStrategy(v)
    }
  }

  final def singleInstanceTypeAsScala(value: Option[Boolean]): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.singleInstanceType(v)
    }
  }

  final def singleAvailabilityZoneAsScala(value: Option[Boolean]): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.singleAvailabilityZone(v)
    }
  }

  final def minTargetCapacityAsScala(value: Option[Int]): OnDemandOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.minTargetCapacity(v)
    }
  }

}

final class OnDemandOptionsRequestOps(val self: OnDemandOptionsRequest) extends AnyVal {

  final def allocationStrategyAsScala: Option[FleetOnDemandAllocationStrategy] = Option(self.allocationStrategy)

  final def singleInstanceTypeAsScala: Option[Boolean] = Option(self.singleInstanceType)

  final def singleAvailabilityZoneAsScala: Option[Boolean] = Option(self.singleAvailabilityZone)

  final def minTargetCapacityAsScala: Option[Int] = Option(self.minTargetCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOnDemandOptionsRequestOps {

  implicit def toOnDemandOptionsRequestBuilderOps(v: OnDemandOptionsRequest.Builder): OnDemandOptionsRequestBuilderOps =
    new OnDemandOptionsRequestBuilderOps(v)

  implicit def toOnDemandOptionsRequestOps(v: OnDemandOptionsRequest): OnDemandOptionsRequestOps =
    new OnDemandOptionsRequestOps(v)

}
