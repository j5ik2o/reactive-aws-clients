// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexSettingsUpdateBuilderOps(
    val self: ReplicaGlobalSecondaryIndexSettingsUpdate.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityUnitsAsScala(
      value: Option[Long]
  ): ReplicaGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v => self.provisionedReadCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v => self.provisionedReadCapacityAutoScalingSettingsUpdate(v) }
  }

}

final class ReplicaGlobalSecondaryIndexSettingsUpdateOps(val self: ReplicaGlobalSecondaryIndexSettingsUpdate)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.provisionedReadCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.provisionedReadCapacityAutoScalingSettingsUpdate)

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
