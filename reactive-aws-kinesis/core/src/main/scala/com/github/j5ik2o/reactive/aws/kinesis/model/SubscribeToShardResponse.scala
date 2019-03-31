package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class SubscribeToShardResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = SubscribeToShardResponse
  override def withStatusCode(value: Option[Int]): SubscribeToShardResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): SubscribeToShardResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): SubscribeToShardResponse =
    copy(httpHeaders = value)
}
