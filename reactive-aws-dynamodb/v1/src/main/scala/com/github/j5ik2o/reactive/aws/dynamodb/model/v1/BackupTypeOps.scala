// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupType => ScalaBackupType, _ }
import com.amazonaws.services.dynamodbv2.model.{ BackupType => JavaBackupType }

object BackupTypeOps {

  implicit class ScalaBackupTypeOps(val self: ScalaBackupType) extends AnyVal {

    def toJava: JavaBackupType = {
      JavaBackupType.valueOf(self.entryName)
    }

  }

  implicit class JavaBackupTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaBackupType = {
      ScalaBackupType.withName(self)
    }

  }

}
