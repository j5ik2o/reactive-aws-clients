// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BackupSummaryBuilderOps(val self: BackupSummary.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def tableIdAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.tableId(v)
    }
  }

  final def tableArnAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.tableArn(v)
    }
  }

  final def backupArnAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupArn(v)
    }
  }

  final def backupNameAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupName(v)
    }
  }

  final def backupCreationDateTimeAsScala(value: Option[java.time.Instant]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupCreationDateTime(v)
    }
  }

  final def backupExpiryDateTimeAsScala(value: Option[java.time.Instant]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupExpiryDateTime(v)
    }
  }

  final def backupStatusAsScala(value: Option[BackupStatus]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupStatus(v)
    }
  }

  final def backupTypeAsScala(value: Option[BackupType]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupType(v)
    }
  }

  final def backupSizeBytesAsScala(value: Option[Long]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupSizeBytes(v)
    }
  }

}

final class BackupSummaryOps(val self: BackupSummary) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def tableIdAsScala: Option[String] = Option(self.tableId)

  final def tableArnAsScala: Option[String] = Option(self.tableArn)

  final def backupArnAsScala: Option[String] = Option(self.backupArn)

  final def backupNameAsScala: Option[String] = Option(self.backupName)

  final def backupCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.backupCreationDateTime)

  final def backupExpiryDateTimeAsScala: Option[java.time.Instant] = Option(self.backupExpiryDateTime)

  final def backupStatusAsScala: Option[BackupStatus] = Option(self.backupStatus)

  final def backupTypeAsScala: Option[BackupType] = Option(self.backupType)

  final def backupSizeBytesAsScala: Option[Long] = Option(self.backupSizeBytes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBackupSummaryOps {

  implicit def toBackupSummaryBuilderOps(v: BackupSummary.Builder): BackupSummaryBuilderOps =
    new BackupSummaryBuilderOps(v)

  implicit def toBackupSummaryOps(v: BackupSummary): BackupSummaryOps = new BackupSummaryOps(v)

}
