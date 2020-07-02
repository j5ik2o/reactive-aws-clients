// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class FaceMatchBuilderOps(val self: FaceMatch.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def similarityAsScala(value: Option[Float]): FaceMatch.Builder = {
    value.fold(self) { v => self.similarity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala(value: Option[Face]): FaceMatch.Builder = {
    value.fold(self) { v => self.face(v) }
  }

}

final class FaceMatchOps(val self: FaceMatch) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def similarityAsScala: Option[Float] = Option(self.similarity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala: Option[Face] = Option(self.face)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFaceMatchOps {

  implicit def toFaceMatchBuilderOps(v: FaceMatch.Builder): FaceMatchBuilderOps = new FaceMatchBuilderOps(v)

  implicit def toFaceMatchOps(v: FaceMatch): FaceMatchOps = new FaceMatchOps(v)

}
