// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PriceScheduleSpecificationBuilderOps(val self: PriceScheduleSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): PriceScheduleSpecification.Builder = {
    value.fold(self) { v => self.currencyCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceAsScala(value: Option[Double]): PriceScheduleSpecification.Builder = {
    value.fold(self) { v => self.price(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def termAsScala(value: Option[Long]): PriceScheduleSpecification.Builder = {
    value.fold(self) { v => self.term(v) }
  }

}

final class PriceScheduleSpecificationOps(val self: PriceScheduleSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceAsScala: Option[Double] = Option(self.price)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
