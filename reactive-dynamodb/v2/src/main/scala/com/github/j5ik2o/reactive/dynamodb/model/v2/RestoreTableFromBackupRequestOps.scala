package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  RestoreTableFromBackupRequest => ScalaScalaRestoreTableFromBackupRequest
}
import software.amazon.awssdk.services.dynamodb.model.{
  RestoreTableFromBackupRequest => JavaRestoreTableFromBackupRequest
}

object RestoreTableFromBackupRequestOps {

  implicit class ScalaRestoreTableFromBackupRequestOps(val self: ScalaScalaRestoreTableFromBackupRequest)
      extends AnyVal {

    def toJava: JavaRestoreTableFromBackupRequest = {
      val result = JavaRestoreTableFromBackupRequest.builder()
      self.targetTableName.foreach(result.targetTableName)
      self.backupArn.foreach(result.backupArn)
      result.build()
    }

  }

  implicit class JavaRestoreTableFromBackupRequestOps(val self: JavaRestoreTableFromBackupRequest) extends AnyVal {

    def toScala: ScalaScalaRestoreTableFromBackupRequest = {
      ScalaScalaRestoreTableFromBackupRequest()
        .withTargetTableName(Option(self.targetTableName)).withBackupArn(Option(self.backupArn))
    }

  }

}
