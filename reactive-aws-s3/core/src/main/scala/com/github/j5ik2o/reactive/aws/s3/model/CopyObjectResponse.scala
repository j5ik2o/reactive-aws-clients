package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class CopyObjectResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    copyObjectResult: Option[CopyObjectResult] = None,
    expiration: Option[String] = None,
    copySourceVersionId: Option[String] = None,
    versionId: Option[String] = None,
    serverSideEncryption: Option[ServerSideEncryption] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    ssekmsKeyId: Option[String] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = CopyObjectResponse
  override def withStatusCode(value: Option[Int]): CopyObjectResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CopyObjectResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CopyObjectResponse =
    copy(httpHeaders = value)
  def withCopyObjectResult(value: Option[CopyObjectResult]): CopyObjectResponse =
    copy(copyObjectResult = value)
  def withExpiration(value: Option[String]): CopyObjectResponse =
    copy(expiration = value)
  def withCopySourceVersionId(value: Option[String]): CopyObjectResponse =
    copy(copySourceVersionId = value)
  def withVersionId(value: Option[String]): CopyObjectResponse =
    copy(versionId = value)
  def withServerSideEncryption(value: Option[ServerSideEncryption]): CopyObjectResponse =
    copy(serverSideEncryption = value)
  def withSseCustomerAlgorithm(value: Option[String]): CopyObjectResponse =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKeyMD5(value: Option[String]): CopyObjectResponse =
    copy(sseCustomerKeyMD5 = value)
  def withSsekmsKeyId(value: Option[String]): CopyObjectResponse =
    copy(ssekmsKeyId = value)
  def withRequestCharged(value: Option[RequestCharged]): CopyObjectResponse =
    copy(requestCharged = value)
}
