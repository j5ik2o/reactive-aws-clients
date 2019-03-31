package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetObjectTorrentResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetObjectTorrentResponse
  override def withStatusCode(value: Option[Int]): GetObjectTorrentResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetObjectTorrentResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetObjectTorrentResponse =
    copy(httpHeaders = value)
  def withRequestCharged(value: Option[RequestCharged]): GetObjectTorrentResponse =
    copy(requestCharged = value)
}
