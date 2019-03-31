package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetPublicAccessBlockResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    publicAccessBlockConfiguration: Option[PublicAccessBlockConfiguration] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetPublicAccessBlockResponse
  override def withStatusCode(value: Option[Int]): GetPublicAccessBlockResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetPublicAccessBlockResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetPublicAccessBlockResponse =
    copy(httpHeaders = value)
  def withPublicAccessBlockConfiguration(value: Option[PublicAccessBlockConfiguration]): GetPublicAccessBlockResponse =
    copy(publicAccessBlockConfiguration = value)
}
