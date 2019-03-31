package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class RestoreObjectResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    requestCharged: Option[RequestCharged] = None,
    restoreOutputPath: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = RestoreObjectResponse
  override def withStatusCode(value: Option[Int]): RestoreObjectResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): RestoreObjectResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): RestoreObjectResponse =
    copy(httpHeaders = value)
  def withRequestCharged(value: Option[RequestCharged]): RestoreObjectResponse =
    copy(requestCharged = value)
  def withRestoreOutputPath(value: Option[String]): RestoreObjectResponse =
    copy(restoreOutputPath = value)
}
