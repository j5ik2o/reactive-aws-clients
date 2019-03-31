// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketAclRequest => ScalaPutBucketAclRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketAclRequest => JavaPutBucketAclRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketAclRequestOps {

  implicit class ScalaPutBucketAclRequestOps(val self: ScalaPutBucketAclRequest) extends AnyVal {

    def toJava: JavaPutBucketAclRequest = {
      val result = JavaPutBucketAclRequest.builder()
      self.acl.foreach { v =>
        import BucketCannedACLOps._; result.acl(v.toJava)
      } // String
      self.accessControlPolicy.foreach { v =>
        import AccessControlPolicyOps._; result.accessControlPolicy(v.toJava)
      } // AccessControlPolicy
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                     // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v))             // String
      self.grantFullControl.filter(_.nonEmpty).foreach(v => result.grantFullControl(v)) // String
      self.grantRead.filter(_.nonEmpty).foreach(v => result.grantRead(v))               // String
      self.grantReadACP.filter(_.nonEmpty).foreach(v => result.grantReadACP(v))         // String
      self.grantWrite.filter(_.nonEmpty).foreach(v => result.grantWrite(v))             // String
      self.grantWriteACP.filter(_.nonEmpty).foreach(v => result.grantWriteACP(v))       // String

      result.build()
    }

  }

}
