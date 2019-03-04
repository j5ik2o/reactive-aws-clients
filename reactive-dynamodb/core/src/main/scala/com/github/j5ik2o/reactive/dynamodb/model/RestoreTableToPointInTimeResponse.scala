package com.github.j5ik2o.reactive.dynamodb.model

final case class RestoreTableToPointInTimeResponse(override val statusCode: Option[Int] = None,
                                                   override val statusText: Option[String] = None,
                                                   override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                                   tableDescription: Option[TableDescription] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = RestoreTableToPointInTimeResponse
  override def withStatusCode(value: Option[Int]): RestoreTableToPointInTimeResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): RestoreTableToPointInTimeResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): RestoreTableToPointInTimeResponse =
    copy(httpHeaders = value)
  def withTableDescription(value: Option[TableDescription]): RestoreTableToPointInTimeResponse =
    copy(tableDescription = value)

}
