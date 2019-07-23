// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateHibernationOptionsBuilderOps(val self: LaunchTemplateHibernationOptions.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala(value: Option[Boolean]): LaunchTemplateHibernationOptions.Builder = {
    value.fold(self) { v =>
      self.configured(v)
    }
  }

}

final class LaunchTemplateHibernationOptionsOps(val self: LaunchTemplateHibernationOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala: Option[Boolean] = Option(self.configured)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateHibernationOptionsOps {

  implicit def toLaunchTemplateHibernationOptionsBuilderOps(
      v: LaunchTemplateHibernationOptions.Builder
  ): LaunchTemplateHibernationOptionsBuilderOps = new LaunchTemplateHibernationOptionsBuilderOps(v)

  implicit def toLaunchTemplateHibernationOptionsOps(
      v: LaunchTemplateHibernationOptions
  ): LaunchTemplateHibernationOptionsOps = new LaunchTemplateHibernationOptionsOps(v)

}
