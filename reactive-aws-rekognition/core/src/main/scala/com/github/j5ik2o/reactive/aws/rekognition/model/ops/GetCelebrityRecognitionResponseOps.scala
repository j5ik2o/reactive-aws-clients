// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetCelebrityRecognitionResponseBuilderOps(val self: GetCelebrityRecognitionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v => self.jobStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v => self.videoMetadata(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetCelebrityRecognitionResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def celebritiesAsScala(value: Option[Seq[CelebrityRecognition]]): GetCelebrityRecognitionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.celebrities(v.asJava)
    }
  }

}

final class GetCelebrityRecognitionResponseOps(val self: GetCelebrityRecognitionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def celebritiesAsScala: Option[Seq[CelebrityRecognition]] =
    Option(self.celebrities).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

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
