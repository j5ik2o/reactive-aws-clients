package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketLoggingResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    loggingEnabled: Option[LoggingEnabled] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketLoggingResponse
  override def withStatusCode(value: Option[Int]): GetBucketLoggingResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketLoggingResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketLoggingResponse =
    copy(httpHeaders = value)
  def withLoggingEnabled(value: Option[LoggingEnabled]): GetBucketLoggingResponse =
    copy(loggingEnabled = value)
}
