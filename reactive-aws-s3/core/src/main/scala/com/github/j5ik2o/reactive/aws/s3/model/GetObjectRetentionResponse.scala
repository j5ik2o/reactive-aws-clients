package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetObjectRetentionResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    retention: Option[ObjectLockRetention] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetObjectRetentionResponse
  override def withStatusCode(value: Option[Int]): GetObjectRetentionResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetObjectRetentionResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetObjectRetentionResponse =
    copy(httpHeaders = value)
  def withRetention(value: Option[ObjectLockRetention]): GetObjectRetentionResponse =
    copy(retention = value)
}
