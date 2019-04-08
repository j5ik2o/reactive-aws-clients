// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseHostReservationRequestBuilderOps(val self: PurchaseHostReservationRequest.Builder) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): PurchaseHostReservationRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): PurchaseHostReservationRequest.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def hostIdSetAsScala(value: Option[Seq[String]]): PurchaseHostReservationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hostIdSet(v.asJava)
    }
  }

  final def limitPriceAsScala(value: Option[String]): PurchaseHostReservationRequest.Builder = {
    value.fold(self) { v =>
      self.limitPrice(v)
    }
  }

  final def offeringIdAsScala(value: Option[String]): PurchaseHostReservationRequest.Builder = {
    value.fold(self) { v =>
      self.offeringId(v)
    }
  }

}

final class PurchaseHostReservationRequestOps(val self: PurchaseHostReservationRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def hostIdSetAsScala: Option[Seq[String]] = Option(self.hostIdSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def limitPriceAsScala: Option[String] = Option(self.limitPrice)

  final def offeringIdAsScala: Option[String] = Option(self.offeringId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseHostReservationRequestOps {

  implicit def toPurchaseHostReservationRequestBuilderOps(
      v: PurchaseHostReservationRequest.Builder
  ): PurchaseHostReservationRequestBuilderOps = new PurchaseHostReservationRequestBuilderOps(v)

  implicit def toPurchaseHostReservationRequestOps(
      v: PurchaseHostReservationRequest
  ): PurchaseHostReservationRequestOps = new PurchaseHostReservationRequestOps(v)

}
