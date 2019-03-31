package com.github.j5ik2o.reactive.aws.dynamodb.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DescribeGlobalTableResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    globalTableDescription: Option[GlobalTableDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeGlobalTableResponse
  override def withStatusCode(value: Option[Int]): DescribeGlobalTableResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeGlobalTableResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeGlobalTableResponse =
    copy(httpHeaders = value)
  def withGlobalTableDescription(value: Option[GlobalTableDescription]): DescribeGlobalTableResponse =
    copy(globalTableDescription = value)
}
