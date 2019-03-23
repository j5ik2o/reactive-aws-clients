package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class CreateTableResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    tableDescription: Option[TableDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = CreateTableResponse
  override def withStatusCode(value: Option[Int]): CreateTableResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CreateTableResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CreateTableResponse =
    copy(httpHeaders = value)
  def withTableDescription(value: Option[TableDescription]): CreateTableResponse =
    copy(tableDescription = value)
}
