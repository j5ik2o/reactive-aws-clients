// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutDashboardResponseBuilderOps(val self: PutDashboardResponse.Builder) extends AnyVal {

  final def dashboardValidationMessagesAsScala(
      value: Option[Seq[DashboardValidationMessage]]
  ): PutDashboardResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dashboardValidationMessages(v.asJava)
    } // Seq[DashboardValidationMessage]
  }

}

final class PutDashboardResponseOps(val self: PutDashboardResponse) extends AnyVal {

  final def dashboardValidationMessagesAsScala: Option[Seq[DashboardValidationMessage]] =
    Option(self.dashboardValidationMessages).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[DashboardValidationMessage]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutDashboardResponseOps {

  implicit def toPutDashboardResponseBuilderOps(v: PutDashboardResponse.Builder): PutDashboardResponseBuilderOps =
    new PutDashboardResponseBuilderOps(v)

  implicit def toPutDashboardResponseOps(v: PutDashboardResponse): PutDashboardResponseOps =
    new PutDashboardResponseOps(v)

}
