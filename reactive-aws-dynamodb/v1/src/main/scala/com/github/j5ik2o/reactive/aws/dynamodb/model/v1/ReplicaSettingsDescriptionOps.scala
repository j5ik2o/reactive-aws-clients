package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ReplicaSettingsDescription => JavaReplicaSettingsDescription }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReplicaStatus,
  ReplicaSettingsDescription => ScalaReplicaSettingsDescription
}

import scala.collection.JavaConverters._

object ReplicaSettingsDescriptionOps {

  import AutoScalingSettingsDescriptionOps._
  import BillingModeSummaryOps._
  import ReplicaGlobalSecondaryIndexSettingsDescriptionOps._

  implicit class ScalaReplicaSettingsDescriptionOps(val self: ScalaReplicaSettingsDescription) extends AnyVal {

    def toJava: JavaReplicaSettingsDescription = {
      val result = new JavaReplicaSettingsDescription()
      self.regionName.foreach(result.setRegionName)
      self.replicaStatus.map(_.entryName).foreach(result.setReplicaStatus)
      self.replicaBillingModeSummary.map(_.toJava).foreach(result.setReplicaBillingModeSummary)
      self.replicaProvisionedReadCapacityUnits.foreach(v => result.setReplicaProvisionedReadCapacityUnits(v))
      self.replicaProvisionedReadCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.setReplicaProvisionedReadCapacityAutoScalingSettings)
      self.replicaProvisionedWriteCapacityUnits.foreach(v => result.setReplicaProvisionedWriteCapacityUnits(v))
      self.replicaProvisionedWriteCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.setReplicaProvisionedWriteCapacityAutoScalingSettings)
      self.replicaGlobalSecondaryIndexSettings
        .map(_.map(_.toJava).asJava).foreach(result.setReplicaGlobalSecondaryIndexSettings)
      result
    }

  }

  implicit class JavaReplicaSettingsDescriptionOps(val self: JavaReplicaSettingsDescription) extends AnyVal {

    def toScala: ScalaReplicaSettingsDescription = {
      ScalaReplicaSettingsDescription()
        .withRegionName(Option(self.getRegionName))
        .withReplicaStatus(Option(self.getReplicaStatus).map(ReplicaStatus.withName))
        .withReplicaBillingModeSummary(Option(self.getReplicaBillingModeSummary).map(_.toScala))
        .withReplicaProvisionedReadCapacityUnits(Option(self.getReplicaProvisionedReadCapacityUnits))
        .withReplicaProvisionedReadCapacityAutoScalingSettings(
          Option(self.getReplicaProvisionedReadCapacityAutoScalingSettings).map(_.toScala)
        )
        .withReplicaProvisionedWriteCapacityUnits(Option(self.getReplicaProvisionedWriteCapacityUnits))
        .withReplicaProvisionedWriteCapacityAutoScalingSettings(
          Option(self.getReplicaProvisionedWriteCapacityAutoScalingSettings).map(_.toScala)
        )
        .withReplicaGlobalSecondaryIndexSettings(
          Option(self.getReplicaGlobalSecondaryIndexSettings).map(_.asScala.map(_.toScala))
        )
    }

  }

}
