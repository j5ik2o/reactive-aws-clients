package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class SequenceNumberRange(
    startingSequenceNumber: Option[String] = None,
    endingSequenceNumber: Option[String] = None
) {
  def withStartingSequenceNumber(value: Option[String]): SequenceNumberRange =
    copy(startingSequenceNumber = value)
  def withEndingSequenceNumber(value: Option[String]): SequenceNumberRange =
    copy(endingSequenceNumber = value)
}
