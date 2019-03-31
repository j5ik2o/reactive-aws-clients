package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ReplicaSettingsUpdate(
    regionName: Option[String] = None,
    replicaProvisionedReadCapacityUnits: Option[Long] = None,
    replicaProvisionedReadCapacityAutoScalingSettingsUpdate: Option[AutoScalingSettingsUpdate] = None,
    replicaGlobalSecondaryIndexSettingsUpdate: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]] = None
) {
  def withRegionName(value: Option[String]): ReplicaSettingsUpdate =
    copy(regionName = value)
  def withReplicaProvisionedReadCapacityUnits(value: Option[Long]): ReplicaSettingsUpdate =
    copy(replicaProvisionedReadCapacityUnits = value)
  def withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaSettingsUpdate =
    copy(replicaProvisionedReadCapacityAutoScalingSettingsUpdate = value)
  def withReplicaGlobalSecondaryIndexSettingsUpdate(
      value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]]
  ): ReplicaSettingsUpdate =
    copy(replicaGlobalSecondaryIndexSettingsUpdate = value)
}
