// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartLabelDetectionRequestBuilderOps(val self: StartLabelDetectionRequest.Builder) extends AnyVal {

  final def videoAsScala(value: Option[Video]): StartLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.video(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): StartLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  final def minConfidenceAsScala(value: Option[Float]): StartLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.minConfidence(v)
    }
  }

  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.notificationChannel(v)
    }
  }

  final def jobTagAsScala(value: Option[String]): StartLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.jobTag(v)
    }
  }

}

final class StartLabelDetectionRequestOps(val self: StartLabelDetectionRequest) extends AnyVal {

  final def videoAsScala: Option[Video] = Option(self.video)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  final def minConfidenceAsScala: Option[Float] = Option(self.minConfidence)

  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  final def jobTagAsScala: Option[String] = Option(self.jobTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartLabelDetectionRequestOps {

  implicit def toStartLabelDetectionRequestBuilderOps(
      v: StartLabelDetectionRequest.Builder
  ): StartLabelDetectionRequestBuilderOps = new StartLabelDetectionRequestBuilderOps(v)

  implicit def toStartLabelDetectionRequestOps(v: StartLabelDetectionRequest): StartLabelDetectionRequestOps =
    new StartLabelDetectionRequestOps(v)

}
