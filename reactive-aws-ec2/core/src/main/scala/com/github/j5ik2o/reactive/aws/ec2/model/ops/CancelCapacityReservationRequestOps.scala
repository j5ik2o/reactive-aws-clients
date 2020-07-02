// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelCapacityReservationRequestBuilderOps(val self: CancelCapacityReservationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala(value: Option[String]): CancelCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.capacityReservationId(v) }
  }

}

final class CancelCapacityReservationRequestOps(val self: CancelCapacityReservationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelCapacityReservationRequestOps {

  implicit def toCancelCapacityReservationRequestBuilderOps(
      v: CancelCapacityReservationRequest.Builder
  ): CancelCapacityReservationRequestBuilderOps = new CancelCapacityReservationRequestBuilderOps(v)

  implicit def toCancelCapacityReservationRequestOps(
      v: CancelCapacityReservationRequest
  ): CancelCapacityReservationRequestOps = new CancelCapacityReservationRequestOps(v)

}
