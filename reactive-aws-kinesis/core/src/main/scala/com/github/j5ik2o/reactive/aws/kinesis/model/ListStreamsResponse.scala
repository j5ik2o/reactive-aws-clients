package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListStreamsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    streamNames: Option[Seq[String]] = None,
    hasMoreStreams: Option[Boolean] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListStreamsResponse
  override def withStatusCode(value: Option[Int]): ListStreamsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListStreamsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListStreamsResponse =
    copy(httpHeaders = value)
  def withStreamNames(value: Option[Seq[String]]): ListStreamsResponse =
    copy(streamNames = value)
  def withHasMoreStreams(value: Option[Boolean]): ListStreamsResponse =
    copy(hasMoreStreams = value)
}
