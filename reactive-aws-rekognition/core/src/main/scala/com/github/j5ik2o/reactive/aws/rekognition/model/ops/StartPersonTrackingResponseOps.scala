// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartPersonTrackingResponseBuilderOps(val self: StartPersonTrackingResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): StartPersonTrackingResponse.Builder = {
    value.fold(self) { v => self.jobId(v) }
  }

}

final class StartPersonTrackingResponseOps(val self: StartPersonTrackingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartPersonTrackingResponseOps {

  implicit def toStartPersonTrackingResponseBuilderOps(
      v: StartPersonTrackingResponse.Builder
  ): StartPersonTrackingResponseBuilderOps = new StartPersonTrackingResponseBuilderOps(v)

  implicit def toStartPersonTrackingResponseOps(v: StartPersonTrackingResponse): StartPersonTrackingResponseOps =
    new StartPersonTrackingResponseOps(v)

}
