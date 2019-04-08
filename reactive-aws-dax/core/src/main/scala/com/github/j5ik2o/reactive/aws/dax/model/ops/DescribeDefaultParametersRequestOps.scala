// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeDefaultParametersRequestBuilderOps(val self: DescribeDefaultParametersRequest.Builder)
    extends AnyVal {

  final def maxResultsAsScala(value: Option[Int]): DescribeDefaultParametersRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeDefaultParametersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeDefaultParametersRequestOps(val self: DescribeDefaultParametersRequest) extends AnyVal {

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDefaultParametersRequestOps {

  implicit def toDescribeDefaultParametersRequestBuilderOps(
      v: DescribeDefaultParametersRequest.Builder
  ): DescribeDefaultParametersRequestBuilderOps = new DescribeDefaultParametersRequestBuilderOps(v)

  implicit def toDescribeDefaultParametersRequestOps(
      v: DescribeDefaultParametersRequest
  ): DescribeDefaultParametersRequestOps = new DescribeDefaultParametersRequestOps(v)

}
