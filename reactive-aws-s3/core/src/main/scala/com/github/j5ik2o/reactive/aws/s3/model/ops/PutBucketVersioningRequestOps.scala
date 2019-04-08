// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketVersioningRequestBuilderOps(val self: PutBucketVersioningRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketVersioningRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def contentMD5AsScala(value: Option[String]): PutBucketVersioningRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def mfaAsScala(value: Option[String]): PutBucketVersioningRequest.Builder = {
    value.fold(self) { v =>
      self.mfa(v)
    }
  } // String

  final def versioningConfigurationAsScala(
      value: Option[VersioningConfiguration]
  ): PutBucketVersioningRequest.Builder = {
    value.fold(self) { v =>
      self.versioningConfiguration(v)
    }
  } // VersioningConfiguration

}

final class PutBucketVersioningRequestOps(val self: PutBucketVersioningRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def mfaAsScala: Option[String] = Option(self.mfa) // String

  final def versioningConfigurationAsScala: Option[VersioningConfiguration] =
    Option(self.versioningConfiguration) // VersioningConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketVersioningRequestOps {

  implicit def toPutBucketVersioningRequestBuilderOps(
      v: PutBucketVersioningRequest.Builder
  ): PutBucketVersioningRequestBuilderOps = new PutBucketVersioningRequestBuilderOps(v)

  implicit def toPutBucketVersioningRequestOps(v: PutBucketVersioningRequest): PutBucketVersioningRequestOps =
    new PutBucketVersioningRequestOps(v)

}
