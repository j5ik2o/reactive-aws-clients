// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectResponseBuilderOps(val self: GetObjectResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteMarkerAsScala(value: Option[Boolean]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.deleteMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptRangesAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.acceptRanges(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.expiration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.restore(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentLengthAsScala(value: Option[Long]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.contentLength(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.eTag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def missingMetaAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.missingMeta(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cacheControlAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.cacheControl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentDispositionAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.contentDisposition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentEncodingAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.contentEncoding(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentLanguageAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.contentLanguage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentRangeAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.contentRange(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentTypeAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.contentType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.expires(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def websiteRedirectLocationAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.websiteRedirectLocation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.serverSideEncryption(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataAsScala(value: Option[Map[String, String]]): GetObjectResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metadata(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.sseCustomerAlgorithm(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.sseCustomerKeyMD5(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala(value: Option[String]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.ssekmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala(value: Option[StorageClass]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.storageClass(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.requestCharged(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationStatusAsScala(value: Option[ReplicationStatus]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.replicationStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partsCountAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.partsCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagCountAsScala(value: Option[Int]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.tagCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockModeAsScala(value: Option[ObjectLockMode]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.objectLockMode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.objectLockRetainUntilDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockLegalHoldStatusAsScala(value: Option[ObjectLockLegalHoldStatus]): GetObjectResponse.Builder = {
    value.fold(self) { v => self.objectLockLegalHoldStatus(v) }
  }

}

final class GetObjectResponseOps(val self: GetObjectResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteMarkerAsScala: Option[Boolean] = Option(self.deleteMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptRangesAsScala: Option[String] = Option(self.acceptRanges)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationAsScala: Option[String] = Option(self.expiration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreAsScala: Option[String] = Option(self.restore)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[java.time.Instant] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentLengthAsScala: Option[Long] = Option(self.contentLength)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala: Option[String] = Option(self.eTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def missingMetaAsScala: Option[Int] = Option(self.missingMeta)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cacheControlAsScala: Option[String] = Option(self.cacheControl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentRangeAsScala: Option[String] = Option(self.contentRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentTypeAsScala: Option[String] = Option(self.contentType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataAsScala: Option[Map[String, String]] =
    Option(self.metadata).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationStatusAsScala: Option[ReplicationStatus] = Option(self.replicationStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partsCountAsScala: Option[Int] = Option(self.partsCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagCountAsScala: Option[Int] = Option(self.tagCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] = Option(self.objectLockRetainUntilDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] = Option(self.objectLockLegalHoldStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectResponseOps {

  implicit def toGetObjectResponseBuilderOps(v: GetObjectResponse.Builder): GetObjectResponseBuilderOps =
    new GetObjectResponseBuilderOps(v)

  implicit def toGetObjectResponseOps(v: GetObjectResponse): GetObjectResponseOps = new GetObjectResponseOps(v)

}
