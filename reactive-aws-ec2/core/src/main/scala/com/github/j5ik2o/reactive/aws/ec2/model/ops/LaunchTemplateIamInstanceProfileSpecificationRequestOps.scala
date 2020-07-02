// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateIamInstanceProfileSpecificationRequestBuilderOps(
    val self: LaunchTemplateIamInstanceProfileSpecificationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): LaunchTemplateIamInstanceProfileSpecificationRequest.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): LaunchTemplateIamInstanceProfileSpecificationRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

}

final class LaunchTemplateIamInstanceProfileSpecificationRequestOps(
    val self: LaunchTemplateIamInstanceProfileSpecificationRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateIamInstanceProfileSpecificationRequestOps {

  implicit def toLaunchTemplateIamInstanceProfileSpecificationRequestBuilderOps(
      v: LaunchTemplateIamInstanceProfileSpecificationRequest.Builder
  ): LaunchTemplateIamInstanceProfileSpecificationRequestBuilderOps =
    new LaunchTemplateIamInstanceProfileSpecificationRequestBuilderOps(v)

  implicit def toLaunchTemplateIamInstanceProfileSpecificationRequestOps(
      v: LaunchTemplateIamInstanceProfileSpecificationRequest
  ): LaunchTemplateIamInstanceProfileSpecificationRequestOps =
    new LaunchTemplateIamInstanceProfileSpecificationRequestOps(v)

}
