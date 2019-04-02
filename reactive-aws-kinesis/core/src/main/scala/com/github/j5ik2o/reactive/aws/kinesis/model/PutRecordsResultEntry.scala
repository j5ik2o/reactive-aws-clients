package com.github.j5ik2o.reactive.aws.kinesis.model

final case class PutRecordsResultEntry(
    sequenceNumber: Option[String] = None, // String
    shardId: Option[String] = None, // String
    errorCode: Option[String] = None, // String
    errorMessage: Option[String] = None // String
) {
  def withSequenceNumber(value: Option[String]): PutRecordsResultEntry =
    copy(sequenceNumber = value)
  def withShardId(value: Option[String]): PutRecordsResultEntry =
    copy(shardId = value)
  def withErrorCode(value: Option[String]): PutRecordsResultEntry =
    copy(errorCode = value)
  def withErrorMessage(value: Option[String]): PutRecordsResultEntry =
    copy(errorMessage = value)
}
