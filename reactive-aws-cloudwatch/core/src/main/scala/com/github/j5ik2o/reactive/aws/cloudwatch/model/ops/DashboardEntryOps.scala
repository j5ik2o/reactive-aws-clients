// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DashboardEntryBuilderOps(val self: DashboardEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala(value: Option[String]): DashboardEntry.Builder = {
    value.fold(self) { v => self.dashboardName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardArnAsScala(value: Option[String]): DashboardEntry.Builder = {
    value.fold(self) { v => self.dashboardArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): DashboardEntry.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Long]): DashboardEntry.Builder = {
    value.fold(self) { v => self.size(v) }
  }

}

final class DashboardEntryOps(val self: DashboardEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardNameAsScala: Option[String] = Option(self.dashboardName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dashboardArnAsScala: Option[String] = Option(self.dashboardArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Long] = Option(self.size)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDashboardEntryOps {

  implicit def toDashboardEntryBuilderOps(v: DashboardEntry.Builder): DashboardEntryBuilderOps =
    new DashboardEntryBuilderOps(v)

  implicit def toDashboardEntryOps(v: DashboardEntry): DashboardEntryOps = new DashboardEntryOps(v)

}
