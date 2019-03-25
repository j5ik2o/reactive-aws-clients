package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaSettingsUpdate => ScalaReplicaSettingsUpdate, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaSettingsUpdate => JavaReplicaSettingsUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaSettingsUpdateOps {

  implicit class ScalaReplicaSettingsUpdateOps(val self: ScalaReplicaSettingsUpdate) extends AnyVal {

    def toJava: JavaReplicaSettingsUpdate = {
      val result = JavaReplicaSettingsUpdate.builder()
      self.regionName.filter(_.nonEmpty).foreach(v => result.regionName(v)) // String, case String
      self.replicaProvisionedReadCapacityUnits
        .map(_.longValue).foreach(v => result.replicaProvisionedReadCapacityUnits(v)) // Long, case Long
      self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._; result.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate, case Other
      self.replicaGlobalSecondaryIndexSettingsUpdate.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._;
        result.replicaGlobalSecondaryIndexSettingsUpdate(v.map(_.toJava).asJava)
      } // Seq[ReplicaGlobalSecondaryIndexSettingsUpdate], case Seq[_], UserDefined

      result.build()
    }

  }

  implicit class JavaReplicaSettingsUpdateOps(val self: JavaReplicaSettingsUpdate) extends AnyVal {

    def toScala: ScalaReplicaSettingsUpdate = {
      ScalaReplicaSettingsUpdate()
        .withRegionName(Option(self.regionName)) // String
        .withReplicaProvisionedReadCapacityUnits(Option(self.replicaProvisionedReadCapacityUnits).map(_.longValue)) // Long
        .withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate).map { v =>
            import AutoScalingSettingsUpdateOps._; v.toScala
          }
        ) // AutoScalingSettingsUpdate, Map-12
        .withReplicaGlobalSecondaryIndexSettingsUpdate(Option(self.replicaGlobalSecondaryIndexSettingsUpdate).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.toScala)
        }) // Seq[ReplicaGlobalSecondaryIndexSettingsUpdate], Seq-6
    }

  }

}
