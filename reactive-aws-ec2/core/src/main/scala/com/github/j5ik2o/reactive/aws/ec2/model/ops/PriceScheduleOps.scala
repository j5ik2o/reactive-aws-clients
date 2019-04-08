// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PriceScheduleBuilderOps(val self: PriceSchedule.Builder) extends AnyVal {

  final def activeAsScala(value: Option[Boolean]): PriceSchedule.Builder = {
    value.fold(self) { v =>
      self.active(v)
    }
  }

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): PriceSchedule.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def priceAsScala(value: Option[Double]): PriceSchedule.Builder = {
    value.fold(self) { v =>
      self.price(v)
    }
  }

  final def termAsScala(value: Option[Long]): PriceSchedule.Builder = {
    value.fold(self) { v =>
      self.term(v)
    }
  }

}

final class PriceScheduleOps(val self: PriceSchedule) extends AnyVal {

  final def activeAsScala: Option[Boolean] = Option(self.active)

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def priceAsScala: Option[Double] = Option(self.price)

  final def termAsScala: Option[Long] = Option(self.term)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPriceScheduleOps {

  implicit def toPriceScheduleBuilderOps(v: PriceSchedule.Builder): PriceScheduleBuilderOps =
    new PriceScheduleBuilderOps(v)

  implicit def toPriceScheduleOps(v: PriceSchedule): PriceScheduleOps = new PriceScheduleOps(v)

}
