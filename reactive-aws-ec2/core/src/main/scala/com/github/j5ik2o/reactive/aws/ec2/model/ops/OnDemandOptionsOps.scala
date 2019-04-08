// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class OnDemandOptionsBuilderOps(val self: OnDemandOptions.Builder) extends AnyVal {

  final def allocationStrategyAsScala(value: Option[FleetOnDemandAllocationStrategy]): OnDemandOptions.Builder = {
    value.fold(self) { v =>
      self.allocationStrategy(v)
    }
  }

  final def singleInstanceTypeAsScala(value: Option[Boolean]): OnDemandOptions.Builder = {
    value.fold(self) { v =>
      self.singleInstanceType(v)
    }
  }

  final def singleAvailabilityZoneAsScala(value: Option[Boolean]): OnDemandOptions.Builder = {
    value.fold(self) { v =>
      self.singleAvailabilityZone(v)
    }
  }

  final def minTargetCapacityAsScala(value: Option[Int]): OnDemandOptions.Builder = {
    value.fold(self) { v =>
      self.minTargetCapacity(v)
    }
  }

}

final class OnDemandOptionsOps(val self: OnDemandOptions) extends AnyVal {

  final def allocationStrategyAsScala: Option[FleetOnDemandAllocationStrategy] = Option(self.allocationStrategy)

  final def singleInstanceTypeAsScala: Option[Boolean] = Option(self.singleInstanceType)

  final def singleAvailabilityZoneAsScala: Option[Boolean] = Option(self.singleAvailabilityZone)

  final def minTargetCapacityAsScala: Option[Int] = Option(self.minTargetCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOnDemandOptionsOps {

  implicit def toOnDemandOptionsBuilderOps(v: OnDemandOptions.Builder): OnDemandOptionsBuilderOps =
    new OnDemandOptionsBuilderOps(v)

  implicit def toOnDemandOptionsOps(v: OnDemandOptions): OnDemandOptionsOps = new OnDemandOptionsOps(v)

}
