package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GlobalTableGlobalSecondaryIndexSettingsUpdate(
    indexName: Option[String] = None,
    provisionedWriteCapacityUnits: Option[Long] = None,
    provisionedWriteCapacityAutoScalingSettingsUpdate: Option[AutoScalingSettingsUpdate] = None
) {
  def withIndexName(value: Option[String]): GlobalTableGlobalSecondaryIndexSettingsUpdate =
    copy(indexName = value)
  def withProvisionedWriteCapacityUnits(value: Option[Long]): GlobalTableGlobalSecondaryIndexSettingsUpdate =
    copy(provisionedWriteCapacityUnits = value)
  def withProvisionedWriteCapacityAutoScalingSettingsUpdate(
      value: Option[AutoScalingSettingsUpdate]
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate =
    copy(provisionedWriteCapacityAutoScalingSettingsUpdate = value)
}
