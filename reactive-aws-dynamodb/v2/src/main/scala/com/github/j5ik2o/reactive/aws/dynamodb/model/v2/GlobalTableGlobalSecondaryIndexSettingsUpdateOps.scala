package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate
}
import software.amazon.awssdk.services.dynamodb.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
}

object GlobalTableGlobalSecondaryIndexSettingsUpdateOps {

  import AutoScalingSettingsUpdateOps._

  implicit class ScalaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val result = JavaGlobalTableGlobalSecondaryIndexSettingsUpdate.builder()
      self.indexName.foreach(result.indexName)
      self.provisionedWriteCapacityUnits.foreach(v => result.provisionedWriteCapacityUnits(v))
      self.provisionedWriteCapacityAutoScalingSettingsUpdate
        .map(_.toJava).foreach(result.provisionedWriteCapacityAutoScalingSettingsUpdate)
      result.build()
    }

  }

  implicit class JavaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.indexName))
        .withProvisionedWriteCapacityUnits(Option(self.provisionedWriteCapacityUnits).map(_.longValue()))
        .withProvisionedWriteCapacityAutoScalingSettingsUpdate(
          Option(self.provisionedWriteCapacityAutoScalingSettingsUpdate).map(_.toScala)
        )
    }

  }

}
