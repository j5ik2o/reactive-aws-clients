// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CompareFacesMatchBuilderOps(val self: CompareFacesMatch.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def similarityAsScala(value: Option[Float]): CompareFacesMatch.Builder = {
    value.fold(self) { v =>
      self.similarity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala(value: Option[ComparedFace]): CompareFacesMatch.Builder = {
    value.fold(self) { v =>
      self.face(v)
    }
  }

}

final class CompareFacesMatchOps(val self: CompareFacesMatch) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def similarityAsScala: Option[Float] = Option(self.similarity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala: Option[ComparedFace] = Option(self.face)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompareFacesMatchOps {

  implicit def toCompareFacesMatchBuilderOps(v: CompareFacesMatch.Builder): CompareFacesMatchBuilderOps =
    new CompareFacesMatchBuilderOps(v)

  implicit def toCompareFacesMatchOps(v: CompareFacesMatch): CompareFacesMatchOps = new CompareFacesMatchOps(v)

}
