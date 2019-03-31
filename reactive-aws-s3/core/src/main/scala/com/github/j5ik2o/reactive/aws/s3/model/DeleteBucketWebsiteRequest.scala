package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketWebsiteRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketWebsiteRequest =
    copy(bucket = value)
}
