package com.github.j5ik2o.reactive.aws.dynamodb.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListTablesResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    tableNames: Option[Seq[String]] = None,
    lastEvaluatedTableName: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListTablesResponse
  override def withStatusCode(value: Option[Int]): ListTablesResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListTablesResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListTablesResponse =
    copy(httpHeaders = value)
  def withTableNames(value: Option[Seq[String]]): ListTablesResponse =
    copy(tableNames = value)
  def withLastEvaluatedTableName(value: Option[String]): ListTablesResponse =
    copy(lastEvaluatedTableName = value)
}
