// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyObjectRequestBuilderOps(val self: CopyObjectRequest.Builder) extends AnyVal {

  final def withAclAsScala(value: Option[ObjectCannedACL]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  } // String

  final def withBucketAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withCacheControlAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  } // String

  final def withContentDispositionAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  } // String

  final def withContentEncodingAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  } // String

  final def withContentLanguageAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  } // String

  final def withContentTypeAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  } // String

  final def withCopySourceAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySource(v)
    }
  } // String

  final def withCopySourceIfMatchAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfMatch(v)
    }
  } // String

  final def withCopySourceIfModifiedSinceAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfModifiedSince(v)
    }
  } // Instant

  final def withCopySourceIfNoneMatchAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfNoneMatch(v)
    }
  } // String

  final def withCopySourceIfUnmodifiedSinceAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfUnmodifiedSince(v)
    }
  } // Instant

  final def withExpiresAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // Instant

  final def withGrantFullControlAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  } // String

  final def withGrantReadAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  } // String

  final def withGrantReadACPAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  } // String

  final def withGrantWriteACPAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withMetadataAsScala(value: Option[Map[String, String]]): CopyObjectRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    } // Map[String, String]
  }

  final def withMetadataDirectiveAsScala(value: Option[MetadataDirective]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.metadataDirective(v)
    }
  } // String

  final def withTaggingDirectiveAsScala(value: Option[TaggingDirective]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.taggingDirective(v)
    }
  } // String

  final def withServerSideEncryptionAsScala(value: Option[ServerSideEncryption]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def withStorageClassAsScala(value: Option[StorageClass]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

  final def withWebsiteRedirectLocationAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  } // String

  final def withSseCustomerAlgorithmAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def withSseCustomerKeyAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def withSseCustomerKeyMD5AsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def withSsekmsKeyIdAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def withCopySourceSSECustomerAlgorithmAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerAlgorithm(v)
    }
  } // String

  final def withCopySourceSSECustomerKeyAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKey(v)
    }
  } // String

  final def withCopySourceSSECustomerKeyMD5AsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKeyMD5(v)
    }
  } // String

  final def withRequestPayerAsScala(value: Option[RequestPayer]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

  final def withTaggingAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  } // String

  final def withObjectLockModeAsScala(value: Option[ObjectLockMode]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  } // String

  final def withObjectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  } // Instant

  final def withObjectLockLegalHoldStatusAsScala(
      value: Option[ObjectLockLegalHoldStatus]
  ): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  } // String

}

final class CopyObjectRequestOps(val self: CopyObjectRequest) extends AnyVal {

  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl) // String

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl) // String

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition) // String

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding) // String

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage) // String

  final def contentTypeAsScala: Option[String] = Option(self.contentType) // String

  final def copySourceAsScala: Option[String] = Option(self.copySource) // String

  final def copySourceIfMatchAsScala: Option[String] = Option(self.copySourceIfMatch) // String

  final def copySourceIfModifiedSinceAsScala: Option[java.time.Instant] =
    Option(self.copySourceIfModifiedSince) // Instant

  final def copySourceIfNoneMatchAsScala: Option[String] = Option(self.copySourceIfNoneMatch) // String

  final def copySourceIfUnmodifiedSinceAsScala: Option[java.time.Instant] =
    Option(self.copySourceIfUnmodifiedSince) // Instant

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires) // Instant

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl) // String

  final def grantReadAsScala: Option[String] = Option(self.grantRead) // String

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP) // String

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def metadataDirectiveAsScala: Option[MetadataDirective] = Option(self.metadataDirective) // String

  final def taggingDirectiveAsScala: Option[TaggingDirective] = Option(self.taggingDirective) // String

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // String

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def copySourceSSECustomerAlgorithmAsScala: Option[String] =
    Option(self.copySourceSSECustomerAlgorithm) // String

  final def copySourceSSECustomerKeyAsScala: Option[String] = Option(self.copySourceSSECustomerKey) // String

  final def copySourceSSECustomerKeyMD5AsScala: Option[String] = Option(self.copySourceSSECustomerKeyMD5) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

  final def taggingAsScala: Option[String] = Option(self.tagging) // String

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode) // String

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] =
    Option(self.objectLockRetainUntilDate) // Instant

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] =
    Option(self.objectLockLegalHoldStatus) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyObjectRequestOps {

  implicit def toCopyObjectRequestBuilderOps(v: CopyObjectRequest.Builder): CopyObjectRequestBuilderOps =
    new CopyObjectRequestBuilderOps(v)

  implicit def toCopyObjectRequestOps(v: CopyObjectRequest): CopyObjectRequestOps = new CopyObjectRequestOps(v)

}
