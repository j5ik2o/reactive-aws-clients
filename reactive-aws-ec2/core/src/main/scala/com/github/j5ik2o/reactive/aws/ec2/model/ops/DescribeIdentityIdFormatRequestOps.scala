// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIdentityIdFormatRequestBuilderOps(val self: DescribeIdentityIdFormatRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala(value: Option[String]): DescribeIdentityIdFormatRequest.Builder = {
    value.fold(self) { v => self.principalArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala(value: Option[String]): DescribeIdentityIdFormatRequest.Builder = {
    value.fold(self) { v => self.resource(v) }
  }

}

final class DescribeIdentityIdFormatRequestOps(val self: DescribeIdentityIdFormatRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala: Option[String] = Option(self.principalArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala: Option[String] = Option(self.resource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeIdentityIdFormatRequestOps {

  implicit def toDescribeIdentityIdFormatRequestBuilderOps(
      v: DescribeIdentityIdFormatRequest.Builder
  ): DescribeIdentityIdFormatRequestBuilderOps = new DescribeIdentityIdFormatRequestBuilderOps(v)

  implicit def toDescribeIdentityIdFormatRequestOps(
      v: DescribeIdentityIdFormatRequest
  ): DescribeIdentityIdFormatRequestOps = new DescribeIdentityIdFormatRequestOps(v)

}
