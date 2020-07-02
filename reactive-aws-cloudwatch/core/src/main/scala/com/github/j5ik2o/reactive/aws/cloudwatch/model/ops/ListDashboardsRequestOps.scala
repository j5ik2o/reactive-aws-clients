// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class ListDashboardsRequestBuilderOps(val self: ListDashboardsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNamePrefixAsScala(value: Option[String]): ListDashboardsRequest.Builder = {
    value.fold(self) { v => self.dashboardNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListDashboardsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListDashboardsRequestOps(val self: ListDashboardsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNamePrefixAsScala: Option[String] = Option(self.dashboardNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDashboardsRequestOps {

  implicit def toListDashboardsRequestBuilderOps(v: ListDashboardsRequest.Builder): ListDashboardsRequestBuilderOps =
    new ListDashboardsRequestBuilderOps(v)

  implicit def toListDashboardsRequestOps(v: ListDashboardsRequest): ListDashboardsRequestOps =
    new ListDashboardsRequestOps(v)

}
