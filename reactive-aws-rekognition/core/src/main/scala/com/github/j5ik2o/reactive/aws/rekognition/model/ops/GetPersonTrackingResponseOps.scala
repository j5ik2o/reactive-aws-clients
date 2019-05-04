// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetPersonTrackingResponseBuilderOps(val self: GetPersonTrackingResponse.Builder) extends AnyVal {

  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v =>
      self.videoMetadata(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetPersonTrackingResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def personsAsScala(value: Option[Seq[PersonDetection]]): GetPersonTrackingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.persons(v.asJava)
    }
  }

}

final class GetPersonTrackingResponseOps(val self: GetPersonTrackingResponse) extends AnyVal {

  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def personsAsScala: Option[Seq[PersonDetection]] = Option(self.persons).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPersonTrackingResponseOps {

  implicit def toGetPersonTrackingResponseBuilderOps(
      v: GetPersonTrackingResponse.Builder
  ): GetPersonTrackingResponseBuilderOps = new GetPersonTrackingResponseBuilderOps(v)

  implicit def toGetPersonTrackingResponseOps(v: GetPersonTrackingResponse): GetPersonTrackingResponseOps =
    new GetPersonTrackingResponseOps(v)

}
