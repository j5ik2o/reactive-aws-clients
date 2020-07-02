// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateElasticInferenceAcceleratorBuilderOps(
    val self: LaunchTemplateElasticInferenceAccelerator.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): LaunchTemplateElasticInferenceAccelerator.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): LaunchTemplateElasticInferenceAccelerator.Builder = {
    value.fold(self) { v => self.count(v) }
  }

}

final class LaunchTemplateElasticInferenceAcceleratorOps(val self: LaunchTemplateElasticInferenceAccelerator)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateElasticInferenceAcceleratorOps {

  implicit def toLaunchTemplateElasticInferenceAcceleratorBuilderOps(
      v: LaunchTemplateElasticInferenceAccelerator.Builder
  ): LaunchTemplateElasticInferenceAcceleratorBuilderOps = new LaunchTemplateElasticInferenceAcceleratorBuilderOps(v)

  implicit def toLaunchTemplateElasticInferenceAcceleratorOps(
      v: LaunchTemplateElasticInferenceAccelerator
  ): LaunchTemplateElasticInferenceAcceleratorOps = new LaunchTemplateElasticInferenceAcceleratorOps(v)

}
