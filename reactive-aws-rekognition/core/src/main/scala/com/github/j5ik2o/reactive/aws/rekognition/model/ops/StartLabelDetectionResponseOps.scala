// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartLabelDetectionResponseBuilderOps(val self: StartLabelDetectionResponse.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): StartLabelDetectionResponse.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

}

final class StartLabelDetectionResponseOps(val self: StartLabelDetectionResponse) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartLabelDetectionResponseOps {

  implicit def toStartLabelDetectionResponseBuilderOps(
      v: StartLabelDetectionResponse.Builder
  ): StartLabelDetectionResponseBuilderOps = new StartLabelDetectionResponseBuilderOps(v)

  implicit def toStartLabelDetectionResponseOps(v: StartLabelDetectionResponse): StartLabelDetectionResponseOps =
    new StartLabelDetectionResponseOps(v)

}
