// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectResponseBuilderOps(val self: GetObjectResponse.Builder) extends AnyVal {

  final def withDeleteMarkerAsScala(value: Option[Boolean]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.deleteMarker(v)
    }
  } // Boolean

  final def withAcceptRangesAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.acceptRanges(v)
    }
  } // String

  final def withExpirationAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  } // String

  final def withRestoreAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.restore(v)
    }
  } // String

  final def withLastModifiedAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // Instant

  final def withContentLengthAsScala(value: Option[Long]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLength(v)
    }
  } // Long

  final def withETagAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def withMissingMetaAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.missingMeta(v)
    }
  } // Int

  final def withVersionIdAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withCacheControlAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  } // String

  final def withContentDispositionAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  } // String

  final def withContentEncodingAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  } // String

  final def withContentLanguageAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  } // String

  final def withContentRangeAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentRange(v)
    }
  } // String

  final def withContentTypeAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  } // String

  final def withExpiresAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // Instant

  final def withWebsiteRedirectLocationAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  } // String

  final def withServerSideEncryptionAsScala(value: Option[ServerSideEncryption]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def withMetadataAsScala(value: Option[Map[String, String]]): GetObjectResponse.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    } // Map[String, String]
  }

  final def withSseCustomerAlgorithmAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def withSseCustomerKeyMD5AsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def withSsekmsKeyIdAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def withStorageClassAsScala(value: Option[StorageClass]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

  final def withRequestChargedAsScala(value: Option[RequestCharged]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

  final def withReplicationStatusAsScala(value: Option[ReplicationStatus]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.replicationStatus(v)
    }
  } // String

  final def withPartsCountAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.partsCount(v)
    }
  } // Int

  final def withTagCountAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.tagCount(v)
    }
  } // Int

  final def withObjectLockModeAsScala(value: Option[ObjectLockMode]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  } // String

  final def withObjectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  } // Instant

  final def withObjectLockLegalHoldStatusAsScala(
      value: Option[ObjectLockLegalHoldStatus]
  ): GetObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  } // String

}

final class GetObjectResponseOps(val self: GetObjectResponse) extends AnyVal {

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

  final def contentRangeAsScala: Option[String] = Option(self.contentRange) // String

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

  final def tagCountAsScala: Option[Int] = Option(self.tagCount) // Int

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode) // String

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] =
    Option(self.objectLockRetainUntilDate) // Instant

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] =
    Option(self.objectLockLegalHoldStatus) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectResponseOps {

  implicit def toGetObjectResponseBuilderOps(v: GetObjectResponse.Builder): GetObjectResponseBuilderOps =
    new GetObjectResponseBuilderOps(v)

  implicit def toGetObjectResponseOps(v: GetObjectResponse): GetObjectResponseOps = new GetObjectResponseOps(v)

}
