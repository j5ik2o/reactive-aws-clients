// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class ListDashboardsResponseBuilderOps(val self: ListDashboardsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardEntriesAsScala(value: Option[Seq[DashboardEntry]]): ListDashboardsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dashboardEntries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListDashboardsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListDashboardsResponseOps(val self: ListDashboardsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardEntriesAsScala: Option[Seq[DashboardEntry]] =
    Option(self.dashboardEntries).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDashboardsResponseOps {

  implicit def toListDashboardsResponseBuilderOps(v: ListDashboardsResponse.Builder): ListDashboardsResponseBuilderOps =
    new ListDashboardsResponseBuilderOps(v)

  implicit def toListDashboardsResponseOps(v: ListDashboardsResponse): ListDashboardsResponseOps =
    new ListDashboardsResponseOps(v)

}
