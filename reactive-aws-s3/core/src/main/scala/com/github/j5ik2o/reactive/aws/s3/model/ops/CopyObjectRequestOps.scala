// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyObjectRequestBuilderOps(val self: CopyObjectRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[ObjectCannedACL]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  }

  final def bucketAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def cacheControlAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  }

  final def contentDispositionAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  }

  final def contentEncodingAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  }

  final def contentLanguageAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  }

  final def contentTypeAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  }

  final def copySourceAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySource(v)
    }
  }

  final def copySourceIfMatchAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfMatch(v)
    }
  }

  final def copySourceIfModifiedSinceAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfModifiedSince(v)
    }
  }

  final def copySourceIfNoneMatchAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfNoneMatch(v)
    }
  }

  final def copySourceIfUnmodifiedSinceAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfUnmodifiedSince(v)
    }
  }

  final def expiresAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  }

  final def grantFullControlAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  }

  final def grantReadAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  }

  final def grantReadACPAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  }

  final def grantWriteACPAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  }

  final def keyAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def metadataAsScala(value: Option[Map[String, String]]): CopyObjectRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    }
  }

  final def metadataDirectiveAsScala(value: Option[MetadataDirective]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.metadataDirective(v)
    }
  }

  final def taggingDirectiveAsScala(value: Option[TaggingDirective]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.taggingDirective(v)
    }
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def storageClassAsScala(value: Option[StorageClass]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  final def websiteRedirectLocationAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def copySourceSSECustomerAlgorithmAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerAlgorithm(v)
    }
  }

  final def copySourceSSECustomerKeyAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKey(v)
    }
  }

  final def copySourceSSECustomerKeyMD5AsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKeyMD5(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  final def taggingAsScala(value: Option[String]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  }

  final def objectLockModeAsScala(value: Option[ObjectLockMode]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  }

  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  }

  final def objectLockLegalHoldStatusAsScala(value: Option[ObjectLockLegalHoldStatus]): CopyObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  }

}

final class CopyObjectRequestOps(val self: CopyObjectRequest) extends AnyVal {

  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl)

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition)

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding)

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage)

  final def contentTypeAsScala: Option[String] = Option(self.contentType)

  final def copySourceAsScala: Option[String] = Option(self.copySource)

  final def copySourceIfMatchAsScala: Option[String] = Option(self.copySourceIfMatch)

  final def copySourceIfModifiedSinceAsScala: Option[java.time.Instant] = Option(self.copySourceIfModifiedSince)

  final def copySourceIfNoneMatchAsScala: Option[String] = Option(self.copySourceIfNoneMatch)

  final def copySourceIfUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.copySourceIfUnmodifiedSince)

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires)

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl)

  final def grantReadAsScala: Option[String] = Option(self.grantRead)

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP)

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP)

  final def keyAsScala: Option[String] = Option(self.key)

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def metadataDirectiveAsScala: Option[MetadataDirective] = Option(self.metadataDirective)

  final def taggingDirectiveAsScala: Option[TaggingDirective] = Option(self.taggingDirective)

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def copySourceSSECustomerAlgorithmAsScala: Option[String] = Option(self.copySourceSSECustomerAlgorithm)

  final def copySourceSSECustomerKeyAsScala: Option[String] = Option(self.copySourceSSECustomerKey)

  final def copySourceSSECustomerKeyMD5AsScala: Option[String] = Option(self.copySourceSSECustomerKeyMD5)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  final def taggingAsScala: Option[String] = Option(self.tagging)

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode)

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] = Option(self.objectLockRetainUntilDate)

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] = Option(self.objectLockLegalHoldStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyObjectRequestOps {

  implicit def toCopyObjectRequestBuilderOps(v: CopyObjectRequest.Builder): CopyObjectRequestBuilderOps =
    new CopyObjectRequestBuilderOps(v)

  implicit def toCopyObjectRequestOps(v: CopyObjectRequest): CopyObjectRequestOps = new CopyObjectRequestOps(v)

}
