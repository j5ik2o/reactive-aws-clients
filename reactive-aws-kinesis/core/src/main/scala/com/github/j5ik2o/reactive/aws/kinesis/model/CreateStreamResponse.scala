package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class CreateStreamResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = CreateStreamResponse
  override def withStatusCode(value: Option[Int]): CreateStreamResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CreateStreamResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CreateStreamResponse =
    copy(httpHeaders = value)
}
