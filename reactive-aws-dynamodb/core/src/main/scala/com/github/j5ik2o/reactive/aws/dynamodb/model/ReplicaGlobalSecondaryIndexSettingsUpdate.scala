package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ReplicaGlobalSecondaryIndexSettingsUpdate(
    indexName: Option[String] = None,
    provisionedReadCapacityUnits: Option[Long] = None,
    provisionedReadCapacityAutoScalingSettingsUpdate: Option[AutoScalingSettingsUpdate] = None
) {
  def withIndexName(value: Option[String]): ReplicaGlobalSecondaryIndexSettingsUpdate =
    copy(indexName = value)
  def withProvisionedReadCapacityUnits(value: Option[Long]): ReplicaGlobalSecondaryIndexSettingsUpdate =
    copy(provisionedReadCapacityUnits = value)
  def withProvisionedReadCapacityAutoScalingSettingsUpdate(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaGlobalSecondaryIndexSettingsUpdate =
    copy(provisionedReadCapacityAutoScalingSettingsUpdate = value)
}
