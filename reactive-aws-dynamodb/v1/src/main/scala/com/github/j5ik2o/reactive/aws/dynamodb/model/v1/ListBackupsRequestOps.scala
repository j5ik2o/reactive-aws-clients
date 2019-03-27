// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListBackupsRequest => ScalaListBackupsRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListBackupsRequest => JavaListBackupsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBackupsRequestOps {

  implicit class ScalaListBackupsRequestOps(val self: ScalaListBackupsRequest) extends AnyVal {

    def toJava: JavaListBackupsRequest = {
      val result = new JavaListBackupsRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))                             // String
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                                        // Int
      self.timeRangeLowerBound.map(java.util.Date.from).foreach(v => result.withTimeRangeLowerBound(v))   // Instant
      self.timeRangeUpperBound.map(java.util.Date.from).foreach(v => result.withTimeRangeUpperBound(v))   // Instant
      self.exclusiveStartBackupArn.filter(_.nonEmpty).foreach(v => result.withExclusiveStartBackupArn(v)) // String
      self.backupType.foreach { v =>
        import BackupTypeFilterOps._; result.withBackupType(v.toJava)
      } // String

      result
    }

  }

}
