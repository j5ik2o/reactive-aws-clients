// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartPersonTrackingRequestBuilderOps(val self: StartPersonTrackingRequest.Builder) extends AnyVal {

  final def videoAsScala(value: Option[Video]): StartPersonTrackingRequest.Builder = {
    value.fold(self) { v =>
      self.video(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): StartPersonTrackingRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartPersonTrackingRequest.Builder = {
    value.fold(self) { v =>
      self.notificationChannel(v)
    }
  }

  final def jobTagAsScala(value: Option[String]): StartPersonTrackingRequest.Builder = {
    value.fold(self) { v =>
      self.jobTag(v)
    }
  }

}

final class StartPersonTrackingRequestOps(val self: StartPersonTrackingRequest) extends AnyVal {

  final def videoAsScala: Option[Video] = Option(self.video)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  final def jobTagAsScala: Option[String] = Option(self.jobTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartPersonTrackingRequestOps {

  implicit def toStartPersonTrackingRequestBuilderOps(
      v: StartPersonTrackingRequest.Builder
  ): StartPersonTrackingRequestBuilderOps = new StartPersonTrackingRequestBuilderOps(v)

  implicit def toStartPersonTrackingRequestOps(v: StartPersonTrackingRequest): StartPersonTrackingRequestOps =
    new StartPersonTrackingRequestOps(v)

}
