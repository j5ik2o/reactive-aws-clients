package com.github.j5ik2o.reactive.aws.dynamodb.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DescribeTableResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    table: Option[TableDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeTableResponse
  override def withStatusCode(value: Option[Int]): DescribeTableResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeTableResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeTableResponse =
    copy(httpHeaders = value)
  def withTable(value: Option[TableDescription]): DescribeTableResponse =
    copy(table = value)
}
