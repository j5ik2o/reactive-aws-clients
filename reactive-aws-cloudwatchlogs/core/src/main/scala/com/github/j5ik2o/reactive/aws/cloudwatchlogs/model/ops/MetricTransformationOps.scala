// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class MetricTransformationBuilderOps(val self: MetricTransformation.Builder) extends AnyVal {

  final def metricNameAsScala(value: Option[String]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  final def metricNamespaceAsScala(value: Option[String]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.metricNamespace(v)
    }
  }

  final def metricValueAsScala(value: Option[String]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.metricValue(v)
    }
  }

  final def defaultValueAsScala(value: Option[Double]): MetricTransformation.Builder = {
    value.fold(self) { v =>
      self.defaultValue(v)
    }
  }

}

final class MetricTransformationOps(val self: MetricTransformation) extends AnyVal {

  final def metricNameAsScala: Option[String] = Option(self.metricName)

  final def metricNamespaceAsScala: Option[String] = Option(self.metricNamespace)

  final def metricValueAsScala: Option[String] = Option(self.metricValue)

  final def defaultValueAsScala: Option[Double] = Option(self.defaultValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricTransformationOps {

  implicit def toMetricTransformationBuilderOps(v: MetricTransformation.Builder): MetricTransformationBuilderOps =
    new MetricTransformationBuilderOps(v)

  implicit def toMetricTransformationOps(v: MetricTransformation): MetricTransformationOps =
    new MetricTransformationOps(v)

}
