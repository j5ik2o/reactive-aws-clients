// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PricingDetailBuilderOps(val self: PricingDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): PricingDetail.Builder = {
    value.fold(self) { v => self.count(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceAsScala(value: Option[Double]): PricingDetail.Builder = {
    value.fold(self) { v => self.price(v) }
  }

}

final class PricingDetailOps(val self: PricingDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceAsScala: Option[Double] = Option(self.price)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPricingDetailOps {

  implicit def toPricingDetailBuilderOps(v: PricingDetail.Builder): PricingDetailBuilderOps =
    new PricingDetailBuilderOps(v)

  implicit def toPricingDetailOps(v: PricingDetail): PricingDetailOps = new PricingDetailOps(v)

}
