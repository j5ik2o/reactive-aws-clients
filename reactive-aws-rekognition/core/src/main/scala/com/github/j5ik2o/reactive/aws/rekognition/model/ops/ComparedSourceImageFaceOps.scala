// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ComparedSourceImageFaceBuilderOps(val self: ComparedSourceImageFace.Builder) extends AnyVal {

  final def boundingBoxAsScala(value: Option[BoundingBox]): ComparedSourceImageFace.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): ComparedSourceImageFace.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class ComparedSourceImageFaceOps(val self: ComparedSourceImageFace) extends AnyVal {

  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComparedSourceImageFaceOps {

  implicit def toComparedSourceImageFaceBuilderOps(
      v: ComparedSourceImageFace.Builder
  ): ComparedSourceImageFaceBuilderOps = new ComparedSourceImageFaceBuilderOps(v)

  implicit def toComparedSourceImageFaceOps(v: ComparedSourceImageFace): ComparedSourceImageFaceOps =
    new ComparedSourceImageFaceOps(v)

}
