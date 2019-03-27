// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupTypeFilter => ScalaBackupTypeFilter, _ }
import com.amazonaws.services.dynamodbv2.model.{ BackupTypeFilter => JavaBackupTypeFilter }

object BackupTypeFilterOps {

  implicit class ScalaBackupTypeFilterOps(val self: ScalaBackupTypeFilter) extends AnyVal {

    def toJava: JavaBackupTypeFilter = {
      JavaBackupTypeFilter.valueOf(self.entryName)
    }

  }

  implicit class JavaBackupTypeFilterOps(val self: String) extends AnyVal {

    def toScala: ScalaBackupTypeFilter = {
      ScalaBackupTypeFilter.withName(self)
    }

  }

}
