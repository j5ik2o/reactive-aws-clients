package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Record(
    eventID: Option[String] = None,
    eventName: Option[OperationType] = None,
    eventVersion: Option[String] = None,
    eventSource: Option[String] = None,
    awsRegion: Option[String] = None,
    dynamodb: Option[StreamRecord] = None,
    userIdentity: Option[Identity] = None
) {
  def withEventID(value: Option[String]): Record =
    copy(eventID = value)
  def withEventName(value: Option[OperationType]): Record =
    copy(eventName = value)
  def withEventVersion(value: Option[String]): Record =
    copy(eventVersion = value)
  def withEventSource(value: Option[String]): Record =
    copy(eventSource = value)
  def withAwsRegion(value: Option[String]): Record =
    copy(awsRegion = value)
  def withDynamodb(value: Option[StreamRecord]): Record =
    copy(dynamodb = value)
  def withUserIdentity(value: Option[Identity]): Record =
    copy(userIdentity = value)
}
