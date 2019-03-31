package com.github.j5ik2o.reactive.aws.s3.model

final case class AnalyticsExportDestination(
    s3BucketDestination: Option[AnalyticsS3BucketDestination] = None
) {
  def withS3BucketDestination(value: Option[AnalyticsS3BucketDestination]): AnalyticsExportDestination =
    copy(s3BucketDestination = value)
}
