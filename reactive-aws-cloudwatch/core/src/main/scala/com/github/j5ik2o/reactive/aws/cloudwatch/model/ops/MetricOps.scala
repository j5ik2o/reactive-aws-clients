// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricBuilderOps(val self: Metric.Builder) extends AnyVal {

  final def namespaceAsScala(value: Option[String]): Metric.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def metricNameAsScala(value: Option[String]): Metric.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  } // String

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): Metric.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    } // Seq[Dimension]
  }

}

final class MetricOps(val self: Metric) extends AnyVal {

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def metricNameAsScala: Option[String] = Option(self.metricName) // String

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Dimension]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricOps {

  implicit def toMetricBuilderOps(v: Metric.Builder): MetricBuilderOps = new MetricBuilderOps(v)

  implicit def toMetricOps(v: Metric): MetricOps = new MetricOps(v)

}
