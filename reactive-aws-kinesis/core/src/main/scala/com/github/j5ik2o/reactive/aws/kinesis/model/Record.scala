package com.github.j5ik2o.reactive.aws.kinesis.model
import java.nio.ByteBuffer
import java.time.Instant

final case class Record(sequenceNumber: Option[String] = None,
                        approximateArrivalTimestamp: Option[Instant] = None,
                        data: Option[ByteBuffer] = None,
                        partitionKey: Option[String] = None,
                        encryptionType: Option[EncryptionType] = None) {

  def withSequenceNumber(value: Option[String]): Record               = copy(sequenceNumber = value)
  def withApproximateArrivalTimestamp(value: Option[Instant]): Record = copy(approximateArrivalTimestamp = value)
  def withData(value: Option[ByteBuffer]): Record                     = copy(data = value)
  def withPartitionKey(value: Option[String]): Record                 = copy(partitionKey = value)
  def withEncryptionType(value: Option[EncryptionType]): Record       = copy(encryptionType = value)

}
