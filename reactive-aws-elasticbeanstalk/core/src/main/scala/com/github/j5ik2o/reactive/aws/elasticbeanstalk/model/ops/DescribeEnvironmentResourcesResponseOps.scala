// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentResourcesResponseBuilderOps(val self: DescribeEnvironmentResourcesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentResourcesAsScala(
      value: Option[EnvironmentResourceDescription]
  ): DescribeEnvironmentResourcesResponse.Builder = {
    value.fold(self) { v => self.environmentResources(v) }
  }

}

final class DescribeEnvironmentResourcesResponseOps(val self: DescribeEnvironmentResourcesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentResourcesAsScala: Option[EnvironmentResourceDescription] = Option(self.environmentResources)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentResourcesResponseOps {

  implicit def toDescribeEnvironmentResourcesResponseBuilderOps(
      v: DescribeEnvironmentResourcesResponse.Builder
  ): DescribeEnvironmentResourcesResponseBuilderOps = new DescribeEnvironmentResourcesResponseBuilderOps(v)

  implicit def toDescribeEnvironmentResourcesResponseOps(
      v: DescribeEnvironmentResourcesResponse
  ): DescribeEnvironmentResourcesResponseOps = new DescribeEnvironmentResourcesResponseOps(v)

}
