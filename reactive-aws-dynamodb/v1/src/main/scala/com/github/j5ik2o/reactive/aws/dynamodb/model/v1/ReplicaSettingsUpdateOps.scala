package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ReplicaSettingsUpdate => JavaReplicaSettingsUpdate }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaSettingsUpdate => ScalaReplicaSettingsUpdate }

import scala.collection.JavaConverters._

object ReplicaSettingsUpdateOps {

  import AutoScalingSettingsUpdateOps._
  import ReplicaGlobalSecondaryIndexSettingsUpdateOps._

  implicit class ScalaReplicaSettingsUpdateOps(val self: ScalaReplicaSettingsUpdate) extends AnyVal {

    def toJava: JavaReplicaSettingsUpdate = {
      val result = new JavaReplicaSettingsUpdate()
      self.regionName.foreach(result.setRegionName)
      self.replicaProvisionedReadCapacityUnits.foreach(v => result.setReplicaProvisionedReadCapacityUnits(v))
      self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate)
      self.replicaGlobalSecondaryIndexSettingsUpdate
        .map(_.map(_.toJava).asJava).foreach(result.setReplicaGlobalSecondaryIndexSettingsUpdate)
      result
    }

  }

  implicit class JavaReplicaSettingsUpdateOps(val self: JavaReplicaSettingsUpdate) extends AnyVal {

    def toScala: ScalaReplicaSettingsUpdate = {
      ScalaReplicaSettingsUpdate()
        .withRegionName(Option(self.getRegionName))
        .withReplicaProvisionedReadCapacityUnits(Option(self.getReplicaProvisionedReadCapacityUnits).map(_.longValue()))
        .withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
          Option(self.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
        .withReplicaGlobalSecondaryIndexSettingsUpdate(
          Option(self.getReplicaGlobalSecondaryIndexSettingsUpdate).map(_.asScala.map(_.toScala))
        )
    }

  }

}
