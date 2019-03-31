package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketWebsiteRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    websiteConfiguration: Option[WebsiteConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketWebsiteRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketWebsiteRequest =
    copy(contentMD5 = value)
  def withWebsiteConfiguration(value: Option[WebsiteConfiguration]): PutBucketWebsiteRequest =
    copy(websiteConfiguration = value)
}
