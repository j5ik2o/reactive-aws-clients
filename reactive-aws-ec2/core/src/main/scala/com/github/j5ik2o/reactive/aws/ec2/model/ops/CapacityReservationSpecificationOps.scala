// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationSpecificationBuilderOps(val self: CapacityReservationSpecification.Builder)
    extends AnyVal {

  final def capacityReservationPreferenceAsScala(
      value: Option[CapacityReservationPreference]
  ): CapacityReservationSpecification.Builder = {
    value.fold(self) { v =>
      self.capacityReservationPreference(v)
    }
  }

  final def capacityReservationTargetAsScala(
      value: Option[CapacityReservationTarget]
  ): CapacityReservationSpecification.Builder = {
    value.fold(self) { v =>
      self.capacityReservationTarget(v)
    }
  }

}

final class CapacityReservationSpecificationOps(val self: CapacityReservationSpecification) extends AnyVal {

  final def capacityReservationPreferenceAsScala: Option[CapacityReservationPreference] =
    Option(self.capacityReservationPreference)

  final def capacityReservationTargetAsScala: Option[CapacityReservationTarget] = Option(self.capacityReservationTarget)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationSpecificationOps {

  implicit def toCapacityReservationSpecificationBuilderOps(
      v: CapacityReservationSpecification.Builder
  ): CapacityReservationSpecificationBuilderOps = new CapacityReservationSpecificationBuilderOps(v)

  implicit def toCapacityReservationSpecificationOps(
      v: CapacityReservationSpecification
  ): CapacityReservationSpecificationOps = new CapacityReservationSpecificationOps(v)

}
