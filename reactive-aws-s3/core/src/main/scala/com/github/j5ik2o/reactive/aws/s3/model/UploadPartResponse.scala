package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class UploadPartResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    serverSideEncryption: Option[ServerSideEncryption] = None,
    eTag: Option[String] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    ssekmsKeyId: Option[String] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UploadPartResponse
  override def withStatusCode(value: Option[Int]): UploadPartResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UploadPartResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UploadPartResponse =
    copy(httpHeaders = value)
  def withServerSideEncryption(value: Option[ServerSideEncryption]): UploadPartResponse =
    copy(serverSideEncryption = value)
  def withETag(value: Option[String]): UploadPartResponse =
    copy(eTag = value)
  def withSseCustomerAlgorithm(value: Option[String]): UploadPartResponse =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKeyMD5(value: Option[String]): UploadPartResponse =
    copy(sseCustomerKeyMD5 = value)
  def withSsekmsKeyId(value: Option[String]): UploadPartResponse =
    copy(ssekmsKeyId = value)
  def withRequestCharged(value: Option[RequestCharged]): UploadPartResponse =
    copy(requestCharged = value)
}
