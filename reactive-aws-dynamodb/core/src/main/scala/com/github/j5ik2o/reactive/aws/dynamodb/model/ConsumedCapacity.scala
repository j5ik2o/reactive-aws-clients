package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ConsumedCapacity(
    tableName: Option[String] = None,
    capacityUnits: Option[Double] = None,
    readCapacityUnits: Option[Double] = None,
    writeCapacityUnits: Option[Double] = None,
    table: Option[Capacity] = None,
    localSecondaryIndexes: Option[Map[String, Capacity]] = None,
    globalSecondaryIndexes: Option[Map[String, Capacity]] = None
) {
  def withTableName(value: Option[String]): ConsumedCapacity =
    copy(tableName = value)
  def withCapacityUnits(value: Option[Double]): ConsumedCapacity =
    copy(capacityUnits = value)
  def withReadCapacityUnits(value: Option[Double]): ConsumedCapacity =
    copy(readCapacityUnits = value)
  def withWriteCapacityUnits(value: Option[Double]): ConsumedCapacity =
    copy(writeCapacityUnits = value)
  def withTable(value: Option[Capacity]): ConsumedCapacity =
    copy(table = value)
  def withLocalSecondaryIndexes(value: Option[Map[String, Capacity]]): ConsumedCapacity =
    copy(localSecondaryIndexes = value)
  def withGlobalSecondaryIndexes(value: Option[Map[String, Capacity]]): ConsumedCapacity =
    copy(globalSecondaryIndexes = value)
}
