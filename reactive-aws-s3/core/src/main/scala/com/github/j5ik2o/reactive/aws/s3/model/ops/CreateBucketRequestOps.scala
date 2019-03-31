// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ CreateBucketRequest => ScalaCreateBucketRequest, _ }
import software.amazon.awssdk.services.s3.model.{ CreateBucketRequest => JavaCreateBucketRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateBucketRequestOps {

  implicit class ScalaCreateBucketRequestOps(val self: ScalaCreateBucketRequest) extends AnyVal {

    def toJava: JavaCreateBucketRequest = {
      val result = JavaCreateBucketRequest.builder()
      self.acl.foreach { v =>
        import BucketCannedACLOps._; result.acl(v.toJava)
      } // String
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.createBucketConfiguration.foreach { v =>
        import CreateBucketConfigurationOps._; result.createBucketConfiguration(v.toJava)
      } // CreateBucketConfiguration
      self.grantFullControl.filter(_.nonEmpty).foreach(v => result.grantFullControl(v))                      // String
      self.grantRead.filter(_.nonEmpty).foreach(v => result.grantRead(v))                                    // String
      self.grantReadACP.filter(_.nonEmpty).foreach(v => result.grantReadACP(v))                              // String
      self.grantWrite.filter(_.nonEmpty).foreach(v => result.grantWrite(v))                                  // String
      self.grantWriteACP.filter(_.nonEmpty).foreach(v => result.grantWriteACP(v))                            // String
      self.objectLockEnabledForBucket.map(_.booleanValue).foreach(v => result.objectLockEnabledForBucket(v)) // Boolean

      result.build()
    }

  }

}
