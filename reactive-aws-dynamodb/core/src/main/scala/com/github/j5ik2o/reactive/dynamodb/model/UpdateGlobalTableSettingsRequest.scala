package com.github.j5ik2o.reactive.dynamodb.model

final case class UpdateGlobalTableSettingsRequest(
    globalTableName: Option[String] = None,
    globalTableBillingMode: Option[BillingMode] = None,
    globalTableProvisionedWriteCapacityUnits: Option[Long] = None,
    globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: Option[AutoScalingSettingsUpdate] = None,
    globalTableGlobalSecondaryIndexSettingsUpdate: Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]] = None,
    replicaSettingsUpdate: Option[Seq[ReplicaSettingsUpdate]] = None
) {
  def withGlobalTableName(value: Option[String]): UpdateGlobalTableSettingsRequest = copy(globalTableName = value)
  def withGlobalTableBillingMode(value: Option[BillingMode]): UpdateGlobalTableSettingsRequest =
    copy(globalTableBillingMode = value)
  def withGlobalTableProvisionedWriteCapacityUnits(value: Option[Long]): UpdateGlobalTableSettingsRequest =
    copy(globalTableProvisionedWriteCapacityUnits = value)
  def withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(
      value: Option[AutoScalingSettingsUpdate]
  ): UpdateGlobalTableSettingsRequest =
    copy(globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate = value)
  def withGlobalTableGlobalSecondaryIndexSettingsUpdate(
      value: Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]]
  ): UpdateGlobalTableSettingsRequest =
    copy(globalTableGlobalSecondaryIndexSettingsUpdate = value)
  def withReplicaSettingsUpdate(value: Option[Seq[ReplicaSettingsUpdate]]): UpdateGlobalTableSettingsRequest =
    copy(replicaSettingsUpdate = value)
}
