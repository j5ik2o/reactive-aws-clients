package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ListGlobalTablesResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    globalTables: Option[Seq[GlobalTable]] = None,
    lastEvaluatedGlobalTableName: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListGlobalTablesResponse
  override def withStatusCode(value: Option[Int]): ListGlobalTablesResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListGlobalTablesResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListGlobalTablesResponse =
    copy(httpHeaders = value)
  def withGlobalTables(value: Option[Seq[GlobalTable]]): ListGlobalTablesResponse =
    copy(globalTables = value)
  def withLastEvaluatedGlobalTableName(value: Option[String]): ListGlobalTablesResponse =
    copy(lastEvaluatedGlobalTableName = value)
}
