// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PriceScheduleBuilderOps(val self: PriceSchedule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeAsScala(value: Option[Boolean]): PriceSchedule.Builder = {
    value.fold(self) { v => self.active(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): PriceSchedule.Builder = {
    value.fold(self) { v => self.currencyCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceAsScala(value: Option[Double]): PriceSchedule.Builder = {
    value.fold(self) { v => self.price(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def termAsScala(value: Option[Long]): PriceSchedule.Builder = {
    value.fold(self) { v => self.term(v) }
  }

}

final class PriceScheduleOps(val self: PriceSchedule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeAsScala: Option[Boolean] = Option(self.active)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceAsScala: Option[Double] = Option(self.price)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def termAsScala: Option[Long] = Option(self.term)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPriceScheduleOps {

  implicit def toPriceScheduleBuilderOps(v: PriceSchedule.Builder): PriceScheduleBuilderOps =
    new PriceScheduleBuilderOps(v)

  implicit def toPriceScheduleOps(v: PriceSchedule): PriceScheduleOps = new PriceScheduleOps(v)

}
