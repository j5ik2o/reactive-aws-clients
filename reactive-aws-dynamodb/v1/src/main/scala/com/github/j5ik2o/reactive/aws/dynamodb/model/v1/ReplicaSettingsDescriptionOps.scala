// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReplicaSettingsDescription => ScalaReplicaSettingsDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ ReplicaSettingsDescription => JavaReplicaSettingsDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaSettingsDescriptionOps {

  implicit class ScalaReplicaSettingsDescriptionOps(val self: ScalaReplicaSettingsDescription) extends AnyVal {

    def toJava: JavaReplicaSettingsDescription = {
      val result = new JavaReplicaSettingsDescription()
      self.regionName.filter(_.nonEmpty).foreach(v => result.withRegionName(v)) // String
      self.replicaStatus.foreach { v =>
        import ReplicaStatusOps._; result.withReplicaStatus(v.toJava)
      } // String
      self.replicaBillingModeSummary.foreach { v =>
        import BillingModeSummaryOps._; result.withReplicaBillingModeSummary(v.toJava)
      } // BillingModeSummary
      self.replicaProvisionedReadCapacityUnits
        .map(_.longValue).foreach(v => result.withReplicaProvisionedReadCapacityUnits(v)) // Long
      self.replicaProvisionedReadCapacityAutoScalingSettings.foreach { v =>
        import AutoScalingSettingsDescriptionOps._;
        result.withReplicaProvisionedReadCapacityAutoScalingSettings(v.toJava)
      } // AutoScalingSettingsDescription
      self.replicaProvisionedWriteCapacityUnits
        .map(_.longValue).foreach(v => result.withReplicaProvisionedWriteCapacityUnits(v)) // Long
      self.replicaProvisionedWriteCapacityAutoScalingSettings.foreach { v =>
        import AutoScalingSettingsDescriptionOps._;
        result.withReplicaProvisionedWriteCapacityAutoScalingSettings(v.toJava)
      } // AutoScalingSettingsDescription
      self.replicaGlobalSecondaryIndexSettings.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaGlobalSecondaryIndexSettingsDescriptionOps._;
        result.withReplicaGlobalSecondaryIndexSettings(v.map(_.toJava).asJava)
      } // Seq[ReplicaGlobalSecondaryIndexSettingsDescription]

      result
    }

  }

  implicit class JavaReplicaSettingsDescriptionOps(val self: JavaReplicaSettingsDescription) extends AnyVal {

    def toScala: ScalaReplicaSettingsDescription = {
      ScalaReplicaSettingsDescription()
        .withRegionName(Option(self.getRegionName)) // String
        .withReplicaStatus(Option(self.getReplicaStatus).map { v =>
          import ReplicaStatusOps._; v.toScala
        }) // String
        .withReplicaBillingModeSummary(Option(self.getReplicaBillingModeSummary).map { v =>
          import BillingModeSummaryOps._; v.toScala
        }) // BillingModeSummary
        .withReplicaProvisionedReadCapacityUnits(Option(self.getReplicaProvisionedReadCapacityUnits).map(_.longValue)) // Long
        .withReplicaProvisionedReadCapacityAutoScalingSettings(
          Option(self.getReplicaProvisionedReadCapacityAutoScalingSettings).map { v =>
            import AutoScalingSettingsDescriptionOps._; v.toScala
          }
        ) // AutoScalingSettingsDescription
        .withReplicaProvisionedWriteCapacityUnits(Option(self.getReplicaProvisionedWriteCapacityUnits).map(_.longValue)) // Long
        .withReplicaProvisionedWriteCapacityAutoScalingSettings(
          Option(self.getReplicaProvisionedWriteCapacityAutoScalingSettings).map { v =>
            import AutoScalingSettingsDescriptionOps._; v.toScala
          }
        ) // AutoScalingSettingsDescription
        .withReplicaGlobalSecondaryIndexSettings(Option(self.getReplicaGlobalSecondaryIndexSettings).map { v =>
          import scala.collection.JavaConverters._, ReplicaGlobalSecondaryIndexSettingsDescriptionOps._;
          v.asScala.map(_.toScala)
        }) // Seq[ReplicaGlobalSecondaryIndexSettingsDescription]
    }

  }

}
