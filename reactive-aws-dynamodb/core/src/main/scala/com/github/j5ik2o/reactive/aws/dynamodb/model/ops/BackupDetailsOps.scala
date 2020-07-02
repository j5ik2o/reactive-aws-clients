// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BackupDetailsBuilderOps(val self: BackupDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala(value: Option[String]): BackupDetails.Builder = {
    value.fold(self) { v => self.backupArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupNameAsScala(value: Option[String]): BackupDetails.Builder = {
    value.fold(self) { v => self.backupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupSizeBytesAsScala(value: Option[Long]): BackupDetails.Builder = {
    value.fold(self) { v => self.backupSizeBytes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupStatusAsScala(value: Option[BackupStatus]): BackupDetails.Builder = {
    value.fold(self) { v => self.backupStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupTypeAsScala(value: Option[BackupType]): BackupDetails.Builder = {
    value.fold(self) { v => self.backupType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupCreationDateTimeAsScala(value: Option[java.time.Instant]): BackupDetails.Builder = {
    value.fold(self) { v => self.backupCreationDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupExpiryDateTimeAsScala(value: Option[java.time.Instant]): BackupDetails.Builder = {
    value.fold(self) { v => self.backupExpiryDateTime(v) }
  }

}

final class BackupDetailsOps(val self: BackupDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala: Option[String] = Option(self.backupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupNameAsScala: Option[String] = Option(self.backupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupSizeBytesAsScala: Option[Long] = Option(self.backupSizeBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupStatusAsScala: Option[BackupStatus] = Option(self.backupStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupTypeAsScala: Option[BackupType] = Option(self.backupType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.backupCreationDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupExpiryDateTimeAsScala: Option[java.time.Instant] = Option(self.backupExpiryDateTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBackupDetailsOps {

  implicit def toBackupDetailsBuilderOps(v: BackupDetails.Builder): BackupDetailsBuilderOps =
    new BackupDetailsBuilderOps(v)

  implicit def toBackupDetailsOps(v: BackupDetails): BackupDetailsOps = new BackupDetailsOps(v)

}
