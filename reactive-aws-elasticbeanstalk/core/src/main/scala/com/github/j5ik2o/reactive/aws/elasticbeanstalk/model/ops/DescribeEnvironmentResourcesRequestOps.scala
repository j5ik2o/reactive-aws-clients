// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentResourcesRequestBuilderOps(val self: DescribeEnvironmentResourcesRequest.Builder)
    extends AnyVal {

  final def environmentIdAsScala(value: Option[String]): DescribeEnvironmentResourcesRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentResourcesRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

}

final class DescribeEnvironmentResourcesRequestOps(val self: DescribeEnvironmentResourcesRequest) extends AnyVal {

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentResourcesRequestOps {

  implicit def toDescribeEnvironmentResourcesRequestBuilderOps(
      v: DescribeEnvironmentResourcesRequest.Builder
  ): DescribeEnvironmentResourcesRequestBuilderOps = new DescribeEnvironmentResourcesRequestBuilderOps(v)

  implicit def toDescribeEnvironmentResourcesRequestOps(
      v: DescribeEnvironmentResourcesRequest
  ): DescribeEnvironmentResourcesRequestOps = new DescribeEnvironmentResourcesRequestOps(v)

}
