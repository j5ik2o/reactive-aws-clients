// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class MetricFilterBuilderOps(val self: MetricFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala(value: Option[String]): MetricFilter.Builder = {
    value.fold(self) { v => self.filterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala(value: Option[String]): MetricFilter.Builder = {
    value.fold(self) { v => self.filterPattern(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricTransformationsAsScala(value: Option[Seq[MetricTransformation]]): MetricFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricTransformations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[Long]): MetricFilter.Builder = {
    value.fold(self) { v => self.creationTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): MetricFilter.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

}

final class MetricFilterOps(val self: MetricFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala: Option[String] = Option(self.filterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricTransformationsAsScala: Option[Seq[MetricTransformation]] =
    Option(self.metricTransformations).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricFilterOps {

  implicit def toMetricFilterBuilderOps(v: MetricFilter.Builder): MetricFilterBuilderOps = new MetricFilterBuilderOps(v)

  implicit def toMetricFilterOps(v: MetricFilter): MetricFilterOps = new MetricFilterOps(v)

}
