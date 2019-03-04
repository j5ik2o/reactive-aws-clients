package com.github.j5ik2o.reactive.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ ListBackupsRequest => JavaListBackupsRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ BackupType, ListBackupsRequest => ScalaListBackupsRequest }

object ListBackupsRequestOps {

  implicit class ScalaListBackupsRequestOps(val self: ScalaListBackupsRequest) extends AnyVal {

    def toJava: JavaListBackupsRequest = {
      val result = new JavaListBackupsRequest()
      self.tableName.foreach(result.setTableName)
      self.limit.foreach(v => result.setLimit(v))
      self.timeRangeLowerBound.map(Date.from).foreach(v => result.setTimeRangeLowerBound(v))
      self.timeRangeUpperBound.map(Date.from).foreach(v => result.setTimeRangeUpperBound(v))
      self.exclusiveStartBackupArn.foreach(result.setExclusiveStartBackupArn)
      self.backupType.map(_.entryName).foreach(result.setBackupType)
      result
    }

  }

  implicit class JavaListBackupsRequestOps(val self: JavaListBackupsRequest) extends AnyVal {

    def toScala: ScalaListBackupsRequest = {
      ScalaListBackupsRequest()
        .withTableName(Option(self.getTableName))
        .withLimit(Option(self.getLimit))
        .withTimeRangeLowerBound(Option(self.getTimeRangeLowerBound).map(_.toInstant))
        .withTimeRangeUpperBound(Option(self.getTimeRangeUpperBound).map(_.toInstant))
        .withExclusiveStartBackupArn(Option(self.getExclusiveStartBackupArn))
        .withBackupType(Option(self.getBackupType).map(BackupType.withName))
    }

  }

}
