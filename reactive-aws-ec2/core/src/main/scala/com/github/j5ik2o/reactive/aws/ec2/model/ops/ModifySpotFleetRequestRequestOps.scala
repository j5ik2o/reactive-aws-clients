// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifySpotFleetRequestRequestBuilderOps(val self: ModifySpotFleetRequestRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excessCapacityTerminationPolicyAsScala(
      value: Option[ExcessCapacityTerminationPolicy]
  ): ModifySpotFleetRequestRequest.Builder = {
    value.fold(self) { v =>
      self.excessCapacityTerminationPolicy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala(value: Option[String]): ModifySpotFleetRequestRequest.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacityAsScala(value: Option[Int]): ModifySpotFleetRequestRequest.Builder = {
    value.fold(self) { v =>
      self.targetCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandTargetCapacityAsScala(value: Option[Int]): ModifySpotFleetRequestRequest.Builder = {
    value.fold(self) { v =>
      self.onDemandTargetCapacity(v)
    }
  }

}

final class ModifySpotFleetRequestRequestOps(val self: ModifySpotFleetRequestRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excessCapacityTerminationPolicyAsScala: Option[ExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacityAsScala: Option[Int] = Option(self.targetCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onDemandTargetCapacityAsScala: Option[Int] = Option(self.onDemandTargetCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifySpotFleetRequestRequestOps {

  implicit def toModifySpotFleetRequestRequestBuilderOps(
      v: ModifySpotFleetRequestRequest.Builder
  ): ModifySpotFleetRequestRequestBuilderOps = new ModifySpotFleetRequestRequestBuilderOps(v)

  implicit def toModifySpotFleetRequestRequestOps(v: ModifySpotFleetRequestRequest): ModifySpotFleetRequestRequestOps =
    new ModifySpotFleetRequestRequestOps(v)

}
