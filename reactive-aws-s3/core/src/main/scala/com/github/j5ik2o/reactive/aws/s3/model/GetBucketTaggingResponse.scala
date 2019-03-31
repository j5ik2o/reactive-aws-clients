package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketTaggingResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    tagSet: Option[Seq[Tag]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketTaggingResponse
  override def withStatusCode(value: Option[Int]): GetBucketTaggingResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketTaggingResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketTaggingResponse =
    copy(httpHeaders = value)
  def withTagSet(value: Option[Seq[Tag]]): GetBucketTaggingResponse =
    copy(tagSet = value)
}
