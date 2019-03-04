package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ BackupDetails => JavaBackupDetails }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupStatus, BackupType, BackupDetails => ScalaBackupDetails }

object BackupDetailsOps {

  implicit class ScalaBackupDetailsOps(val self: ScalaBackupDetails) extends AnyVal {

    def toJava: JavaBackupDetails = {
      val result = new JavaBackupDetails()
      self.backupArn.foreach(result.setBackupArn)
      self.backupName.foreach(result.setBackupName)
      self.backupSizeBytes.foreach(v => result.setBackupSizeBytes(v))
      self.backupStatus.map(_.entryName).foreach(result.setBackupStatus)
      self.backupType.map(_.entryName).foreach(result.setBackupType)
      self.backupCreationDateTime.map(Date.from).foreach(result.setBackupCreationDateTime)
      self.backupExpiryDateTime.map(Date.from).foreach(result.setBackupExpiryDateTime)
      result
    }

  }

  implicit class JavaBackupDetailsOps(val self: JavaBackupDetails) extends AnyVal {
    def toScala: ScalaBackupDetails = {
      ScalaBackupDetails()
        .withBackupArn(Option(self.getBackupArn))
        .withBackupName(Option(self.getBackupName))
        .withBackupSizeBytes(Option(self.getBackupSizeBytes))
        .withBackupStatus(Option(self.getBackupStatus).map(BackupStatus.withName))
        .withBackupType(Option(self.getBackupType).map(BackupType.withName))
        .withBackupCreationDateTime(Option(self.getBackupCreationDateTime).map(_.toInstant))
        .withBackupExpiryDateTime(Option(self.getBackupExpiryDateTime).map(_.toInstant))
    }
  }

}
