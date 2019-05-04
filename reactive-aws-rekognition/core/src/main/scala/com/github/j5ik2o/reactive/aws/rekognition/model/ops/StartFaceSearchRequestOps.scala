// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartFaceSearchRequestBuilderOps(val self: StartFaceSearchRequest.Builder) extends AnyVal {

  final def videoAsScala(value: Option[Video]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.video(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  final def faceMatchThresholdAsScala(value: Option[Float]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.faceMatchThreshold(v)
    }
  }

  final def collectionIdAsScala(value: Option[String]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.notificationChannel(v)
    }
  }

  final def jobTagAsScala(value: Option[String]): StartFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.jobTag(v)
    }
  }

}

final class StartFaceSearchRequestOps(val self: StartFaceSearchRequest) extends AnyVal {

  final def videoAsScala: Option[Video] = Option(self.video)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  final def faceMatchThresholdAsScala: Option[Float] = Option(self.faceMatchThreshold)

  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  final def jobTagAsScala: Option[String] = Option(self.jobTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartFaceSearchRequestOps {

  implicit def toStartFaceSearchRequestBuilderOps(v: StartFaceSearchRequest.Builder): StartFaceSearchRequestBuilderOps =
    new StartFaceSearchRequestBuilderOps(v)

  implicit def toStartFaceSearchRequestOps(v: StartFaceSearchRequest): StartFaceSearchRequestOps =
    new StartFaceSearchRequestOps(v)

}
