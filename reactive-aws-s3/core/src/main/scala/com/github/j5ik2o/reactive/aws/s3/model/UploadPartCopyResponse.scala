package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class UploadPartCopyResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    copySourceVersionId: Option[String] = None,
    copyPartResult: Option[CopyPartResult] = None,
    serverSideEncryption: Option[ServerSideEncryption] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    ssekmsKeyId: Option[String] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UploadPartCopyResponse
  override def withStatusCode(value: Option[Int]): UploadPartCopyResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UploadPartCopyResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UploadPartCopyResponse =
    copy(httpHeaders = value)
  def withCopySourceVersionId(value: Option[String]): UploadPartCopyResponse =
    copy(copySourceVersionId = value)
  def withCopyPartResult(value: Option[CopyPartResult]): UploadPartCopyResponse =
    copy(copyPartResult = value)
  def withServerSideEncryption(value: Option[ServerSideEncryption]): UploadPartCopyResponse =
    copy(serverSideEncryption = value)
  def withSseCustomerAlgorithm(value: Option[String]): UploadPartCopyResponse =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKeyMD5(value: Option[String]): UploadPartCopyResponse =
    copy(sseCustomerKeyMD5 = value)
  def withSsekmsKeyId(value: Option[String]): UploadPartCopyResponse =
    copy(ssekmsKeyId = value)
  def withRequestCharged(value: Option[RequestCharged]): UploadPartCopyResponse =
    copy(requestCharged = value)
}
