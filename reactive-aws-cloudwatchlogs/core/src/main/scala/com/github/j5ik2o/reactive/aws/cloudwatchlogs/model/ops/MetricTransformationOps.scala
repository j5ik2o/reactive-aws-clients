// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class MetricTransformationBuilderOps(val self: MetricTransformation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNamespaceAsScala(value: Option[String]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.metricNamespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricValueAsScala(value: Option[String]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.metricValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultValueAsScala(value: Option[Double]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.defaultValue(v)
    }
  }

}

final class MetricTransformationOps(val self: MetricTransformation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNamespaceAsScala: Option[String] = Option(self.metricNamespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricValueAsScala: Option[String] = Option(self.metricValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultValueAsScala: Option[Double] = Option(self.defaultValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricTransformationOps {

  implicit def toMetricTransformationBuilderOps(v: MetricTransformation.Builder): MetricTransformationBuilderOps =
    new MetricTransformationBuilderOps(v)

  implicit def toMetricTransformationOps(v: MetricTransformation): MetricTransformationOps =
    new MetricTransformationOps(v)

}
