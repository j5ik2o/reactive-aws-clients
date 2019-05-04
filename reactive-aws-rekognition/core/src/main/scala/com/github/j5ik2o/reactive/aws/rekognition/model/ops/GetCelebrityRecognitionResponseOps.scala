// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetCelebrityRecognitionResponseBuilderOps(val self: GetCelebrityRecognitionResponse.Builder)
    extends AnyVal {

  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v =>
      self.videoMetadata(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def celebritiesAsScala(value: Option[Seq[CelebrityRecognition]]): GetCelebrityRecognitionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.celebrities(v.asJava)
    }
  }

}

final class GetCelebrityRecognitionResponseOps(val self: GetCelebrityRecognitionResponse) extends AnyVal {

  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def celebritiesAsScala: Option[Seq[CelebrityRecognition]] = Option(self.celebrities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCelebrityRecognitionResponseOps {

  implicit def toGetCelebrityRecognitionResponseBuilderOps(
      v: GetCelebrityRecognitionResponse.Builder
  ): GetCelebrityRecognitionResponseBuilderOps = new GetCelebrityRecognitionResponseBuilderOps(v)

  implicit def toGetCelebrityRecognitionResponseOps(
      v: GetCelebrityRecognitionResponse
  ): GetCelebrityRecognitionResponseOps = new GetCelebrityRecognitionResponseOps(v)

}
