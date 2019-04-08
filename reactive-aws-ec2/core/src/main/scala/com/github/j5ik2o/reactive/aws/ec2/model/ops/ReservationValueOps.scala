// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservationValueBuilderOps(val self: ReservationValue.Builder) extends AnyVal {

  final def hourlyPriceAsScala(value: Option[String]): ReservationValue.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  final def remainingTotalValueAsScala(value: Option[String]): ReservationValue.Builder = {
    value.fold(self) { v =>
      self.remainingTotalValue(v)
    }
  }

  final def remainingUpfrontValueAsScala(value: Option[String]): ReservationValue.Builder = {
    value.fold(self) { v =>
      self.remainingUpfrontValue(v)
    }
  }

}

final class ReservationValueOps(val self: ReservationValue) extends AnyVal {

  final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice)

  final def remainingTotalValueAsScala: Option[String] = Option(self.remainingTotalValue)

  final def remainingUpfrontValueAsScala: Option[String] = Option(self.remainingUpfrontValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservationValueOps {

  implicit def toReservationValueBuilderOps(v: ReservationValue.Builder): ReservationValueBuilderOps =
    new ReservationValueBuilderOps(v)

  implicit def toReservationValueOps(v: ReservationValue): ReservationValueOps = new ReservationValueOps(v)

}
