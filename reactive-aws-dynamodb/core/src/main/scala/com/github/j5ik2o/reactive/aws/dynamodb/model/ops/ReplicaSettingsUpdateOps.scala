// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaSettingsUpdateBuilderOps(val self: ReplicaSettingsUpdate.Builder) extends AnyVal {

  final def withRegionNameAsScala(value: Option[String]): ReplicaSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  } // String

  final def withReplicaProvisionedReadCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityUnits(v)
    }
  } // Long

  final def withReplicaProvisionedReadCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(v)
    }
  } // AutoScalingSettingsUpdate

  final def withReplicaGlobalSecondaryIndexSettingsUpdateAsScala(
      value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]]
  ): ReplicaSettingsUpdate.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaGlobalSecondaryIndexSettingsUpdate(v.asJava)
    } // Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]
  }

}

final class ReplicaSettingsUpdateOps(val self: ReplicaSettingsUpdate) extends AnyVal {

  final def regionNameAsScala: Option[String] = Option(self.regionName) // String

  final def replicaProvisionedReadCapacityUnitsAsScala: Option[Long] =
    Option(self.replicaProvisionedReadCapacityUnits) // Long

  final def replicaProvisionedReadCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate) // AutoScalingSettingsUpdate

  final def replicaGlobalSecondaryIndexSettingsUpdateAsScala: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]] =
    Option(self.replicaGlobalSecondaryIndexSettingsUpdate).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaSettingsUpdateOps {

  implicit def toReplicaSettingsUpdateBuilderOps(v: ReplicaSettingsUpdate.Builder): ReplicaSettingsUpdateBuilderOps =
    new ReplicaSettingsUpdateBuilderOps(v)

  implicit def toReplicaSettingsUpdateOps(v: ReplicaSettingsUpdate): ReplicaSettingsUpdateOps =
    new ReplicaSettingsUpdateOps(v)

}
