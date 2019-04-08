// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeAccountAttributesRequestBuilderOps(val self: DescribeAccountAttributesRequest.Builder)
    extends AnyVal {}

final class DescribeAccountAttributesRequestOps(val self: DescribeAccountAttributesRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAccountAttributesRequestOps {

  implicit def toDescribeAccountAttributesRequestBuilderOps(
      v: DescribeAccountAttributesRequest.Builder
  ): DescribeAccountAttributesRequestBuilderOps = new DescribeAccountAttributesRequestBuilderOps(v)

  implicit def toDescribeAccountAttributesRequestOps(
      v: DescribeAccountAttributesRequest
  ): DescribeAccountAttributesRequestOps = new DescribeAccountAttributesRequestOps(v)

}
