package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  BillingMode,
  UpdateGlobalTableSettingsRequest => ScalaUpdateGlobalTableSettingsRequest
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateGlobalTableSettingsRequest => JavaUpdateGlobalTableSettingsRequest
}

import scala.collection.JavaConverters._

object UpdateGlobalTableSettingsRequestOps {

  import AutoScalingSettingsUpdateOps._
  import GlobalTableGlobalSecondaryIndexSettingsUpdateOps._
  import ReplicaSettingsUpdateOps._

  implicit class ScalaUpdateGlobalTableSettingsRequestOps(val self: ScalaUpdateGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaUpdateGlobalTableSettingsRequest = {
      val result = JavaUpdateGlobalTableSettingsRequest.builder()
      self.globalTableName.foreach(result.globalTableName)
      self.globalTableBillingMode.map(_.entryName).foreach(result.globalTableBillingMode)
      self.globalTableProvisionedWriteCapacityUnits.foreach(v => result.globalTableProvisionedWriteCapacityUnits(v))
      self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate)
      self.globalTableGlobalSecondaryIndexSettingsUpdate
        .map(_.map(_.toJava).asJava).foreach(
          v => result.globalTableGlobalSecondaryIndexSettingsUpdate(v)
        )
      self.replicaSettingsUpdate.map(_.map(_.toJava).asJava).foreach(result.replicaSettingsUpdate)
      result.build()
    }

  }

  implicit class JavaUpdateGlobalTableSettingsRequestOps(val self: JavaUpdateGlobalTableSettingsRequest)
      extends AnyVal {

    def toScala: ScalaUpdateGlobalTableSettingsRequest = {
      ScalaUpdateGlobalTableSettingsRequest()
        .withGlobalTableName(Option(self.globalTableName))
        .withGlobalTableBillingMode(Option(self.globalTableBillingMode).map(_.toString).map(BillingMode.withName))
        .withGlobalTableProvisionedWriteCapacityUnits(
          Option(self.globalTableProvisionedWriteCapacityUnits).map(_.longValue())
        )
        .withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(
          Option(self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
        .withGlobalTableGlobalSecondaryIndexSettingsUpdate(
          Option(self.globalTableGlobalSecondaryIndexSettingsUpdate).map(_.asScala.map(_.toScala))
        )
        .withReplicaSettingsUpdate(Option(self.replicaSettingsUpdate).map(_.asScala.map(_.toScala)))
    }

  }

}
