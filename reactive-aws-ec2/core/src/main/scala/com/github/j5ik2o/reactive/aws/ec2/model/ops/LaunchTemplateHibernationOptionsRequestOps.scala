// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateHibernationOptionsRequestBuilderOps(val self: LaunchTemplateHibernationOptionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala(value: Option[Boolean]): LaunchTemplateHibernationOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.configured(v)
    }
  }

}

final class LaunchTemplateHibernationOptionsRequestOps(val self: LaunchTemplateHibernationOptionsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala: Option[Boolean] = Option(self.configured)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateHibernationOptionsRequestOps {

  implicit def toLaunchTemplateHibernationOptionsRequestBuilderOps(
      v: LaunchTemplateHibernationOptionsRequest.Builder
  ): LaunchTemplateHibernationOptionsRequestBuilderOps = new LaunchTemplateHibernationOptionsRequestBuilderOps(v)

  implicit def toLaunchTemplateHibernationOptionsRequestOps(
      v: LaunchTemplateHibernationOptionsRequest
  ): LaunchTemplateHibernationOptionsRequestOps = new LaunchTemplateHibernationOptionsRequestOps(v)

}
