// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreTableFromBackupRequestBuilderOps(val self: RestoreTableFromBackupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTableNameAsScala(value: Option[String]): RestoreTableFromBackupRequest.Builder = {
    value.fold(self) { v =>
      self.targetTableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala(value: Option[String]): RestoreTableFromBackupRequest.Builder = {
    value.fold(self) { v =>
      self.backupArn(v)
    }
  }

}

final class RestoreTableFromBackupRequestOps(val self: RestoreTableFromBackupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTableNameAsScala: Option[String] = Option(self.targetTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala: Option[String] = Option(self.backupArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreTableFromBackupRequestOps {

  implicit def toRestoreTableFromBackupRequestBuilderOps(
      v: RestoreTableFromBackupRequest.Builder
  ): RestoreTableFromBackupRequestBuilderOps = new RestoreTableFromBackupRequestBuilderOps(v)

  implicit def toRestoreTableFromBackupRequestOps(v: RestoreTableFromBackupRequest): RestoreTableFromBackupRequestOps =
    new RestoreTableFromBackupRequestOps(v)

}
