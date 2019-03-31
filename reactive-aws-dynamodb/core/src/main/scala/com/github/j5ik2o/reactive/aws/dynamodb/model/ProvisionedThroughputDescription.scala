package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ProvisionedThroughputDescription(
    lastIncreaseDateTime: Option[java.time.Instant] = None,
    lastDecreaseDateTime: Option[java.time.Instant] = None,
    numberOfDecreasesToday: Option[Long] = None,
    readCapacityUnits: Option[Long] = None,
    writeCapacityUnits: Option[Long] = None
) {
  def withLastIncreaseDateTime(value: Option[java.time.Instant]): ProvisionedThroughputDescription =
    copy(lastIncreaseDateTime = value)
  def withLastDecreaseDateTime(value: Option[java.time.Instant]): ProvisionedThroughputDescription =
    copy(lastDecreaseDateTime = value)
  def withNumberOfDecreasesToday(value: Option[Long]): ProvisionedThroughputDescription =
    copy(numberOfDecreasesToday = value)
  def withReadCapacityUnits(value: Option[Long]): ProvisionedThroughputDescription =
    copy(readCapacityUnits = value)
  def withWriteCapacityUnits(value: Option[Long]): ProvisionedThroughputDescription =
    copy(writeCapacityUnits = value)
}
