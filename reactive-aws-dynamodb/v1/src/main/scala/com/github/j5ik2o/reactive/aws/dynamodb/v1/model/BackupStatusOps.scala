// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupStatus => ScalaBackupStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ BackupStatus => JavaBackupStatus }

object BackupStatusOps {

  implicit class ScalaBackupStatusOps(val self: ScalaBackupStatus) extends AnyVal {

    def toJava: JavaBackupStatus = {
      JavaBackupStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaBackupStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaBackupStatus = {
      ScalaBackupStatus.withName(self)
    }

  }

}
