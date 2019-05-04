// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartFaceDetectionRequestBuilderOps(val self: StartFaceDetectionRequest.Builder) extends AnyVal {

  final def videoAsScala(value: Option[Video]): StartFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.video(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): StartFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.notificationChannel(v)
    }
  }

  final def faceAttributesAsScala(value: Option[FaceAttributes]): StartFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.faceAttributes(v)
    }
  }

  final def jobTagAsScala(value: Option[String]): StartFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.jobTag(v)
    }
  }

}

final class StartFaceDetectionRequestOps(val self: StartFaceDetectionRequest) extends AnyVal {

  final def videoAsScala: Option[Video] = Option(self.video)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  final def faceAttributesAsScala: Option[FaceAttributes] = Option(self.faceAttributes)

  final def jobTagAsScala: Option[String] = Option(self.jobTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartFaceDetectionRequestOps {

  implicit def toStartFaceDetectionRequestBuilderOps(
      v: StartFaceDetectionRequest.Builder
  ): StartFaceDetectionRequestBuilderOps = new StartFaceDetectionRequestBuilderOps(v)

  implicit def toStartFaceDetectionRequestOps(v: StartFaceDetectionRequest): StartFaceDetectionRequestOps =
    new StartFaceDetectionRequestOps(v)

}
