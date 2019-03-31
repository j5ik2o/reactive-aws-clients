package com.github.j5ik2o.reactive.aws.s3.model

final case class UploadPartRequest(
    bucket: Option[String] = None,
    contentLength: Option[Long] = None,
    contentMD5: Option[String] = None,
    key: Option[String] = None,
    partNumber: Option[Int] = None,
    uploadId: Option[String] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKey: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): UploadPartRequest =
    copy(bucket = value)
  def withContentLength(value: Option[Long]): UploadPartRequest =
    copy(contentLength = value)
  def withContentMD5(value: Option[String]): UploadPartRequest =
    copy(contentMD5 = value)
  def withKey(value: Option[String]): UploadPartRequest =
    copy(key = value)
  def withPartNumber(value: Option[Int]): UploadPartRequest =
    copy(partNumber = value)
  def withUploadId(value: Option[String]): UploadPartRequest =
    copy(uploadId = value)
  def withSseCustomerAlgorithm(value: Option[String]): UploadPartRequest =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKey(value: Option[String]): UploadPartRequest =
    copy(sseCustomerKey = value)
  def withSseCustomerKeyMD5(value: Option[String]): UploadPartRequest =
    copy(sseCustomerKeyMD5 = value)
  def withRequestPayer(value: Option[RequestPayer]): UploadPartRequest =
    copy(requestPayer = value)
}
