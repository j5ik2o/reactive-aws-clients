// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetFaceSearchResponseBuilderOps(val self: GetFaceSearchResponse.Builder) extends AnyVal {

  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetFaceSearchResponse.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): GetFaceSearchResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetFaceSearchResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetFaceSearchResponse.Builder = {
    value.fold(self) { v =>
      self.videoMetadata(v)
    }
  }

  final def personsAsScala(value: Option[Seq[PersonMatch]]): GetFaceSearchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.persons(v.asJava)
    }
  }

}

final class GetFaceSearchResponseOps(val self: GetFaceSearchResponse) extends AnyVal {

  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  final def personsAsScala: Option[Seq[PersonMatch]] = Option(self.persons).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFaceSearchResponseOps {

  implicit def toGetFaceSearchResponseBuilderOps(v: GetFaceSearchResponse.Builder): GetFaceSearchResponseBuilderOps =
    new GetFaceSearchResponseBuilderOps(v)

  implicit def toGetFaceSearchResponseOps(v: GetFaceSearchResponse): GetFaceSearchResponseOps =
    new GetFaceSearchResponseOps(v)

}
