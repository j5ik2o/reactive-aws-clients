// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexAutoScalingUpdateBuilderOps(
    val self: ReplicaGlobalSecondaryIndexAutoScalingUpdate.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndexAutoScalingUpdate.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaGlobalSecondaryIndexAutoScalingUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedReadCapacityAutoScalingUpdate(v)
    }
  }

}

final class ReplicaGlobalSecondaryIndexAutoScalingUpdateOps(val self: ReplicaGlobalSecondaryIndexAutoScalingUpdate)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedReadCapacityAutoScalingUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.provisionedReadCapacityAutoScalingUpdate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaGlobalSecondaryIndexAutoScalingUpdateOps {

  implicit def toReplicaGlobalSecondaryIndexAutoScalingUpdateBuilderOps(
      v: ReplicaGlobalSecondaryIndexAutoScalingUpdate.Builder
  ): ReplicaGlobalSecondaryIndexAutoScalingUpdateBuilderOps =
    new ReplicaGlobalSecondaryIndexAutoScalingUpdateBuilderOps(v)

  implicit def toReplicaGlobalSecondaryIndexAutoScalingUpdateOps(
      v: ReplicaGlobalSecondaryIndexAutoScalingUpdate
  ): ReplicaGlobalSecondaryIndexAutoScalingUpdateOps = new ReplicaGlobalSecondaryIndexAutoScalingUpdateOps(v)

}
