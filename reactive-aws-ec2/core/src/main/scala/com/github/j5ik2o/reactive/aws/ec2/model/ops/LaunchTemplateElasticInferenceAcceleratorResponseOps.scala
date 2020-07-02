// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateElasticInferenceAcceleratorResponseBuilderOps(
    val self: LaunchTemplateElasticInferenceAcceleratorResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): LaunchTemplateElasticInferenceAcceleratorResponse.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): LaunchTemplateElasticInferenceAcceleratorResponse.Builder = {
    value.fold(self) { v => self.count(v) }
  }

}

final class LaunchTemplateElasticInferenceAcceleratorResponseOps(
    val self: LaunchTemplateElasticInferenceAcceleratorResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateElasticInferenceAcceleratorResponseOps {

  implicit def toLaunchTemplateElasticInferenceAcceleratorResponseBuilderOps(
      v: LaunchTemplateElasticInferenceAcceleratorResponse.Builder
  ): LaunchTemplateElasticInferenceAcceleratorResponseBuilderOps =
    new LaunchTemplateElasticInferenceAcceleratorResponseBuilderOps(v)

  implicit def toLaunchTemplateElasticInferenceAcceleratorResponseOps(
      v: LaunchTemplateElasticInferenceAcceleratorResponse
  ): LaunchTemplateElasticInferenceAcceleratorResponseOps = new LaunchTemplateElasticInferenceAcceleratorResponseOps(v)

}
