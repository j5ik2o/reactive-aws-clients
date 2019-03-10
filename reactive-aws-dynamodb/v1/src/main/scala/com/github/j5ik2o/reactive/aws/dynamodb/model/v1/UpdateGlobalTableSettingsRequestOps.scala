package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  UpdateGlobalTableSettingsRequest => JavaUpdateGlobalTableSettingsRequest
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  BillingMode,
  UpdateGlobalTableSettingsRequest => ScalaUpdateGlobalTableSettingsRequest
}

import scala.collection.JavaConverters._

object UpdateGlobalTableSettingsRequestOps {

  import AutoScalingSettingsUpdateOps._
  import GlobalTableGlobalSecondaryIndexSettingsUpdateOps._
  import ReplicaSettingsUpdateOps._

  implicit class ScalaUpdateGlobalTableSettingsRequestOps(val self: ScalaUpdateGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaUpdateGlobalTableSettingsRequest = {
      val result = new JavaUpdateGlobalTableSettingsRequest()
      self.globalTableName.foreach(result.setGlobalTableName)
      self.globalTableBillingMode.map(_.entryName).foreach(result.setGlobalTableBillingMode)
      self.globalTableProvisionedWriteCapacityUnits.foreach(v => result.setGlobalTableProvisionedWriteCapacityUnits(v))
      self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate)
      self.globalTableGlobalSecondaryIndexSettingsUpdate
        .map(_.map(_.toJava).asJava).foreach(
          v => result.setGlobalTableGlobalSecondaryIndexSettingsUpdate(v)
        )
      self.replicaSettingsUpdate.map(_.map(_.toJava).asJava).foreach(result.setReplicaSettingsUpdate)
      result
    }

  }

  implicit class JavaUpdateGlobalTableSettingsRequestOps(val self: JavaUpdateGlobalTableSettingsRequest)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalTableSettingsRequest = {
      ScalaUpdateGlobalTableSettingsRequest()
        .withGlobalTableName(Option(self.getGlobalTableName))
        .withGlobalTableBillingMode(Option(self.getGlobalTableBillingMode).map(BillingMode.withName))
        .withGlobalTableProvisionedWriteCapacityUnits(
          Option(self.getGlobalTableProvisionedWriteCapacityUnits).map(_.longValue())
        )
        .withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(
          Option(self.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
        .withGlobalTableGlobalSecondaryIndexSettingsUpdate(
          Option(self.getGlobalTableGlobalSecondaryIndexSettingsUpdate).map(_.asScala.map(_.toScala))
        )
        .withReplicaSettingsUpdate(Option(self.getReplicaSettingsUpdate).map(_.asScala.map(_.toScala)))
    }

  }

}
