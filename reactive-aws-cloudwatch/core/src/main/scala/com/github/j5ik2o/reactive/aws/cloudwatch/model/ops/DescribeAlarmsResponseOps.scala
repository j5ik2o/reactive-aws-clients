// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsResponseBuilderOps(val self: DescribeAlarmsResponse.Builder) extends AnyVal {

  final def metricAlarmsAsScala(value: Option[Seq[MetricAlarm]]): DescribeAlarmsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metricAlarms(v.asJava)
    } // Seq[MetricAlarm]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeAlarmsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeAlarmsResponseOps(val self: DescribeAlarmsResponse) extends AnyVal {

  final def metricAlarmsAsScala: Option[Seq[MetricAlarm]] = Option(self.metricAlarms).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricAlarm]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmsResponseOps {

  implicit def toDescribeAlarmsResponseBuilderOps(v: DescribeAlarmsResponse.Builder): DescribeAlarmsResponseBuilderOps =
    new DescribeAlarmsResponseBuilderOps(v)

  implicit def toDescribeAlarmsResponseOps(v: DescribeAlarmsResponse): DescribeAlarmsResponseOps =
    new DescribeAlarmsResponseOps(v)

}
