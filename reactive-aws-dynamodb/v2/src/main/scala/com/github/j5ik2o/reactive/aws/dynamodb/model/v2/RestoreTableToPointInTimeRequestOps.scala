// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableToPointInTimeRequest => ScalaRestoreTableToPointInTimeRequest,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  RestoreTableToPointInTimeRequest => JavaRestoreTableToPointInTimeRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreTableToPointInTimeRequestOps {

  implicit class ScalaRestoreTableToPointInTimeRequestOps(val self: ScalaRestoreTableToPointInTimeRequest)
      extends AnyVal {

    def toJava: JavaRestoreTableToPointInTimeRequest = {
      val result = JavaRestoreTableToPointInTimeRequest.builder()
      self.sourceTableName.filter(_.nonEmpty).foreach(v => result.sourceTableName(v))                  // String
      self.targetTableName.filter(_.nonEmpty).foreach(v => result.targetTableName(v))                  // String
      self.useLatestRestorableTime.map(_.booleanValue).foreach(v => result.useLatestRestorableTime(v)) // Boolean
      self.restoreDateTime.foreach(v => result.restoreDateTime(v))                                     // Instant

      result.build()
    }

  }

}
