// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class FaceRecordBuilderOps(val self: FaceRecord.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala(value: Option[Face]): FaceRecord.Builder = {
    value.fold(self) { v =>
      self.face(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceDetailAsScala(value: Option[FaceDetail]): FaceRecord.Builder = {
    value.fold(self) { v =>
      self.faceDetail(v)
    }
  }

}

final class FaceRecordOps(val self: FaceRecord) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala: Option[Face] = Option(self.face)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceDetailAsScala: Option[FaceDetail] = Option(self.faceDetail)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFaceRecordOps {

  implicit def toFaceRecordBuilderOps(v: FaceRecord.Builder): FaceRecordBuilderOps = new FaceRecordBuilderOps(v)

  implicit def toFaceRecordOps(v: FaceRecord): FaceRecordOps = new FaceRecordOps(v)

}
