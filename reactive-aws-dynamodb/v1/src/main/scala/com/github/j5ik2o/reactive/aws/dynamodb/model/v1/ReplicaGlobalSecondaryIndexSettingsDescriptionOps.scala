package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  ReplicaGlobalSecondaryIndexSettingsDescription => JavaReplicaGlobalSecondaryIndexSettingsDescription
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  IndexStatus,
  ReplicaGlobalSecondaryIndexSettingsDescription => ScalaReplicaGlobalSecondaryIndexSettingsDescription
}

object ReplicaGlobalSecondaryIndexSettingsDescriptionOps {

  import AutoScalingSettingsDescriptionOps._

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsDescriptionOps(
      val self: ScalaReplicaGlobalSecondaryIndexSettingsDescription
  ) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsDescription = {
      val result = new JavaReplicaGlobalSecondaryIndexSettingsDescription()
      self.indexName.foreach(result.setIndexName)
      self.indexStatus.map(_.entryName).foreach(result.setIndexStatus)
      self.provisionedReadCapacityUnits.foreach(v => result.setProvisionedReadCapacityUnits(v))
      self.provisionedReadCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.setProvisionedReadCapacityAutoScalingSettings)
      self.provisionedWriteCapacityUnits.foreach(v => result.setProvisionedWriteCapacityUnits(v))
      self.provisionedWriteCapacityAutoScalingSettings
        .map(_.toJava).foreach(result.setProvisionedWriteCapacityAutoScalingSettings)
      result
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsDescriptionOps(
      val self: JavaReplicaGlobalSecondaryIndexSettingsDescription
  ) extends AnyVal {

    def toScala: ScalaReplicaGlobalSecondaryIndexSettingsDescription = {
      ScalaReplicaGlobalSecondaryIndexSettingsDescription()
        .withIndexName(Option(self.getIndexName))
        .withIndexStatus(Option(self.getIndexStatus).map(IndexStatus.withName))
        .withProvisionedReadCapacityUnits(Option(self.getProvisionedReadCapacityUnits))
        .withProvisionedReadCapacityAutoScalingSettings(
          Option(self.getProvisionedReadCapacityAutoScalingSettings).map(_.toScala)
        )
        .withProvisionedWriteCapacityUnits(Option(self.getProvisionedWriteCapacityUnits))
        .withProvisionedWriteCapacityAutoScalingSettings(
          Option(self.getProvisionedWriteCapacityAutoScalingSettings).map(_.toScala)
        )
    }

  }

}
