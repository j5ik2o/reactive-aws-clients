package com.github.j5ik2o.reactive.aws.s3.model

final case class HeadObjectRequest(
    bucket: Option[String] = None,
    ifMatch: Option[String] = None,
    ifModifiedSince: Option[java.time.Instant] = None,
    ifNoneMatch: Option[String] = None,
    ifUnmodifiedSince: Option[java.time.Instant] = None,
    key: Option[String] = None,
    range: Option[String] = None,
    versionId: Option[String] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKey: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    requestPayer: Option[RequestPayer] = None,
    partNumber: Option[Int] = None
) {
  def withBucket(value: Option[String]): HeadObjectRequest =
    copy(bucket = value)
  def withIfMatch(value: Option[String]): HeadObjectRequest =
    copy(ifMatch = value)
  def withIfModifiedSince(value: Option[java.time.Instant]): HeadObjectRequest =
    copy(ifModifiedSince = value)
  def withIfNoneMatch(value: Option[String]): HeadObjectRequest =
    copy(ifNoneMatch = value)
  def withIfUnmodifiedSince(value: Option[java.time.Instant]): HeadObjectRequest =
    copy(ifUnmodifiedSince = value)
  def withKey(value: Option[String]): HeadObjectRequest =
    copy(key = value)
  def withRange(value: Option[String]): HeadObjectRequest =
    copy(range = value)
  def withVersionId(value: Option[String]): HeadObjectRequest =
    copy(versionId = value)
  def withSseCustomerAlgorithm(value: Option[String]): HeadObjectRequest =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKey(value: Option[String]): HeadObjectRequest =
    copy(sseCustomerKey = value)
  def withSseCustomerKeyMD5(value: Option[String]): HeadObjectRequest =
    copy(sseCustomerKeyMD5 = value)
  def withRequestPayer(value: Option[RequestPayer]): HeadObjectRequest =
    copy(requestPayer = value)
  def withPartNumber(value: Option[Int]): HeadObjectRequest =
    copy(partNumber = value)
}
