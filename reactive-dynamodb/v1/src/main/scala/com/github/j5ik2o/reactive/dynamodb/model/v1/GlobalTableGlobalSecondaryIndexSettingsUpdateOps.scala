package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
}
import com.github.j5ik2o.reactive.dynamodb.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate
}

object GlobalTableGlobalSecondaryIndexSettingsUpdateOps {

  import AutoScalingSettingsUpdateOps._

  implicit class ScalaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val result = new JavaGlobalTableGlobalSecondaryIndexSettingsUpdate()
      self.indexName.foreach(result.setIndexName)
      self.provisionedWriteCapacityUnits.foreach(v => result.setProvisionedWriteCapacityUnits(v))
      self.provisionedWriteCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.setProvisionedWriteCapacityAutoScalingSettingsUpdate)
      result
    }

  }

  implicit class JavaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.getIndexName))
        .withProvisionedWriteCapacityUnits(Option(self.getProvisionedWriteCapacityUnits))
        .withProvisionedWriteCapacityAutoScalingSettingsUpdate(
          Option(self.getProvisionedWriteCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
    }

  }

}
