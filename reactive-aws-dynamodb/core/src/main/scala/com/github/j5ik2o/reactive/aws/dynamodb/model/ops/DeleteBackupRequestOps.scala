// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteBackupRequestBuilderOps(val self: DeleteBackupRequest.Builder) extends AnyVal {

  final def withBackupArnAsScala(value: Option[String]): DeleteBackupRequest.Builder = {
    value.fold(self) { v =>
      self.backupArn(v)
    }
  } // String

}

final class DeleteBackupRequestOps(val self: DeleteBackupRequest) extends AnyVal {

  final def backupArnAsScala: Option[String] = Option(self.backupArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBackupRequestOps {

  implicit def toDeleteBackupRequestBuilderOps(v: DeleteBackupRequest.Builder): DeleteBackupRequestBuilderOps =
    new DeleteBackupRequestBuilderOps(v)

  implicit def toDeleteBackupRequestOps(v: DeleteBackupRequest): DeleteBackupRequestOps = new DeleteBackupRequestOps(v)

}
