// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DefaultRetentionBuilderOps(val self: DefaultRetention.Builder) extends AnyVal {

  final def modeAsScala(value: Option[ObjectLockRetentionMode]): DefaultRetention.Builder = {
    value.fold(self) { v =>
      self.mode(v)
    }
  } // String

  final def daysAsScala(value: Option[Int]): DefaultRetention.Builder = {
    value.fold(self) { v =>
      self.days(v)
    }
  } // Int

  final def yearsAsScala(value: Option[Int]): DefaultRetention.Builder = {
    value.fold(self) { v =>
      self.years(v)
    }
  } // Int

}

final class DefaultRetentionOps(val self: DefaultRetention) extends AnyVal {

  final def modeAsScala: Option[ObjectLockRetentionMode] = Option(self.mode) // String

  final def daysAsScala: Option[Int] = Option(self.days) // Int

  final def yearsAsScala: Option[Int] = Option(self.years) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDefaultRetentionOps {

  implicit def toDefaultRetentionBuilderOps(v: DefaultRetention.Builder): DefaultRetentionBuilderOps =
    new DefaultRetentionBuilderOps(v)

  implicit def toDefaultRetentionOps(v: DefaultRetention): DefaultRetentionOps = new DefaultRetentionOps(v)

}
