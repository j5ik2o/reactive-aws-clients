package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupTypeFilter => ScalaBackupTypeFilter, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupTypeFilter => JavaBackupTypeFilter }

object BackupTypeFilterOps {

  implicit class ScalaBackupTypeFilterOps(val self: ScalaBackupTypeFilter) extends AnyVal {

    def toJava: JavaBackupTypeFilter = {
      JavaBackupTypeFilter.valueOf(self.entryName)
    }

  }

  implicit class JavaBackupTypeFilterOps(val self: JavaBackupTypeFilter) extends AnyVal {

    def toScala: ScalaBackupTypeFilter = {
      ScalaBackupTypeFilter.withName(self.toString)
    }

  }

}
