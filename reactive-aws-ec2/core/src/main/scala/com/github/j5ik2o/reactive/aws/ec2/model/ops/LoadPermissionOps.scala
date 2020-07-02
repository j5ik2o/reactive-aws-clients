// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LoadPermissionBuilderOps(val self: LoadPermission.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala(value: Option[String]): LoadPermission.Builder = {
    value.fold(self) { v => self.userId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala(value: Option[PermissionGroup]): LoadPermission.Builder = {
    value.fold(self) { v => self.group(v) }
  }

}

final class LoadPermissionOps(val self: LoadPermission) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala: Option[String] = Option(self.userId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala: Option[PermissionGroup] = Option(self.group)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadPermissionOps {

  implicit def toLoadPermissionBuilderOps(v: LoadPermission.Builder): LoadPermissionBuilderOps =
    new LoadPermissionBuilderOps(v)

  implicit def toLoadPermissionOps(v: LoadPermission): LoadPermissionOps = new LoadPermissionOps(v)

}
