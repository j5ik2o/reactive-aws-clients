// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutObjectLockConfigurationRequest => ScalaPutObjectLockConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutObjectLockConfigurationRequest => JavaPutObjectLockConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectLockConfigurationRequestOps {

  implicit class ScalaPutObjectLockConfigurationRequestOps(val self: ScalaPutObjectLockConfigurationRequest)
      extends AnyVal {

    def toJava: JavaPutObjectLockConfigurationRequest = {
      val result = JavaPutObjectLockConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.objectLockConfiguration.foreach { v =>
        import ObjectLockConfigurationOps._; result.objectLockConfiguration(v.toJava)
      } // ObjectLockConfiguration
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.token.filter(_.nonEmpty).foreach(v => result.token(v))           // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String

      result.build()
    }

  }

}
