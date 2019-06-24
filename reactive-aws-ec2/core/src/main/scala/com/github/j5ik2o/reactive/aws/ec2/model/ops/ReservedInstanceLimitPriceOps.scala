// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstanceLimitPriceBuilderOps(val self: ReservedInstanceLimitPrice.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amountAsScala(value: Option[Double]): ReservedInstanceLimitPrice.Builder = {
    value.fold(self) { v =>
      self.amount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): ReservedInstanceLimitPrice.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

}

final class ReservedInstanceLimitPriceOps(val self: ReservedInstanceLimitPrice) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amountAsScala: Option[Double] = Option(self.amount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstanceLimitPriceOps {

  implicit def toReservedInstanceLimitPriceBuilderOps(
      v: ReservedInstanceLimitPrice.Builder
  ): ReservedInstanceLimitPriceBuilderOps = new ReservedInstanceLimitPriceBuilderOps(v)

  implicit def toReservedInstanceLimitPriceOps(v: ReservedInstanceLimitPrice): ReservedInstanceLimitPriceOps =
    new ReservedInstanceLimitPriceOps(v)

}
