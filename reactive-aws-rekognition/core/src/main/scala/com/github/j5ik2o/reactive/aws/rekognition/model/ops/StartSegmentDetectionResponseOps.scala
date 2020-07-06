// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartSegmentDetectionResponseBuilderOps(val self: StartSegmentDetectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): StartSegmentDetectionResponse.Builder = {
    value.fold(self) { v => self.jobId(v) }
  }

}

final class StartSegmentDetectionResponseOps(val self: StartSegmentDetectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartSegmentDetectionResponseOps {

  implicit def toStartSegmentDetectionResponseBuilderOps(
      v: StartSegmentDetectionResponse.Builder
  ): StartSegmentDetectionResponseBuilderOps = new StartSegmentDetectionResponseBuilderOps(v)

  implicit def toStartSegmentDetectionResponseOps(v: StartSegmentDetectionResponse): StartSegmentDetectionResponseOps =
    new StartSegmentDetectionResponseOps(v)

}
