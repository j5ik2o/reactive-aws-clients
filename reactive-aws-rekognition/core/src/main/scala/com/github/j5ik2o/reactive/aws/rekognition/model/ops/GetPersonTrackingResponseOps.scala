// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetPersonTrackingResponseBuilderOps(val self: GetPersonTrackingResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v => self.jobStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v => self.videoMetadata(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def personsAsScala(value: Option[Seq[PersonDetection]]): GetPersonTrackingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.persons(v.asJava)
    }
  }

}

final class GetPersonTrackingResponseOps(val self: GetPersonTrackingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def personsAsScala: Option[Seq[PersonDetection]] =
    Option(self.persons).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPersonTrackingResponseOps {

  implicit def toGetPersonTrackingResponseBuilderOps(
      v: GetPersonTrackingResponse.Builder
  ): GetPersonTrackingResponseBuilderOps = new GetPersonTrackingResponseBuilderOps(v)

  implicit def toGetPersonTrackingResponseOps(v: GetPersonTrackingResponse): GetPersonTrackingResponseOps =
    new GetPersonTrackingResponseOps(v)

}
