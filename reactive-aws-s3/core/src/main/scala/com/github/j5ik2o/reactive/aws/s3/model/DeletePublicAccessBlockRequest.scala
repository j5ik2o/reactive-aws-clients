package com.github.j5ik2o.reactive.aws.s3.model

final case class DeletePublicAccessBlockRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeletePublicAccessBlockRequest =
    copy(bucket = value)
}
