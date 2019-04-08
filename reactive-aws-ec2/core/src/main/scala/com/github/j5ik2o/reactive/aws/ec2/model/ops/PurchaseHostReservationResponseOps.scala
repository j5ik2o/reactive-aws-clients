// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseHostReservationResponseBuilderOps(val self: PurchaseHostReservationResponse.Builder)
    extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): PurchaseHostReservationResponse.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): PurchaseHostReservationResponse.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def purchaseAsScala(value: Option[Seq[Purchase]]): PurchaseHostReservationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.purchase(v.asJava)
    }
  }

  final def totalHourlyPriceAsScala(value: Option[String]): PurchaseHostReservationResponse.Builder = {
    value.fold(self) { v =>
      self.totalHourlyPrice(v)
    }
  }

  final def totalUpfrontPriceAsScala(value: Option[String]): PurchaseHostReservationResponse.Builder = {
    value.fold(self) { v =>
      self.totalUpfrontPrice(v)
    }
  }

}

final class PurchaseHostReservationResponseOps(val self: PurchaseHostReservationResponse) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def purchaseAsScala: Option[Seq[Purchase]] = Option(self.purchase).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def totalHourlyPriceAsScala: Option[String] = Option(self.totalHourlyPrice)

  final def totalUpfrontPriceAsScala: Option[String] = Option(self.totalUpfrontPrice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseHostReservationResponseOps {

  implicit def toPurchaseHostReservationResponseBuilderOps(
      v: PurchaseHostReservationResponse.Builder
  ): PurchaseHostReservationResponseBuilderOps = new PurchaseHostReservationResponseBuilderOps(v)

  implicit def toPurchaseHostReservationResponseOps(
      v: PurchaseHostReservationResponse
  ): PurchaseHostReservationResponseOps = new PurchaseHostReservationResponseOps(v)

}
