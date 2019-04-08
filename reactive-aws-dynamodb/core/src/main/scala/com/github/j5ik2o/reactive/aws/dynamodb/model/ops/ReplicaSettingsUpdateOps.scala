// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaSettingsUpdateBuilderOps(val self: ReplicaSettingsUpdate.Builder) extends AnyVal {

  final def regionNameAsScala(value: Option[String]): ReplicaSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

  final def replicaProvisionedReadCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityUnits(v)
    }
  }

  final def replicaProvisionedReadCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): ReplicaSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(v)
    }
  }

  final def replicaGlobalSecondaryIndexSettingsUpdateAsScala(
      value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]]
  ): ReplicaSettingsUpdate.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaGlobalSecondaryIndexSettingsUpdate(v.asJava)
    }
  }

}

final class ReplicaSettingsUpdateOps(val self: ReplicaSettingsUpdate) extends AnyVal {

  final def regionNameAsScala: Option[String] = Option(self.regionName)

  final def replicaProvisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.replicaProvisionedReadCapacityUnits)

  final def replicaProvisionedReadCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate)

  final def replicaGlobalSecondaryIndexSettingsUpdateAsScala: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]] =
    Option(self.replicaGlobalSecondaryIndexSettingsUpdate).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaSettingsUpdateOps {

  implicit def toReplicaSettingsUpdateBuilderOps(v: ReplicaSettingsUpdate.Builder): ReplicaSettingsUpdateBuilderOps =
    new ReplicaSettingsUpdateBuilderOps(v)

  implicit def toReplicaSettingsUpdateOps(v: ReplicaSettingsUpdate): ReplicaSettingsUpdateOps =
    new ReplicaSettingsUpdateOps(v)

}
