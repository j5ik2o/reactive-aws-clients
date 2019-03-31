package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Capacity(
    readCapacityUnits: Option[Double] = None,
    writeCapacityUnits: Option[Double] = None,
    capacityUnits: Option[Double] = None
) {
  def withReadCapacityUnits(value: Option[Double]): Capacity =
    copy(readCapacityUnits = value)
  def withWriteCapacityUnits(value: Option[Double]): Capacity =
    copy(writeCapacityUnits = value)
  def withCapacityUnits(value: Option[Double]): Capacity =
    copy(capacityUnits = value)
}
