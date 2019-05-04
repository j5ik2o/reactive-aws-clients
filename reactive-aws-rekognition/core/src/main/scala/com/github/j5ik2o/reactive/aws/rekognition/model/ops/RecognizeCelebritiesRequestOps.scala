// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class RecognizeCelebritiesRequestBuilderOps(val self: RecognizeCelebritiesRequest.Builder) extends AnyVal {

  final def imageAsScala(value: Option[Image]): RecognizeCelebritiesRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

}

final class RecognizeCelebritiesRequestOps(val self: RecognizeCelebritiesRequest) extends AnyVal {

  final def imageAsScala: Option[Image] = Option(self.image)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecognizeCelebritiesRequestOps {

  implicit def toRecognizeCelebritiesRequestBuilderOps(
      v: RecognizeCelebritiesRequest.Builder
  ): RecognizeCelebritiesRequestBuilderOps = new RecognizeCelebritiesRequestBuilderOps(v)

  implicit def toRecognizeCelebritiesRequestOps(v: RecognizeCelebritiesRequest): RecognizeCelebritiesRequestOps =
    new RecognizeCelebritiesRequestOps(v)

}
