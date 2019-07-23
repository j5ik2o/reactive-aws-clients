// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetDashboardRequestBuilderOps(val self: GetDashboardRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala(value: Option[String]): GetDashboardRequest.Builder = {
    value.fold(self) { v =>
      self.dashboardName(v)
    }
  }

}

final class GetDashboardRequestOps(val self: GetDashboardRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala: Option[String] = Option(self.dashboardName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDashboardRequestOps {

  implicit def toGetDashboardRequestBuilderOps(v: GetDashboardRequest.Builder): GetDashboardRequestBuilderOps =
    new GetDashboardRequestBuilderOps(v)

  implicit def toGetDashboardRequestOps(v: GetDashboardRequest): GetDashboardRequestOps = new GetDashboardRequestOps(v)

}
