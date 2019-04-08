// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIdFormatRequestBuilderOps(val self: DescribeIdFormatRequest.Builder) extends AnyVal {

  final def resourceAsScala(value: Option[String]): DescribeIdFormatRequest.Builder = {
    value.fold(self) { v =>
      self.resource(v)
    }
  }

}

final class DescribeIdFormatRequestOps(val self: DescribeIdFormatRequest) extends AnyVal {

  final def resourceAsScala: Option[String] = Option(self.resource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeIdFormatRequestOps {

  implicit def toDescribeIdFormatRequestBuilderOps(
      v: DescribeIdFormatRequest.Builder
  ): DescribeIdFormatRequestBuilderOps = new DescribeIdFormatRequestBuilderOps(v)

  implicit def toDescribeIdFormatRequestOps(v: DescribeIdFormatRequest): DescribeIdFormatRequestOps =
    new DescribeIdFormatRequestOps(v)

}
