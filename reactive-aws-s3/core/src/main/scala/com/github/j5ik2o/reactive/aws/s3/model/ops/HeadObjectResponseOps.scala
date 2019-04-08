// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class HeadObjectResponseBuilderOps(val self: HeadObjectResponse.Builder) extends AnyVal {

  final def deleteMarkerAsScala(value: Option[Boolean]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.deleteMarker(v)
    }
  } // Boolean

  final def acceptRangesAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.acceptRanges(v)
    }
  } // String

  final def expirationAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  } // String

  final def restoreAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.restore(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

  final def contentLengthAsScala(value: Option[Long]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLength(v)
    }
  } // Long

  final def eTagAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def missingMetaAsScala(value: Option[Int]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.missingMeta(v)
    }
  } // Int

  final def versionIdAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def cacheControlAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  } // String

  final def contentDispositionAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  } // String

  final def contentEncodingAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  } // String

  final def contentLanguageAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  } // String

  final def contentTypeAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  } // String

  final def expiresAsScala(value: Option[java.time.Instant]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // Instant

  final def websiteRedirectLocationAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  } // String

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def metadataAsScala(value: Option[Map[String, String]]): HeadObjectResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    } // Map[String, String]
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def ssekmsKeyIdAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def storageClassAsScala(value: Option[StorageClass]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

  final def requestChargedAsScala(value: Option[RequestCharged]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

  final def replicationStatusAsScala(value: Option[ReplicationStatus]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.replicationStatus(v)
    }
  } // String

  final def partsCountAsScala(value: Option[Int]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.partsCount(v)
    }
  } // Int

  final def objectLockModeAsScala(value: Option[ObjectLockMode]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  } // String

  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  } // Instant

  final def objectLockLegalHoldStatusAsScala(value: Option[ObjectLockLegalHoldStatus]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  } // String

}

final class HeadObjectResponseOps(val self: HeadObjectResponse) extends AnyVal {

  final def deleteMarkerAsScala: Option[Boolean] = Option(self.deleteMarker) // Boolean

  final def acceptRangesAsScala: Option[String] = Option(self.acceptRanges) // String

  final def expirationAsScala: Option[String] = Option(self.expiration) // String

  final def restoreAsScala: Option[String] = Option(self.restore) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // Instant

  final def contentLengthAsScala: Option[Long] = Option(self.contentLength) // Long

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def missingMetaAsScala: Option[Int] = Option(self.missingMeta) // Int

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl) // String

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition) // String

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding) // String

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage) // String

  final def contentTypeAsScala: Option[String] = Option(self.contentType) // String

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires) // Instant

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation) // String

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

  final def replicationStatusAsScala: Option[ReplicationStatus] = Option(self.replicationStatus) // String

  final def partsCountAsScala: Option[Int] = Option(self.partsCount) // Int

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode) // String

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] =
    Option(self.objectLockRetainUntilDate) // Instant

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] =
    Option(self.objectLockLegalHoldStatus) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHeadObjectResponseOps {

  implicit def toHeadObjectResponseBuilderOps(v: HeadObjectResponse.Builder): HeadObjectResponseBuilderOps =
    new HeadObjectResponseBuilderOps(v)

  implicit def toHeadObjectResponseOps(v: HeadObjectResponse): HeadObjectResponseOps = new HeadObjectResponseOps(v)

}
