package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ProvisionedThroughput(
    readCapacityUnits: Option[Long] = None,
    writeCapacityUnits: Option[Long] = None
) {
  def withReadCapacityUnits(value: Option[Long]): ProvisionedThroughput =
    copy(readCapacityUnits = value)
  def withWriteCapacityUnits(value: Option[Long]): ProvisionedThroughput =
    copy(writeCapacityUnits = value)
}
