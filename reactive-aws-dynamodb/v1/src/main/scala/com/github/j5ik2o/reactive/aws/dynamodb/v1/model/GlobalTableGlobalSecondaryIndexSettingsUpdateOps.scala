// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalTableGlobalSecondaryIndexSettingsUpdateOps {

  implicit class ScalaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val result = new JavaGlobalTableGlobalSecondaryIndexSettingsUpdate()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.provisionedWriteCapacityUnits
        .map(_.longValue).foreach(v => result.withProvisionedWriteCapacityUnits(v)) // Long
      self.provisionedWriteCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._; result.withProvisionedWriteCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate

      result
    }

  }

  implicit class JavaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.getIndexName)) // String
        .withProvisionedWriteCapacityUnits(Option(self.getProvisionedWriteCapacityUnits).map(_.longValue)) // Long
        .withProvisionedWriteCapacityAutoScalingSettingsUpdate(
          Option(self.getProvisionedWriteCapacityAutoScalingSettingsUpdate).map { v =>
            import AutoScalingSettingsUpdateOps._; v.toScala
          }
        ) // AutoScalingSettingsUpdate
    }

  }

}
