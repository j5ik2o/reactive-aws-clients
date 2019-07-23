// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class FaceSearchSettingsBuilderOps(val self: FaceSearchSettings.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): FaceSearchSettings.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala(value: Option[Float]): FaceSearchSettings.Builder = {
    value.fold(self) { v =>
      self.faceMatchThreshold(v)
    }
  }

}

final class FaceSearchSettingsOps(val self: FaceSearchSettings) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala: Option[Float] = Option(self.faceMatchThreshold)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFaceSearchSettingsOps {

  implicit def toFaceSearchSettingsBuilderOps(v: FaceSearchSettings.Builder): FaceSearchSettingsBuilderOps =
    new FaceSearchSettingsBuilderOps(v)

  implicit def toFaceSearchSettingsOps(v: FaceSearchSettings): FaceSearchSettingsOps = new FaceSearchSettingsOps(v)

}
