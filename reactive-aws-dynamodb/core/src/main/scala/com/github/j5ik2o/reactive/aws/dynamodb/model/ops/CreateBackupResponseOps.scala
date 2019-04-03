// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateBackupResponseBuilderOps(val self: CreateBackupResponse.Builder) extends AnyVal {

  final def withBackupDetailsAsScala(value: Option[BackupDetails]): CreateBackupResponse.Builder = {
    value.fold(self) { v =>
      self.backupDetails(v)
    }
  } // BackupDetails

}

final class CreateBackupResponseOps(val self: CreateBackupResponse) extends AnyVal {

  final def backupDetailsAsScala: Option[BackupDetails] = Option(self.backupDetails) // BackupDetails

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBackupResponseOps {

  implicit def toCreateBackupResponseBuilderOps(v: CreateBackupResponse.Builder): CreateBackupResponseBuilderOps =
    new CreateBackupResponseBuilderOps(v)

  implicit def toCreateBackupResponseOps(v: CreateBackupResponse): CreateBackupResponseOps =
    new CreateBackupResponseOps(v)

}
