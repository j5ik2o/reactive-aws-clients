// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutDashboardRequestBuilderOps(val self: PutDashboardRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala(value: Option[String]): PutDashboardRequest.Builder = {
    value.fold(self) { v => self.dashboardName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardBodyAsScala(value: Option[String]): PutDashboardRequest.Builder = {
    value.fold(self) { v => self.dashboardBody(v) }
  }

}

final class PutDashboardRequestOps(val self: PutDashboardRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala: Option[String] = Option(self.dashboardName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardBodyAsScala: Option[String] = Option(self.dashboardBody)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutDashboardRequestOps {

  implicit def toPutDashboardRequestBuilderOps(v: PutDashboardRequest.Builder): PutDashboardRequestBuilderOps =
    new PutDashboardRequestBuilderOps(v)

  implicit def toPutDashboardRequestOps(v: PutDashboardRequest): PutDashboardRequestOps = new PutDashboardRequestOps(v)

}
