// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotOptionsBuilderOps(val self: SpotOptions.Builder) extends AnyVal {

  final def allocationStrategyAsScala(value: Option[SpotAllocationStrategy]): SpotOptions.Builder = {
    value.fold(self) { v =>
      self.allocationStrategy(v)
    }
  }

  final def instanceInterruptionBehaviorAsScala(
      value: Option[SpotInstanceInterruptionBehavior]
  ): SpotOptions.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

  final def instancePoolsToUseCountAsScala(value: Option[Int]): SpotOptions.Builder = {
    value.fold(self) { v =>
      self.instancePoolsToUseCount(v)
    }
  }

  final def singleInstanceTypeAsScala(value: Option[Boolean]): SpotOptions.Builder = {
    value.fold(self) { v =>
      self.singleInstanceType(v)
    }
  }

  final def singleAvailabilityZoneAsScala(value: Option[Boolean]): SpotOptions.Builder = {
    value.fold(self) { v =>
      self.singleAvailabilityZone(v)
    }
  }

  final def minTargetCapacityAsScala(value: Option[Int]): SpotOptions.Builder = {
    value.fold(self) { v =>
      self.minTargetCapacity(v)
    }
  }

}

final class SpotOptionsOps(val self: SpotOptions) extends AnyVal {

  final def allocationStrategyAsScala: Option[SpotAllocationStrategy] = Option(self.allocationStrategy)

  final def instanceInterruptionBehaviorAsScala: Option[SpotInstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

  final def instancePoolsToUseCountAsScala: Option[Int] = Option(self.instancePoolsToUseCount)

  final def singleInstanceTypeAsScala: Option[Boolean] = Option(self.singleInstanceType)

  final def singleAvailabilityZoneAsScala: Option[Boolean] = Option(self.singleAvailabilityZone)

  final def minTargetCapacityAsScala: Option[Int] = Option(self.minTargetCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotOptionsOps {

  implicit def toSpotOptionsBuilderOps(v: SpotOptions.Builder): SpotOptionsBuilderOps = new SpotOptionsBuilderOps(v)

  implicit def toSpotOptionsOps(v: SpotOptions): SpotOptionsOps = new SpotOptionsOps(v)

}
