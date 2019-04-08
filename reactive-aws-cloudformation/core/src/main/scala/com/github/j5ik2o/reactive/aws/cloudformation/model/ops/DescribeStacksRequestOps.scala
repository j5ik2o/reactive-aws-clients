// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStacksRequestBuilderOps(val self: DescribeStacksRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DescribeStacksRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStacksRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeStacksRequestOps(val self: DescribeStacksRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStacksRequestOps {

  implicit def toDescribeStacksRequestBuilderOps(v: DescribeStacksRequest.Builder): DescribeStacksRequestBuilderOps =
    new DescribeStacksRequestBuilderOps(v)

  implicit def toDescribeStacksRequestOps(v: DescribeStacksRequest): DescribeStacksRequestOps =
    new DescribeStacksRequestOps(v)

}
