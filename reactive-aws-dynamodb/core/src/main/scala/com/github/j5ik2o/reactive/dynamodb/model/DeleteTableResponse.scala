package com.github.j5ik2o.reactive.dynamodb.model

final case class DeleteTableResponse(override val statusCode: Option[Int] = None,
                                     override val statusText: Option[String] = None,
                                     override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                     tableDescription: Option[TableDescription] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteTableResponse
  override def withStatusCode(value: Option[Int]): DeleteTableResponse                       = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteTableResponse                    = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteTableResponse = copy(httpHeaders = value)
  def withTableDescription(value: Option[TableDescription]): DeleteTableResponse             = copy(tableDescription = value)

}
