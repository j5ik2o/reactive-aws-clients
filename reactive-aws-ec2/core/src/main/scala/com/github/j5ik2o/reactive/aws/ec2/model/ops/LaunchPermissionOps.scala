// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchPermissionBuilderOps(val self: LaunchPermission.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala(value: Option[PermissionGroup]): LaunchPermission.Builder = {
    value.fold(self) { v =>
      self.group(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala(value: Option[String]): LaunchPermission.Builder = {
    value.fold(self) { v =>
      self.userId(v)
    }
  }

}

final class LaunchPermissionOps(val self: LaunchPermission) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala: Option[PermissionGroup] = Option(self.group)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala: Option[String] = Option(self.userId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchPermissionOps {

  implicit def toLaunchPermissionBuilderOps(v: LaunchPermission.Builder): LaunchPermissionBuilderOps =
    new LaunchPermissionBuilderOps(v)

  implicit def toLaunchPermissionOps(v: LaunchPermission): LaunchPermissionOps = new LaunchPermissionOps(v)

}
