package com.github.j5ik2o.reactive.aws.kinesis.model

final case class SequenceNumberRange(
    startingSequenceNumber: Option[String] = None, // String
    endingSequenceNumber: Option[String] = None // String
) {
  def withStartingSequenceNumber(value: Option[String]): SequenceNumberRange =
    copy(startingSequenceNumber = value)
  def withEndingSequenceNumber(value: Option[String]): SequenceNumberRange =
    copy(endingSequenceNumber = value)
}
