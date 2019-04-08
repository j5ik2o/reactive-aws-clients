// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class ListDashboardsRequestBuilderOps(val self: ListDashboardsRequest.Builder) extends AnyVal {

  final def dashboardNamePrefixAsScala(value: Option[String]): ListDashboardsRequest.Builder = {
    value.fold(self) { v =>
      self.dashboardNamePrefix(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListDashboardsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListDashboardsRequestOps(val self: ListDashboardsRequest) extends AnyVal {

  final def dashboardNamePrefixAsScala: Option[String] = Option(self.dashboardNamePrefix) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDashboardsRequestOps {

  implicit def toListDashboardsRequestBuilderOps(v: ListDashboardsRequest.Builder): ListDashboardsRequestBuilderOps =
    new ListDashboardsRequestBuilderOps(v)

  implicit def toListDashboardsRequestOps(v: ListDashboardsRequest): ListDashboardsRequestOps =
    new ListDashboardsRequestOps(v)

}
