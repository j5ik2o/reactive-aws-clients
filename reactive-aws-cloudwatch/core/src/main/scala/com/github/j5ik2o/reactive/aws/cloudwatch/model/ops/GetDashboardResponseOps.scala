// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetDashboardResponseBuilderOps(val self: GetDashboardResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardArnAsScala(value: Option[String]): GetDashboardResponse.Builder = {
    value.fold(self) { v => self.dashboardArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardBodyAsScala(value: Option[String]): GetDashboardResponse.Builder = {
    value.fold(self) { v => self.dashboardBody(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala(value: Option[String]): GetDashboardResponse.Builder = {
    value.fold(self) { v => self.dashboardName(v) }
  }

}

final class GetDashboardResponseOps(val self: GetDashboardResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardArnAsScala: Option[String] = Option(self.dashboardArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardBodyAsScala: Option[String] = Option(self.dashboardBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala: Option[String] = Option(self.dashboardName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDashboardResponseOps {

  implicit def toGetDashboardResponseBuilderOps(v: GetDashboardResponse.Builder): GetDashboardResponseBuilderOps =
    new GetDashboardResponseBuilderOps(v)

  implicit def toGetDashboardResponseOps(v: GetDashboardResponse): GetDashboardResponseOps =
    new GetDashboardResponseOps(v)

}
