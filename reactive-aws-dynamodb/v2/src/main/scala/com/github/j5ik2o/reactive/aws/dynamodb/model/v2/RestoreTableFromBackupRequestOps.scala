package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ RestoreTableFromBackupRequest => ScalaRestoreTableFromBackupRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ RestoreTableFromBackupRequest => JavaRestoreTableFromBackupRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreTableFromBackupRequestOps {

  implicit class ScalaRestoreTableFromBackupRequestOps(val self: ScalaRestoreTableFromBackupRequest) extends AnyVal {

    def toJava: JavaRestoreTableFromBackupRequest = {
      val result = JavaRestoreTableFromBackupRequest.builder()
                                self.targetTableName.filter(_.nonEmpty).foreach(v => result.targetTableName(v)) // String, case String
                    self.backupArn.filter(_.nonEmpty).foreach(v => result.backupArn(v)) // String, case String

      result.build()
    }

  }

}