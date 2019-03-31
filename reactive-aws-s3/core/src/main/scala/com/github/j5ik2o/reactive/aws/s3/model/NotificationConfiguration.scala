package com.github.j5ik2o.reactive.aws.s3.model

final case class NotificationConfiguration(
    topicConfigurations: Option[Seq[TopicConfiguration]] = None,
    queueConfigurations: Option[Seq[QueueConfiguration]] = None,
    lambdaFunctionConfigurations: Option[Seq[LambdaFunctionConfiguration]] = None
) {
  def withTopicConfigurations(value: Option[Seq[TopicConfiguration]]): NotificationConfiguration =
    copy(topicConfigurations = value)
  def withQueueConfigurations(value: Option[Seq[QueueConfiguration]]): NotificationConfiguration =
    copy(queueConfigurations = value)
  def withLambdaFunctionConfigurations(value: Option[Seq[LambdaFunctionConfiguration]]): NotificationConfiguration =
    copy(lambdaFunctionConfigurations = value)
}
