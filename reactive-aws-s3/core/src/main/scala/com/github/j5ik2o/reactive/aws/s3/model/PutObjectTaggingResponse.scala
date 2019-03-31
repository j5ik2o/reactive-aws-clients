package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutObjectTaggingResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    versionId: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutObjectTaggingResponse
  override def withStatusCode(value: Option[Int]): PutObjectTaggingResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutObjectTaggingResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutObjectTaggingResponse =
    copy(httpHeaders = value)
  def withVersionId(value: Option[String]): PutObjectTaggingResponse =
    copy(versionId = value)
}
