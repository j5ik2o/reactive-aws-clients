// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class ListDashboardsResponseBuilderOps(val self: ListDashboardsResponse.Builder) extends AnyVal {

  final def dashboardEntriesAsScala(value: Option[Seq[DashboardEntry]]): ListDashboardsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dashboardEntries(v.asJava)
    } // Seq[DashboardEntry]
  }

  final def nextTokenAsScala(value: Option[String]): ListDashboardsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListDashboardsResponseOps(val self: ListDashboardsResponse) extends AnyVal {

  final def dashboardEntriesAsScala: Option[Seq[DashboardEntry]] = Option(self.dashboardEntries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[DashboardEntry]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDashboardsResponseOps {

  implicit def toListDashboardsResponseBuilderOps(v: ListDashboardsResponse.Builder): ListDashboardsResponseBuilderOps =
    new ListDashboardsResponseBuilderOps(v)

  implicit def toListDashboardsResponseOps(v: ListDashboardsResponse): ListDashboardsResponseOps =
    new ListDashboardsResponseOps(v)

}
