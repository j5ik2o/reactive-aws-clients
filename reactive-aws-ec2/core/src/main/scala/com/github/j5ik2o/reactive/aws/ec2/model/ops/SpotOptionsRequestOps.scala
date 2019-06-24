// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotOptionsRequestBuilderOps(val self: SpotOptionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationStrategyAsScala(value: Option[SpotAllocationStrategy]): SpotOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.allocationStrategy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala(
      value: Option[SpotInstanceInterruptionBehavior]
  ): SpotOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancePoolsToUseCountAsScala(value: Option[Int]): SpotOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.instancePoolsToUseCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleInstanceTypeAsScala(value: Option[Boolean]): SpotOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.singleInstanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def singleAvailabilityZoneAsScala(value: Option[Boolean]): SpotOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.singleAvailabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTargetCapacityAsScala(value: Option[Int]): SpotOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.minTargetCapacity(v)
    }
  }

}

final class SpotOptionsRequestOps(val self: SpotOptionsRequest) extends AnyVal {

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

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotOptionsRequestOps {

  implicit def toSpotOptionsRequestBuilderOps(v: SpotOptionsRequest.Builder): SpotOptionsRequestBuilderOps =
    new SpotOptionsRequestBuilderOps(v)

  implicit def toSpotOptionsRequestOps(v: SpotOptionsRequest): SpotOptionsRequestOps = new SpotOptionsRequestOps(v)

}
