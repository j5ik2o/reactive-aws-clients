package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ReplicaGlobalSecondaryIndexSettingsDescription(
    indexName: Option[String] = None,
    indexStatus: Option[IndexStatus] = None,
    provisionedReadCapacityUnits: Option[Long] = None,
    provisionedReadCapacityAutoScalingSettings: Option[AutoScalingSettingsDescription] = None,
    provisionedWriteCapacityUnits: Option[Long] = None,
    provisionedWriteCapacityAutoScalingSettings: Option[AutoScalingSettingsDescription] = None
) {
  def withIndexName(value: Option[String]): ReplicaGlobalSecondaryIndexSettingsDescription = copy(indexName = value)
  def withIndexStatus(value: Option[IndexStatus]): ReplicaGlobalSecondaryIndexSettingsDescription =
    copy(indexStatus = value)
  def withProvisionedReadCapacityUnits(value: Option[Long]): ReplicaGlobalSecondaryIndexSettingsDescription =
    copy(provisionedReadCapacityUnits = value)
  def withProvisionedReadCapacityAutoScalingSettings(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexSettingsDescription = copy(provisionedReadCapacityAutoScalingSettings = value)
  def withProvisionedWriteCapacityUnits(value: Option[Long]): ReplicaGlobalSecondaryIndexSettingsDescription =
    copy(provisionedWriteCapacityUnits = value)
  def withProvisionedWriteCapacityAutoScalingSettings(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexSettingsDescription =
    copy(provisionedWriteCapacityAutoScalingSettings = value)
}
