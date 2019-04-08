// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVolumePermissionBuilderOps(val self: CreateVolumePermission.Builder) extends AnyVal {

  final def groupAsScala(value: Option[PermissionGroup]): CreateVolumePermission.Builder = {
    value.fold(self) { v =>
      self.group(v)
    }
  }

  final def userIdAsScala(value: Option[String]): CreateVolumePermission.Builder = {
    value.fold(self) { v =>
      self.userId(v)
    }
  }

}

final class CreateVolumePermissionOps(val self: CreateVolumePermission) extends AnyVal {

  final def groupAsScala: Option[PermissionGroup] = Option(self.group)

  final def userIdAsScala: Option[String] = Option(self.userId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVolumePermissionOps {

  implicit def toCreateVolumePermissionBuilderOps(v: CreateVolumePermission.Builder): CreateVolumePermissionBuilderOps =
    new CreateVolumePermissionBuilderOps(v)

  implicit def toCreateVolumePermissionOps(v: CreateVolumePermission): CreateVolumePermissionOps =
    new CreateVolumePermissionOps(v)

}
