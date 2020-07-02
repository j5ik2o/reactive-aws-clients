// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsForMetricRequestBuilderOps(val self: DescribeAlarmsForMetricRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v => self.metricName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v => self.namespace(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticAsScala(value: Option[Statistic]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v => self.statistic(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extendedStatisticAsScala(value: Option[String]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v => self.extendedStatistic(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): DescribeAlarmsForMetricRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala(value: Option[Int]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v => self.period(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala(value: Option[StandardUnit]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v => self.unit(v) }
  }

}

final class DescribeAlarmsForMetricRequestOps(val self: DescribeAlarmsForMetricRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticAsScala: Option[Statistic] = Option(self.statistic)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extendedStatisticAsScala: Option[String] = Option(self.extendedStatistic)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala: Option[Seq[Dimension]] =
    Option(self.dimensions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala: Option[Int] = Option(self.period)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmsForMetricRequestOps {

  implicit def toDescribeAlarmsForMetricRequestBuilderOps(
      v: DescribeAlarmsForMetricRequest.Builder
  ): DescribeAlarmsForMetricRequestBuilderOps = new DescribeAlarmsForMetricRequestBuilderOps(v)

  implicit def toDescribeAlarmsForMetricRequestOps(
      v: DescribeAlarmsForMetricRequest
  ): DescribeAlarmsForMetricRequestOps = new DescribeAlarmsForMetricRequestOps(v)

}
