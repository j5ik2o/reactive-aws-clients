// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class MetricFilterBuilderOps(val self: MetricFilter.Builder) extends AnyVal {

  final def filterNameAsScala(value: Option[String]): MetricFilter.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  } // String

  final def filterPatternAsScala(value: Option[String]): MetricFilter.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  } // String

  final def metricTransformationsAsScala(value: Option[Seq[MetricTransformation]]): MetricFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metricTransformations(v.asJava)
    } // Seq[MetricTransformation]
  }

  final def creationTimeAsScala(value: Option[Long]): MetricFilter.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Long

  final def logGroupNameAsScala(value: Option[String]): MetricFilter.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

}

final class MetricFilterOps(val self: MetricFilter) extends AnyVal {

  final def filterNameAsScala: Option[String] = Option(self.filterName) // String

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern) // String

  final def metricTransformationsAsScala: Option[Seq[MetricTransformation]] = Option(self.metricTransformations).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricTransformation]

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime) // Long

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricFilterOps {

  implicit def toMetricFilterBuilderOps(v: MetricFilter.Builder): MetricFilterBuilderOps = new MetricFilterBuilderOps(v)

  implicit def toMetricFilterOps(v: MetricFilter): MetricFilterOps = new MetricFilterOps(v)

}
