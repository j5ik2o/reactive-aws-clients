// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class MountPointBuilderOps(val self: MountPoint.Builder) extends AnyVal {

  final def sourceVolumeAsScala(value: Option[String]): MountPoint.Builder = {
    value.fold(self) { v =>
      self.sourceVolume(v)
    }
  }

  final def containerPathAsScala(value: Option[String]): MountPoint.Builder = {
    value.fold(self) { v =>
      self.containerPath(v)
    }
  }

  final def readOnlyAsScala(value: Option[Boolean]): MountPoint.Builder = {
    value.fold(self) { v =>
      self.readOnly(v)
    }
  }

}

final class MountPointOps(val self: MountPoint) extends AnyVal {

  final def sourceVolumeAsScala: Option[String] = Option(self.sourceVolume)

  final def containerPathAsScala: Option[String] = Option(self.containerPath)

  final def readOnlyAsScala: Option[Boolean] = Option(self.readOnly)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMountPointOps {

  implicit def toMountPointBuilderOps(v: MountPoint.Builder): MountPointBuilderOps = new MountPointBuilderOps(v)

  implicit def toMountPointOps(v: MountPoint): MountPointOps = new MountPointOps(v)

}
