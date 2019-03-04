package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ RestoreTableFromBackupRequest => JavaRestoreTableFromBackupRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableFromBackupRequest => ScalaScalaRestoreTableFromBackupRequest
}

object RestoreTableFromBackupRequestOps {

  implicit class ScalaRestoreTableFromBackupRequestOps(val self: ScalaScalaRestoreTableFromBackupRequest)
      extends AnyVal {

    def toJava: JavaRestoreTableFromBackupRequest = {
      val result = new JavaRestoreTableFromBackupRequest()
      self.targetTableName.foreach(result.setTargetTableName)
      self.backupArn.foreach(result.setBackupArn)
      result
    }

  }

  implicit class JavaRestoreTableFromBackupRequestOps(val self: JavaRestoreTableFromBackupRequest) extends AnyVal {

    def toScala: ScalaScalaRestoreTableFromBackupRequest = {
      ScalaScalaRestoreTableFromBackupRequest()
        .withTargetTableName(Option(self.getTargetTableName)).withBackupArn(Option(self.getBackupArn))
    }

  }

}
