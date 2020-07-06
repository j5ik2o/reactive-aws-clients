// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartSegmentDetectionRequestBuilderOps(val self: StartSegmentDetectionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala(value: Option[Video]): StartSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.video(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): StartSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.clientRequestToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala(value: Option[NotificationChannel]): StartSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.notificationChannel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala(value: Option[String]): StartSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.jobTag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[StartSegmentDetectionFilters]): StartSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.filters(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def segmentTypesAsScala(value: Option[Seq[SegmentType]]): StartSegmentDetectionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.segmentTypes(v.asJava)
    }
  }

}

final class StartSegmentDetectionRequestOps(val self: StartSegmentDetectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoAsScala: Option[Video] = Option(self.video)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationChannelAsScala: Option[NotificationChannel] = Option(self.notificationChannel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobTagAsScala: Option[String] = Option(self.jobTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[StartSegmentDetectionFilters] = Option(self.filters)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def segmentTypesAsScala: Option[Seq[SegmentType]] =
    Option(self.segmentTypes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartSegmentDetectionRequestOps {

  implicit def toStartSegmentDetectionRequestBuilderOps(
      v: StartSegmentDetectionRequest.Builder
  ): StartSegmentDetectionRequestBuilderOps = new StartSegmentDetectionRequestBuilderOps(v)

  implicit def toStartSegmentDetectionRequestOps(v: StartSegmentDetectionRequest): StartSegmentDetectionRequestOps =
    new StartSegmentDetectionRequestOps(v)

}
