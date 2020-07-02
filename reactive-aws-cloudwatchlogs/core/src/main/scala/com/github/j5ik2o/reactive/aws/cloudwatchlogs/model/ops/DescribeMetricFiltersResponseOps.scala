// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeMetricFiltersResponseBuilderOps(val self: DescribeMetricFiltersResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricFiltersAsScala(value: Option[Seq[MetricFilter]]): DescribeMetricFiltersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricFilters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeMetricFiltersResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeMetricFiltersResponseOps(val self: DescribeMetricFiltersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricFiltersAsScala: Option[Seq[MetricFilter]] =
    Option(self.metricFilters).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeMetricFiltersResponseOps {

  implicit def toDescribeMetricFiltersResponseBuilderOps(
      v: DescribeMetricFiltersResponse.Builder
  ): DescribeMetricFiltersResponseBuilderOps = new DescribeMetricFiltersResponseBuilderOps(v)

  implicit def toDescribeMetricFiltersResponseOps(v: DescribeMetricFiltersResponse): DescribeMetricFiltersResponseOps =
    new DescribeMetricFiltersResponseOps(v)

}
