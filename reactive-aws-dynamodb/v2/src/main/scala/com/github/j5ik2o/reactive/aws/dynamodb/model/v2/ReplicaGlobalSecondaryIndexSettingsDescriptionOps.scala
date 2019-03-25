package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReplicaGlobalSecondaryIndexSettingsDescription => ScalaReplicaGlobalSecondaryIndexSettingsDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaGlobalSecondaryIndexSettingsDescription => JavaReplicaGlobalSecondaryIndexSettingsDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaGlobalSecondaryIndexSettingsDescriptionOps {

  implicit class ScalaReplicaGlobalSecondaryIndexSettingsDescriptionOps(val self: ScalaReplicaGlobalSecondaryIndexSettingsDescription) extends AnyVal {

    def toJava: JavaReplicaGlobalSecondaryIndexSettingsDescription = {
      val result = JavaReplicaGlobalSecondaryIndexSettingsDescription.builder()
                                                      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String, case String
                      self.indexStatus.foreach{ v => import IndexStatusOps._; result.indexStatus(v.toJava) } // String, case Other
                      self.provisionedReadCapacityUnits.map(_.longValue).foreach(v => result.provisionedReadCapacityUnits(v)) // Long, case Long
                      self.provisionedReadCapacityAutoScalingSettings.foreach{ v => import AutoScalingSettingsDescriptionOps._; result.provisionedReadCapacityAutoScalingSettings(v.toJava) } // AutoScalingSettingsDescription, case Other
                      self.provisionedWriteCapacityUnits.map(_.longValue).foreach(v => result.provisionedWriteCapacityUnits(v)) // Long, case Long
                      self.provisionedWriteCapacityAutoScalingSettings.foreach{ v => import AutoScalingSettingsDescriptionOps._; result.provisionedWriteCapacityAutoScalingSettings(v.toJava) } // AutoScalingSettingsDescription, case Other

      result.build()
    }

  }

  implicit class JavaReplicaGlobalSecondaryIndexSettingsDescriptionOps(val self: JavaReplicaGlobalSecondaryIndexSettingsDescription) extends AnyVal {

     def toScala: ScalaReplicaGlobalSecondaryIndexSettingsDescription = {
       ScalaReplicaGlobalSecondaryIndexSettingsDescription()
            .withIndexName(Option(self.indexName)) // String
            .withIndexStatus(Option(self.indexStatus).map{ v => import IndexStatusOps._; v.toScala}) // String, Map-12
            .withProvisionedReadCapacityUnits(Option(self.provisionedReadCapacityUnits).map(_.longValue)) // Long
            .withProvisionedReadCapacityAutoScalingSettings(Option(self.provisionedReadCapacityAutoScalingSettings).map{ v => import AutoScalingSettingsDescriptionOps._; v.toScala}) // AutoScalingSettingsDescription, Map-12
            .withProvisionedWriteCapacityUnits(Option(self.provisionedWriteCapacityUnits).map(_.longValue)) // Long
            .withProvisionedWriteCapacityAutoScalingSettings(Option(self.provisionedWriteCapacityAutoScalingSettings).map{ v => import AutoScalingSettingsDescriptionOps._; v.toScala}) // AutoScalingSettingsDescription, Map-12
     }

   }

}