// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaAutoScalingUpdateBuilderOps(val self: ReplicaAutoScalingUpdate.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala(value: Option[String]): ReplicaAutoScalingUpdate.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaGlobalSecondaryIndexUpdatesAsScala(
      value: Option[Seq[ReplicaGlobalSecondaryIndexAutoScalingUpdate]]
  ): ReplicaAutoScalingUpdate.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.replicaGlobalSecondaryIndexUpdates(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaProvisionedReadCapacityAutoScalingUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaAutoScalingUpdate.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityAutoScalingUpdate(v)
    }
  }

}

final class ReplicaAutoScalingUpdateOps(val self: ReplicaAutoScalingUpdate) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala: Option[String] = Option(self.regionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaGlobalSecondaryIndexUpdatesAsScala: Option[Seq[ReplicaGlobalSecondaryIndexAutoScalingUpdate]] =
    Option(self.replicaGlobalSecondaryIndexUpdates).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaProvisionedReadCapacityAutoScalingUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.replicaProvisionedReadCapacityAutoScalingUpdate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaAutoScalingUpdateOps {

  implicit def toReplicaAutoScalingUpdateBuilderOps(
      v: ReplicaAutoScalingUpdate.Builder
  ): ReplicaAutoScalingUpdateBuilderOps = new ReplicaAutoScalingUpdateBuilderOps(v)

  implicit def toReplicaAutoScalingUpdateOps(v: ReplicaAutoScalingUpdate): ReplicaAutoScalingUpdateOps =
    new ReplicaAutoScalingUpdateOps(v)

}
