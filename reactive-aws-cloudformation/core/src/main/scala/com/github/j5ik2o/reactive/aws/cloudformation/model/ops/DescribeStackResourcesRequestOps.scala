// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourcesRequestBuilderOps(val self: DescribeStackResourcesRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DescribeStackResourcesRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def logicalResourceIdAsScala(value: Option[String]): DescribeStackResourcesRequest.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  final def physicalResourceIdAsScala(value: Option[String]): DescribeStackResourcesRequest.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

}

final class DescribeStackResourcesRequestOps(val self: DescribeStackResourcesRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackResourcesRequestOps {

  implicit def toDescribeStackResourcesRequestBuilderOps(
      v: DescribeStackResourcesRequest.Builder
  ): DescribeStackResourcesRequestBuilderOps = new DescribeStackResourcesRequestBuilderOps(v)

  implicit def toDescribeStackResourcesRequestOps(v: DescribeStackResourcesRequest): DescribeStackResourcesRequestOps =
    new DescribeStackResourcesRequestOps(v)

}
