package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeleteObjectResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    deleteMarker: Option[Boolean] = None,
    versionId: Option[String] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteObjectResponse
  override def withStatusCode(value: Option[Int]): DeleteObjectResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteObjectResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteObjectResponse =
    copy(httpHeaders = value)
  def withDeleteMarker(value: Option[Boolean]): DeleteObjectResponse =
    copy(deleteMarker = value)
  def withVersionId(value: Option[String]): DeleteObjectResponse =
    copy(versionId = value)
  def withRequestCharged(value: Option[RequestCharged]): DeleteObjectResponse =
    copy(requestCharged = value)
}
