package com.github.j5ik2o.reactive.aws.kinesis.model

final case class StartingPosition(
    `type`: Option[ShardIteratorType] = None,
    sequenceNumber: Option[String] = None,
    timestamp: Option[java.time.Instant] = None
) {
  def withType(value: Option[ShardIteratorType]): StartingPosition =
    copy(`type` = value)
  def withSequenceNumber(value: Option[String]): StartingPosition =
    copy(sequenceNumber = value)
  def withTimestamp(value: Option[java.time.Instant]): StartingPosition =
    copy(timestamp = value)
}
