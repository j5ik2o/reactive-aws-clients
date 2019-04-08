// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseBuilderOps(val self: Purchase.Builder) extends AnyVal {

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): Purchase.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def durationAsScala(value: Option[Int]): Purchase.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def hostIdSetAsScala(value: Option[Seq[String]]): Purchase.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hostIdSet(v.asJava)
    }
  }

  final def hostReservationIdAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.hostReservationId(v)
    }
  }

  final def hourlyPriceAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  final def instanceFamilyAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.instanceFamily(v)
    }
  }

  final def paymentOptionAsScala(value: Option[PaymentOption]): Purchase.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  final def upfrontPriceAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.upfrontPrice(v)
    }
  }

}

final class PurchaseOps(val self: Purchase) extends AnyVal {

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def durationAsScala: Option[Int] = Option(self.duration)

  final def hostIdSetAsScala: Option[Seq[String]] = Option(self.hostIdSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def hostReservationIdAsScala: Option[String] = Option(self.hostReservationId)

  final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice)

  final def instanceFamilyAsScala: Option[String] = Option(self.instanceFamily)

  final def paymentOptionAsScala: Option[PaymentOption] = Option(self.paymentOption)

  final def upfrontPriceAsScala: Option[String] = Option(self.upfrontPrice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseOps {

  implicit def toPurchaseBuilderOps(v: Purchase.Builder): PurchaseBuilderOps = new PurchaseBuilderOps(v)

  implicit def toPurchaseOps(v: Purchase): PurchaseOps = new PurchaseOps(v)

}
