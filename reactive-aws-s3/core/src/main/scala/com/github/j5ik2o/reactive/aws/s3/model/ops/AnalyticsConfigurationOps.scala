// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsConfigurationBuilderOps(val self: AnalyticsConfiguration.Builder) extends AnyVal {

  final def withIdAsScala(value: Option[String]): AnalyticsConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withFilterAsScala(value: Option[AnalyticsFilter]): AnalyticsConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // AnalyticsFilter

  final def withStorageClassAnalysisAsScala(value: Option[StorageClassAnalysis]): AnalyticsConfiguration.Builder = {
    value.fold(self) { v =>
      self.storageClassAnalysis(v)
    }
  } // StorageClassAnalysis

}

final class AnalyticsConfigurationOps(val self: AnalyticsConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def filterAsScala: Option[AnalyticsFilter] = Option(self.filter) // AnalyticsFilter

  final def storageClassAnalysisAsScala: Option[StorageClassAnalysis] =
    Option(self.storageClassAnalysis) // StorageClassAnalysis

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsConfigurationOps {

  implicit def toAnalyticsConfigurationBuilderOps(v: AnalyticsConfiguration.Builder): AnalyticsConfigurationBuilderOps =
    new AnalyticsConfigurationBuilderOps(v)

  implicit def toAnalyticsConfigurationOps(v: AnalyticsConfiguration): AnalyticsConfigurationOps =
    new AnalyticsConfigurationOps(v)

}
