// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RecurringChargeBuilderOps(val self: RecurringCharge.Builder) extends AnyVal {

  final def amountAsScala(value: Option[Double]): RecurringCharge.Builder = {
    value.fold(self) { v =>
      self.amount(v)
    }
  }

  final def frequencyAsScala(value: Option[RecurringChargeFrequency]): RecurringCharge.Builder = {
    value.fold(self) { v =>
      self.frequency(v)
    }
  }

}

final class RecurringChargeOps(val self: RecurringCharge) extends AnyVal {

  final def amountAsScala: Option[Double] = Option(self.amount)

  final def frequencyAsScala: Option[RecurringChargeFrequency] = Option(self.frequency)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecurringChargeOps {

  implicit def toRecurringChargeBuilderOps(v: RecurringCharge.Builder): RecurringChargeBuilderOps =
    new RecurringChargeBuilderOps(v)

  implicit def toRecurringChargeOps(v: RecurringCharge): RecurringChargeOps = new RecurringChargeOps(v)

}
