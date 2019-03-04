package com.github.j5ik2o.reactive.dynamodb.model

final case class CreateGlobalTableResponse(override val statusCode: Option[Int] = None,
                                           override val statusText: Option[String] = None,
                                           override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                           globalTableDescription: Option[GlobalTableDescription] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = CreateGlobalTableResponse
  override def withStatusCode(value: Option[Int]): CreateGlobalTableResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): CreateGlobalTableResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): CreateGlobalTableResponse =
    copy(httpHeaders = value)
  def withGlobalTableDescription(value: Option[GlobalTableDescription]): CreateGlobalTableResponse =
    copy(globalTableDescription = value)

}
