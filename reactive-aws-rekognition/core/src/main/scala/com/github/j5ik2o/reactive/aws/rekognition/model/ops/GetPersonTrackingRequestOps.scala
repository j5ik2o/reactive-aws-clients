// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetPersonTrackingRequestBuilderOps(val self: GetPersonTrackingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): GetPersonTrackingRequest.Builder = {
    value.fold(self) { v => self.jobId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetPersonTrackingRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetPersonTrackingRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sortByAsScala(value: Option[PersonTrackingSortBy]): GetPersonTrackingRequest.Builder = {
    value.fold(self) { v => self.sortBy(v) }
  }

}

final class GetPersonTrackingRequestOps(val self: GetPersonTrackingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sortByAsScala: Option[PersonTrackingSortBy] = Option(self.sortBy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPersonTrackingRequestOps {

  implicit def toGetPersonTrackingRequestBuilderOps(
      v: GetPersonTrackingRequest.Builder
  ): GetPersonTrackingRequestBuilderOps = new GetPersonTrackingRequestBuilderOps(v)

  implicit def toGetPersonTrackingRequestOps(v: GetPersonTrackingRequest): GetPersonTrackingRequestOps =
    new GetPersonTrackingRequestOps(v)

}
