// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class VolumeBuilderOps(val self: Volume.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): Volume.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def hostAsScala(value: Option[HostVolumeProperties]): Volume.Builder = {
    value.fold(self) { v =>
      self.host(v)
    }
  }

  final def dockerVolumeConfigurationAsScala(value: Option[DockerVolumeConfiguration]): Volume.Builder = {
    value.fold(self) { v =>
      self.dockerVolumeConfiguration(v)
    }
  }

}

final class VolumeOps(val self: Volume) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def hostAsScala: Option[HostVolumeProperties] = Option(self.host)

  final def dockerVolumeConfigurationAsScala: Option[DockerVolumeConfiguration] = Option(self.dockerVolumeConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeOps {

  implicit def toVolumeBuilderOps(v: Volume.Builder): VolumeBuilderOps = new VolumeBuilderOps(v)

  implicit def toVolumeOps(v: Volume): VolumeOps = new VolumeOps(v)

}
