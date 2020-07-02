// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartCelebrityRecognitionRequestBuilderOps(val self: StartCelebrityRecognitionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala(value: Option[Video]): StartCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v => self.video(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): StartCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v => self.clientRequestToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v => self.notificationChannel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala(value: Option[String]): StartCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v => self.jobTag(v) }
  }

}

final class StartCelebrityRecognitionRequestOps(val self: StartCelebrityRecognitionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala: Option[Video] = Option(self.video)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala: Option[String] = Option(self.jobTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartCelebrityRecognitionRequestOps {

  implicit def toStartCelebrityRecognitionRequestBuilderOps(
      v: StartCelebrityRecognitionRequest.Builder
  ): StartCelebrityRecognitionRequestBuilderOps = new StartCelebrityRecognitionRequestBuilderOps(v)

  implicit def toStartCelebrityRecognitionRequestOps(
      v: StartCelebrityRecognitionRequest
  ): StartCelebrityRecognitionRequestOps = new StartCelebrityRecognitionRequestOps(v)

}
