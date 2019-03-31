package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketNotificationConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    topicConfigurations: Option[Seq[TopicConfiguration]] = None,
    queueConfigurations: Option[Seq[QueueConfiguration]] = None,
    lambdaFunctionConfigurations: Option[Seq[LambdaFunctionConfiguration]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketNotificationConfigurationResponse
  override def withStatusCode(value: Option[Int]): GetBucketNotificationConfigurationResponse = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketNotificationConfigurationResponse =
    copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketNotificationConfigurationResponse =
    copy(httpHeaders = value)
  def withTopicConfigurations(value: Option[Seq[TopicConfiguration]]): GetBucketNotificationConfigurationResponse =
    copy(topicConfigurations = value)
  def withQueueConfigurations(value: Option[Seq[QueueConfiguration]]): GetBucketNotificationConfigurationResponse =
    copy(queueConfigurations = value)
  def withLambdaFunctionConfigurations(
      value: Option[Seq[LambdaFunctionConfiguration]]
  ): GetBucketNotificationConfigurationResponse =
    copy(lambdaFunctionConfigurations = value)
}
