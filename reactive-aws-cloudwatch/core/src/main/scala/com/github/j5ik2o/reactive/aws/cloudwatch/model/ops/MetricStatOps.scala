// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricStatBuilderOps(val self: MetricStat.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricAsScala(value: Option[Metric]): MetricStat.Builder = {
    value.fold(self) { v => self.metric(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala(value: Option[Int]): MetricStat.Builder = {
    value.fold(self) { v => self.period(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statAsScala(value: Option[String]): MetricStat.Builder = {
    value.fold(self) { v => self.stat(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala(value: Option[StandardUnit]): MetricStat.Builder = {
    value.fold(self) { v => self.unit(v) }
  }

}

final class MetricStatOps(val self: MetricStat) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricAsScala: Option[Metric] = Option(self.metric)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala: Option[Int] = Option(self.period)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statAsScala: Option[String] = Option(self.stat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricStatOps {

  implicit def toMetricStatBuilderOps(v: MetricStat.Builder): MetricStatBuilderOps = new MetricStatBuilderOps(v)

  implicit def toMetricStatOps(v: MetricStat): MetricStatOps = new MetricStatOps(v)

}
