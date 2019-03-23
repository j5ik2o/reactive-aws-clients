package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ListStreamsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    streams: Option[Seq[Stream]] = None,
    lastEvaluatedStreamArn: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListStreamsResponse
  override def withStatusCode(value: Option[Int]): ListStreamsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListStreamsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListStreamsResponse =
    copy(httpHeaders = value)
  def withStreams(value: Option[Seq[Stream]]): ListStreamsResponse =
    copy(streams = value)
  def withLastEvaluatedStreamArn(value: Option[String]): ListStreamsResponse =
    copy(lastEvaluatedStreamArn = value)
}
