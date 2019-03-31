package com.github.j5ik2o.reactive.aws.s3.model

final case class CompleteMultipartUploadRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    multipartUpload: Option[CompletedMultipartUpload] = None,
    uploadId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): CompleteMultipartUploadRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): CompleteMultipartUploadRequest =
    copy(key = value)
  def withMultipartUpload(value: Option[CompletedMultipartUpload]): CompleteMultipartUploadRequest =
    copy(multipartUpload = value)
  def withUploadId(value: Option[String]): CompleteMultipartUploadRequest =
    copy(uploadId = value)
  def withRequestPayer(value: Option[RequestPayer]): CompleteMultipartUploadRequest =
    copy(requestPayer = value)
}
