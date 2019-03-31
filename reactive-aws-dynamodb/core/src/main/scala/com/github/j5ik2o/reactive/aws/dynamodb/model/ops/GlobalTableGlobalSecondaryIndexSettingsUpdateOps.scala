// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  GlobalTableGlobalSecondaryIndexSettingsUpdate => JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalTableGlobalSecondaryIndexSettingsUpdateOps {

  implicit class ScalaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toJava: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val result = JavaGlobalTableGlobalSecondaryIndexSettingsUpdate.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v))                                       // String
      self.provisionedWriteCapacityUnits.map(_.longValue).foreach(v => result.provisionedWriteCapacityUnits(v)) // Long
      self.provisionedWriteCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._; result.provisionedWriteCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate

      result.build()
    }

  }

  implicit class JavaGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      val self: JavaGlobalTableGlobalSecondaryIndexSettingsUpdate
  ) extends AnyVal {

    def toScala: ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate()
        .withIndexName(Option(self.indexName)) // String
        .withProvisionedWriteCapacityUnits(Option(self.provisionedWriteCapacityUnits).map(_.longValue)) // Long
        .withProvisionedWriteCapacityAutoScalingSettingsUpdate(
          Option(self.provisionedWriteCapacityAutoScalingSettingsUpdate).map { v =>
            import AutoScalingSettingsUpdateOps._; v.toScala
          }
        ) // AutoScalingSettingsUpdate
    }

  }

}
