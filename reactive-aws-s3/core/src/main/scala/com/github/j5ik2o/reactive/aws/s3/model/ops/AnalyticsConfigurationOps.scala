// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsConfigurationBuilderOps(val self: AnalyticsConfiguration.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): AnalyticsConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def filterAsScala(value: Option[AnalyticsFilter]): AnalyticsConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

  final def storageClassAnalysisAsScala(value: Option[StorageClassAnalysis]): AnalyticsConfiguration.Builder = {
    value.fold(self) { v =>
      self.storageClassAnalysis(v)
    }
  }

}

final class AnalyticsConfigurationOps(val self: AnalyticsConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def filterAsScala: Option[AnalyticsFilter] = Option(self.filter)

  final def storageClassAnalysisAsScala: Option[StorageClassAnalysis] = Option(self.storageClassAnalysis)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsConfigurationOps {

  implicit def toAnalyticsConfigurationBuilderOps(v: AnalyticsConfiguration.Builder): AnalyticsConfigurationBuilderOps =
    new AnalyticsConfigurationBuilderOps(v)

  implicit def toAnalyticsConfigurationOps(v: AnalyticsConfiguration): AnalyticsConfigurationOps =
    new AnalyticsConfigurationOps(v)

}
