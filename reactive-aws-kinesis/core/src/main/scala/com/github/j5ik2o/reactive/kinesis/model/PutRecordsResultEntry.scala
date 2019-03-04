package com.github.j5ik2o.reactive.kinesis.model

final case class PutRecordsResultEntry(sequenceNumber: Option[String] = None,
                                       shardId: Option[String] = None,
                                       errorCode: Option[String] = None,
                                       errorMessage: Option[String] = None) {

  def withSequenceNumber(value: Option[String]): PutRecordsResultEntry = copy(sequenceNumber = value)
  def withShardId(value: Option[String]): PutRecordsResultEntry        = copy(shardId = value)
  def withErrorCode(value: Option[String]): PutRecordsResultEntry      = copy(errorCode = value)
  def withErrorMessage(value: Option[String]): PutRecordsResultEntry   = copy(errorMessage = value)

}
