package com.github.j5ik2o.reactive.aws.s3.model

final case class UploadPartCopyRequest(
    bucket: Option[String] = None,
    copySource: Option[String] = None,
    copySourceIfMatch: Option[String] = None,
    copySourceIfModifiedSince: Option[java.time.Instant] = None,
    copySourceIfNoneMatch: Option[String] = None,
    copySourceIfUnmodifiedSince: Option[java.time.Instant] = None,
    copySourceRange: Option[String] = None,
    key: Option[String] = None,
    partNumber: Option[Int] = None,
    uploadId: Option[String] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKey: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    copySourceSSECustomerAlgorithm: Option[String] = None,
    copySourceSSECustomerKey: Option[String] = None,
    copySourceSSECustomerKeyMD5: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): UploadPartCopyRequest =
    copy(bucket = value)
  def withCopySource(value: Option[String]): UploadPartCopyRequest =
    copy(copySource = value)
  def withCopySourceIfMatch(value: Option[String]): UploadPartCopyRequest =
    copy(copySourceIfMatch = value)
  def withCopySourceIfModifiedSince(value: Option[java.time.Instant]): UploadPartCopyRequest =
    copy(copySourceIfModifiedSince = value)
  def withCopySourceIfNoneMatch(value: Option[String]): UploadPartCopyRequest =
    copy(copySourceIfNoneMatch = value)
  def withCopySourceIfUnmodifiedSince(value: Option[java.time.Instant]): UploadPartCopyRequest =
    copy(copySourceIfUnmodifiedSince = value)
  def withCopySourceRange(value: Option[String]): UploadPartCopyRequest =
    copy(copySourceRange = value)
  def withKey(value: Option[String]): UploadPartCopyRequest =
    copy(key = value)
  def withPartNumber(value: Option[Int]): UploadPartCopyRequest =
    copy(partNumber = value)
  def withUploadId(value: Option[String]): UploadPartCopyRequest =
    copy(uploadId = value)
  def withSseCustomerAlgorithm(value: Option[String]): UploadPartCopyRequest =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKey(value: Option[String]): UploadPartCopyRequest =
    copy(sseCustomerKey = value)
  def withSseCustomerKeyMD5(value: Option[String]): UploadPartCopyRequest =
    copy(sseCustomerKeyMD5 = value)
  def withCopySourceSSECustomerAlgorithm(value: Option[String]): UploadPartCopyRequest =
    copy(copySourceSSECustomerAlgorithm = value)
  def withCopySourceSSECustomerKey(value: Option[String]): UploadPartCopyRequest =
    copy(copySourceSSECustomerKey = value)
  def withCopySourceSSECustomerKeyMD5(value: Option[String]): UploadPartCopyRequest =
    copy(copySourceSSECustomerKeyMD5 = value)
  def withRequestPayer(value: Option[RequestPayer]): UploadPartCopyRequest =
    copy(requestPayer = value)
}
