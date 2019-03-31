package com.github.j5ik2o.reactive.aws.s3.model

final case class AnalyticsS3BucketDestination(
    format: Option[AnalyticsS3ExportFileFormat] = None,
    bucketAccountId: Option[String] = None,
    bucket: Option[String] = None,
    prefix: Option[String] = None
) {
  def withFormat(value: Option[AnalyticsS3ExportFileFormat]): AnalyticsS3BucketDestination =
    copy(format = value)
  def withBucketAccountId(value: Option[String]): AnalyticsS3BucketDestination =
    copy(bucketAccountId = value)
  def withBucket(value: Option[String]): AnalyticsS3BucketDestination =
    copy(bucket = value)
  def withPrefix(value: Option[String]): AnalyticsS3BucketDestination =
    copy(prefix = value)
}
