// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => ScalaReplicaGlobalSecondaryIndexSettingsUpdate,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => JavaReplicaGlobalSecondaryIndexSettingsUpdate
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaGlobalSecondaryIndexSettingsUpdateOps {

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsUpdate = {
      val result = new JavaReplicaGlobalSecondaryIndexSettingsUpdate()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.provisionedReadCapacityUnits
        .map(_.longValue).foreach(v => result.withProvisionedReadCapacityUnits(v)) // Long
      self.provisionedReadCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._; result.withProvisionedReadCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate

      result
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaReplicaGlobalSecondaryIndexSettingsUpdate = {
      ScalaReplicaGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.getIndexName)) // String
        .withProvisionedReadCapacityUnits(Option(self.getProvisionedReadCapacityUnits).map(_.longValue)) // Long
        .withProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.getProvisionedReadCapacityAutoScalingSettingsUpdate).map { v =>
            import AutoScalingSettingsUpdateOps._; v.toScala
          }
        ) // AutoScalingSettingsUpdate
    }

  }

}
