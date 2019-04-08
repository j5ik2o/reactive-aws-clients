// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateMultipartUploadRequestBuilderOps(val self: CreateMultipartUploadRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[ObjectCannedACL]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  } // ObjectCannedACL

  final def bucketAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def cacheControlAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  } // String

  final def contentDispositionAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  } // String

  final def contentEncodingAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  } // String

  final def contentLanguageAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  } // String

  final def contentTypeAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  } // String

  final def expiresAsScala(value: Option[java.time.Instant]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // java.time.Instant

  final def grantFullControlAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  } // String

  final def grantReadAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  } // String

  final def grantReadACPAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  } // String

  final def grantWriteACPAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def metadataAsScala(value: Option[Map[String, String]]): CreateMultipartUploadRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    } // Map[String, String]
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // ServerSideEncryption

  final def storageClassAsScala(value: Option[StorageClass]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // StorageClass

  final def websiteRedirectLocationAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  } // String

  final def sseCustomerAlgorithmAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def ssekmsKeyIdAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

  final def taggingAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  } // String

  final def objectLockModeAsScala(value: Option[ObjectLockMode]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  } // ObjectLockMode

  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  } // java.time.Instant

  final def objectLockLegalHoldStatusAsScala(
      value: Option[ObjectLockLegalHoldStatus]
  ): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  } // ObjectLockLegalHoldStatus

}

final class CreateMultipartUploadRequestOps(val self: CreateMultipartUploadRequest) extends AnyVal {

  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl) // ObjectCannedACL

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl) // String

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition) // String

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding) // String

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage) // String

  final def contentTypeAsScala: Option[String] = Option(self.contentType) // String

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires) // java.time.Instant

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl) // String

  final def grantReadAsScala: Option[String] = Option(self.grantRead) // String

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP) // String

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] =
    Option(self.serverSideEncryption) // ServerSideEncryption

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // StorageClass

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

  final def taggingAsScala: Option[String] = Option(self.tagging) // String

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode) // ObjectLockMode

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] =
    Option(self.objectLockRetainUntilDate) // java.time.Instant

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] =
    Option(self.objectLockLegalHoldStatus) // ObjectLockLegalHoldStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateMultipartUploadRequestOps {

  implicit def toCreateMultipartUploadRequestBuilderOps(
      v: CreateMultipartUploadRequest.Builder
  ): CreateMultipartUploadRequestBuilderOps = new CreateMultipartUploadRequestBuilderOps(v)

  implicit def toCreateMultipartUploadRequestOps(v: CreateMultipartUploadRequest): CreateMultipartUploadRequestOps =
    new CreateMultipartUploadRequestOps(v)

}
