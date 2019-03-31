package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeleteObjectTaggingResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    versionId: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteObjectTaggingResponse
  override def withStatusCode(value: Option[Int]): DeleteObjectTaggingResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteObjectTaggingResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteObjectTaggingResponse =
    copy(httpHeaders = value)
  def withVersionId(value: Option[String]): DeleteObjectTaggingResponse =
    copy(versionId = value)
}
