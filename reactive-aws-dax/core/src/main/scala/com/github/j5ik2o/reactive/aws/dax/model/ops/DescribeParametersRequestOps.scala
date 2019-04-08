// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeParametersRequestBuilderOps(val self: DescribeParametersRequest.Builder) extends AnyVal {

  final def parameterGroupNameAsScala(value: Option[String]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  }

  final def sourceAsScala(value: Option[String]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.source(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeParametersRequestOps(val self: DescribeParametersRequest) extends AnyVal {

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  final def sourceAsScala: Option[String] = Option(self.source)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeParametersRequestOps {

  implicit def toDescribeParametersRequestBuilderOps(
      v: DescribeParametersRequest.Builder
  ): DescribeParametersRequestBuilderOps = new DescribeParametersRequestBuilderOps(v)

  implicit def toDescribeParametersRequestOps(v: DescribeParametersRequest): DescribeParametersRequestOps =
    new DescribeParametersRequestOps(v)

}
