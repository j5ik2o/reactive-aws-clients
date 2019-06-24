// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetCelebrityRecognitionRequestBuilderOps(val self: GetCelebrityRecognitionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): GetCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sortByAsScala(value: Option[CelebrityRecognitionSortBy]): GetCelebrityRecognitionRequest.Builder = {
    value.fold(self) { v =>
      self.sortBy(v)
    }
  }

}

final class GetCelebrityRecognitionRequestOps(val self: GetCelebrityRecognitionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sortByAsScala: Option[CelebrityRecognitionSortBy] = Option(self.sortBy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCelebrityRecognitionRequestOps {

  implicit def toGetCelebrityRecognitionRequestBuilderOps(
      v: GetCelebrityRecognitionRequest.Builder
  ): GetCelebrityRecognitionRequestBuilderOps = new GetCelebrityRecognitionRequestBuilderOps(v)

  implicit def toGetCelebrityRecognitionRequestOps(
      v: GetCelebrityRecognitionRequest
  ): GetCelebrityRecognitionRequestOps = new GetCelebrityRecognitionRequestOps(v)

}
