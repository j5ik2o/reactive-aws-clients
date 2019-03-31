package com.github.j5ik2o.reactive.aws.s3.model

final case class AbortMultipartUploadRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    uploadId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): AbortMultipartUploadRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): AbortMultipartUploadRequest =
    copy(key = value)
  def withUploadId(value: Option[String]): AbortMultipartUploadRequest =
    copy(uploadId = value)
  def withRequestPayer(value: Option[RequestPayer]): AbortMultipartUploadRequest =
    copy(requestPayer = value)
}
