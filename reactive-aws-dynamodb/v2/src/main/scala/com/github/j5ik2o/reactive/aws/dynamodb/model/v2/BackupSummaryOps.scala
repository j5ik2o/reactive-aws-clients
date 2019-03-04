package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupStatus, BackupType, BackupSummary => ScalaBackupSummary }
import software.amazon.awssdk.services.dynamodb.model.{ BackupSummary => JavaBackupSummary }

object BackupSummaryOps {

  implicit class ScalaBackupSummaryOps(val self: ScalaBackupSummary) extends AnyVal {

    def toJava: JavaBackupSummary = {
      val result = JavaBackupSummary.builder()
      self.tableName.foreach(result.tableName)
      self.tableId.foreach(result.tableId)
      self.tableArn.foreach(result.tableArn)
      self.backupArn.foreach(result.backupArn)
      self.backupCreationDateTime.foreach(result.backupCreationDateTime)
      self.backupExpiryDateTime.foreach(result.backupExpiryDateTime)
      self.backupStatus.map(_.entryName).foreach(result.backupStatus)
      self.backupType.map(_.entryName).foreach(result.backupType)
      self.backupSizeBytes.foreach(v => result.backupSizeBytes(v))
      result.build()
    }

  }

  implicit class JavaBackupSummaryOps(val self: JavaBackupSummary) extends AnyVal {

    def toScala: ScalaBackupSummary = {
      ScalaBackupSummary()
        .withTableName(Option(self.tableName))
        .withTableId(Option(self.tableId))
        .withTableArn(Option(self.tableArn))
        .withBackupArn(Option(self.backupArn))
        .withBackupCreationDateTime(Option(self.backupCreationDateTime))
        .withBackupStatus(Option(self.backupStatus).map(_.toString).map(BackupStatus.withName))
        .withBackupType(Option(self.backupType).map(_.toString).map(BackupType.withName))
        .withBackupSizeBytes(Option(self.backupSizeBytes))
    }

  }

}
