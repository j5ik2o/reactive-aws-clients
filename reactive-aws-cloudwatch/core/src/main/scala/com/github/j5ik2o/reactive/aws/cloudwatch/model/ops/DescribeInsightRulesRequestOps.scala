// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeInsightRulesRequestBuilderOps(val self: DescribeInsightRulesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeInsightRulesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeInsightRulesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeInsightRulesRequestOps(val self: DescribeInsightRulesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInsightRulesRequestOps {

  implicit def toDescribeInsightRulesRequestBuilderOps(
      v: DescribeInsightRulesRequest.Builder
  ): DescribeInsightRulesRequestBuilderOps = new DescribeInsightRulesRequestBuilderOps(v)

  implicit def toDescribeInsightRulesRequestOps(v: DescribeInsightRulesRequest): DescribeInsightRulesRequestOps =
    new DescribeInsightRulesRequestOps(v)

}
