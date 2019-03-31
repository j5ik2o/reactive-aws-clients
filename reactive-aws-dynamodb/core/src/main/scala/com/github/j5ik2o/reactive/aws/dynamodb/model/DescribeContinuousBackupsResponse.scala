package com.github.j5ik2o.reactive.aws.dynamodb.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DescribeContinuousBackupsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    continuousBackupsDescription: Option[ContinuousBackupsDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeContinuousBackupsResponse
  override def withStatusCode(value: Option[Int]): DescribeContinuousBackupsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeContinuousBackupsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeContinuousBackupsResponse =
    copy(httpHeaders = value)
  def withContinuousBackupsDescription(value: Option[ContinuousBackupsDescription]): DescribeContinuousBackupsResponse =
    copy(continuousBackupsDescription = value)
}
