package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetObjectTaggingResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    versionId: Option[String] = None,
    tagSet: Option[Seq[Tag]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetObjectTaggingResponse
  override def withStatusCode(value: Option[Int]): GetObjectTaggingResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetObjectTaggingResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetObjectTaggingResponse =
    copy(httpHeaders = value)
  def withVersionId(value: Option[String]): GetObjectTaggingResponse =
    copy(versionId = value)
  def withTagSet(value: Option[Seq[Tag]]): GetObjectTaggingResponse =
    copy(tagSet = value)
}
