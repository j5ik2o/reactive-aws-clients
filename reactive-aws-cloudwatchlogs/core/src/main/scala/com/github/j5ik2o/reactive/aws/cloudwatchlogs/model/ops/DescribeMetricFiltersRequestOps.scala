// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeMetricFiltersRequestBuilderOps(val self: DescribeMetricFiltersRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNamePrefixAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v => self.filterNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v => self.metricName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNamespaceAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v => self.metricNamespace(v) }
  }

}

final class DescribeMetricFiltersRequestOps(val self: DescribeMetricFiltersRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNamePrefixAsScala: Option[String] = Option(self.filterNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNamespaceAsScala: Option[String] = Option(self.metricNamespace)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeMetricFiltersRequestOps {

  implicit def toDescribeMetricFiltersRequestBuilderOps(
      v: DescribeMetricFiltersRequest.Builder
  ): DescribeMetricFiltersRequestBuilderOps = new DescribeMetricFiltersRequestBuilderOps(v)

  implicit def toDescribeMetricFiltersRequestOps(v: DescribeMetricFiltersRequest): DescribeMetricFiltersRequestOps =
    new DescribeMetricFiltersRequestOps(v)

}
