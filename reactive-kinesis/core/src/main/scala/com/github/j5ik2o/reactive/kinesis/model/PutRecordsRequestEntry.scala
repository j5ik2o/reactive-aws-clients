package com.github.j5ik2o.reactive.kinesis.model

import java.nio.ByteBuffer

final case class PutRecordsRequestEntry(data: Option[ByteBuffer] = None,
                                        explicitHashKey: Option[String] = None,
                                        partitionKey: Option[String] = None) {

  def withData(value: Option[ByteBuffer]): PutRecordsRequestEntry        = copy(data = value)
  def withExplicitHashKey(value: Option[String]): PutRecordsRequestEntry = copy(explicitHashKey = value)
  def withPartitionKey(value: Option[String]): PutRecordsRequestEntry    = copy(partitionKey = value)

}
