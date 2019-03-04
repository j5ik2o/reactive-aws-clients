package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  IndexStatus,
  ReplicaGlobalSecondaryIndexSettingsDescription => ScalaReplicaGlobalSecondaryIndexSettingsDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsDescription => JavaReplicaGlobalSecondaryIndexSettingsDescription
}
object ReplicaGlobalSecondaryIndexSettingsDescriptionOps {

  import AutoScalingSettingsDescriptionOps._

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsDescriptionOps(
      val self: ScalaReplicaGlobalSecondaryIndexSettingsDescription
  ) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsDescription = {
      val result = JavaReplicaGlobalSecondaryIndexSettingsDescription.builder()
      self.indexName.foreach(result.indexName)
      self.indexStatus.map(_.entryName).foreach(result.indexStatus)
      self.provisionedReadCapacityUnits.foreach(v => result.provisionedReadCapacityUnits(v))
      self.provisionedReadCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.provisionedReadCapacityAutoScalingSettings)
      self.provisionedWriteCapacityUnits.foreach(v => result.provisionedWriteCapacityUnits(v))
      self.provisionedWriteCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.provisionedWriteCapacityAutoScalingSettings)
      result.build()
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsDescriptionOps(
      val self: JavaReplicaGlobalSecondaryIndexSettingsDescription
  ) extends AnyVal {

    def toScala: ScalaReplicaGlobalSecondaryIndexSettingsDescription = {
      ScalaReplicaGlobalSecondaryIndexSettingsDescription()
        .withIndexName(Option(self.indexName))
        .withIndexStatus(Option(self.indexStatus).map(_.toString).map(IndexStatus.withName))
        .withProvisionedReadCapacityUnits(Option(self.provisionedReadCapacityUnits))
        .withProvisionedReadCapacityAutoScalingSettings(
          Option(self.provisionedReadCapacityAutoScalingSettings).map(_.toScala)
        )
        .withProvisionedWriteCapacityUnits(Option(self.provisionedWriteCapacityUnits))
        .withProvisionedWriteCapacityAutoScalingSettings(
          Option(self.provisionedWriteCapacityAutoScalingSettings).map(_.toScala)
        )
    }

  }

}
