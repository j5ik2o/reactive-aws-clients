package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketVersioningResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    status: Option[BucketVersioningStatus] = None,
    mfaDelete: Option[MFADeleteStatus] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketVersioningResponse
  override def withStatusCode(value: Option[Int]): GetBucketVersioningResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketVersioningResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketVersioningResponse =
    copy(httpHeaders = value)
  def withStatus(value: Option[BucketVersioningStatus]): GetBucketVersioningResponse =
    copy(status = value)
  def withMfaDelete(value: Option[MFADeleteStatus]): GetBucketVersioningResponse =
    copy(mfaDelete = value)
}
