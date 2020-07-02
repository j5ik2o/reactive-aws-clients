// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartContentModerationResponseBuilderOps(val self: StartContentModerationResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): StartContentModerationResponse.Builder = {
    value.fold(self) { v => self.jobId(v) }
  }

}

final class StartContentModerationResponseOps(val self: StartContentModerationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartContentModerationResponseOps {

  implicit def toStartContentModerationResponseBuilderOps(
      v: StartContentModerationResponse.Builder
  ): StartContentModerationResponseBuilderOps = new StartContentModerationResponseBuilderOps(v)

  implicit def toStartContentModerationResponseOps(
      v: StartContentModerationResponse
  ): StartContentModerationResponseOps = new StartContentModerationResponseOps(v)

}
