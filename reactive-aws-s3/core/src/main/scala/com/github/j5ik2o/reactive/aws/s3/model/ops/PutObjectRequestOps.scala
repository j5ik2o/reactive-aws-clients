// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectRequest => ScalaPutObjectRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectRequest => JavaPutObjectRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectRequestOps {

  implicit class ScalaPutObjectRequestOps(val self: ScalaPutObjectRequest) extends AnyVal {

    def toJava: JavaPutObjectRequest = {
      val result = JavaPutObjectRequest.builder()
      self.acl.foreach { v =>
        import ObjectCannedACLOps._; result.acl(v.toJava)
      } // String
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                         // String
      self.cacheControl.filter(_.nonEmpty).foreach(v => result.cacheControl(v))             // String
      self.contentDisposition.filter(_.nonEmpty).foreach(v => result.contentDisposition(v)) // String
      self.contentEncoding.filter(_.nonEmpty).foreach(v => result.contentEncoding(v))       // String
      self.contentLanguage.filter(_.nonEmpty).foreach(v => result.contentLanguage(v))       // String
      self.contentLength.map(_.longValue).foreach(v => result.contentLength(v))             // Long
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v))                 // String
      self.contentType.filter(_.nonEmpty).foreach(v => result.contentType(v))               // String
      self.expires.foreach(v => result.expires(v))                                          // Instant
      self.grantFullControl.filter(_.nonEmpty).foreach(v => result.grantFullControl(v))     // String
      self.grantRead.filter(_.nonEmpty).foreach(v => result.grantRead(v))                   // String
      self.grantReadACP.filter(_.nonEmpty).foreach(v => result.grantReadACP(v))             // String
      self.grantWriteACP.filter(_.nonEmpty).foreach(v => result.grantWriteACP(v))           // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                               // String
      self.metadata.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.metadata(v.asJava)
      } // Map[String, String]
      self.serverSideEncryption.foreach { v =>
        import ServerSideEncryptionOps._; result.serverSideEncryption(v.toJava)
      } // String
      self.storageClass.foreach { v =>
        import StorageClassOps._; result.storageClass(v.toJava)
      } // String
      self.websiteRedirectLocation.filter(_.nonEmpty).foreach(v => result.websiteRedirectLocation(v)) // String
      self.sseCustomerAlgorithm.filter(_.nonEmpty).foreach(v => result.sseCustomerAlgorithm(v))       // String
      self.sseCustomerKey.filter(_.nonEmpty).foreach(v => result.sseCustomerKey(v))                   // String
      self.sseCustomerKeyMD5.filter(_.nonEmpty).foreach(v => result.sseCustomerKeyMD5(v))             // String
      self.ssekmsKeyId.filter(_.nonEmpty).foreach(v => result.ssekmsKeyId(v))                         // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.tagging.filter(_.nonEmpty).foreach(v => result.tagging(v)) // String
      self.objectLockMode.foreach { v =>
        import ObjectLockModeOps._; result.objectLockMode(v.toJava)
      } // String
      self.objectLockRetainUntilDate.foreach(v => result.objectLockRetainUntilDate(v)) // Instant
      self.objectLockLegalHoldStatus.foreach { v =>
        import ObjectLockLegalHoldStatusOps._; result.objectLockLegalHoldStatus(v.toJava)
      } // String

      result.build()
    }

  }

}
