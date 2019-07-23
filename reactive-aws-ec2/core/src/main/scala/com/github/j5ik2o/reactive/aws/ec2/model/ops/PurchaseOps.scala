// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseBuilderOps(val self: Purchase.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): Purchase.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala(value: Option[Int]): Purchase.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdSetAsScala(value: Option[Seq[String]]): Purchase.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostIdSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostReservationIdAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.hostReservationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hourlyPriceAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.instanceFamily(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala(value: Option[PaymentOption]): Purchase.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upfrontPriceAsScala(value: Option[String]): Purchase.Builder = {
    value.fold(self) { v =>
      self.upfrontPrice(v)
    }
  }

}

final class PurchaseOps(val self: Purchase) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala: Option[Int] = Option(self.duration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdSetAsScala: Option[Seq[String]] = Option(self.hostIdSet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostReservationIdAsScala: Option[String] = Option(self.hostReservationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyAsScala: Option[String] = Option(self.instanceFamily)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala: Option[PaymentOption] = Option(self.paymentOption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upfrontPriceAsScala: Option[String] = Option(self.upfrontPrice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseOps {

  implicit def toPurchaseBuilderOps(v: Purchase.Builder): PurchaseBuilderOps = new PurchaseBuilderOps(v)

  implicit def toPurchaseOps(v: Purchase): PurchaseOps = new PurchaseOps(v)

}
