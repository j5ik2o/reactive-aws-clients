package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  ReplicaStatus,
  ReplicaSettingsDescription => ScalaReplicaSettingsDescription
}
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaSettingsDescription => JavaReplicaSettingsDescription }

import scala.collection.JavaConverters._

object ReplicaSettingsDescriptionOps {

  import AutoScalingSettingsDescriptionOps._
  import BillingModeSummaryOps._
  import ReplicaGlobalSecondaryIndexSettingsDescriptionOps._

  implicit class ScalaReplicaSettingsDescriptionOps(val self: ScalaReplicaSettingsDescription) extends AnyVal {

    def toJava: JavaReplicaSettingsDescription = {
      val result = JavaReplicaSettingsDescription.builder()
      self.regionName.foreach(result.regionName)
      self.replicaStatus.map(_.entryName).foreach(result.replicaStatus)
      self.replicaBillingModeSummary.map(_.toJava).foreach(result.replicaBillingModeSummary)
      self.replicaProvisionedReadCapacityUnits.foreach(v => result.replicaProvisionedReadCapacityUnits(v))
      self.replicaProvisionedReadCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.replicaProvisionedReadCapacityAutoScalingSettings)
      self.replicaProvisionedWriteCapacityUnits.foreach(v => result.replicaProvisionedWriteCapacityUnits(v))
      self.replicaProvisionedWriteCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.replicaProvisionedWriteCapacityAutoScalingSettings)
      self.replicaGlobalSecondaryIndexSettings
        .map(_.map(_.toJava).asJava).foreach(result.replicaGlobalSecondaryIndexSettings)
      result.build()
    }

  }

  implicit class JavaReplicaSettingsDescriptionOps(val self: JavaReplicaSettingsDescription) extends AnyVal {

    def toScala: ScalaReplicaSettingsDescription = {
      ScalaReplicaSettingsDescription()
        .withRegionName(Option(self.regionName))
        .withReplicaStatus(Option(self.replicaStatus).map(_.toString).map(ReplicaStatus.withName))
        .withReplicaBillingModeSummary(Option(self.replicaBillingModeSummary).map(_.toScala))
        .withReplicaProvisionedReadCapacityUnits(Option(self.replicaProvisionedReadCapacityUnits))
        .withReplicaProvisionedReadCapacityAutoScalingSettings(
          Option(self.replicaProvisionedReadCapacityAutoScalingSettings).map(_.toScala)
        )
        .withReplicaProvisionedWriteCapacityUnits(Option(self.replicaProvisionedWriteCapacityUnits))
        .withReplicaProvisionedWriteCapacityAutoScalingSettings(
          Option(self.replicaProvisionedWriteCapacityAutoScalingSettings).map(_.toScala)
        )
        .withReplicaGlobalSecondaryIndexSettings(
          Option(self.replicaGlobalSecondaryIndexSettings).map(_.asScala.map(_.toScala))
        )
    }

  }

}
