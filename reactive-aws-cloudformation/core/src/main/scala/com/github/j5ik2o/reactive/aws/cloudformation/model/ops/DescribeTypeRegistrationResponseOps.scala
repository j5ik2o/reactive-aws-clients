// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeTypeRegistrationResponseBuilderOps(val self: DescribeTypeRegistrationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressStatusAsScala(value: Option[RegistrationStatus]): DescribeTypeRegistrationResponse.Builder = {
    value.fold(self) { v => self.progressStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): DescribeTypeRegistrationResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeArnAsScala(value: Option[String]): DescribeTypeRegistrationResponse.Builder = {
    value.fold(self) { v => self.typeArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeVersionArnAsScala(value: Option[String]): DescribeTypeRegistrationResponse.Builder = {
    value.fold(self) { v => self.typeVersionArn(v) }
  }

}

final class DescribeTypeRegistrationResponseOps(val self: DescribeTypeRegistrationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressStatusAsScala: Option[RegistrationStatus] = Option(self.progressStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeArnAsScala: Option[String] = Option(self.typeArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeVersionArnAsScala: Option[String] = Option(self.typeVersionArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTypeRegistrationResponseOps {

  implicit def toDescribeTypeRegistrationResponseBuilderOps(
      v: DescribeTypeRegistrationResponse.Builder
  ): DescribeTypeRegistrationResponseBuilderOps = new DescribeTypeRegistrationResponseBuilderOps(v)

  implicit def toDescribeTypeRegistrationResponseOps(
      v: DescribeTypeRegistrationResponse
  ): DescribeTypeRegistrationResponseOps = new DescribeTypeRegistrationResponseOps(v)

}
