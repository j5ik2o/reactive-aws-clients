// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationTargetResponseBuilderOps(val self: CapacityReservationTargetResponse.Builder)
    extends AnyVal {

  final def capacityReservationIdAsScala(value: Option[String]): CapacityReservationTargetResponse.Builder = {
    value.fold(self) { v =>
      self.capacityReservationId(v)
    }
  }

}

final class CapacityReservationTargetResponseOps(val self: CapacityReservationTargetResponse) extends AnyVal {

  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationTargetResponseOps {

  implicit def toCapacityReservationTargetResponseBuilderOps(
      v: CapacityReservationTargetResponse.Builder
  ): CapacityReservationTargetResponseBuilderOps = new CapacityReservationTargetResponseBuilderOps(v)

  implicit def toCapacityReservationTargetResponseOps(
      v: CapacityReservationTargetResponse
  ): CapacityReservationTargetResponseOps = new CapacityReservationTargetResponseOps(v)

}
