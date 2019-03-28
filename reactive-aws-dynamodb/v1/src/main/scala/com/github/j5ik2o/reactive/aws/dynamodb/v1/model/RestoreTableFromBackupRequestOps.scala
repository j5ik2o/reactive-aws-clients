// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableFromBackupRequest => ScalaRestoreTableFromBackupRequest,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ RestoreTableFromBackupRequest => JavaRestoreTableFromBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreTableFromBackupRequestOps {

  implicit class ScalaRestoreTableFromBackupRequestOps(val self: ScalaRestoreTableFromBackupRequest) extends AnyVal {

    def toJava: JavaRestoreTableFromBackupRequest = {
      val result = new JavaRestoreTableFromBackupRequest()
      self.targetTableName.filter(_.nonEmpty).foreach(v => result.withTargetTableName(v)) // String
      self.backupArn.filter(_.nonEmpty).foreach(v => result.withBackupArn(v))             // String

      result
    }

  }

}
