// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartTextDetectionRequestBuilderOps(val self: StartTextDetectionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala(value: Option[Video]): StartTextDetectionRequest.Builder = {
    value.fold(self) { v => self.video(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): StartTextDetectionRequest.Builder = {
    value.fold(self) { v => self.clientRequestToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartTextDetectionRequest.Builder = {
    value.fold(self) { v => self.notificationChannel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala(value: Option[String]): StartTextDetectionRequest.Builder = {
    value.fold(self) { v => self.jobTag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[StartTextDetectionFilters]): StartTextDetectionRequest.Builder = {
    value.fold(self) { v => self.filters(v) }
  }

}

final class StartTextDetectionRequestOps(val self: StartTextDetectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala: Option[Video] = Option(self.video)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala: Option[String] = Option(self.jobTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[StartTextDetectionFilters] = Option(self.filters)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTextDetectionRequestOps {

  implicit def toStartTextDetectionRequestBuilderOps(
      v: StartTextDetectionRequest.Builder
  ): StartTextDetectionRequestBuilderOps = new StartTextDetectionRequestBuilderOps(v)

  implicit def toStartTextDetectionRequestOps(v: StartTextDetectionRequest): StartTextDetectionRequestOps =
    new StartTextDetectionRequestOps(v)

}
