package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class RestoreTableFromBackupResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    tableDescription: Option[TableDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = RestoreTableFromBackupResponse
  override def withStatusCode(value: Option[Int]): RestoreTableFromBackupResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): RestoreTableFromBackupResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): RestoreTableFromBackupResponse =
    copy(httpHeaders = value)
  def withTableDescription(value: Option[TableDescription]): RestoreTableFromBackupResponse =
    copy(tableDescription = value)
}
