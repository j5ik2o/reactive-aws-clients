// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetContentModerationRequestBuilderOps(val self: GetContentModerationRequest.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): GetContentModerationRequest.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): GetContentModerationRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetContentModerationRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def sortByAsScala(value: Option[ContentModerationSortBy]): GetContentModerationRequest.Builder = {
    value.fold(self) { v =>
      self.sortBy(v)
    }
  }

}

final class GetContentModerationRequestOps(val self: GetContentModerationRequest) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def sortByAsScala: Option[ContentModerationSortBy] = Option(self.sortBy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetContentModerationRequestOps {

  implicit def toGetContentModerationRequestBuilderOps(
      v: GetContentModerationRequest.Builder
  ): GetContentModerationRequestBuilderOps = new GetContentModerationRequestBuilderOps(v)

  implicit def toGetContentModerationRequestOps(v: GetContentModerationRequest): GetContentModerationRequestOps =
    new GetContentModerationRequestOps(v)

}
