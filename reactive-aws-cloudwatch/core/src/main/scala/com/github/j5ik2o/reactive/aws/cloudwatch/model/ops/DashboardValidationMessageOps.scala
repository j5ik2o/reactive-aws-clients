// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DashboardValidationMessageBuilderOps(val self: DashboardValidationMessage.Builder) extends AnyVal {

  final def dataPathAsScala(value: Option[String]): DashboardValidationMessage.Builder = {
    value.fold(self) { v =>
      self.dataPath(v)
    }
  } // String

  final def messageAsScala(value: Option[String]): DashboardValidationMessage.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

}

final class DashboardValidationMessageOps(val self: DashboardValidationMessage) extends AnyVal {

  final def dataPathAsScala: Option[String] = Option(self.dataPath) // String

  final def messageAsScala: Option[String] = Option(self.message) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDashboardValidationMessageOps {

  implicit def toDashboardValidationMessageBuilderOps(
      v: DashboardValidationMessage.Builder
  ): DashboardValidationMessageBuilderOps = new DashboardValidationMessageBuilderOps(v)

  implicit def toDashboardValidationMessageOps(v: DashboardValidationMessage): DashboardValidationMessageOps =
    new DashboardValidationMessageOps(v)

}
