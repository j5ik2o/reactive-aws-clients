package com.github.j5ik2o.reactive.aws.kinesis.model

final case class ListStreamConsumersRequest(
    streamARN: Option[String] = None, // String
    nextToken: Option[String] = None, // String
    maxResults: Option[Int] = None, // Int
    streamCreationTimestamp: Option[java.time.Instant] = None // Instant
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
