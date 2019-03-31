package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class StreamRecord(
    approximateCreationDateTime: Option[java.time.Instant] = None,
    keys: Option[Map[String, AttributeValue]] = None,
    newImage: Option[Map[String, AttributeValue]] = None,
    oldImage: Option[Map[String, AttributeValue]] = None,
    sequenceNumber: Option[String] = None,
    sizeBytes: Option[Long] = None,
    streamViewType: Option[StreamViewType] = None
) {
  def withApproximateCreationDateTime(value: Option[java.time.Instant]): StreamRecord =
    copy(approximateCreationDateTime = value)
  def withKeys(value: Option[Map[String, AttributeValue]]): StreamRecord =
    copy(keys = value)
  def withNewImage(value: Option[Map[String, AttributeValue]]): StreamRecord =
    copy(newImage = value)
  def withOldImage(value: Option[Map[String, AttributeValue]]): StreamRecord =
    copy(oldImage = value)
  def withSequenceNumber(value: Option[String]): StreamRecord =
    copy(sequenceNumber = value)
  def withSizeBytes(value: Option[Long]): StreamRecord =
    copy(sizeBytes = value)
  def withStreamViewType(value: Option[StreamViewType]): StreamRecord =
    copy(streamViewType = value)
}
