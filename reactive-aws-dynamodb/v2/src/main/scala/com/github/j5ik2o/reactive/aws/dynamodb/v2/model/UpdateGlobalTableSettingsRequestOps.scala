// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalTableSettingsRequest => ScalaUpdateGlobalTableSettingsRequest,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateGlobalTableSettingsRequest => JavaUpdateGlobalTableSettingsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableSettingsRequestOps {

  implicit class ScalaUpdateGlobalTableSettingsRequestOps(val self: ScalaUpdateGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaUpdateGlobalTableSettingsRequest = {
      val result = JavaUpdateGlobalTableSettingsRequest.builder()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String
      self.globalTableBillingMode.foreach { v =>
        import BillingModeOps._; result.globalTableBillingMode(v.toJava)
      } // String
      self.globalTableProvisionedWriteCapacityUnits
        .map(_.longValue).foreach(v => result.globalTableProvisionedWriteCapacityUnits(v)) // Long
      self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._;
        result.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate
      self.globalTableGlobalSecondaryIndexSettingsUpdate.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalTableGlobalSecondaryIndexSettingsUpdateOps._;
        result.globalTableGlobalSecondaryIndexSettingsUpdate(v.map(_.toJava).asJava)
      } // Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]
      self.replicaSettingsUpdate.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaSettingsUpdateOps._;
        result.replicaSettingsUpdate(v.map(_.toJava).asJava)
      } // Seq[ReplicaSettingsUpdate]

      result.build()
    }

  }

}
