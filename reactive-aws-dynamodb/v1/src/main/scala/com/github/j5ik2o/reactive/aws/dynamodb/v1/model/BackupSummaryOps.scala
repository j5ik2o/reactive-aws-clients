// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupSummary => ScalaBackupSummary, _ }
import com.amazonaws.services.dynamodbv2.model.{ BackupSummary => JavaBackupSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupSummaryOps {

  implicit class ScalaBackupSummaryOps(val self: ScalaBackupSummary) extends AnyVal {

    def toJava: JavaBackupSummary = {
      val result = new JavaBackupSummary()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))                                 // String
      self.tableId.filter(_.nonEmpty).foreach(v => result.withTableId(v))                                     // String
      self.tableArn.filter(_.nonEmpty).foreach(v => result.withTableArn(v))                                   // String
      self.backupArn.filter(_.nonEmpty).foreach(v => result.withBackupArn(v))                                 // String
      self.backupName.filter(_.nonEmpty).foreach(v => result.withBackupName(v))                               // String
      self.backupCreationDateTime.map(java.util.Date.from).foreach(v => result.withBackupCreationDateTime(v)) // Instant
      self.backupExpiryDateTime.map(java.util.Date.from).foreach(v => result.withBackupExpiryDateTime(v))     // Instant
      self.backupStatus.foreach { v =>
        import BackupStatusOps._; result.withBackupStatus(v.toJava)
      } // String
      self.backupType.foreach { v =>
        import BackupTypeOps._; result.withBackupType(v.toJava)
      } // String
      self.backupSizeBytes.map(_.longValue).foreach(v => result.withBackupSizeBytes(v)) // Long

      result
    }

  }

  implicit class JavaBackupSummaryOps(val self: JavaBackupSummary) extends AnyVal {

    def toScala: ScalaBackupSummary = {
      ScalaBackupSummary()
        .withTableName(Option(self.getTableName)) // String
        .withTableId(Option(self.getTableId)) // String
        .withTableArn(Option(self.getTableArn)) // String
        .withBackupArn(Option(self.getBackupArn)) // String
        .withBackupName(Option(self.getBackupName)) // String
        .withBackupCreationDateTime(Option(self.getBackupCreationDateTime).map(_.toInstant)) // Instant
        .withBackupExpiryDateTime(Option(self.getBackupExpiryDateTime).map(_.toInstant)) // Instant
        .withBackupStatus(Option(self.getBackupStatus).map { v =>
          import BackupStatusOps._; v.toScala
        }) // String
        .withBackupType(Option(self.getBackupType).map { v =>
          import BackupTypeOps._; v.toScala
        }) // String
        .withBackupSizeBytes(Option(self.getBackupSizeBytes).map(_.longValue)) // Long
    }

  }

}
