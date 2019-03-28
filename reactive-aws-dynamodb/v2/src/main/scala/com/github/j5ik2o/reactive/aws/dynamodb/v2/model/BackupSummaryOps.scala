// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupSummary => ScalaBackupSummary, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupSummary => JavaBackupSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupSummaryOps {

  implicit class ScalaBackupSummaryOps(val self: ScalaBackupSummary) extends AnyVal {

    def toJava: JavaBackupSummary = {
      val result = JavaBackupSummary.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))        // String
      self.tableId.filter(_.nonEmpty).foreach(v => result.tableId(v))            // String
      self.tableArn.filter(_.nonEmpty).foreach(v => result.tableArn(v))          // String
      self.backupArn.filter(_.nonEmpty).foreach(v => result.backupArn(v))        // String
      self.backupName.filter(_.nonEmpty).foreach(v => result.backupName(v))      // String
      self.backupCreationDateTime.foreach(v => result.backupCreationDateTime(v)) // Instant
      self.backupExpiryDateTime.foreach(v => result.backupExpiryDateTime(v))     // Instant
      self.backupStatus.foreach { v =>
        import BackupStatusOps._; result.backupStatus(v.toJava)
      } // String
      self.backupType.foreach { v =>
        import BackupTypeOps._; result.backupType(v.toJava)
      } // String
      self.backupSizeBytes.map(_.longValue).foreach(v => result.backupSizeBytes(v)) // Long

      result.build()
    }

  }

  implicit class JavaBackupSummaryOps(val self: JavaBackupSummary) extends AnyVal {

    def toScala: ScalaBackupSummary = {
      ScalaBackupSummary()
        .withTableName(Option(self.tableName)) // String
        .withTableId(Option(self.tableId)) // String
        .withTableArn(Option(self.tableArn)) // String
        .withBackupArn(Option(self.backupArn)) // String
        .withBackupName(Option(self.backupName)) // String
        .withBackupCreationDateTime(Option(self.backupCreationDateTime)) // Instant
        .withBackupExpiryDateTime(Option(self.backupExpiryDateTime)) // Instant
        .withBackupStatus(Option(self.backupStatus).map { v =>
          import BackupStatusOps._; v.toScala
        }) // String
        .withBackupType(Option(self.backupType).map { v =>
          import BackupTypeOps._; v.toScala
        }) // String
        .withBackupSizeBytes(Option(self.backupSizeBytes).map(_.longValue)) // Long
    }

  }

}
