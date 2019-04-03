// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaSettingsDescriptionBuilderOps(val self: ReplicaSettingsDescription.Builder) extends AnyVal {

  final def withRegionNameAsScala(value: Option[String]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  } // String

  final def withReplicaStatusAsScala(value: Option[ReplicaStatus]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaStatus(v)
    }
  } // String

  final def withReplicaBillingModeSummaryAsScala(
      value: Option[BillingModeSummary]
  ): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaBillingModeSummary(v)
    }
  } // BillingModeSummary

  final def withReplicaProvisionedReadCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityUnits(v)
    }
  } // Long

  final def withReplicaProvisionedReadCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedReadCapacityAutoScalingSettings(v)
    }
  } // AutoScalingSettingsDescription

  final def withReplicaProvisionedWriteCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedWriteCapacityUnits(v)
    }
  } // Long

  final def withReplicaProvisionedWriteCapacityAutoScalingSettingsAsScala(
      value: Option[AutoScalingSettingsDescription]
  ): ReplicaSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.replicaProvisionedWriteCapacityAutoScalingSettings(v)
    }
  } // AutoScalingSettingsDescription

  final def withReplicaGlobalSecondaryIndexSettingsAsScala(
      value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]]
  ): ReplicaSettingsDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaGlobalSecondaryIndexSettings(v.asJava)
    } // Seq[ReplicaGlobalSecondaryIndexSettingsDescription]
  }

}

final class ReplicaSettingsDescriptionOps(val self: ReplicaSettingsDescription) extends AnyVal {

  final def regionNameAsScala: Option[String] = Option(self.regionName) // String

  final def replicaStatusAsScala: Option[ReplicaStatus] = Option(self.replicaStatus) // String

  final def replicaBillingModeSummaryAsScala: Option[BillingModeSummary] =
    Option(self.replicaBillingModeSummary) // BillingModeSummary

  final def replicaProvisionedReadCapacityUnitsAsScala: Option[Long] =
    Option(self.replicaProvisionedReadCapacityUnits) // Long

  final def replicaProvisionedReadCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.replicaProvisionedReadCapacityAutoScalingSettings) // AutoScalingSettingsDescription

  final def replicaProvisionedWriteCapacityUnitsAsScala: Option[Long] =
    Option(self.replicaProvisionedWriteCapacityUnits) // Long

  final def replicaProvisionedWriteCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] =
    Option(self.replicaProvisionedWriteCapacityAutoScalingSettings) // AutoScalingSettingsDescription

  final def replicaGlobalSecondaryIndexSettingsAsScala: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]] =
    Option(self.replicaGlobalSecondaryIndexSettings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[ReplicaGlobalSecondaryIndexSettingsDescription]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaSettingsDescriptionOps {

  implicit def toReplicaSettingsDescriptionBuilderOps(
      v: ReplicaSettingsDescription.Builder
  ): ReplicaSettingsDescriptionBuilderOps = new ReplicaSettingsDescriptionBuilderOps(v)

  implicit def toReplicaSettingsDescriptionOps(v: ReplicaSettingsDescription): ReplicaSettingsDescriptionOps =
    new ReplicaSettingsDescriptionOps(v)

}
