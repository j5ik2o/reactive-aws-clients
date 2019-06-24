// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class RecurringChargeBuilderOps(val self: RecurringCharge.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargeAmountAsScala(value: Option[Double]): RecurringCharge.Builder = {
    value.fold(self) { v =>
      self.recurringChargeAmount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargeFrequencyAsScala(value: Option[String]): RecurringCharge.Builder = {
    value.fold(self) { v =>
      self.recurringChargeFrequency(v)
    }
  }

}

final class RecurringChargeOps(val self: RecurringCharge) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargeAmountAsScala: Option[Double] = Option(self.recurringChargeAmount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargeFrequencyAsScala: Option[String] = Option(self.recurringChargeFrequency)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecurringChargeOps {

  implicit def toRecurringChargeBuilderOps(v: RecurringCharge.Builder): RecurringChargeBuilderOps =
    new RecurringChargeBuilderOps(v)

  implicit def toRecurringChargeOps(v: RecurringCharge): RecurringChargeOps = new RecurringChargeOps(v)

}
