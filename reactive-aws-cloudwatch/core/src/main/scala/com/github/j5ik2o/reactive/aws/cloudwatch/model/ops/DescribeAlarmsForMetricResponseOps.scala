// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsForMetricResponseBuilderOps(val self: DescribeAlarmsForMetricResponse.Builder)
    extends AnyVal {

  final def metricAlarmsAsScala(value: Option[Seq[MetricAlarm]]): DescribeAlarmsForMetricResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metricAlarms(v.asJava)
    } // Seq[MetricAlarm]
  }

}

final class DescribeAlarmsForMetricResponseOps(val self: DescribeAlarmsForMetricResponse) extends AnyVal {

  final def metricAlarmsAsScala: Option[Seq[MetricAlarm]] = Option(self.metricAlarms).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricAlarm]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmsForMetricResponseOps {

  implicit def toDescribeAlarmsForMetricResponseBuilderOps(
      v: DescribeAlarmsForMetricResponse.Builder
  ): DescribeAlarmsForMetricResponseBuilderOps = new DescribeAlarmsForMetricResponseBuilderOps(v)

  implicit def toDescribeAlarmsForMetricResponseOps(
      v: DescribeAlarmsForMetricResponse
  ): DescribeAlarmsForMetricResponseOps = new DescribeAlarmsForMetricResponseOps(v)

}
