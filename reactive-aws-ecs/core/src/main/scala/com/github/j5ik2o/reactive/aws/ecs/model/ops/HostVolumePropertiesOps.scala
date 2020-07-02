// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class HostVolumePropertiesBuilderOps(val self: HostVolumeProperties.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourcePathAsScala(value: Option[String]): HostVolumeProperties.Builder = {
    value.fold(self) { v => self.sourcePath(v) }
  }

}

final class HostVolumePropertiesOps(val self: HostVolumeProperties) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourcePathAsScala: Option[String] = Option(self.sourcePath)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostVolumePropertiesOps {

  implicit def toHostVolumePropertiesBuilderOps(v: HostVolumeProperties.Builder): HostVolumePropertiesBuilderOps =
    new HostVolumePropertiesBuilderOps(v)

  implicit def toHostVolumePropertiesOps(v: HostVolumeProperties): HostVolumePropertiesOps =
    new HostVolumePropertiesOps(v)

}
