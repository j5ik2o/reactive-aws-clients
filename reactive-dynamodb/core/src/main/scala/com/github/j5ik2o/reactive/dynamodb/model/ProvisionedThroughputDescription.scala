package com.github.j5ik2o.reactive.dynamodb.model

import java.time.Instant

final case class ProvisionedThroughputDescription(lastIncreaseDateTime: Option[Instant] = None,
                                                  lastDecreaseDateTime: Option[Instant] = None,
                                                  numberOfDecreasesToday: Option[Long] = Some(0L),
                                                  readCapacityUnits: Option[Long] = Some(0L),
                                                  writeCapacityUnits: Option[Long] = Some(0L)) {
  def withLastIncreaseDateTime(value: Option[Instant]): ProvisionedThroughputDescription =
    copy(lastIncreaseDateTime = value)
  def withLastDecreaseDateTime(value: Option[Instant]): ProvisionedThroughputDescription =
    copy(lastDecreaseDateTime = value)
  def withNumberOfDecreasesToday(value: Option[Long]): ProvisionedThroughputDescription =
    copy(numberOfDecreasesToday = value)
  def withReadCapacityUnits(value: Option[Long]): ProvisionedThroughputDescription  = copy(readCapacityUnits = value)
  def withWriteCapacityUnits(value: Option[Long]): ProvisionedThroughputDescription = copy(writeCapacityUnits = value)
}
