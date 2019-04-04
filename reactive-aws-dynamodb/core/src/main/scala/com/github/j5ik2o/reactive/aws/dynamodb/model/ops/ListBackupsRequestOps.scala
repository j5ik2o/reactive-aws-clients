// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListBackupsRequestBuilderOps(val self: ListBackupsRequest.Builder) extends AnyVal {

  final def withTableNameAsScala(value: Option[String]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withLimitAsScala(value: Option[Int]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def withTimeRangeLowerBoundAsScala(value: Option[java.time.Instant]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.timeRangeLowerBound(v)
    }
  } // Instant

  final def withTimeRangeUpperBoundAsScala(value: Option[java.time.Instant]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.timeRangeUpperBound(v)
    }
  } // Instant

  final def withExclusiveStartBackupArnAsScala(value: Option[String]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartBackupArn(v)
    }
  } // String

  final def withBackupTypeAsScala(value: Option[BackupTypeFilter]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.backupType(v)
    }
  } // String

}

final class ListBackupsRequestOps(val self: ListBackupsRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def timeRangeLowerBoundAsScala: Option[java.time.Instant] = Option(self.timeRangeLowerBound) // Instant

  final def timeRangeUpperBoundAsScala: Option[java.time.Instant] = Option(self.timeRangeUpperBound) // Instant

  final def exclusiveStartBackupArnAsScala: Option[String] = Option(self.exclusiveStartBackupArn) // String

  final def backupTypeAsScala: Option[BackupTypeFilter] = Option(self.backupType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBackupsRequestOps {

  implicit def toListBackupsRequestBuilderOps(v: ListBackupsRequest.Builder): ListBackupsRequestBuilderOps =
    new ListBackupsRequestBuilderOps(v)

  implicit def toListBackupsRequestOps(v: ListBackupsRequest): ListBackupsRequestOps = new ListBackupsRequestOps(v)

}
