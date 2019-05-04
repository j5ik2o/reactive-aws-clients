// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartCelebrityRecognitionResponseBuilderOps(val self: StartCelebrityRecognitionResponse.Builder)
    extends AnyVal {

  final def jobIdAsScala(value: Option[String]): StartCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

}

final class StartCelebrityRecognitionResponseOps(val self: StartCelebrityRecognitionResponse) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartCelebrityRecognitionResponseOps {

  implicit def toStartCelebrityRecognitionResponseBuilderOps(
      v: StartCelebrityRecognitionResponse.Builder
  ): StartCelebrityRecognitionResponseBuilderOps = new StartCelebrityRecognitionResponseBuilderOps(v)

  implicit def toStartCelebrityRecognitionResponseOps(
      v: StartCelebrityRecognitionResponse
  ): StartCelebrityRecognitionResponseOps = new StartCelebrityRecognitionResponseOps(v)

}
