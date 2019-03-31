package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutObjectResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    expiration: Option[String] = None,
    eTag: Option[String] = None,
    serverSideEncryption: Option[ServerSideEncryption] = None,
    versionId: Option[String] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    ssekmsKeyId: Option[String] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutObjectResponse
  override def withStatusCode(value: Option[Int]): PutObjectResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutObjectResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutObjectResponse =
    copy(httpHeaders = value)
  def withExpiration(value: Option[String]): PutObjectResponse =
    copy(expiration = value)
  def withETag(value: Option[String]): PutObjectResponse =
    copy(eTag = value)
  def withServerSideEncryption(value: Option[ServerSideEncryption]): PutObjectResponse =
    copy(serverSideEncryption = value)
  def withVersionId(value: Option[String]): PutObjectResponse =
    copy(versionId = value)
  def withSseCustomerAlgorithm(value: Option[String]): PutObjectResponse =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKeyMD5(value: Option[String]): PutObjectResponse =
    copy(sseCustomerKeyMD5 = value)
  def withSsekmsKeyId(value: Option[String]): PutObjectResponse =
    copy(ssekmsKeyId = value)
  def withRequestCharged(value: Option[RequestCharged]): PutObjectResponse =
    copy(requestCharged = value)
}
