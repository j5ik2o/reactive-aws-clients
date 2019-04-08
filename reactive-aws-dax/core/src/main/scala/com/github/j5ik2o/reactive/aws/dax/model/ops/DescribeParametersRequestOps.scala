// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeParametersRequestBuilderOps(val self: DescribeParametersRequest.Builder) extends AnyVal {

  final def parameterGroupNameAsScala(value: Option[String]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  } // String

  final def sourceAsScala(value: Option[String]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.source(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeParametersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeParametersRequestOps(val self: DescribeParametersRequest) extends AnyVal {

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName) // String

  final def sourceAsScala: Option[String] = Option(self.source) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeParametersRequestOps {

  implicit def toDescribeParametersRequestBuilderOps(
      v: DescribeParametersRequest.Builder
  ): DescribeParametersRequestBuilderOps = new DescribeParametersRequestBuilderOps(v)

  implicit def toDescribeParametersRequestOps(v: DescribeParametersRequest): DescribeParametersRequestOps =
    new DescribeParametersRequestOps(v)

}
