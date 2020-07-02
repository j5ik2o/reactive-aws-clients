// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BackupSummaryBuilderOps(val self: BackupSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableIdAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v => self.tableId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableArnAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v => self.tableArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v => self.backupArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupNameAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v => self.backupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupCreationDateTimeAsScala(value: Option[java.time.Instant]): BackupSummary.Builder = {
    value.fold(self) { v => self.backupCreationDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupExpiryDateTimeAsScala(value: Option[java.time.Instant]): BackupSummary.Builder = {
    value.fold(self) { v => self.backupExpiryDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupStatusAsScala(value: Option[BackupStatus]): BackupSummary.Builder = {
    value.fold(self) { v => self.backupStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupTypeAsScala(value: Option[BackupType]): BackupSummary.Builder = {
    value.fold(self) { v => self.backupType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupSizeBytesAsScala(value: Option[Long]): BackupSummary.Builder = {
    value.fold(self) { v => self.backupSizeBytes(v) }
  }

}

final class BackupSummaryOps(val self: BackupSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableIdAsScala: Option[String] = Option(self.tableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableArnAsScala: Option[String] = Option(self.tableArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala: Option[String] = Option(self.backupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupNameAsScala: Option[String] = Option(self.backupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.backupCreationDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupExpiryDateTimeAsScala: Option[java.time.Instant] = Option(self.backupExpiryDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupStatusAsScala: Option[BackupStatus] = Option(self.backupStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupTypeAsScala: Option[BackupType] = Option(self.backupType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupSizeBytesAsScala: Option[Long] = Option(self.backupSizeBytes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBackupSummaryOps {

  implicit def toBackupSummaryBuilderOps(v: BackupSummary.Builder): BackupSummaryBuilderOps =
    new BackupSummaryBuilderOps(v)

  implicit def toBackupSummaryOps(v: BackupSummary): BackupSummaryOps = new BackupSummaryOps(v)

}
