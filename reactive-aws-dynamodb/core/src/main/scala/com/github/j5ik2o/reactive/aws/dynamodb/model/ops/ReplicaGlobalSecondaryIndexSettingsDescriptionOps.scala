// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexSettingsDescriptionBuilderOps(
    val self: ReplicaGlobalSecondaryIndexSettingsDescription.Builder
) extends AnyVal {

  final def withIndexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def withIndexStatusAsScala(
      value: Option[IndexStatus]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.indexStatus(v)
    }
  } // String

  final def withProvisionedReadCapacityUnitsAsScala(
      value: Option[Long]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedReadCapacityUnits(v)
    }
  } // Long

  final def withProvisionedReadCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedReadCapacityAutoScalingSettings(v)
    }
  } // AutoScalingSettingsDescription

  final def withProvisionedWriteCapacityUnitsAsScala(
      value: Option[Long]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedWriteCapacityUnits(v)
    }
  } // Long

  final def withProvisionedWriteCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.provisionedWriteCapacityAutoScalingSettings(v)
    }
  } // AutoScalingSettingsDescription

}

final class ReplicaGlobalSecondaryIndexSettingsDescriptionOps(val self: ReplicaGlobalSecondaryIndexSettingsDescription)
    extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def indexStatusAsScala: Option[IndexStatus] = Option(self.indexStatus) // String

  final def provisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.provisionedReadCapacityUnits) // Long

  final def provisionedReadCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.provisionedReadCapacityAutoScalingSettings) // AutoScalingSettingsDescription

  final def provisionedWriteCapacityUnitsAsScala: Option[Long] = Option(self.provisionedWriteCapacityUnits) // Long

  final def provisionedWriteCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.provisionedWriteCapacityAutoScalingSettings) // AutoScalingSettingsDescription

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
