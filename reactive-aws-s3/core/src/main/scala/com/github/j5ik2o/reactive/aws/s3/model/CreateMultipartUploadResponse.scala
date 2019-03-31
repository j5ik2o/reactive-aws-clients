package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class CreateMultipartUploadResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    abortDate: Option[java.time.Instant] = None,
    abortRuleId: Option[String] = None,
    bucket: Option[String] = None,
    key: Option[String] = None,
    uploadId: Option[String] = None,
    serverSideEncryption: Option[ServerSideEncryption] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    ssekmsKeyId: Option[String] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = CreateMultipartUploadResponse
  override def withStatusCode(value: Option[Int]): CreateMultipartUploadResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CreateMultipartUploadResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CreateMultipartUploadResponse =
    copy(httpHeaders = value)
  def withAbortDate(value: Option[java.time.Instant]): CreateMultipartUploadResponse =
    copy(abortDate = value)
  def withAbortRuleId(value: Option[String]): CreateMultipartUploadResponse =
    copy(abortRuleId = value)
  def withBucket(value: Option[String]): CreateMultipartUploadResponse =
    copy(bucket = value)
  def withKey(value: Option[String]): CreateMultipartUploadResponse =
    copy(key = value)
  def withUploadId(value: Option[String]): CreateMultipartUploadResponse =
    copy(uploadId = value)
  def withServerSideEncryption(value: Option[ServerSideEncryption]): CreateMultipartUploadResponse =
    copy(serverSideEncryption = value)
  def withSseCustomerAlgorithm(value: Option[String]): CreateMultipartUploadResponse =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKeyMD5(value: Option[String]): CreateMultipartUploadResponse =
    copy(sseCustomerKeyMD5 = value)
  def withSsekmsKeyId(value: Option[String]): CreateMultipartUploadResponse =
    copy(ssekmsKeyId = value)
  def withRequestCharged(value: Option[RequestCharged]): CreateMultipartUploadResponse =
    copy(requestCharged = value)
}
