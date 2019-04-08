// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectTaggingResponseBuilderOps(val self: PutObjectTaggingResponse.Builder) extends AnyVal {

  final def versionIdAsScala(value: Option[String]): PutObjectTaggingResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

}

final class PutObjectTaggingResponseOps(val self: PutObjectTaggingResponse) extends AnyVal {

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectTaggingResponseOps {

  implicit def toPutObjectTaggingResponseBuilderOps(
      v: PutObjectTaggingResponse.Builder
  ): PutObjectTaggingResponseBuilderOps = new PutObjectTaggingResponseBuilderOps(v)

  implicit def toPutObjectTaggingResponseOps(v: PutObjectTaggingResponse): PutObjectTaggingResponseOps =
    new PutObjectTaggingResponseOps(v)

}
