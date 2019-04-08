// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectResponseBuilderOps(val self: GetObjectResponse.Builder) extends AnyVal {

  final def deleteMarkerAsScala(value: Option[Boolean]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.deleteMarker(v)
    }
  } // Boolean

  final def acceptRangesAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.acceptRanges(v)
    }
  } // String

  final def expirationAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  } // String

  final def restoreAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.restore(v)
    }
  } // String

  final def lastModifiedAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // java.time.Instant

  final def contentLengthAsScala(value: Option[Long]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLength(v)
    }
  } // Long

  final def eTagAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def missingMetaAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.missingMeta(v)
    }
  } // Int

  final def versionIdAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def cacheControlAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  } // String

  final def contentDispositionAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  } // String

  final def contentEncodingAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  } // String

  final def contentLanguageAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  } // String

  final def contentRangeAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentRange(v)
    }
  } // String

  final def contentTypeAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  } // String

  final def expiresAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // java.time.Instant

  final def websiteRedirectLocationAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  } // String

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // ServerSideEncryption

  final def metadataAsScala(value: Option[Map[String, String]]): GetObjectResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    } // Map[String, String]
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def ssekmsKeyIdAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def storageClassAsScala(value: Option[StorageClass]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // StorageClass

  final def requestChargedAsScala(value: Option[RequestCharged]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // RequestCharged

  final def replicationStatusAsScala(value: Option[ReplicationStatus]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.replicationStatus(v)
    }
  } // ReplicationStatus

  final def partsCountAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.partsCount(v)
    }
  } // Int

  final def tagCountAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.tagCount(v)
    }
  } // Int

  final def objectLockModeAsScala(value: Option[ObjectLockMode]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  } // ObjectLockMode

  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  } // java.time.Instant

  final def objectLockLegalHoldStatusAsScala(value: Option[ObjectLockLegalHoldStatus]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  } // ObjectLockLegalHoldStatus

}

final class GetObjectResponseOps(val self: GetObjectResponse) extends AnyVal {

  final def deleteMarkerAsScala: Option[Boolean] = Option(self.deleteMarker) // Boolean

  final def acceptRangesAsScala: Option[String] = Option(self.acceptRanges) // String

  final def expirationAsScala: Option[String] = Option(self.expiration) // String

  final def restoreAsScala: Option[String] = Option(self.restore) // String

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified) // java.time.Instant

  final def contentLengthAsScala: Option[Long] = Option(self.contentLength) // Long

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def missingMetaAsScala: Option[Int] = Option(self.missingMeta) // Int

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl) // String

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition) // String

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding) // String

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage) // String

  final def contentRangeAsScala: Option[String] = Option(self.contentRange) // String

  final def contentTypeAsScala: Option[String] = Option(self.contentType) // String

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires) // java.time.Instant

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation) // String

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] =
    Option(self.serverSideEncryption) // ServerSideEncryption

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // StorageClass

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // RequestCharged

  final def replicationStatusAsScala: Option[ReplicationStatus] = Option(self.replicationStatus) // ReplicationStatus

  final def partsCountAsScala: Option[Int] = Option(self.partsCount) // Int

  final def tagCountAsScala: Option[Int] = Option(self.tagCount) // Int

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode) // ObjectLockMode

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] =
    Option(self.objectLockRetainUntilDate) // java.time.Instant

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] =
    Option(self.objectLockLegalHoldStatus) // ObjectLockLegalHoldStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectResponseOps {

  implicit def toGetObjectResponseBuilderOps(v: GetObjectResponse.Builder): GetObjectResponseBuilderOps =
    new GetObjectResponseBuilderOps(v)

  implicit def toGetObjectResponseOps(v: GetObjectResponse): GetObjectResponseOps = new GetObjectResponseOps(v)

}
