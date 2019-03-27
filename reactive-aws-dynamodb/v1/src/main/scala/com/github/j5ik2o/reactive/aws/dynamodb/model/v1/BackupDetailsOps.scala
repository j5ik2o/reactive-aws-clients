// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BackupDetails => ScalaBackupDetails, _ }
import com.amazonaws.services.dynamodbv2.model.{ BackupDetails => JavaBackupDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BackupDetailsOps {

  implicit class ScalaBackupDetailsOps(val self: ScalaBackupDetails) extends AnyVal {

    def toJava: JavaBackupDetails = {
      val result = new JavaBackupDetails()
      self.backupArn.filter(_.nonEmpty).foreach(v => result.withBackupArn(v))           // String
      self.backupName.filter(_.nonEmpty).foreach(v => result.withBackupName(v))         // String
      self.backupSizeBytes.map(_.longValue).foreach(v => result.withBackupSizeBytes(v)) // Long
      self.backupStatus.foreach { v =>
        import BackupStatusOps._; result.withBackupStatus(v.toJava)
      } // String
      self.backupType.foreach { v =>
        import BackupTypeOps._; result.withBackupType(v.toJava)
      } // String
      self.backupCreationDateTime.map(java.util.Date.from).foreach(v => result.withBackupCreationDateTime(v)) // Instant
      self.backupExpiryDateTime.map(java.util.Date.from).foreach(v => result.withBackupExpiryDateTime(v))     // Instant

      result
    }

  }

  implicit class JavaBackupDetailsOps(val self: JavaBackupDetails) extends AnyVal {

    def toScala: ScalaBackupDetails = {
      ScalaBackupDetails()
        .withBackupArn(Option(self.getBackupArn)) // String
        .withBackupName(Option(self.getBackupName)) // String
        .withBackupSizeBytes(Option(self.getBackupSizeBytes).map(_.longValue)) // Long
        .withBackupStatus(Option(self.getBackupStatus).map { v =>
          import BackupStatusOps._; v.toScala
        }) // String
        .withBackupType(Option(self.getBackupType).map { v =>
          import BackupTypeOps._; v.toScala
        }) // String
        .withBackupCreationDateTime(Option(self.getBackupCreationDateTime).map(_.toInstant)) // Instant
        .withBackupExpiryDateTime(Option(self.getBackupExpiryDateTime).map(_.toInstant)) // Instant
    }

  }

}
