// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreTableFromBackupResponseBuilderOps(val self: RestoreTableFromBackupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableDescriptionAsScala(value: Option[TableDescription]): RestoreTableFromBackupResponse.Builder = {
    value.fold(self) { v =>
      self.tableDescription(v)
    }
  }

}

final class RestoreTableFromBackupResponseOps(val self: RestoreTableFromBackupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableDescriptionAsScala: Option[TableDescription] = Option(self.tableDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreTableFromBackupResponseOps {

  implicit def toRestoreTableFromBackupResponseBuilderOps(
      v: RestoreTableFromBackupResponse.Builder
  ): RestoreTableFromBackupResponseBuilderOps = new RestoreTableFromBackupResponseBuilderOps(v)

  implicit def toRestoreTableFromBackupResponseOps(
      v: RestoreTableFromBackupResponse
  ): RestoreTableFromBackupResponseOps = new RestoreTableFromBackupResponseOps(v)

}
