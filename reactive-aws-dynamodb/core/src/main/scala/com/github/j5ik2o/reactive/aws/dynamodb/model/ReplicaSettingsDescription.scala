package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ReplicaSettingsDescription(
    regionName: Option[String] = None,
    replicaStatus: Option[ReplicaStatus] = None,
    replicaBillingModeSummary: Option[BillingModeSummary] = None,
    replicaProvisionedReadCapacityUnits: Option[Long] = None,
    replicaProvisionedReadCapacityAutoScalingSettings: Option[AutoScalingSettingsDescription] = None,
    replicaProvisionedWriteCapacityUnits: Option[Long] = None,
    replicaProvisionedWriteCapacityAutoScalingSettings: Option[AutoScalingSettingsDescription] = None,
    replicaGlobalSecondaryIndexSettings: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]] = None
) {
  def withRegionName(value: Option[String]): ReplicaSettingsDescription =
    copy(regionName = value)
  def withReplicaStatus(value: Option[ReplicaStatus]): ReplicaSettingsDescription =
    copy(replicaStatus = value)
  def withReplicaBillingModeSummary(value: Option[BillingModeSummary]): ReplicaSettingsDescription =
    copy(replicaBillingModeSummary = value)
  def withReplicaProvisionedReadCapacityUnits(value: Option[Long]): ReplicaSettingsDescription =
    copy(replicaProvisionedReadCapacityUnits = value)
  def withReplicaProvisionedReadCapacityAutoScalingSettings(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaSettingsDescription =
    copy(replicaProvisionedReadCapacityAutoScalingSettings = value)
  def withReplicaProvisionedWriteCapacityUnits(value: Option[Long]): ReplicaSettingsDescription =
    copy(replicaProvisionedWriteCapacityUnits = value)
  def withReplicaProvisionedWriteCapacityAutoScalingSettings(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaSettingsDescription =
    copy(replicaProvisionedWriteCapacityAutoScalingSettings = value)
  def withReplicaGlobalSecondaryIndexSettings(
      value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]]
  ): ReplicaSettingsDescription =
    copy(replicaGlobalSecondaryIndexSettings = value)
}
