// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetObjectLockConfigurationRequest => ScalaGetObjectLockConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetObjectLockConfigurationRequest => JavaGetObjectLockConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectLockConfigurationRequestOps {

  implicit class ScalaGetObjectLockConfigurationRequestOps(val self: ScalaGetObjectLockConfigurationRequest)
      extends AnyVal {

    def toJava: JavaGetObjectLockConfigurationRequest = {
      val result = JavaGetObjectLockConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
