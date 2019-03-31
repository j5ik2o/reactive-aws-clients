package com.github.j5ik2o.reactive.aws.s3.model

final case class QueueConfiguration(
    id: Option[String] = None,
    queueArn: Option[String] = None,
    events: Option[Seq[Event]] = None,
    filter: Option[NotificationConfigurationFilter] = None
) {
  def withId(value: Option[String]): QueueConfiguration =
    copy(id = value)
  def withQueueArn(value: Option[String]): QueueConfiguration =
    copy(queueArn = value)
  def withEvents(value: Option[Seq[Event]]): QueueConfiguration =
    copy(events = value)
  def withFilter(value: Option[NotificationConfigurationFilter]): QueueConfiguration =
    copy(filter = value)
}
