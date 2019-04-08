// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectTaggingRequestBuilderOps(val self: GetObjectTaggingRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyAsScala(value: Option[String]): GetObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): GetObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

}

final class GetObjectTaggingRequestOps(val self: GetObjectTaggingRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyAsScala: Option[String] = Option(self.key)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectTaggingRequestOps {

  implicit def toGetObjectTaggingRequestBuilderOps(
      v: GetObjectTaggingRequest.Builder
  ): GetObjectTaggingRequestBuilderOps = new GetObjectTaggingRequestBuilderOps(v)

  implicit def toGetObjectTaggingRequestOps(v: GetObjectTaggingRequest): GetObjectTaggingRequestOps =
    new GetObjectTaggingRequestOps(v)

}
