// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompleteMultipartUploadResponseBuilderOps(val self: CompleteMultipartUploadResponse.Builder)
    extends AnyVal {

  final def locationAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.location(v)
    }
  } // String

  final def bucketAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def expirationAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  } // String

  final def eTagAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def serverSideEncryptionAsScala(
      value: Option[ServerSideEncryption]
  ): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def versionIdAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def ssekmsKeyIdAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def requestChargedAsScala(value: Option[RequestCharged]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class CompleteMultipartUploadResponseOps(val self: CompleteMultipartUploadResponse) extends AnyVal {

  final def locationAsScala: Option[String] = Option(self.location) // String

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def expirationAsScala: Option[String] = Option(self.expiration) // String

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompleteMultipartUploadResponseOps {

  implicit def toCompleteMultipartUploadResponseBuilderOps(
      v: CompleteMultipartUploadResponse.Builder
  ): CompleteMultipartUploadResponseBuilderOps = new CompleteMultipartUploadResponseBuilderOps(v)

  implicit def toCompleteMultipartUploadResponseOps(
      v: CompleteMultipartUploadResponse
  ): CompleteMultipartUploadResponseOps = new CompleteMultipartUploadResponseOps(v)

}
