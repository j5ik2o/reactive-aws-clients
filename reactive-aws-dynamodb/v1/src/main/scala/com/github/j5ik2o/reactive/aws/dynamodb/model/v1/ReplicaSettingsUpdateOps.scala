// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaSettingsUpdate => ScalaReplicaSettingsUpdate, _ }
import com.amazonaws.services.dynamodbv2.model.{ ReplicaSettingsUpdate => JavaReplicaSettingsUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaSettingsUpdateOps {

  implicit class ScalaReplicaSettingsUpdateOps(val self: ScalaReplicaSettingsUpdate) extends AnyVal {

    def toJava: JavaReplicaSettingsUpdate = {
      val result = new JavaReplicaSettingsUpdate()
      self.regionName.filter(_.nonEmpty).foreach(v => result.withRegionName(v)) // String
      self.replicaProvisionedReadCapacityUnits
        .map(_.longValue).foreach(v => result.withReplicaProvisionedReadCapacityUnits(v)) // Long
      self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._;
        result.withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate
      self.replicaGlobalSecondaryIndexSettingsUpdate.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaGlobalSecondaryIndexSettingsUpdateOps._;
        result.withReplicaGlobalSecondaryIndexSettingsUpdate(v.map(_.toJava).asJava)
      } // Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]

      result
    }

  }

  implicit class JavaReplicaSettingsUpdateOps(val self: JavaReplicaSettingsUpdate) extends AnyVal {

    def toScala: ScalaReplicaSettingsUpdate = {
      ScalaReplicaSettingsUpdate()
        .withRegionName(Option(self.getRegionName)) // String
        .withReplicaProvisionedReadCapacityUnits(Option(self.getReplicaProvisionedReadCapacityUnits).map(_.longValue)) // Long
        .withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate).map { v =>
            import AutoScalingSettingsUpdateOps._; v.toScala
          }
        ) // AutoScalingSettingsUpdate
        .withReplicaGlobalSecondaryIndexSettingsUpdate(Option(self.getReplicaGlobalSecondaryIndexSettingsUpdate).map {
          v =>
            import scala.collection.JavaConverters._, ReplicaGlobalSecondaryIndexSettingsUpdateOps._;
            v.asScala.map(_.toScala)
        }) // Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]
    }

  }

}
