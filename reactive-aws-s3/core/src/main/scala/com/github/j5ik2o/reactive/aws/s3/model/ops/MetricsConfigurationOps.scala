// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MetricsConfigurationBuilderOps(val self: MetricsConfiguration.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): MetricsConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def filterAsScala(value: Option[MetricsFilter]): MetricsConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // MetricsFilter

}

final class MetricsConfigurationOps(val self: MetricsConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def filterAsScala: Option[MetricsFilter] = Option(self.filter) // MetricsFilter

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricsConfigurationOps {

  implicit def toMetricsConfigurationBuilderOps(v: MetricsConfiguration.Builder): MetricsConfigurationBuilderOps =
    new MetricsConfigurationBuilderOps(v)

  implicit def toMetricsConfigurationOps(v: MetricsConfiguration): MetricsConfigurationOps =
    new MetricsConfigurationOps(v)

}
