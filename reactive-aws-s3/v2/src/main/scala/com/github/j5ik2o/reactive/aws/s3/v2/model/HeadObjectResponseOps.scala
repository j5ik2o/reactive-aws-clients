// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ HeadObjectResponse => ScalaHeadObjectResponse, _ }
import software.amazon.awssdk.services.s3.model.{ HeadObjectResponse => JavaHeadObjectResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object HeadObjectResponseOps {

  implicit class JavaHeadObjectResponseOps(val self: JavaHeadObjectResponse) extends AnyVal {

    def toScala: ScalaHeadObjectResponse = {
      ScalaHeadObjectResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withDeleteMarker(Option(self.deleteMarker).map(_.booleanValue)) // Boolean
        .withAcceptRanges(Option(self.acceptRanges)) // String
        .withExpiration(Option(self.expiration)) // String
        .withRestore(Option(self.restore)) // String
        .withLastModified(Option(self.lastModified)) // Instant
        .withContentLength(Option(self.contentLength).map(_.longValue)) // Long
        .withETag(Option(self.eTag)) // String
        .withMissingMeta(Option(self.missingMeta).map(_.intValue)) // Int
        .withVersionId(Option(self.versionId)) // String
        .withCacheControl(Option(self.cacheControl)) // String
        .withContentDisposition(Option(self.contentDisposition)) // String
        .withContentEncoding(Option(self.contentEncoding)) // String
        .withContentLanguage(Option(self.contentLanguage)) // String
        .withContentType(Option(self.contentType)) // String
        .withExpires(Option(self.expires)) // Instant
        .withWebsiteRedirectLocation(Option(self.websiteRedirectLocation)) // String
        .withServerSideEncryption(Option(self.serverSideEncryption).map { v =>
          import ServerSideEncryptionOps._; v.toScala
        }) // String
        .withMetadata(Option(self.metadata).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
        .withSseCustomerAlgorithm(Option(self.sseCustomerAlgorithm)) // String
        .withSseCustomerKeyMD5(Option(self.sseCustomerKeyMD5)) // String
        .withSsekmsKeyId(Option(self.ssekmsKeyId)) // String
        .withStorageClass(Option(self.storageClass).map { v =>
          import StorageClassOps._; v.toScala
        }) // String
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
        .withReplicationStatus(Option(self.replicationStatus).map { v =>
          import ReplicationStatusOps._; v.toScala
        }) // String
        .withPartsCount(Option(self.partsCount).map(_.intValue)) // Int
        .withObjectLockMode(Option(self.objectLockMode).map { v =>
          import ObjectLockModeOps._; v.toScala
        }) // String
        .withObjectLockRetainUntilDate(Option(self.objectLockRetainUntilDate)) // Instant
        .withObjectLockLegalHoldStatus(Option(self.objectLockLegalHoldStatus).map { v =>
          import ObjectLockLegalHoldStatusOps._; v.toScala
        }) // String
    }

  }

}
