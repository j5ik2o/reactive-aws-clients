// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexAutoScalingDescriptionBuilderOps(
    val self: ReplicaGlobalSecondaryIndexAutoScalingDescription.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndexAutoScalingDescription.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexStatusAsScala(
      value: Option[IndexStatus]
  ): ReplicaGlobalSecondaryIndexAutoScalingDescription.Builder = {
    value.fold(self) { v => self.indexStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexAutoScalingDescription.Builder = {
    value.fold(self) { v => self.provisionedReadCapacityAutoScalingSettings(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaGlobalSecondaryIndexAutoScalingDescription.Builder = {
    value.fold(self) { v => self.provisionedWriteCapacityAutoScalingSettings(v) }
  }

}

final class ReplicaGlobalSecondaryIndexAutoScalingDescriptionOps(
    val self: ReplicaGlobalSecondaryIndexAutoScalingDescription
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexStatusAsScala: Option[IndexStatus] = Option(self.indexStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.provisionedReadCapacityAutoScalingSettings)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.provisionedWriteCapacityAutoScalingSettings)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaGlobalSecondaryIndexAutoScalingDescriptionOps {

  implicit def toReplicaGlobalSecondaryIndexAutoScalingDescriptionBuilderOps(
      v: ReplicaGlobalSecondaryIndexAutoScalingDescription.Builder
  ): ReplicaGlobalSecondaryIndexAutoScalingDescriptionBuilderOps =
    new ReplicaGlobalSecondaryIndexAutoScalingDescriptionBuilderOps(v)

  implicit def toReplicaGlobalSecondaryIndexAutoScalingDescriptionOps(
      v: ReplicaGlobalSecondaryIndexAutoScalingDescription
  ): ReplicaGlobalSecondaryIndexAutoScalingDescriptionOps = new ReplicaGlobalSecondaryIndexAutoScalingDescriptionOps(v)

}
