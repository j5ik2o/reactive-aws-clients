package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupStatus => ScalaBackupStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupStatus => JavaBackupStatus }

object BackupStatusOps {

  implicit class ScalaBackupStatusOps(val self: ScalaBackupStatus) extends AnyVal {

    def toJava: JavaBackupStatus = {
        JavaBackupStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaBackupStatusOps(val self: JavaBackupStatus) extends AnyVal {

     def toScala: ScalaBackupStatus = {
        ScalaBackupStatus.withName(self.toString)
     }

   }

}