package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketLocationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    locationConstraint: Option[BucketLocationConstraint] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketLocationResponse
  override def withStatusCode(value: Option[Int]): GetBucketLocationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketLocationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketLocationResponse =
    copy(httpHeaders = value)
  def withLocationConstraint(value: Option[BucketLocationConstraint]): GetBucketLocationResponse =
    copy(locationConstraint = value)
}
