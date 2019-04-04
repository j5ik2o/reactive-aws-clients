// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BackupDetailsBuilderOps(val self: BackupDetails.Builder) extends AnyVal {

  final def withBackupArnAsScala(value: Option[String]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupArn(v)
    }
  } // String

  final def withBackupNameAsScala(value: Option[String]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupName(v)
    }
  } // String

  final def withBackupSizeBytesAsScala(value: Option[Long]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupSizeBytes(v)
    }
  } // Long

  final def withBackupStatusAsScala(value: Option[BackupStatus]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupStatus(v)
    }
  } // String

  final def withBackupTypeAsScala(value: Option[BackupType]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupType(v)
    }
  } // String

  final def withBackupCreationDateTimeAsScala(value: Option[java.time.Instant]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupCreationDateTime(v)
    }
  } // Instant

  final def withBackupExpiryDateTimeAsScala(value: Option[java.time.Instant]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupExpiryDateTime(v)
    }
  } // Instant

}

final class BackupDetailsOps(val self: BackupDetails) extends AnyVal {

  final def backupArnAsScala: Option[String] = Option(self.backupArn) // String

  final def backupNameAsScala: Option[String] = Option(self.backupName) // String

  final def backupSizeBytesAsScala: Option[Long] = Option(self.backupSizeBytes) // Long

  final def backupStatusAsScala: Option[BackupStatus] = Option(self.backupStatus) // String

  final def backupTypeAsScala: Option[BackupType] = Option(self.backupType) // String

  final def backupCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.backupCreationDateTime) // Instant

  final def backupExpiryDateTimeAsScala: Option[java.time.Instant] = Option(self.backupExpiryDateTime) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBackupDetailsOps {

  implicit def toBackupDetailsBuilderOps(v: BackupDetails.Builder): BackupDetailsBuilderOps =
    new BackupDetailsBuilderOps(v)

  implicit def toBackupDetailsOps(v: BackupDetails): BackupDetailsOps = new BackupDetailsOps(v)

}
