// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StreamProcessorSettingsBuilderOps(val self: StreamProcessorSettings.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceSearchAsScala(value: Option[FaceSearchSettings]): StreamProcessorSettings.Builder = {
    value.fold(self) { v => self.faceSearch(v) }
  }

}

final class StreamProcessorSettingsOps(val self: StreamProcessorSettings) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceSearchAsScala: Option[FaceSearchSettings] = Option(self.faceSearch)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamProcessorSettingsOps {

  implicit def toStreamProcessorSettingsBuilderOps(
      v: StreamProcessorSettings.Builder
  ): StreamProcessorSettingsBuilderOps = new StreamProcessorSettingsBuilderOps(v)

  implicit def toStreamProcessorSettingsOps(v: StreamProcessorSettings): StreamProcessorSettingsOps =
    new StreamProcessorSettingsOps(v)

}
