package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeleteBucketWebsiteResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteBucketWebsiteResponse
  override def withStatusCode(value: Option[Int]): DeleteBucketWebsiteResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteBucketWebsiteResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteBucketWebsiteResponse =
    copy(httpHeaders = value)
}
