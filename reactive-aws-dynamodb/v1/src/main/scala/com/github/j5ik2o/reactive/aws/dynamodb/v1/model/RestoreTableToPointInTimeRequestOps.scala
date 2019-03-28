// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableToPointInTimeRequest => ScalaRestoreTableToPointInTimeRequest,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  RestoreTableToPointInTimeRequest => JavaRestoreTableToPointInTimeRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreTableToPointInTimeRequestOps {

  implicit class ScalaRestoreTableToPointInTimeRequestOps(val self: ScalaRestoreTableToPointInTimeRequest)
      extends AnyVal {

    def toJava: JavaRestoreTableToPointInTimeRequest = {
      val result = new JavaRestoreTableToPointInTimeRequest()
      self.sourceTableName.filter(_.nonEmpty).foreach(v => result.withSourceTableName(v))                  // String
      self.targetTableName.filter(_.nonEmpty).foreach(v => result.withTargetTableName(v))                  // String
      self.useLatestRestorableTime.map(_.booleanValue).foreach(v => result.withUseLatestRestorableTime(v)) // Boolean
      self.restoreDateTime.map(java.util.Date.from).foreach(v => result.withRestoreDateTime(v))            // Instant

      result
    }

  }

}
