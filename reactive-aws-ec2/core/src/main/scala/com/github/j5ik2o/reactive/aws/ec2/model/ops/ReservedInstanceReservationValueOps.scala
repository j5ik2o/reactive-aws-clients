// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstanceReservationValueBuilderOps(val self: ReservedInstanceReservationValue.Builder)
    extends AnyVal {

  final def reservationValueAsScala(value: Option[ReservationValue]): ReservedInstanceReservationValue.Builder = {
    value.fold(self) { v =>
      self.reservationValue(v)
    }
  }

  final def reservedInstanceIdAsScala(value: Option[String]): ReservedInstanceReservationValue.Builder = {
    value.fold(self) { v =>
      self.reservedInstanceId(v)
    }
  }

}

final class ReservedInstanceReservationValueOps(val self: ReservedInstanceReservationValue) extends AnyVal {

  final def reservationValueAsScala: Option[ReservationValue] = Option(self.reservationValue)

  final def reservedInstanceIdAsScala: Option[String] = Option(self.reservedInstanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstanceReservationValueOps {

  implicit def toReservedInstanceReservationValueBuilderOps(
      v: ReservedInstanceReservationValue.Builder
  ): ReservedInstanceReservationValueBuilderOps = new ReservedInstanceReservationValueBuilderOps(v)

  implicit def toReservedInstanceReservationValueOps(
      v: ReservedInstanceReservationValue
  ): ReservedInstanceReservationValueOps = new ReservedInstanceReservationValueOps(v)

}
