package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupType => ScalaBackupType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupType => JavaBackupType }

object BackupTypeOps {

  implicit class ScalaBackupTypeOps(val self: ScalaBackupType) extends AnyVal {

    def toJava: JavaBackupType = {
        JavaBackupType.valueOf(self.entryName)
    }

  }

  implicit class JavaBackupTypeOps(val self: JavaBackupType) extends AnyVal {

     def toScala: ScalaBackupType = {
        ScalaBackupType.withName(self.toString)
     }

   }

}