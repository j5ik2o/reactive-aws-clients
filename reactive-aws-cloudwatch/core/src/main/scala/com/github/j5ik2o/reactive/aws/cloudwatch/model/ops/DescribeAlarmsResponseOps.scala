// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsResponseBuilderOps(val self: DescribeAlarmsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricAlarmsAsScala(value: Option[Seq[MetricAlarm]]): DescribeAlarmsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricAlarms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeAlarmsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeAlarmsResponseOps(val self: DescribeAlarmsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricAlarmsAsScala: Option[Seq[MetricAlarm]] = Option(self.metricAlarms).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmsResponseOps {

  implicit def toDescribeAlarmsResponseBuilderOps(v: DescribeAlarmsResponse.Builder): DescribeAlarmsResponseBuilderOps =
    new DescribeAlarmsResponseBuilderOps(v)

  implicit def toDescribeAlarmsResponseOps(v: DescribeAlarmsResponse): DescribeAlarmsResponseOps =
    new DescribeAlarmsResponseOps(v)

}
