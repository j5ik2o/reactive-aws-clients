// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartFaceSearchResponseBuilderOps(val self: StartFaceSearchResponse.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): StartFaceSearchResponse.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

}

final class StartFaceSearchResponseOps(val self: StartFaceSearchResponse) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartFaceSearchResponseOps {

  implicit def toStartFaceSearchResponseBuilderOps(
      v: StartFaceSearchResponse.Builder
  ): StartFaceSearchResponseBuilderOps = new StartFaceSearchResponseBuilderOps(v)

  implicit def toStartFaceSearchResponseOps(v: StartFaceSearchResponse): StartFaceSearchResponseOps =
    new StartFaceSearchResponseOps(v)

}
