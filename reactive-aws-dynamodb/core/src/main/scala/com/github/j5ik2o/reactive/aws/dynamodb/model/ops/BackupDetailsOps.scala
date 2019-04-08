// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BackupDetailsBuilderOps(val self: BackupDetails.Builder) extends AnyVal {

  final def backupArnAsScala(value: Option[String]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupArn(v)
    }
  }

  final def backupNameAsScala(value: Option[String]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupName(v)
    }
  }

  final def backupSizeBytesAsScala(value: Option[Long]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupSizeBytes(v)
    }
  }

  final def backupStatusAsScala(value: Option[BackupStatus]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupStatus(v)
    }
  }

  final def backupTypeAsScala(value: Option[BackupType]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupType(v)
    }
  }

  final def backupCreationDateTimeAsScala(value: Option[java.time.Instant]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupCreationDateTime(v)
    }
  }

  final def backupExpiryDateTimeAsScala(value: Option[java.time.Instant]): BackupDetails.Builder = {
    value.fold(self) { v =>
      self.backupExpiryDateTime(v)
    }
  }

}

final class BackupDetailsOps(val self: BackupDetails) extends AnyVal {

  final def backupArnAsScala: Option[String] = Option(self.backupArn)

  final def backupNameAsScala: Option[String] = Option(self.backupName)

  final def backupSizeBytesAsScala: Option[Long] = Option(self.backupSizeBytes)

  final def backupStatusAsScala: Option[BackupStatus] = Option(self.backupStatus)

  final def backupTypeAsScala: Option[BackupType] = Option(self.backupType)

  final def backupCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.backupCreationDateTime)

  final def backupExpiryDateTimeAsScala: Option[java.time.Instant] = Option(self.backupExpiryDateTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBackupDetailsOps {

  implicit def toBackupDetailsBuilderOps(v: BackupDetails.Builder): BackupDetailsBuilderOps =
    new BackupDetailsBuilderOps(v)

  implicit def toBackupDetailsOps(v: BackupDetails): BackupDetailsOps = new BackupDetailsOps(v)

}
