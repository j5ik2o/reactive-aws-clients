package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateGlobalTableResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    globalTableDescription: Option[GlobalTableDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UpdateGlobalTableResponse
  override def withStatusCode(value: Option[Int]): UpdateGlobalTableResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UpdateGlobalTableResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UpdateGlobalTableResponse =
    copy(httpHeaders = value)
  def withGlobalTableDescription(value: Option[GlobalTableDescription]): UpdateGlobalTableResponse =
    copy(globalTableDescription = value)
}
