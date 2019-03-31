package com.github.j5ik2o.reactive.aws.s3.model

final case class TopicConfiguration(
    id: Option[String] = None,
    topicArn: Option[String] = None,
    events: Option[Seq[Event]] = None,
    filter: Option[NotificationConfigurationFilter] = None
) {
  def withId(value: Option[String]): TopicConfiguration =
    copy(id = value)
  def withTopicArn(value: Option[String]): TopicConfiguration =
    copy(topicArn = value)
  def withEvents(value: Option[Seq[Event]]): TopicConfiguration =
    copy(events = value)
  def withFilter(value: Option[NotificationConfigurationFilter]): TopicConfiguration =
    copy(filter = value)
}
