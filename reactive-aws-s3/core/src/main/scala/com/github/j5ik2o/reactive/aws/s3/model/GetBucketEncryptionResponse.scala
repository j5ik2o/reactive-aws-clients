package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketEncryptionResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    serverSideEncryptionConfiguration: Option[ServerSideEncryptionConfiguration] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketEncryptionResponse
  override def withStatusCode(value: Option[Int]): GetBucketEncryptionResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketEncryptionResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketEncryptionResponse =
    copy(httpHeaders = value)
  def withServerSideEncryptionConfiguration(
      value: Option[ServerSideEncryptionConfiguration]
  ): GetBucketEncryptionResponse =
    copy(serverSideEncryptionConfiguration = value)
}
