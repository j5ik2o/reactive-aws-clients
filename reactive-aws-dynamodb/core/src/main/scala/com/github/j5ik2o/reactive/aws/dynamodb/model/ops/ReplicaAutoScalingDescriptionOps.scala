// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaAutoScalingDescriptionBuilderOps(val self: ReplicaAutoScalingDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala(value: Option[String]): ReplicaAutoScalingDescription.Builder = {
    value.fold(self) { v => self.regionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala(
      value: Option[Seq[ReplicaGlobalSecondaryIndexAutoScalingDescription]]
  ): ReplicaAutoScalingDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaProvisionedReadCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaAutoScalingDescription.Builder = {
    value.fold(self) { v => self.replicaProvisionedReadCapacityAutoScalingSettings(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaProvisionedWriteCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaAutoScalingDescription.Builder = {
    value.fold(self) { v => self.replicaProvisionedWriteCapacityAutoScalingSettings(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaStatusAsScala(value: Option[ReplicaStatus]): ReplicaAutoScalingDescription.Builder = {
    value.fold(self) { v => self.replicaStatus(v) }
  }

}

final class ReplicaAutoScalingDescriptionOps(val self: ReplicaAutoScalingDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala: Option[String] = Option(self.regionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala: Option[Seq[ReplicaGlobalSecondaryIndexAutoScalingDescription]] =
    Option(self.globalSecondaryIndexes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaProvisionedReadCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.replicaProvisionedReadCapacityAutoScalingSettings)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaProvisionedWriteCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.replicaProvisionedWriteCapacityAutoScalingSettings)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaStatusAsScala: Option[ReplicaStatus] = Option(self.replicaStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaAutoScalingDescriptionOps {

  implicit def toReplicaAutoScalingDescriptionBuilderOps(
      v: ReplicaAutoScalingDescription.Builder
  ): ReplicaAutoScalingDescriptionBuilderOps = new ReplicaAutoScalingDescriptionBuilderOps(v)

  implicit def toReplicaAutoScalingDescriptionOps(v: ReplicaAutoScalingDescription): ReplicaAutoScalingDescriptionOps =
    new ReplicaAutoScalingDescriptionOps(v)

}
