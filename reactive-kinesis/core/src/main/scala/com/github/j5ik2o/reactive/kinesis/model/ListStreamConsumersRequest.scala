package com.github.j5ik2o.reactive.kinesis.model

import java.time.Instant

final case class ListStreamConsumersRequest(streamARN: Option[String] = None,
                                            nextToken: Option[String] = None,
                                            maxResults: Option[Int] = None,
                                            streamCreationTimestamp: Option[Instant] = None) {
  def withStreamARN(value: Option[String]): ListStreamConsumersRequest = copy(streamARN = value)
  def withNextToken(value: Option[String]): ListStreamConsumersRequest = copy(nextToken = value)
  def withMaxResults(value: Option[Int]): ListStreamConsumersRequest   = copy(maxResults = value)
  def withStreamCreationTimestamp(value: Option[Instant]): ListStreamConsumersRequest =
    copy(streamCreationTimestamp = value)
}
