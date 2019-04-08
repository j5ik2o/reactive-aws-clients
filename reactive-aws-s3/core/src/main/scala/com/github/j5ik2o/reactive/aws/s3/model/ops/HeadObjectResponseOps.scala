// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class HeadObjectResponseBuilderOps(val self: HeadObjectResponse.Builder) extends AnyVal {

  final def deleteMarkerAsScala(value: Option[Boolean]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.deleteMarker(v)
    }
  }

  final def acceptRangesAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.acceptRanges(v)
    }
  }

  final def expirationAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  }

  final def restoreAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.restore(v)
    }
  }

  final def lastModifiedAsScala(value: Option[java.time.Instant]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  final def contentLengthAsScala(value: Option[Long]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLength(v)
    }
  }

  final def eTagAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  }

  final def missingMetaAsScala(value: Option[Int]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.missingMeta(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def cacheControlAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  }

  final def contentDispositionAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  }

  final def contentEncodingAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  }

  final def contentLanguageAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  }

  final def contentTypeAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  }

  final def expiresAsScala(value: Option[java.time.Instant]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  }

  final def websiteRedirectLocationAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def metadataAsScala(value: Option[Map[String, String]]): HeadObjectResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metadata(v.asJava)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def storageClassAsScala(value: Option[StorageClass]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

  final def replicationStatusAsScala(value: Option[ReplicationStatus]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.replicationStatus(v)
    }
  }

  final def partsCountAsScala(value: Option[Int]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.partsCount(v)
    }
  }

  final def objectLockModeAsScala(value: Option[ObjectLockMode]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  }

  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  }

  final def objectLockLegalHoldStatusAsScala(value: Option[ObjectLockLegalHoldStatus]): HeadObjectResponse.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  }

}

final class HeadObjectResponseOps(val self: HeadObjectResponse) extends AnyVal {

  final def deleteMarkerAsScala: Option[Boolean] = Option(self.deleteMarker)

  final def acceptRangesAsScala: Option[String] = Option(self.acceptRanges)

  final def expirationAsScala: Option[String] = Option(self.expiration)

  final def restoreAsScala: Option[String] = Option(self.restore)

  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  final def contentLengthAsScala: Option[Long] = Option(self.contentLength)

  final def eTagAsScala: Option[String] = Option(self.eTag)

  final def missingMetaAsScala: Option[Int] = Option(self.missingMeta)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def cacheControlAsScala: Option[String] = Option(self.cacheControl)

  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition)

  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding)

  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage)

  final def contentTypeAsScala: Option[String] = Option(self.contentType)

  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires)

  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation)

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

  final def replicationStatusAsScala: Option[ReplicationStatus] = Option(self.replicationStatus)

  final def partsCountAsScala: Option[Int] = Option(self.partsCount)

  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode)

  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] = Option(self.objectLockRetainUntilDate)

  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] = Option(self.objectLockLegalHoldStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHeadObjectResponseOps {

  implicit def toHeadObjectResponseBuilderOps(v: HeadObjectResponse.Builder): HeadObjectResponseBuilderOps =
    new HeadObjectResponseBuilderOps(v)

  implicit def toHeadObjectResponseOps(v: HeadObjectResponse): HeadObjectResponseOps = new HeadObjectResponseOps(v)

}
