package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeleteBucketMetricsConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteBucketMetricsConfigurationResponse
  override def withStatusCode(value: Option[Int]): DeleteBucketMetricsConfigurationResponse = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteBucketMetricsConfigurationResponse =
    copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteBucketMetricsConfigurationResponse =
    copy(httpHeaders = value)
}
