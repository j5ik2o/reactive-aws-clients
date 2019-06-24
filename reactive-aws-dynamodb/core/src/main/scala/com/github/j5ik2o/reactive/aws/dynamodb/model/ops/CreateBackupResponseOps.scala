// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateBackupResponseBuilderOps(val self: CreateBackupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupDetailsAsScala(value: Option[BackupDetails]): CreateBackupResponse.Builder = {
    value.fold(self) { v =>
      self.backupDetails(v)
    }
  }

}

final class CreateBackupResponseOps(val self: CreateBackupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupDetailsAsScala: Option[BackupDetails] = Option(self.backupDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBackupResponseOps {

  implicit def toCreateBackupResponseBuilderOps(v: CreateBackupResponse.Builder): CreateBackupResponseBuilderOps =
    new CreateBackupResponseBuilderOps(v)

  implicit def toCreateBackupResponseOps(v: CreateBackupResponse): CreateBackupResponseOps =
    new CreateBackupResponseOps(v)

}
