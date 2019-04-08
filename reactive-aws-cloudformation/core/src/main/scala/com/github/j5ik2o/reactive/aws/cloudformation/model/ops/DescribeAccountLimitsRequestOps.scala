// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeAccountLimitsRequestBuilderOps(val self: DescribeAccountLimitsRequest.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeAccountLimitsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeAccountLimitsRequestOps(val self: DescribeAccountLimitsRequest) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAccountLimitsRequestOps {

  implicit def toDescribeAccountLimitsRequestBuilderOps(
      v: DescribeAccountLimitsRequest.Builder
  ): DescribeAccountLimitsRequestBuilderOps = new DescribeAccountLimitsRequestBuilderOps(v)

  implicit def toDescribeAccountLimitsRequestOps(v: DescribeAccountLimitsRequest): DescribeAccountLimitsRequestOps =
    new DescribeAccountLimitsRequestOps(v)

}
