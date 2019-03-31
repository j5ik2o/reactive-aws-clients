// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketNotificationConfigurationRequest => ScalaGetBucketNotificationConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketNotificationConfigurationRequest => JavaGetBucketNotificationConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketNotificationConfigurationRequestOps {

  implicit class ScalaGetBucketNotificationConfigurationRequestOps(
      val self: ScalaGetBucketNotificationConfigurationRequest
  ) extends AnyVal {

    def toJava: JavaGetBucketNotificationConfigurationRequest = {
      val result = JavaGetBucketNotificationConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
