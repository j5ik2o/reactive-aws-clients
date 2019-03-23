package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupTypeFilter, ListBackupsRequest => ScalaListBackupsRequest }
import software.amazon.awssdk.services.dynamodb.model.{ ListBackupsRequest => JavaListBackupsRequest }

object ListBackupsRequestOps {

  implicit class ScalaListBackupsRequestOps(val self: ScalaListBackupsRequest) extends AnyVal {

    def toJava: JavaListBackupsRequest = {
      val result = JavaListBackupsRequest.builder()
      self.tableName.foreach(result.tableName)
      self.limit.foreach(v => result.limit(v))
      self.timeRangeLowerBound.foreach(v => result.timeRangeLowerBound(v))
      self.timeRangeUpperBound.foreach(v => result.timeRangeUpperBound(v))
      self.exclusiveStartBackupArn.foreach(result.exclusiveStartBackupArn)
      self.backupType.map(_.entryName).foreach(result.backupType)
      result.build()
    }

  }

  implicit class JavaListBackupsRequestOps(val self: JavaListBackupsRequest) extends AnyVal {

    def toScala: ScalaListBackupsRequest = {
      ScalaListBackupsRequest()
        .withTableName(Option(self.tableName))
        .withLimit(Option(self.limit))
        .withTimeRangeLowerBound(Option(self.timeRangeLowerBound))
        .withTimeRangeUpperBound(Option(self.timeRangeUpperBound))
        .withExclusiveStartBackupArn(Option(self.exclusiveStartBackupArn))
        .withBackupType(Option(self.backupType).map(_.toString).map(BackupTypeFilter.withName))
    }

  }

}
