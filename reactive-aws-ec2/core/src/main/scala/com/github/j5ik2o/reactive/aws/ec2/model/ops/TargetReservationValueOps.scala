// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetReservationValueBuilderOps(val self: TargetReservationValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationValueAsScala(value: Option[ReservationValue]): TargetReservationValue.Builder = {
    value.fold(self) { v =>
      self.reservationValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationAsScala(value: Option[TargetConfiguration]): TargetReservationValue.Builder = {
    value.fold(self) { v =>
      self.targetConfiguration(v)
    }
  }

}

final class TargetReservationValueOps(val self: TargetReservationValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationValueAsScala: Option[ReservationValue] = Option(self.reservationValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationAsScala: Option[TargetConfiguration] = Option(self.targetConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetReservationValueOps {

  implicit def toTargetReservationValueBuilderOps(v: TargetReservationValue.Builder): TargetReservationValueBuilderOps =
    new TargetReservationValueBuilderOps(v)

  implicit def toTargetReservationValueOps(v: TargetReservationValue): TargetReservationValueOps =
    new TargetReservationValueOps(v)

}
