// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectTaggingRequestBuilderOps(val self: PutObjectTaggingRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def withTaggingAsScala(value: Option[Tagging]): PutObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  } // Tagging

}

final class PutObjectTaggingRequestOps(val self: PutObjectTaggingRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def taggingAsScala: Option[Tagging] = Option(self.tagging) // Tagging

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectTaggingRequestOps {

  implicit def toPutObjectTaggingRequestBuilderOps(
      v: PutObjectTaggingRequest.Builder
  ): PutObjectTaggingRequestBuilderOps = new PutObjectTaggingRequestBuilderOps(v)

  implicit def toPutObjectTaggingRequestOps(v: PutObjectTaggingRequest): PutObjectTaggingRequestOps =
    new PutObjectTaggingRequestOps(v)

}
