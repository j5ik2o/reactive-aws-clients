package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeleteObjectsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    deleted: Option[Seq[DeletedObject]] = None,
    requestCharged: Option[RequestCharged] = None,
    errors: Option[Seq[S3Error]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteObjectsResponse
  override def withStatusCode(value: Option[Int]): DeleteObjectsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteObjectsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteObjectsResponse =
    copy(httpHeaders = value)
  def withDeleted(value: Option[Seq[DeletedObject]]): DeleteObjectsResponse =
    copy(deleted = value)
  def withRequestCharged(value: Option[RequestCharged]): DeleteObjectsResponse =
    copy(requestCharged = value)
  def withErrors(value: Option[Seq[S3Error]]): DeleteObjectsResponse =
    copy(errors = value)
}
