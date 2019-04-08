// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DashboardEntryBuilderOps(val self: DashboardEntry.Builder) extends AnyVal {

  final def dashboardNameAsScala(value: Option[String]): DashboardEntry.Builder = {
    value.fold(self) { v =>
      self.dashboardName(v)
    }
  } // String

  final def dashboardArnAsScala(value: Option[String]): DashboardEntry.Builder = {
    value.fold(self) { v =>
      self.dashboardArn(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): DashboardEntry.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

  final def sizeAsScala(value: Option[Long]): DashboardEntry.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  } // Long

}

final class DashboardEntryOps(val self: DashboardEntry) extends AnyVal {

  final def dashboardNameAsScala: Option[String] = Option(self.dashboardName) // String

  final def dashboardArnAsScala: Option[String] = Option(self.dashboardArn) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // Instant

  final def sizeAsScala: Option[Long] = Option(self.size) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDashboardEntryOps {

  implicit def toDashboardEntryBuilderOps(v: DashboardEntry.Builder): DashboardEntryBuilderOps =
    new DashboardEntryBuilderOps(v)

  implicit def toDashboardEntryOps(v: DashboardEntry): DashboardEntryOps = new DashboardEntryOps(v)

}
