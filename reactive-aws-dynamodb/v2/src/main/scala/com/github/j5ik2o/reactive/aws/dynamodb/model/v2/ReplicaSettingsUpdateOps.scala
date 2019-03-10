package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaSettingsUpdate => ScalaReplicaSettingsUpdate }
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaSettingsUpdate => JavaReplicaSettingsUpdate }

import scala.collection.JavaConverters._

object ReplicaSettingsUpdateOps {

  import AutoScalingSettingsUpdateOps._
  import ReplicaGlobalSecondaryIndexSettingsUpdateOps._

  implicit class ScalaReplicaSettingsUpdateOps(val self: ScalaReplicaSettingsUpdate) extends AnyVal {

    def toJava: JavaReplicaSettingsUpdate = {
      val result = JavaReplicaSettingsUpdate.builder()
      self.regionName.foreach(result.regionName)
      self.replicaProvisionedReadCapacityUnits.foreach(v => result.replicaProvisionedReadCapacityUnits(v))
      self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.replicaProvisionedReadCapacityAutoScalingSettingsUpdate)
      self.replicaGlobalSecondaryIndexSettingsUpdate
        .map(_.map(_.toJava).asJava).foreach(result.replicaGlobalSecondaryIndexSettingsUpdate)
      result.build()
    }

  }

  implicit class JavaReplicaSettingsUpdateOps(val self: JavaReplicaSettingsUpdate) extends AnyVal {

    def toScala: ScalaReplicaSettingsUpdate = {
      ScalaReplicaSettingsUpdate()
        .withRegionName(Option(self.regionName))
        .withReplicaProvisionedReadCapacityUnits(Option(self.replicaProvisionedReadCapacityUnits).map(_.longValue()))
        .withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
        .withReplicaGlobalSecondaryIndexSettingsUpdate(
          Option(self.replicaGlobalSecondaryIndexSettingsUpdate).map(_.asScala.map(_.toScala))
        )
    }

  }

}
