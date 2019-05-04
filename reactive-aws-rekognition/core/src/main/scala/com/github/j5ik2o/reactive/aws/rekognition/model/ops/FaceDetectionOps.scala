// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class FaceDetectionBuilderOps(val self: FaceDetection.Builder) extends AnyVal {

  final def timestampAsScala(value: Option[Long]): FaceDetection.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def faceAsScala(value: Option[FaceDetail]): FaceDetection.Builder = {
    value.fold(self) { v =>
      self.face(v)
    }
  }

}

final class FaceDetectionOps(val self: FaceDetection) extends AnyVal {

  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  final def faceAsScala: Option[FaceDetail] = Option(self.face)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFaceDetectionOps {

  implicit def toFaceDetectionBuilderOps(v: FaceDetection.Builder): FaceDetectionBuilderOps =
    new FaceDetectionBuilderOps(v)

  implicit def toFaceDetectionOps(v: FaceDetection): FaceDetectionOps = new FaceDetectionOps(v)

}
