package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class CreateBucketResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    location: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = CreateBucketResponse
  override def withStatusCode(value: Option[Int]): CreateBucketResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CreateBucketResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CreateBucketResponse =
    copy(httpHeaders = value)
  def withLocation(value: Option[String]): CreateBucketResponse =
    copy(location = value)
}
