// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetReservedInstancesExchangeQuoteResponseBuilderOps(
    val self: GetReservedInstancesExchangeQuoteResponse.Builder
) extends AnyVal {

  final def currencyCodeAsScala(value: Option[String]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def isValidExchangeAsScala(value: Option[Boolean]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.isValidExchange(v)
    }
  }

  final def outputReservedInstancesWillExpireAtAsScala(
      value: Option[java.time.Instant]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.outputReservedInstancesWillExpireAt(v)
    }
  }

  final def paymentDueAsScala(value: Option[String]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.paymentDue(v)
    }
  }

  final def reservedInstanceValueRollupAsScala(
      value: Option[ReservationValue]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.reservedInstanceValueRollup(v)
    }
  }

  final def reservedInstanceValueSetAsScala(
      value: Option[Seq[ReservedInstanceReservationValue]]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstanceValueSet(v.asJava)
    }
  }

  final def targetConfigurationValueRollupAsScala(
      value: Option[ReservationValue]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.targetConfigurationValueRollup(v)
    }
  }

  final def targetConfigurationValueSetAsScala(
      value: Option[Seq[TargetReservationValue]]
  ): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.targetConfigurationValueSet(v.asJava)
    }
  }

  final def validationFailureReasonAsScala(value: Option[String]): GetReservedInstancesExchangeQuoteResponse.Builder = {
    value.fold(self) { v =>
      self.validationFailureReason(v)
    }
  }

}

final class GetReservedInstancesExchangeQuoteResponseOps(val self: GetReservedInstancesExchangeQuoteResponse)
    extends AnyVal {

  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode)

  final def isValidExchangeAsScala: Option[Boolean] = Option(self.isValidExchange)

  final def outputReservedInstancesWillExpireAtAsScala: Option[java.time.Instant] =
    Option(self.outputReservedInstancesWillExpireAt)

  final def paymentDueAsScala: Option[String] = Option(self.paymentDue)

  final def reservedInstanceValueRollupAsScala: Option[ReservationValue] = Option(self.reservedInstanceValueRollup)

  final def reservedInstanceValueSetAsScala: Option[Seq[ReservedInstanceReservationValue]] =
    Option(self.reservedInstanceValueSet).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def targetConfigurationValueRollupAsScala: Option[ReservationValue] =
    Option(self.targetConfigurationValueRollup)

  final def targetConfigurationValueSetAsScala: Option[Seq[TargetReservationValue]] =
    Option(self.targetConfigurationValueSet).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

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
