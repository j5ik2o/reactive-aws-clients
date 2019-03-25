package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReplicaSettingsDescription => ScalaReplicaSettingsDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{ ReplicaSettingsDescription => JavaReplicaSettingsDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicaSettingsDescriptionOps {

  implicit class ScalaReplicaSettingsDescriptionOps(val self: ScalaReplicaSettingsDescription) extends AnyVal {

    def toJava: JavaReplicaSettingsDescription = {
      val result = JavaReplicaSettingsDescription.builder()
      self.regionName.filter(_.nonEmpty).foreach(v => result.regionName(v)) // String, case String
      self.replicaStatus.foreach { v =>
        import ReplicaStatusOps._; result.replicaStatus(v.toJava)
      } // String, case Other
      self.replicaBillingModeSummary.foreach { v =>
        import BillingModeSummaryOps._; result.replicaBillingModeSummary(v.toJava)
      } // BillingModeSummary, case Other
      self.replicaProvisionedReadCapacityUnits
        .map(_.longValue).foreach(v => result.replicaProvisionedReadCapacityUnits(v)) // Long, case Long
      self.replicaProvisionedReadCapacityAutoScalingSettings.foreach { v =>
        import AutoScalingSettingsDescriptionOps._; result.replicaProvisionedReadCapacityAutoScalingSettings(v.toJava)
      } // AutoScalingSettingsDescription, case Other
      self.replicaProvisionedWriteCapacityUnits
        .map(_.longValue).foreach(v => result.replicaProvisionedWriteCapacityUnits(v)) // Long, case Long
      self.replicaProvisionedWriteCapacityAutoScalingSettings.foreach { v =>
        import AutoScalingSettingsDescriptionOps._; result.replicaProvisionedWriteCapacityAutoScalingSettings(v.toJava)
      } // AutoScalingSettingsDescription, case Other
      self.replicaGlobalSecondaryIndexSettings.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.replicaGlobalSecondaryIndexSettings(v.map(_.toJava).asJava)
      } // Seq[ReplicaGlobalSecondaryIndexSettingsDescription], case Seq[_], UserDefined

      result.build()
    }

  }

  implicit class JavaReplicaSettingsDescriptionOps(val self: JavaReplicaSettingsDescription) extends AnyVal {

    def toScala: ScalaReplicaSettingsDescription = {
      ScalaReplicaSettingsDescription()
        .withRegionName(Option(self.regionName)) // String
        .withReplicaStatus(Option(self.replicaStatus).map { v =>
          import ReplicaStatusOps._; v.toScala
        }) // String, Map-12
        .withReplicaBillingModeSummary(Option(self.replicaBillingModeSummary).map { v =>
          import BillingModeSummaryOps._; v.toScala
        }) // BillingModeSummary, Map-12
        .withReplicaProvisionedReadCapacityUnits(Option(self.replicaProvisionedReadCapacityUnits).map(_.longValue)) // Long
        .withReplicaProvisionedReadCapacityAutoScalingSettings(
          Option(self.replicaProvisionedReadCapacityAutoScalingSettings).map { v =>
            import AutoScalingSettingsDescriptionOps._; v.toScala
          }
        ) // AutoScalingSettingsDescription, Map-12
        .withReplicaProvisionedWriteCapacityUnits(Option(self.replicaProvisionedWriteCapacityUnits).map(_.longValue)) // Long
        .withReplicaProvisionedWriteCapacityAutoScalingSettings(
          Option(self.replicaProvisionedWriteCapacityAutoScalingSettings).map { v =>
            import AutoScalingSettingsDescriptionOps._; v.toScala
          }
        ) // AutoScalingSettingsDescription, Map-12
        .withReplicaGlobalSecondaryIndexSettings(Option(self.replicaGlobalSecondaryIndexSettings).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.toScala)
        }) // Seq[ReplicaGlobalSecondaryIndexSettingsDescription], Seq-6
    }

  }

}
