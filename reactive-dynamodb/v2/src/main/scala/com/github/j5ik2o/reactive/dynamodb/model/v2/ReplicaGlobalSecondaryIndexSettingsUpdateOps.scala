package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => ScalaReplicaGlobalSecondaryIndexSettingsUpdate
}
import software.amazon.awssdk.services.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => JavaReplicaGlobalSecondaryIndexSettingsUpdate
}

object ReplicaGlobalSecondaryIndexSettingsUpdateOps {

  import AutoScalingSettingsUpdateOps._

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsUpdate = {
      val result = JavaReplicaGlobalSecondaryIndexSettingsUpdate.builder()
      self.indexName.foreach(result.indexName)
      self.provisionedReadCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.provisionedReadCapacityAutoScalingSettingsUpdate)
      self.provisionedReadCapacityUnits.foreach(v => result.provisionedReadCapacityUnits(v))
      result.build()
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaReplicaGlobalSecondaryIndexSettingsUpdate = {
      ScalaReplicaGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.indexName))
        .withProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.provisionedReadCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
        .withProvisionedReadCapacityUnits(Option(self.provisionedReadCapacityUnits))
    }

  }

}
