// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectRetentionRequest => ScalaPutObjectRetentionRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectRetentionRequest => JavaPutObjectRetentionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectRetentionRequestOps {

  implicit class ScalaPutObjectRetentionRequestOps(val self: ScalaPutObjectRetentionRequest) extends AnyVal {

    def toJava: JavaPutObjectRetentionRequest = {
      val result = JavaPutObjectRetentionRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))       // String
      self.retention.foreach { v =>
        import ObjectLockRetentionOps._; result.retention(v.toJava)
      } // ObjectLockRetention
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v))                                  // String
      self.bypassGovernanceRetention.map(_.booleanValue).foreach(v => result.bypassGovernanceRetention(v)) // Boolean
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v))                                // String

      result.build()
    }

  }

}
