// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectTaggingRequestBuilderOps(val self: PutObjectTaggingRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyAsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  final def taggingAsScala(value: Option[Tagging]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  }

}

final class PutObjectTaggingRequestOps(val self: PutObjectTaggingRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyAsScala: Option[String] = Option(self.key)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  final def taggingAsScala: Option[Tagging] = Option(self.tagging)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectTaggingRequestOps {

  implicit def toPutObjectTaggingRequestBuilderOps(
      v: PutObjectTaggingRequest.Builder
  ): PutObjectTaggingRequestBuilderOps = new PutObjectTaggingRequestBuilderOps(v)

  implicit def toPutObjectTaggingRequestOps(v: PutObjectTaggingRequest): PutObjectTaggingRequestOps =
    new PutObjectTaggingRequestOps(v)

}
