// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectAclRequest => ScalaPutObjectAclRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectAclRequest => JavaPutObjectAclRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectAclRequestOps {

  implicit class ScalaPutObjectAclRequestOps(val self: ScalaPutObjectAclRequest) extends AnyVal {

    def toJava: JavaPutObjectAclRequest = {
      val result = JavaPutObjectAclRequest.builder()
      self.acl.foreach { v =>
        import ObjectCannedACLOps._; result.acl(v.toJava)
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
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                           // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String

      result.build()
    }

  }

}
