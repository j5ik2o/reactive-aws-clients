package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketNotificationConfigurationRequest(
    bucket: Option[String] = None,
    notificationConfiguration: Option[NotificationConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketNotificationConfigurationRequest =
    copy(bucket = value)
  def withNotificationConfiguration(
      value: Option[NotificationConfiguration]
  ): PutBucketNotificationConfigurationRequest =
    copy(notificationConfiguration = value)
}
