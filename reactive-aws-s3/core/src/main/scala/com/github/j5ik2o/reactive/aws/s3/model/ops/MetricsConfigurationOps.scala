// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MetricsConfigurationBuilderOps(val self: MetricsConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): MetricsConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala(value: Option[MetricsFilter]): MetricsConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

}

final class MetricsConfigurationOps(val self: MetricsConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala: Option[MetricsFilter] = Option(self.filter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricsConfigurationOps {

  implicit def toMetricsConfigurationBuilderOps(v: MetricsConfiguration.Builder): MetricsConfigurationBuilderOps =
    new MetricsConfigurationBuilderOps(v)

  implicit def toMetricsConfigurationOps(v: MetricsConfiguration): MetricsConfigurationOps =
    new MetricsConfigurationOps(v)

}
