package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateContinuousBackupsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    continuousBackupsDescription: Option[ContinuousBackupsDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UpdateContinuousBackupsResponse
  override def withStatusCode(value: Option[Int]): UpdateContinuousBackupsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UpdateContinuousBackupsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UpdateContinuousBackupsResponse =
    copy(httpHeaders = value)
  def withContinuousBackupsDescription(value: Option[ContinuousBackupsDescription]): UpdateContinuousBackupsResponse =
    copy(continuousBackupsDescription = value)
}
