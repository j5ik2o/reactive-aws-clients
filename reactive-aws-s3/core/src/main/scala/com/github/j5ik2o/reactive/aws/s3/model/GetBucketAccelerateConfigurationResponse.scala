package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketAccelerateConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    status: Option[BucketAccelerateStatus] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketAccelerateConfigurationResponse
  override def withStatusCode(value: Option[Int]): GetBucketAccelerateConfigurationResponse = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketAccelerateConfigurationResponse =
    copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketAccelerateConfigurationResponse =
    copy(httpHeaders = value)
  def withStatus(value: Option[BucketAccelerateStatus]): GetBucketAccelerateConfigurationResponse =
    copy(status = value)
}
