// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetSegmentDetectionRequestBuilderOps(val self: GetSegmentDetectionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): GetSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.jobId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetSegmentDetectionRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class GetSegmentDetectionRequestOps(val self: GetSegmentDetectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetSegmentDetectionRequestOps {

  implicit def toGetSegmentDetectionRequestBuilderOps(
      v: GetSegmentDetectionRequest.Builder
  ): GetSegmentDetectionRequestBuilderOps = new GetSegmentDetectionRequestBuilderOps(v)

  implicit def toGetSegmentDetectionRequestOps(v: GetSegmentDetectionRequest): GetSegmentDetectionRequestOps =
    new GetSegmentDetectionRequestOps(v)

}
