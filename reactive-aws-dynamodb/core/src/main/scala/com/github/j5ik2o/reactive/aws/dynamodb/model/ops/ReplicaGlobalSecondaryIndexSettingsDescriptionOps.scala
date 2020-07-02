// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexSettingsDescriptionBuilderOps(
    val self: ReplicaGlobalSecondaryIndexSettingsDescription.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexStatusAsScala(value: Option[IndexStatus]): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v => self.indexStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityUnitsAsScala(
      value: Option[Long]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v => self.provisionedReadCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v => self.provisionedReadCapacityAutoScalingSettings(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityUnitsAsScala(
      value: Option[Long]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v => self.provisionedWriteCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v => self.provisionedWriteCapacityAutoScalingSettings(v) }
  }

}

final class ReplicaGlobalSecondaryIndexSettingsDescriptionOps(val self: ReplicaGlobalSecondaryIndexSettingsDescription)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexStatusAsScala: Option[IndexStatus] = Option(self.indexStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.provisionedReadCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.provisionedReadCapacityAutoScalingSettings)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityUnitsAsScala: Option[Long] = Option(self.provisionedWriteCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.provisionedWriteCapacityAutoScalingSettings)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaGlobalSecondaryIndexSettingsDescriptionOps {

  implicit def toReplicaGlobalSecondaryIndexSettingsDescriptionBuilderOps(
      v: ReplicaGlobalSecondaryIndexSettingsDescription.Builder
  ): ReplicaGlobalSecondaryIndexSettingsDescriptionBuilderOps =
    new ReplicaGlobalSecondaryIndexSettingsDescriptionBuilderOps(v)

  implicit def toReplicaGlobalSecondaryIndexSettingsDescriptionOps(
      v: ReplicaGlobalSecondaryIndexSettingsDescription
  ): ReplicaGlobalSecondaryIndexSettingsDescriptionOps = new ReplicaGlobalSecondaryIndexSettingsDescriptionOps(v)

}
