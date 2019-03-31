package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketLifecycleConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    rules: Option[Seq[LifecycleRule]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketLifecycleConfigurationResponse
  override def withStatusCode(value: Option[Int]): GetBucketLifecycleConfigurationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketLifecycleConfigurationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketLifecycleConfigurationResponse =
    copy(httpHeaders = value)
  def withRules(value: Option[Seq[LifecycleRule]]): GetBucketLifecycleConfigurationResponse =
    copy(rules = value)
}
