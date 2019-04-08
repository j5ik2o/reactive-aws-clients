// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompleteMultipartUploadResponseBuilderOps(val self: CompleteMultipartUploadResponse.Builder)
    extends AnyVal {

  final def locationAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.location(v)
    }
  }

  final def bucketAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def expirationAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  }

  final def eTagAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  }

  final def serverSideEncryptionAsScala(
      value: Option[ServerSideEncryption]
  ): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): CompleteMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class CompleteMultipartUploadResponseOps(val self: CompleteMultipartUploadResponse) extends AnyVal {

  final def locationAsScala: Option[String] = Option(self.location)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyAsScala: Option[String] = Option(self.key)

  final def expirationAsScala: Option[String] = Option(self.expiration)

  final def eTagAsScala: Option[String] = Option(self.eTag)

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

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
