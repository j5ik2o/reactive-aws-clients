package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class CompleteMultipartUploadResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    location: Option[String] = None,
    bucket: Option[String] = None,
    key: Option[String] = None,
    expiration: Option[String] = None,
    eTag: Option[String] = None,
    serverSideEncryption: Option[ServerSideEncryption] = None,
    versionId: Option[String] = None,
    ssekmsKeyId: Option[String] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = CompleteMultipartUploadResponse
  override def withStatusCode(value: Option[Int]): CompleteMultipartUploadResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CompleteMultipartUploadResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CompleteMultipartUploadResponse =
    copy(httpHeaders = value)
  def withLocation(value: Option[String]): CompleteMultipartUploadResponse =
    copy(location = value)
  def withBucket(value: Option[String]): CompleteMultipartUploadResponse =
    copy(bucket = value)
  def withKey(value: Option[String]): CompleteMultipartUploadResponse =
    copy(key = value)
  def withExpiration(value: Option[String]): CompleteMultipartUploadResponse =
    copy(expiration = value)
  def withETag(value: Option[String]): CompleteMultipartUploadResponse =
    copy(eTag = value)
  def withServerSideEncryption(value: Option[ServerSideEncryption]): CompleteMultipartUploadResponse =
    copy(serverSideEncryption = value)
  def withVersionId(value: Option[String]): CompleteMultipartUploadResponse =
    copy(versionId = value)
  def withSsekmsKeyId(value: Option[String]): CompleteMultipartUploadResponse =
    copy(ssekmsKeyId = value)
  def withRequestCharged(value: Option[RequestCharged]): CompleteMultipartUploadResponse =
    copy(requestCharged = value)
}
