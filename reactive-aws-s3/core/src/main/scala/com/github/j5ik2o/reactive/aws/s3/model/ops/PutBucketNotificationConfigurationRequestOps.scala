// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketNotificationConfigurationRequest => ScalaPutBucketNotificationConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketNotificationConfigurationRequest => JavaPutBucketNotificationConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketNotificationConfigurationRequestOps {

  implicit class ScalaPutBucketNotificationConfigurationRequestOps(
      val self: ScalaPutBucketNotificationConfigurationRequest
  ) extends AnyVal {

    def toJava: JavaPutBucketNotificationConfigurationRequest = {
      val result = JavaPutBucketNotificationConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.notificationConfiguration.foreach { v =>
        import NotificationConfigurationOps._; result.notificationConfiguration(v.toJava)
      } // NotificationConfiguration

      result.build()
    }

  }

}
