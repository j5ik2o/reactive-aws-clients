package com.github.j5ik2o.reactive.aws.kinesis.model

final case class ListStreamConsumersRequest(
    streamARN: Option[String] = None,
    nextToken: Option[String] = None,
    maxResults: Option[Int] = None,
    streamCreationTimestamp: Option[java.time.Instant] = None
) {
  def withStreamARN(value: Option[String]): ListStreamConsumersRequest =
    copy(streamARN = value)
  def withNextToken(value: Option[String]): ListStreamConsumersRequest =
    copy(nextToken = value)
  def withMaxResults(value: Option[Int]): ListStreamConsumersRequest =
    copy(maxResults = value)
  def withStreamCreationTimestamp(value: Option[java.time.Instant]): ListStreamConsumersRequest =
    copy(streamCreationTimestamp = value)
}
