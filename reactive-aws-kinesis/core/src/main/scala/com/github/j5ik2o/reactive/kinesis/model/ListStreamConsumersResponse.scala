package com.github.j5ik2o.reactive.kinesis.model

final case class ListStreamConsumersResponse(override val statusCode: Option[Int] = None,
                                             override val statusText: Option[String] = None,
                                             override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                             consumers: Option[Seq[Consumer]] = None,
                                             nextToken: Option[String] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = ListStreamConsumersResponse
  override def withStatusCode(value: Option[Int]): ListStreamConsumersResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListStreamConsumersResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListStreamConsumersResponse =
    copy(httpHeaders = value)
  def withConsumers(value: Option[Seq[Consumer]]): ListStreamConsumersResponse = copy(consumers = value)
  def withNextToken(value: Option[String]): ListStreamConsumersResponse        = copy(nextToken = value)

}
