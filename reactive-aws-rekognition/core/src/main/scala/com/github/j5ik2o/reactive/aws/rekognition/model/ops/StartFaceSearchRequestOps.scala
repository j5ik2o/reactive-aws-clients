// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartFaceSearchRequestBuilderOps(val self: StartFaceSearchRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala(value: Option[Video]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.video(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala(value: Option[Float]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.faceMatchThreshold(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.notificationChannel(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala(value: Option[String]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.jobTag(v)
    }
  }

}

final class StartFaceSearchRequestOps(val self: StartFaceSearchRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala: Option[Video] = Option(self.video)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala: Option[Float] = Option(self.faceMatchThreshold)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala: Option[String] = Option(self.jobTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartFaceSearchRequestOps {

  implicit def toStartFaceSearchRequestBuilderOps(v: StartFaceSearchRequest.Builder): StartFaceSearchRequestBuilderOps =
    new StartFaceSearchRequestBuilderOps(v)

  implicit def toStartFaceSearchRequestOps(v: StartFaceSearchRequest): StartFaceSearchRequestOps =
    new StartFaceSearchRequestOps(v)

}
