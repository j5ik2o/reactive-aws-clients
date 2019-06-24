// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetReservedInstancesExchangeQuoteResponseBuilderOps(
    val self: GetReservedInstancesExchangeQuoteResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[String]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isValidExchangeAsScala(value: Option[Boolean]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.isValidExchange(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputReservedInstancesWillExpireAtAsScala(
      value: Option[java.time.Instant]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.outputReservedInstancesWillExpireAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentDueAsScala(value: Option[String]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.paymentDue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstanceValueRollupAsScala(
      value: Option[ReservationValue]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.reservedInstanceValueRollup(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstanceValueSetAsScala(
      value: Option[Seq[ReservedInstanceReservationValue]]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstanceValueSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationValueRollupAsScala(
      value: Option[ReservationValue]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.targetConfigurationValueRollup(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationValueSetAsScala(
      value: Option[Seq[TargetReservationValue]]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.targetConfigurationValueSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validationFailureReasonAsScala(value: Option[String]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.validationFailureReason(v)
    }
  }

}

final class GetReservedInstancesExchangeQuoteResponseOps(val self: GetReservedInstancesExchangeQuoteResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isValidExchangeAsScala: Option[Boolean] = Option(self.isValidExchange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputReservedInstancesWillExpireAtAsScala: Option[java.time.Instant] =
    Option(self.outputReservedInstancesWillExpireAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentDueAsScala: Option[String] = Option(self.paymentDue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstanceValueRollupAsScala: Option[ReservationValue] = Option(self.reservedInstanceValueRollup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstanceValueSetAsScala: Option[Seq[ReservedInstanceReservationValue]] =
    Option(self.reservedInstanceValueSet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationValueRollupAsScala: Option[ReservationValue] =
    Option(self.targetConfigurationValueRollup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationValueSetAsScala: Option[Seq[TargetReservationValue]] =
    Option(self.targetConfigurationValueSet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validationFailureReasonAsScala: Option[String] = Option(self.validationFailureReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetReservedInstancesExchangeQuoteResponseOps {

  implicit def toGetReservedInstancesExchangeQuoteResponseBuilderOps(
      v: GetReservedInstancesExchangeQuoteResponse.Builder
  ): GetReservedInstancesExchangeQuoteResponseBuilderOps = new GetReservedInstancesExchangeQuoteResponseBuilderOps(v)

  implicit def toGetReservedInstancesExchangeQuoteResponseOps(
      v: GetReservedInstancesExchangeQuoteResponse
  ): GetReservedInstancesExchangeQuoteResponseOps = new GetReservedInstancesExchangeQuoteResponseOps(v)

}
