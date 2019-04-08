// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostReservationBuilderOps(val self: HostReservation.Builder) extends AnyVal {

  final def countAsScala(value: Option[Int]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def durationAsScala(value: Option[Int]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def endAsScala(value: Option[java.time.Instant]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.end(v)
    }
  }

  final def hostIdSetAsScala(value: Option[Seq[String]]): HostReservation.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hostIdSet(v.asJava)
    }
  }

  final def hostReservationIdAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.hostReservationId(v)
    }
  }

  final def hourlyPriceAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  final def instanceFamilyAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.instanceFamily(v)
    }
  }

  final def offeringIdAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.offeringId(v)
    }
  }

  final def paymentOptionAsScala(value: Option[PaymentOption]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  final def startAsScala(value: Option[java.time.Instant]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.start(v)
    }
  }

  final def stateAsScala(value: Option[ReservationState]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def upfrontPriceAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.upfrontPrice(v)
    }
  }

}

final class HostReservationOps(val self: HostReservation) extends AnyVal {

  final def countAsScala: Option[Int] = Option(self.count)

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def durationAsScala: Option[Int] = Option(self.duration)

  final def endAsScala: Option[java.time.Instant] = Option(self.end)

  final def hostIdSetAsScala: Option[Seq[String]] = Option(self.hostIdSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def hostReservationIdAsScala: Option[String] = Option(self.hostReservationId)

  final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice)

  final def instanceFamilyAsScala: Option[String] = Option(self.instanceFamily)

  final def offeringIdAsScala: Option[String] = Option(self.offeringId)

  final def paymentOptionAsScala: Option[PaymentOption] = Option(self.paymentOption)

  final def startAsScala: Option[java.time.Instant] = Option(self.start)

  final def stateAsScala: Option[ReservationState] = Option(self.state)

  final def upfrontPriceAsScala: Option[String] = Option(self.upfrontPrice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostReservationOps {

  implicit def toHostReservationBuilderOps(v: HostReservation.Builder): HostReservationBuilderOps =
    new HostReservationBuilderOps(v)

  implicit def toHostReservationOps(v: HostReservation): HostReservationOps = new HostReservationOps(v)

}
