// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PriceScheduleSpecificationBuilderOps(val self: PriceScheduleSpecification.Builder) extends AnyVal {

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): PriceScheduleSpecification.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def priceAsScala(value: Option[Double]): PriceScheduleSpecification.Builder = {
    value.fold(self) { v =>
      self.price(v)
    }
  }

  final def termAsScala(value: Option[Long]): PriceScheduleSpecification.Builder = {
    value.fold(self) { v =>
      self.term(v)
    }
  }

}

final class PriceScheduleSpecificationOps(val self: PriceScheduleSpecification) extends AnyVal {

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def priceAsScala: Option[Double] = Option(self.price)

  final def termAsScala: Option[Long] = Option(self.term)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPriceScheduleSpecificationOps {

  implicit def toPriceScheduleSpecificationBuilderOps(
      v: PriceScheduleSpecification.Builder
  ): PriceScheduleSpecificationBuilderOps = new PriceScheduleSpecificationBuilderOps(v)

  implicit def toPriceScheduleSpecificationOps(v: PriceScheduleSpecification): PriceScheduleSpecificationOps =
    new PriceScheduleSpecificationOps(v)

}
