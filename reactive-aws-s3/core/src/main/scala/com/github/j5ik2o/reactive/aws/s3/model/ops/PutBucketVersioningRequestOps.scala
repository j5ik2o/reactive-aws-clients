// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketVersioningRequest => ScalaPutBucketVersioningRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketVersioningRequest => JavaPutBucketVersioningRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketVersioningRequestOps {

  implicit class ScalaPutBucketVersioningRequestOps(val self: ScalaPutBucketVersioningRequest) extends AnyVal {

    def toJava: JavaPutBucketVersioningRequest = {
      val result = JavaPutBucketVersioningRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.mfa.filter(_.nonEmpty).foreach(v => result.mfa(v))               // String
      self.versioningConfiguration.foreach { v =>
        import VersioningConfigurationOps._; result.versioningConfiguration(v.toJava)
      } // VersioningConfiguration

      result.build()
    }

  }

}
