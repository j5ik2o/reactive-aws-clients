// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartTextDetectionResponseBuilderOps(val self: StartTextDetectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): StartTextDetectionResponse.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

}

final class StartTextDetectionResponseOps(val self: StartTextDetectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTextDetectionResponseOps {

  implicit def toStartTextDetectionResponseBuilderOps(
      v: StartTextDetectionResponse.Builder
  ): StartTextDetectionResponseBuilderOps = new StartTextDetectionResponseBuilderOps(v)

  implicit def toStartTextDetectionResponseOps(v: StartTextDetectionResponse): StartTextDetectionResponseOps =
    new StartTextDetectionResponseOps(v)

}
