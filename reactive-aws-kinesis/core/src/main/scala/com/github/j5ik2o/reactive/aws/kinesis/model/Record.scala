package com.github.j5ik2o.reactive.aws.kinesis.model

final case class Record(
    sequenceNumber: Option[String] = None, // String
    approximateArrivalTimestamp: Option[java.time.Instant] = None, // Instant
    data: Option[software.amazon.awssdk.core.SdkBytes] = None, // SdkBytes
    partitionKey: Option[String] = None, // String
    encryptionType: Option[EncryptionType] = None // String
) {
  def withSequenceNumber(value: Option[String]): Record =
    copy(sequenceNumber = value)
  def withApproximateArrivalTimestamp(value: Option[java.time.Instant]): Record =
    copy(approximateArrivalTimestamp = value)
  def withData(value: Option[software.amazon.awssdk.core.SdkBytes]): Record =
    copy(data = value)
  def withPartitionKey(value: Option[String]): Record =
    copy(partitionKey = value)
  def withEncryptionType(value: Option[EncryptionType]): Record =
    copy(encryptionType = value)
}
