// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetFaceDetectionRequestBuilderOps(val self: GetFaceDetectionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): GetFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetFaceDetectionRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetFaceDetectionRequestOps(val self: GetFaceDetectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFaceDetectionRequestOps {

  implicit def toGetFaceDetectionRequestBuilderOps(
      v: GetFaceDetectionRequest.Builder
  ): GetFaceDetectionRequestBuilderOps = new GetFaceDetectionRequestBuilderOps(v)

  implicit def toGetFaceDetectionRequestOps(v: GetFaceDetectionRequest): GetFaceDetectionRequestOps =
    new GetFaceDetectionRequestOps(v)

}
