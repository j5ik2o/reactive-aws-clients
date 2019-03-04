package com.github.j5ik2o.reactive.kinesis.model

import java.nio.ByteBuffer

final case class PutRecordRequest(streamName: Option[String] = None,
                                  data: Option[ByteBuffer] = None,
                                  partitionKey: Option[String] = None,
                                  explicitHashKey: Option[String] = None,
                                  sequenceNumberForOrdering: Option[String] = None) {

  def withStreamName(value: Option[String]): PutRecordRequest                = copy(streamName = value)
  def withData(value: Option[ByteBuffer]): PutRecordRequest                  = copy(data = value)
  def withPartitionKey(value: Option[String]): PutRecordRequest              = copy(partitionKey = value)
  def withExplicitHashKey(value: Option[String]): PutRecordRequest           = copy(explicitHashKey = value)
  def withSequenceNumberForOrdering(value: Option[String]): PutRecordRequest = copy(sequenceNumberForOrdering = value)

}
