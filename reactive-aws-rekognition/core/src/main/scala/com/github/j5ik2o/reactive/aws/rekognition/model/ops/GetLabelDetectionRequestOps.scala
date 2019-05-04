// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetLabelDetectionRequestBuilderOps(val self: GetLabelDetectionRequest.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): GetLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): GetLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def sortByAsScala(value: Option[LabelDetectionSortBy]): GetLabelDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.sortBy(v)
    }
  }

}

final class GetLabelDetectionRequestOps(val self: GetLabelDetectionRequest) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def sortByAsScala: Option[LabelDetectionSortBy] = Option(self.sortBy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLabelDetectionRequestOps {

  implicit def toGetLabelDetectionRequestBuilderOps(
      v: GetLabelDetectionRequest.Builder
  ): GetLabelDetectionRequestBuilderOps = new GetLabelDetectionRequestBuilderOps(v)

  implicit def toGetLabelDetectionRequestOps(v: GetLabelDetectionRequest): GetLabelDetectionRequestOps =
    new GetLabelDetectionRequestOps(v)

}
