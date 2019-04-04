// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeEndpointsRequestBuilderOps(val self: DescribeEndpointsRequest.Builder) extends AnyVal {}

final class DescribeEndpointsRequestOps(val self: DescribeEndpointsRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEndpointsRequestOps {

  implicit def toDescribeEndpointsRequestBuilderOps(
      v: DescribeEndpointsRequest.Builder
  ): DescribeEndpointsRequestBuilderOps = new DescribeEndpointsRequestBuilderOps(v)

  implicit def toDescribeEndpointsRequestOps(v: DescribeEndpointsRequest): DescribeEndpointsRequestOps =
    new DescribeEndpointsRequestOps(v)

}
