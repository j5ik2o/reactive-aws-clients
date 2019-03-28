// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateGlobalTableSettingsRequest => ScalaUpdateGlobalTableSettingsRequest,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  UpdateGlobalTableSettingsRequest => JavaUpdateGlobalTableSettingsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableSettingsRequestOps {

  implicit class ScalaUpdateGlobalTableSettingsRequestOps(val self: ScalaUpdateGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaUpdateGlobalTableSettingsRequest = {
      val result = new JavaUpdateGlobalTableSettingsRequest()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.withGlobalTableName(v)) // String
      self.globalTableBillingMode.foreach { v =>
        import BillingModeOps._; result.withGlobalTableBillingMode(v.toJava)
      } // String
      self.globalTableProvisionedWriteCapacityUnits
        .map(_.longValue).foreach(v => result.withGlobalTableProvisionedWriteCapacityUnits(v)) // Long
      self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate.foreach { v =>
        import AutoScalingSettingsUpdateOps._;
        result.withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(v.toJava)
      } // AutoScalingSettingsUpdate
      self.globalTableGlobalSecondaryIndexSettingsUpdate.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalTableGlobalSecondaryIndexSettingsUpdateOps._;
        result.withGlobalTableGlobalSecondaryIndexSettingsUpdate(v.map(_.toJava).asJava)
      } // Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]
      self.replicaSettingsUpdate.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaSettingsUpdateOps._;
        result.withReplicaSettingsUpdate(v.map(_.toJava).asJava)
      } // Seq[ReplicaSettingsUpdate]

      result
    }

  }

}
