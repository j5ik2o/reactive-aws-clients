// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexSettingsUpdateBuilderOps(
    val self: ReplicaGlobalSecondaryIndexSettingsUpdate.Builder
) extends AnyVal {

  final def withIndexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def withProvisionedReadCapacityUnitsAsScala(
      value: Option[Long]
  ): ReplicaGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedReadCapacityUnits(v)
    }
  } // Long

  final def withProvisionedReadCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedReadCapacityAutoScalingSettingsUpdate(v)
    }
  } // AutoScalingSettingsUpdate

}

final class ReplicaGlobalSecondaryIndexSettingsUpdateOps(val self: ReplicaGlobalSecondaryIndexSettingsUpdate)
    extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def provisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.provisionedReadCapacityUnits) // Long

  final def provisionedReadCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.provisionedReadCapacityAutoScalingSettingsUpdate) // AutoScalingSettingsUpdate

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaGlobalSecondaryIndexSettingsUpdateOps {

  implicit def toReplicaGlobalSecondaryIndexSettingsUpdateBuilderOps(
      v: ReplicaGlobalSecondaryIndexSettingsUpdate.Builder
  ): ReplicaGlobalSecondaryIndexSettingsUpdateBuilderOps = new ReplicaGlobalSecondaryIndexSettingsUpdateBuilderOps(v)

  implicit def toReplicaGlobalSecondaryIndexSettingsUpdateOps(
      v: ReplicaGlobalSecondaryIndexSettingsUpdate
  ): ReplicaGlobalSecondaryIndexSettingsUpdateOps = new ReplicaGlobalSecondaryIndexSettingsUpdateOps(v)

}
