// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketNotificationConfigurationRequestBuilderOps(
    val self: PutBucketNotificationConfigurationRequest.Builder
) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketNotificationConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def notificationConfigurationAsScala(
      value: Option[NotificationConfiguration]
  ): PutBucketNotificationConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.notificationConfiguration(v)
    }
  } // NotificationConfiguration

}

final class PutBucketNotificationConfigurationRequestOps(val self: PutBucketNotificationConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def notificationConfigurationAsScala: Option[NotificationConfiguration] =
    Option(self.notificationConfiguration) // NotificationConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketNotificationConfigurationRequestOps {

  implicit def toPutBucketNotificationConfigurationRequestBuilderOps(
      v: PutBucketNotificationConfigurationRequest.Builder
  ): PutBucketNotificationConfigurationRequestBuilderOps = new PutBucketNotificationConfigurationRequestBuilderOps(v)

  implicit def toPutBucketNotificationConfigurationRequestOps(
      v: PutBucketNotificationConfigurationRequest
  ): PutBucketNotificationConfigurationRequestOps = new PutBucketNotificationConfigurationRequestOps(v)

}
