// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetFaceSearchRequestBuilderOps(val self: GetFaceSearchRequest.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): GetFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): GetFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def sortByAsScala(value: Option[FaceSearchSortBy]): GetFaceSearchRequest.Builder = {
    value.fold(self) { v =>
      self.sortBy(v)
    }
  }

}

final class GetFaceSearchRequestOps(val self: GetFaceSearchRequest) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def sortByAsScala: Option[FaceSearchSortBy] = Option(self.sortBy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFaceSearchRequestOps {

  implicit def toGetFaceSearchRequestBuilderOps(v: GetFaceSearchRequest.Builder): GetFaceSearchRequestBuilderOps =
    new GetFaceSearchRequestBuilderOps(v)

  implicit def toGetFaceSearchRequestOps(v: GetFaceSearchRequest): GetFaceSearchRequestOps =
    new GetFaceSearchRequestOps(v)

}
