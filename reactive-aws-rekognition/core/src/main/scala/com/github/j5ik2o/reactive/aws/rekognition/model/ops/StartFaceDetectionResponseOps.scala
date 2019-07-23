// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartFaceDetectionResponseBuilderOps(val self: StartFaceDetectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): StartFaceDetectionResponse.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

}

final class StartFaceDetectionResponseOps(val self: StartFaceDetectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartFaceDetectionResponseOps {

  implicit def toStartFaceDetectionResponseBuilderOps(
      v: StartFaceDetectionResponse.Builder
  ): StartFaceDetectionResponseBuilderOps = new StartFaceDetectionResponseBuilderOps(v)

  implicit def toStartFaceDetectionResponseOps(v: StartFaceDetectionResponse): StartFaceDetectionResponseOps =
    new StartFaceDetectionResponseOps(v)

}
