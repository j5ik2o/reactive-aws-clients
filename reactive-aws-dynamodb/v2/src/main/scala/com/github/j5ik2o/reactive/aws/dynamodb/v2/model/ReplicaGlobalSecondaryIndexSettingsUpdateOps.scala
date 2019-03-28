// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => ScalaReplicaGlobalSecondaryIndexSettingsUpdate,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsUpdate => JavaReplicaGlobalSecondaryIndexSettingsUpdate
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaGlobalSecondaryIndexSettingsUpdateOps {

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsUpdate = {
      val result = JavaReplicaGlobalSecondaryIndexSettingsUpdate.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v))                                     // String
      self.provisionedReadCapacityUnits.map(_.longValue).foreach(v => result.provisionedReadCapacityUnits(v)) // Long
      self.provisionedReadCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._; result.provisionedReadCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate

      result.build()
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaReplicaGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaReplicaGlobalSecondaryIndexSettingsUpdate = {
      ScalaReplicaGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.indexName)) // String
        .withProvisionedReadCapacityUnits(Option(self.provisionedReadCapacityUnits).map(_.longValue)) // Long
        .withProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.provisionedReadCapacityAutoScalingSettingsUpdate).map { v =>
            import AutoScalingSettingsUpdateOps._; v.toScala
          }
        ) // AutoScalingSettingsUpdate
    }

  }

}
