// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifySpotFleetRequestRequestBuilderOps(val self: ModifySpotFleetRequestRequest.Builder) extends AnyVal {

  final def excessCapacityTerminationPolicyAsScala(
      value: Option[ExcessCapacityTerminationPolicy]
  ): ModifySpotFleetRequestRequest.Builder = {
    value.fold(self) { v =>
      self.excessCapacityTerminationPolicy(v)
    }
  }

  final def spotFleetRequestIdAsScala(value: Option[String]): ModifySpotFleetRequestRequest.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

  final def targetCapacityAsScala(value: Option[Int]): ModifySpotFleetRequestRequest.Builder = {
    value.fold(self) { v =>
      self.targetCapacity(v)
    }
  }

}

final class ModifySpotFleetRequestRequestOps(val self: ModifySpotFleetRequestRequest) extends AnyVal {

  final def excessCapacityTerminationPolicyAsScala: Option[ExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

  final def targetCapacityAsScala: Option[Int] = Option(self.targetCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifySpotFleetRequestRequestOps {

  implicit def toModifySpotFleetRequestRequestBuilderOps(
      v: ModifySpotFleetRequestRequest.Builder
  ): ModifySpotFleetRequestRequestBuilderOps = new ModifySpotFleetRequestRequestBuilderOps(v)

  implicit def toModifySpotFleetRequestRequestOps(v: ModifySpotFleetRequestRequest): ModifySpotFleetRequestRequestOps =
    new ModifySpotFleetRequestRequestOps(v)

}
