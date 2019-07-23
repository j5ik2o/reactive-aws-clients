// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostReservationBuilderOps(val self: HostReservation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala(value: Option[Int]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endAsScala(value: Option[java.time.Instant]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.end(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdSetAsScala(value: Option[Seq[String]]): HostReservation.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostIdSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostReservationIdAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.hostReservationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hourlyPriceAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.instanceFamily(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringIdAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.offeringId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala(value: Option[PaymentOption]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAsScala(value: Option[java.time.Instant]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.start(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[ReservationState]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upfrontPriceAsScala(value: Option[String]): HostReservation.Builder = {
    value.fold(self) { v =>
      self.upfrontPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): HostReservation.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class HostReservationOps(val self: HostReservation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala: Option[Int] = Option(self.duration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endAsScala: Option[java.time.Instant] = Option(self.end)

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
  final def offeringIdAsScala: Option[String] = Option(self.offeringId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala: Option[PaymentOption] = Option(self.paymentOption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAsScala: Option[java.time.Instant] = Option(self.start)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[ReservationState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upfrontPriceAsScala: Option[String] = Option(self.upfrontPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostReservationOps {

  implicit def toHostReservationBuilderOps(v: HostReservation.Builder): HostReservationBuilderOps =
    new HostReservationBuilderOps(v)

  implicit def toHostReservationOps(v: HostReservation): HostReservationOps = new HostReservationOps(v)

}
