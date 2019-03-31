// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketEncryptionRequest => ScalaPutBucketEncryptionRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketEncryptionRequest => JavaPutBucketEncryptionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketEncryptionRequestOps {

  implicit class ScalaPutBucketEncryptionRequestOps(val self: ScalaPutBucketEncryptionRequest) extends AnyVal {

    def toJava: JavaPutBucketEncryptionRequest = {
      val result = JavaPutBucketEncryptionRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.serverSideEncryptionConfiguration.foreach { v =>
        import ServerSideEncryptionConfigurationOps._; result.serverSideEncryptionConfiguration(v.toJava)
      } // ServerSideEncryptionConfiguration

      result.build()
    }

  }

}
