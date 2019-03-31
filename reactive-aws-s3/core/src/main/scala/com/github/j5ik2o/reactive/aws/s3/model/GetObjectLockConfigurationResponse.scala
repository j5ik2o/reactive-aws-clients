package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetObjectLockConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    objectLockConfiguration: Option[ObjectLockConfiguration] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetObjectLockConfigurationResponse
  override def withStatusCode(value: Option[Int]): GetObjectLockConfigurationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetObjectLockConfigurationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetObjectLockConfigurationResponse =
    copy(httpHeaders = value)
  def withObjectLockConfiguration(value: Option[ObjectLockConfiguration]): GetObjectLockConfigurationResponse =
    copy(objectLockConfiguration = value)
}
