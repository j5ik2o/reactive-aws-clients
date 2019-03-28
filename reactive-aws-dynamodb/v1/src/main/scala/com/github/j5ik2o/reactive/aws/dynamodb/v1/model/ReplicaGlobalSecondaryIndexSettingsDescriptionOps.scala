// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReplicaGlobalSecondaryIndexSettingsDescription => ScalaReplicaGlobalSecondaryIndexSettingsDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  ReplicaGlobalSecondaryIndexSettingsDescription => JavaReplicaGlobalSecondaryIndexSettingsDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaGlobalSecondaryIndexSettingsDescriptionOps {

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsDescriptionOps(
      val self: ScalaReplicaGlobalSecondaryIndexSettingsDescription
  ) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsDescription = {
      val result = new JavaReplicaGlobalSecondaryIndexSettingsDescription()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.indexStatus.foreach { v =>
        import IndexStatusOps._; result.withIndexStatus(v.toJava)
      } // String
      self.provisionedReadCapacityUnits
        .map(_.longValue).foreach(v => result.withProvisionedReadCapacityUnits(v)) // Long
      self.provisionedReadCapacityAutoScalingSettings.foreach { v =>
        import AutoScalingSettingsDescriptionOps._; result.withProvisionedReadCapacityAutoScalingSettings(v.toJava)
      } // AutoScalingSettingsDescription
      self.provisionedWriteCapacityUnits
        .map(_.longValue).foreach(v => result.withProvisionedWriteCapacityUnits(v)) // Long
      self.provisionedWriteCapacityAutoScalingSettings.foreach { v =>
        import AutoScalingSettingsDescriptionOps._; result.withProvisionedWriteCapacityAutoScalingSettings(v.toJava)
      } // AutoScalingSettingsDescription

      result
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsDescriptionOps(
      val self: JavaReplicaGlobalSecondaryIndexSettingsDescription
  ) extends AnyVal {

    def toScala: ScalaReplicaGlobalSecondaryIndexSettingsDescription = {
      ScalaReplicaGlobalSecondaryIndexSettingsDescription()
        .withIndexName(Option(self.getIndexName)) // String
        .withIndexStatus(Option(self.getIndexStatus).map { v =>
          import IndexStatusOps._; v.toScala
        }) // String
        .withProvisionedReadCapacityUnits(Option(self.getProvisionedReadCapacityUnits).map(_.longValue)) // Long
        .withProvisionedReadCapacityAutoScalingSettings(Option(self.getProvisionedReadCapacityAutoScalingSettings).map {
          v =>
            import AutoScalingSettingsDescriptionOps._; v.toScala
        }) // AutoScalingSettingsDescription
        .withProvisionedWriteCapacityUnits(Option(self.getProvisionedWriteCapacityUnits).map(_.longValue)) // Long
        .withProvisionedWriteCapacityAutoScalingSettings(
          Option(self.getProvisionedWriteCapacityAutoScalingSettings).map { v =>
            import AutoScalingSettingsDescriptionOps._; v.toScala
          }
        ) // AutoScalingSettingsDescription
    }

  }

}
