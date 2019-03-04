package com.github.j5ik2o.reactive.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ BackupSummary => JavaBackupSummary }
import com.github.j5ik2o.reactive.dynamodb.model.{ BackupStatus, BackupType, BackupSummary => ScalaBackupSummary }

object BackupSummaryOps {

  implicit class ScalaBackupSummaryOps(val self: ScalaBackupSummary) extends AnyVal {

    def toJava: JavaBackupSummary = {
      val result = new JavaBackupSummary()
      self.tableName.foreach(result.setTableName)
      self.tableId.foreach(result.setTableId)
      self.tableArn.foreach(result.setTableArn)
      self.backupArn.foreach(result.setBackupArn)
      self.backupCreationDateTime.map(Date.from).foreach(result.setBackupCreationDateTime)
      self.backupExpiryDateTime.map(Date.from).foreach(result.setBackupExpiryDateTime)
      self.backupStatus.map(_.entryName).foreach(result.setBackupStatus)
      self.backupType.map(_.entryName).foreach(result.setBackupType)
      self.backupSizeBytes.foreach(v => result.setBackupSizeBytes(v))
      result
    }

  }

  implicit class JavaBackupSummaryOps(val self: JavaBackupSummary) extends AnyVal {

    def toScala: ScalaBackupSummary = {
      ScalaBackupSummary()
        .withTableName(Option(self.getTableName))
        .withTableId(Option(self.getTableId))
        .withTableArn(Option(self.getTableArn))
        .withBackupArn(Option(self.getBackupArn))
        .withBackupCreationDateTime(Option(self.getBackupCreationDateTime).map(_.toInstant))
        .withBackupStatus(Option(self.getBackupStatus).map(BackupStatus.withName))
        .withBackupType(Option(self.getBackupType).map(BackupType.withName))
        .withBackupSizeBytes(Option(self.getBackupSizeBytes))
    }

  }

}
