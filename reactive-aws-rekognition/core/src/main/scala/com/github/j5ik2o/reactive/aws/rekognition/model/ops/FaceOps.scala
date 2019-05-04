// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class FaceBuilderOps(val self: Face.Builder) extends AnyVal {

  final def faceIdAsScala(value: Option[String]): Face.Builder = {
    value.fold(self) { v =>
      self.faceId(v)
    }
  }

  final def boundingBoxAsScala(value: Option[BoundingBox]): Face.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): Face.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def externalImageIdAsScala(value: Option[String]): Face.Builder = {
    value.fold(self) { v =>
      self.externalImageId(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): Face.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class FaceOps(val self: Face) extends AnyVal {

  final def faceIdAsScala: Option[String] = Option(self.faceId)

  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def externalImageIdAsScala: Option[String] = Option(self.externalImageId)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFaceOps {

  implicit def toFaceBuilderOps(v: Face.Builder): FaceBuilderOps = new FaceBuilderOps(v)

  implicit def toFaceOps(v: Face): FaceOps = new FaceOps(v)

}
