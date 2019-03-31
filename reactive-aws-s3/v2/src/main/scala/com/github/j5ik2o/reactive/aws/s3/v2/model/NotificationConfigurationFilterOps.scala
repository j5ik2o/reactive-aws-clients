// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  NotificationConfigurationFilter => ScalaNotificationConfigurationFilter,
  _
}
import software.amazon.awssdk.services.s3.model.{
  NotificationConfigurationFilter => JavaNotificationConfigurationFilter
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object NotificationConfigurationFilterOps {

  implicit class ScalaNotificationConfigurationFilterOps(val self: ScalaNotificationConfigurationFilter)
      extends AnyVal {

    def toJava: JavaNotificationConfigurationFilter = {
      val result = JavaNotificationConfigurationFilter.builder()
      self.key.foreach { v =>
        import S3KeyFilterOps._; result.key(v.toJava)
      } // S3KeyFilter

      result.build()
    }

  }

  implicit class JavaNotificationConfigurationFilterOps(val self: JavaNotificationConfigurationFilter) extends AnyVal {

    def toScala: ScalaNotificationConfigurationFilter = {
      ScalaNotificationConfigurationFilter()
        .withKey(Option(self.key).map { v =>
          import S3KeyFilterOps._; v.toScala
        }) // S3KeyFilter
    }

  }

}
