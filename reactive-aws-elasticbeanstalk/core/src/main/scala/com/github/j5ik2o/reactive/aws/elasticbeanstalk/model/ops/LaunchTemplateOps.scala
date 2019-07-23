// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class LaunchTemplateBuilderOps(val self: LaunchTemplate.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): LaunchTemplate.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

}

final class LaunchTemplateOps(val self: LaunchTemplate) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateOps {

  implicit def toLaunchTemplateBuilderOps(v: LaunchTemplate.Builder): LaunchTemplateBuilderOps =
    new LaunchTemplateBuilderOps(v)

  implicit def toLaunchTemplateOps(v: LaunchTemplate): LaunchTemplateOps = new LaunchTemplateOps(v)

}
