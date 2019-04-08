// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectRequestBuilderOps(val self: PutObjectRequest.Builder) extends AnyVal {

  final def aclAsScala(value: Option[ObjectCannedACL]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  }

  final def bucketAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def cacheControlAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  }

  final def contentDispositionAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  }

  final def contentEncodingAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  }

  final def contentLanguageAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  }

  final def contentLengthAsScala(value: Option[Long]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentLength(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  final def contentTypeAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  }

  final def expiresAsScala(value: Option[java.time.Instant]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  }

  final def grantFullControlAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  }

  final def grantReadAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  }

  final def grantReadACPAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  }

  final def grantWriteACPAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  }

  final def keyAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def metadataAsScala(value: Option[Map[String, String]]): PutObjectRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    }
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def storageClassAsScala(value: Option[StorageClass]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  final def websiteRedirectLocationAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  final def taggingAsScala(value: Option[String]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  }

  final def objectLockModeAsScala(value: Option[ObjectLockMode]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  }

  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  }

  final def objectLockLegalHoldStatusAsScala(value: Option[ObjectLockLegalHoldStatus]): PutObjectRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  }

}

final class PutObjectRequestOps(val self: PutObjectRequest) extends AnyVal {

  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl)

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition)

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding)

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage)

  final def contentLengthAsScala: Option[Long] = Option(self.contentLength)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  final def contentTypeAsScala: Option[String] = Option(self.contentType)

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires)

  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl)

  final def grantReadAsScala: Option[String] = Option(self.grantRead)

  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP)

  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP)

  final def keyAsScala: Option[String] = Option(self.key)

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  final def taggingAsScala: Option[String] = Option(self.tagging)

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode)

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] = Option(self.objectLockRetainUntilDate)

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] = Option(self.objectLockLegalHoldStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectRequestOps {

  implicit def toPutObjectRequestBuilderOps(v: PutObjectRequest.Builder): PutObjectRequestBuilderOps =
    new PutObjectRequestBuilderOps(v)

  implicit def toPutObjectRequestOps(v: PutObjectRequest): PutObjectRequestOps = new PutObjectRequestOps(v)

}
