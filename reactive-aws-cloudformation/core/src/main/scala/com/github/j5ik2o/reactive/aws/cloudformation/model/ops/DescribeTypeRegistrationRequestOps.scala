// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeTypeRegistrationRequestBuilderOps(val self: DescribeTypeRegistrationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationTokenAsScala(value: Option[String]): DescribeTypeRegistrationRequest.Builder = {
    value.fold(self) { v =>
      self.registrationToken(v)
    }
  }

}

final class DescribeTypeRegistrationRequestOps(val self: DescribeTypeRegistrationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationTokenAsScala: Option[String] = Option(self.registrationToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTypeRegistrationRequestOps {

  implicit def toDescribeTypeRegistrationRequestBuilderOps(
      v: DescribeTypeRegistrationRequest.Builder
  ): DescribeTypeRegistrationRequestBuilderOps = new DescribeTypeRegistrationRequestBuilderOps(v)

  implicit def toDescribeTypeRegistrationRequestOps(
      v: DescribeTypeRegistrationRequest
  ): DescribeTypeRegistrationRequestOps = new DescribeTypeRegistrationRequestOps(v)

}
