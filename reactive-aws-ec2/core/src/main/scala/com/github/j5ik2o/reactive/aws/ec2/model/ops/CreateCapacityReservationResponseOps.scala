// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateCapacityReservationResponseBuilderOps(val self: CreateCapacityReservationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationAsScala(
      value: Option[CapacityReservation]
  ): CreateCapacityReservationResponse.Builder = {
    value.fold(self) { v => self.capacityReservation(v) }
  }

}

final class CreateCapacityReservationResponseOps(val self: CreateCapacityReservationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationAsScala: Option[CapacityReservation] = Option(self.capacityReservation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCapacityReservationResponseOps {

  implicit def toCreateCapacityReservationResponseBuilderOps(
      v: CreateCapacityReservationResponse.Builder
  ): CreateCapacityReservationResponseBuilderOps = new CreateCapacityReservationResponseBuilderOps(v)

  implicit def toCreateCapacityReservationResponseOps(
      v: CreateCapacityReservationResponse
  ): CreateCapacityReservationResponseOps = new CreateCapacityReservationResponseOps(v)

}
