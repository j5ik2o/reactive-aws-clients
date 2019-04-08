// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeMetricFiltersRequestBuilderOps(val self: DescribeMetricFiltersRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def filterNamePrefixAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.filterNamePrefix(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def metricNameAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  } // String

  final def metricNamespaceAsScala(value: Option[String]): DescribeMetricFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.metricNamespace(v)
    }
  } // String

}

final class DescribeMetricFiltersRequestOps(val self: DescribeMetricFiltersRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def filterNamePrefixAsScala: Option[String] = Option(self.filterNamePrefix) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def metricNameAsScala: Option[String] = Option(self.metricName) // String

  final def metricNamespaceAsScala: Option[String] = Option(self.metricNamespace) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeMetricFiltersRequestOps {

  implicit def toDescribeMetricFiltersRequestBuilderOps(
      v: DescribeMetricFiltersRequest.Builder
  ): DescribeMetricFiltersRequestBuilderOps = new DescribeMetricFiltersRequestBuilderOps(v)

  implicit def toDescribeMetricFiltersRequestOps(v: DescribeMetricFiltersRequest): DescribeMetricFiltersRequestOps =
    new DescribeMetricFiltersRequestOps(v)

}
