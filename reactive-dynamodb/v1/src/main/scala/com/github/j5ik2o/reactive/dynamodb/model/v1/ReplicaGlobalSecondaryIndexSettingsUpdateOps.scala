package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => JavaReplicaGlobalSecondaryIndexSettingsUpdate
}
import com.github.j5ik2o.reactive.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => ScalaReplicaGlobalSecondaryIndexSettingsUpdate
}

object ReplicaGlobalSecondaryIndexSettingsUpdateOps {

  import AutoScalingSettingsUpdateOps._

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsUpdate = {
      val result = new JavaReplicaGlobalSecondaryIndexSettingsUpdate()
      self.indexName.foreach(result.setIndexName)
      self.provisionedReadCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.setProvisionedReadCapacityAutoScalingSettingsUpdate)
      self.provisionedReadCapacityUnits.foreach(v => result.setProvisionedReadCapacityUnits(v))
      result
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaReplicaGlobalSecondaryIndexSettingsUpdate = {
      ScalaReplicaGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.getIndexName))
        .withProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.getProvisionedReadCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
        .withProvisionedReadCapacityUnits(Option(self.getProvisionedReadCapacityUnits))
    }

  }

}
