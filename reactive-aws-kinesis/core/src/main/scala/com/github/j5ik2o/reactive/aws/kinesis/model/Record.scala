package com.github.j5ik2o.reactive.aws.kinesis.model

final case class Record(
    sequenceNumber: Option[String] = None,
    approximateArrivalTimestamp: Option[java.time.Instant] = None,
    data: Option[Array[Byte]] = None,
    partitionKey: Option[String] = None,
    encryptionType: Option[EncryptionType] = None
) {
  def withSequenceNumber(value: Option[String]): Record =
    copy(sequenceNumber = value)
  def withApproximateArrivalTimestamp(value: Option[java.time.Instant]): Record =
    copy(approximateArrivalTimestamp = value)
  def withData(value: Option[Array[Byte]]): Record =
    copy(data = value)
  def withPartitionKey(value: Option[String]): Record =
    copy(partitionKey = value)
  def withEncryptionType(value: Option[EncryptionType]): Record =
    copy(encryptionType = value)
}
