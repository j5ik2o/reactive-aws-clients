// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DeleteDashboardsRequestBuilderOps(val self: DeleteDashboardsRequest.Builder) extends AnyVal {

  final def dashboardNamesAsScala(value: Option[Seq[String]]): DeleteDashboardsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dashboardNames(v.asJava)
    }
  }

}

final class DeleteDashboardsRequestOps(val self: DeleteDashboardsRequest) extends AnyVal {

  final def dashboardNamesAsScala: Option[Seq[String]] = Option(self.dashboardNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteDashboardsRequestOps {

  implicit def toDeleteDashboardsRequestBuilderOps(
      v: DeleteDashboardsRequest.Builder
  ): DeleteDashboardsRequestBuilderOps = new DeleteDashboardsRequestBuilderOps(v)

  implicit def toDeleteDashboardsRequestOps(v: DeleteDashboardsRequest): DeleteDashboardsRequestOps =
    new DeleteDashboardsRequestOps(v)

}
