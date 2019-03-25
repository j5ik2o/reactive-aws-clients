package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListBackupsRequest => ScalaListBackupsRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListBackupsRequest => JavaListBackupsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBackupsRequestOps {

  implicit class ScalaListBackupsRequestOps(val self: ScalaListBackupsRequest) extends AnyVal {

    def toJava: JavaListBackupsRequest = {
      val result = JavaListBackupsRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))                             // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                                        // Int
      self.timeRangeLowerBound.foreach(v => result.timeRangeLowerBound(v))                            // Instant
      self.timeRangeUpperBound.foreach(v => result.timeRangeUpperBound(v))                            // Instant
      self.exclusiveStartBackupArn.filter(_.nonEmpty).foreach(v => result.exclusiveStartBackupArn(v)) // String
      self.backupType.foreach { v =>
        import BackupTypeFilterOps._; result.backupType(v.toJava)
      } // String

      result.build()
    }

  }

}
