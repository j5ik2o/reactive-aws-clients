package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class TimeToLiveDescription(
    timeToLiveStatus: Option[TimeToLiveStatus] = None,
    attributeName: Option[String] = None
) {
  def withTimeToLiveStatus(value: Option[TimeToLiveStatus]): TimeToLiveDescription =
    copy(timeToLiveStatus = value)
  def withAttributeName(value: Option[String]): TimeToLiveDescription =
    copy(attributeName = value)
}
