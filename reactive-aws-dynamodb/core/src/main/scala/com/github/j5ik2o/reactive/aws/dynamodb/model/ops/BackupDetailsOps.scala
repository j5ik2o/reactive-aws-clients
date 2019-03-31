// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupDetails => ScalaBackupDetails, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BackupDetails => JavaBackupDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupDetailsOps {

  implicit class ScalaBackupDetailsOps(val self: ScalaBackupDetails) extends AnyVal {

    def toJava: JavaBackupDetails = {
      val result = JavaBackupDetails.builder()
      self.backupArn.filter(_.nonEmpty).foreach(v => result.backupArn(v))           // String
      self.backupName.filter(_.nonEmpty).foreach(v => result.backupName(v))         // String
      self.backupSizeBytes.map(_.longValue).foreach(v => result.backupSizeBytes(v)) // Long
      self.backupStatus.foreach { v =>
        import BackupStatusOps._; result.backupStatus(v.toJava)
      } // String
      self.backupType.foreach { v =>
        import BackupTypeOps._; result.backupType(v.toJava)
      } // String
      self.backupCreationDateTime.foreach(v => result.backupCreationDateTime(v)) // Instant
      self.backupExpiryDateTime.foreach(v => result.backupExpiryDateTime(v))     // Instant

      result.build()
    }

  }

  implicit class JavaBackupDetailsOps(val self: JavaBackupDetails) extends AnyVal {

    def toScala: ScalaBackupDetails = {
      ScalaBackupDetails()
        .withBackupArn(Option(self.backupArn)) // String
        .withBackupName(Option(self.backupName)) // String
        .withBackupSizeBytes(Option(self.backupSizeBytes).map(_.longValue)) // Long
        .withBackupStatus(Option(self.backupStatus).map { v =>
          import BackupStatusOps._; v.toScala
        }) // String
        .withBackupType(Option(self.backupType).map { v =>
          import BackupTypeOps._; v.toScala
        }) // String
        .withBackupCreationDateTime(Option(self.backupCreationDateTime)) // Instant
        .withBackupExpiryDateTime(Option(self.backupExpiryDateTime)) // Instant
    }

  }

}
