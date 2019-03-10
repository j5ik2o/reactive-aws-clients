package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupStatus, BackupType, BackupDetails => ScalaBackupDetails }
import software.amazon.awssdk.services.dynamodb.model.{ BackupDetails => JavaBackupDetails }

object BackupDetailsOps {

  implicit class ScalaBackupDetailsOps(val self: ScalaBackupDetails) extends AnyVal {

    def toJava: JavaBackupDetails = {
      val result = JavaBackupDetails.builder()
      self.backupArn.foreach(result.backupArn)
      self.backupName.foreach(result.backupName)
      self.backupSizeBytes.foreach(v => result.backupSizeBytes(v))
      self.backupStatus.map(_.entryName).foreach(result.backupStatus)
      self.backupType.map(_.entryName).foreach(result.backupType)
      self.backupCreationDateTime.foreach(result.backupCreationDateTime)
      self.backupExpiryDateTime.foreach(result.backupExpiryDateTime)
      result.build()
    }

  }

  implicit class JavaBackupDetailsOps(val self: JavaBackupDetails) extends AnyVal {

    def toScala: ScalaBackupDetails = {
      ScalaBackupDetails()
        .withBackupArn(Option(self.backupArn))
        .withBackupName(Option(self.backupName))
        .withBackupSizeBytes(Option(self.backupSizeBytes).map(_.longValue()))
        .withBackupStatus(Option(self.backupStatus.toString).map(BackupStatus.withName))
        .withBackupType(Option(self.backupType.toString).map(BackupType.withName))
        .withBackupCreationDateTime(Option(self.backupCreationDateTime))
        .withBackupExpiryDateTime(Option(self.backupExpiryDateTime))
    }

  }
}
