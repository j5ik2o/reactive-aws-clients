// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourceRequestBuilderOps(val self: DescribeStackResourceRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DescribeStackResourceRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def logicalResourceIdAsScala(value: Option[String]): DescribeStackResourceRequest.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  } // String

}

final class DescribeStackResourceRequestOps(val self: DescribeStackResourceRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackResourceRequestOps {

  implicit def toDescribeStackResourceRequestBuilderOps(
      v: DescribeStackResourceRequest.Builder
  ): DescribeStackResourceRequestBuilderOps = new DescribeStackResourceRequestBuilderOps(v)

  implicit def toDescribeStackResourceRequestOps(v: DescribeStackResourceRequest): DescribeStackResourceRequestOps =
    new DescribeStackResourceRequestOps(v)

}
