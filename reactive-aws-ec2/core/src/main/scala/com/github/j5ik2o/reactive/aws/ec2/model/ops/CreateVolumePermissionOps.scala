// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVolumePermissionBuilderOps(val self: CreateVolumePermission.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala(value: Option[PermissionGroup]): CreateVolumePermission.Builder = {
    value.fold(self) { v => self.group(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala(value: Option[String]): CreateVolumePermission.Builder = {
    value.fold(self) { v => self.userId(v) }
  }

}

final class CreateVolumePermissionOps(val self: CreateVolumePermission) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala: Option[PermissionGroup] = Option(self.group)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala: Option[String] = Option(self.userId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVolumePermissionOps {

  implicit def toCreateVolumePermissionBuilderOps(v: CreateVolumePermission.Builder): CreateVolumePermissionBuilderOps =
    new CreateVolumePermissionBuilderOps(v)

  implicit def toCreateVolumePermissionOps(v: CreateVolumePermission): CreateVolumePermissionOps =
    new CreateVolumePermissionOps(v)

}
