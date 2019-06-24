// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteBackupResponseBuilderOps(val self: DeleteBackupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupDescriptionAsScala(value: Option[BackupDescription]): DeleteBackupResponse.Builder = {
    value.fold(self) { v =>
      self.backupDescription(v)
    }
  }

}

final class DeleteBackupResponseOps(val self: DeleteBackupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupDescriptionAsScala: Option[BackupDescription] = Option(self.backupDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBackupResponseOps {

  implicit def toDeleteBackupResponseBuilderOps(v: DeleteBackupResponse.Builder): DeleteBackupResponseBuilderOps =
    new DeleteBackupResponseBuilderOps(v)

  implicit def toDeleteBackupResponseOps(v: DeleteBackupResponse): DeleteBackupResponseOps =
    new DeleteBackupResponseOps(v)

}
