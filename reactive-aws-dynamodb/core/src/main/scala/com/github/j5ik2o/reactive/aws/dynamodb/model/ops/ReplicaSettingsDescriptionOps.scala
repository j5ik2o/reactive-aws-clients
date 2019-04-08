// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaSettingsDescriptionBuilderOps(val self: ReplicaSettingsDescription.Builder) extends AnyVal {

  final def regionNameAsScala(value: Option[String]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

  final def replicaStatusAsScala(value: Option[ReplicaStatus]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaStatus(v)
    }
  }

  final def replicaBillingModeSummaryAsScala(value: Option[BillingModeSummary]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaBillingModeSummary(v)
    }
  }

  final def replicaProvisionedReadCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityUnits(v)
    }
  }

  final def replicaProvisionedReadCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityAutoScalingSettings(v)
    }
  }

  final def replicaProvisionedWriteCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedWriteCapacityUnits(v)
    }
  }

  final def replicaProvisionedWriteCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedWriteCapacityAutoScalingSettings(v)
    }
  }

  final def replicaGlobalSecondaryIndexSettingsAsScala(
      value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]]
  ): ReplicaSettingsDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaGlobalSecondaryIndexSettings(v.asJava)
    }
  }

}

final class ReplicaSettingsDescriptionOps(val self: ReplicaSettingsDescription) extends AnyVal {

  final def regionNameAsScala: Option[String] = Option(self.regionName)

  final def replicaStatusAsScala: Option[ReplicaStatus] = Option(self.replicaStatus)

  final def replicaBillingModeSummaryAsScala: Option[BillingModeSummary] = Option(self.replicaBillingModeSummary)

  final def replicaProvisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.replicaProvisionedReadCapacityUnits)

  final def replicaProvisionedReadCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.replicaProvisionedReadCapacityAutoScalingSettings)

  final def replicaProvisionedWriteCapacityUnitsAsScala: Option[Long] =
    Option(self.replicaProvisionedWriteCapacityUnits)

  final def replicaProvisionedWriteCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.replicaProvisionedWriteCapacityAutoScalingSettings)

  final def replicaGlobalSecondaryIndexSettingsAsScala: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]] =
    Option(self.replicaGlobalSecondaryIndexSettings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaSettingsDescriptionOps {

  implicit def toReplicaSettingsDescriptionBuilderOps(
      v: ReplicaSettingsDescription.Builder
  ): ReplicaSettingsDescriptionBuilderOps = new ReplicaSettingsDescriptionBuilderOps(v)

  implicit def toReplicaSettingsDescriptionOps(v: ReplicaSettingsDescription): ReplicaSettingsDescriptionOps =
    new ReplicaSettingsDescriptionOps(v)

}
