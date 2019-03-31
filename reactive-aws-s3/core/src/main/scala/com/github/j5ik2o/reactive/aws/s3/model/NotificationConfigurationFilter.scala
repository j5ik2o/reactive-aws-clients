package com.github.j5ik2o.reactive.aws.s3.model

final case class NotificationConfigurationFilter(
    key: Option[S3KeyFilter] = None
) {
  def withKey(value: Option[S3KeyFilter]): NotificationConfigurationFilter =
    copy(key = value)
}
