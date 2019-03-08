package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateTableResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    tableDescription: Option[TableDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UpdateTableResponse
  override def withStatusCode(value: Option[Int]): UpdateTableResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UpdateTableResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UpdateTableResponse =
    copy(httpHeaders = value)
  def withTableDescription(value: Option[TableDescription]): UpdateTableResponse =
    copy(tableDescription = value)
}
