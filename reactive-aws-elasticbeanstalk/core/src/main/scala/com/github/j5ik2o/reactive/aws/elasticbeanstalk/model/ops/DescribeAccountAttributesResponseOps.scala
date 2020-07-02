// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeAccountAttributesResponseBuilderOps(val self: DescribeAccountAttributesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceQuotasAsScala(value: Option[ResourceQuotas]): DescribeAccountAttributesResponse.Builder = {
    value.fold(self) { v => self.resourceQuotas(v) }
  }

}

final class DescribeAccountAttributesResponseOps(val self: DescribeAccountAttributesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceQuotasAsScala: Option[ResourceQuotas] = Option(self.resourceQuotas)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAccountAttributesResponseOps {

  implicit def toDescribeAccountAttributesResponseBuilderOps(
      v: DescribeAccountAttributesResponse.Builder
  ): DescribeAccountAttributesResponseBuilderOps = new DescribeAccountAttributesResponseBuilderOps(v)

  implicit def toDescribeAccountAttributesResponseOps(
      v: DescribeAccountAttributesResponse
  ): DescribeAccountAttributesResponseOps = new DescribeAccountAttributesResponseOps(v)

}
