// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationSpecificationResponseBuilderOps(
    val self: CapacityReservationSpecificationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationPreferenceAsScala(
      value: Option[CapacityReservationPreference]
  ): CapacityReservationSpecificationResponse.Builder = {
    value.fold(self) { v =>
      self.capacityReservationPreference(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationTargetAsScala(
      value: Option[CapacityReservationTargetResponse]
  ): CapacityReservationSpecificationResponse.Builder = {
    value.fold(self) { v =>
      self.capacityReservationTarget(v)
    }
  }

}

final class CapacityReservationSpecificationResponseOps(val self: CapacityReservationSpecificationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationPreferenceAsScala: Option[CapacityReservationPreference] =
    Option(self.capacityReservationPreference)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationTargetAsScala: Option[CapacityReservationTargetResponse] =
    Option(self.capacityReservationTarget)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationSpecificationResponseOps {

  implicit def toCapacityReservationSpecificationResponseBuilderOps(
      v: CapacityReservationSpecificationResponse.Builder
  ): CapacityReservationSpecificationResponseBuilderOps = new CapacityReservationSpecificationResponseBuilderOps(v)

  implicit def toCapacityReservationSpecificationResponseOps(
      v: CapacityReservationSpecificationResponse
  ): CapacityReservationSpecificationResponseOps = new CapacityReservationSpecificationResponseOps(v)

}
