// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsForMetricRequestBuilderOps(val self: DescribeAlarmsForMetricRequest.Builder) extends AnyVal {

  final def metricNameAsScala(value: Option[String]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  } // String

  final def namespaceAsScala(value: Option[String]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def statisticAsScala(value: Option[Statistic]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v =>
      self.statistic(v)
    }
  } // String

  final def extendedStatisticAsScala(value: Option[String]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v =>
      self.extendedStatistic(v)
    }
  } // String

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): DescribeAlarmsForMetricRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    } // Seq[Dimension]
  }

  final def periodAsScala(value: Option[Int]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v =>
      self.period(v)
    }
  } // Int

  final def unitAsScala(value: Option[StandardUnit]): DescribeAlarmsForMetricRequest.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  } // String

}

final class DescribeAlarmsForMetricRequestOps(val self: DescribeAlarmsForMetricRequest) extends AnyVal {

  final def metricNameAsScala: Option[String] = Option(self.metricName) // String

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def statisticAsScala: Option[Statistic] = Option(self.statistic) // String

  final def extendedStatisticAsScala: Option[String] = Option(self.extendedStatistic) // String

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Dimension]

  final def periodAsScala: Option[Int] = Option(self.period) // Int

  final def unitAsScala: Option[StandardUnit] = Option(self.unit) // String

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
