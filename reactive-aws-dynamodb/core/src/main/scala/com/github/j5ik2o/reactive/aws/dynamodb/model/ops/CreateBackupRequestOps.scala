// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateBackupRequestBuilderOps(val self: CreateBackupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): CreateBackupRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupNameAsScala(value: Option[String]): CreateBackupRequest.Builder = {
    value.fold(self) { v =>
      self.backupName(v)
    }
  }

}

final class CreateBackupRequestOps(val self: CreateBackupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupNameAsScala: Option[String] = Option(self.backupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBackupRequestOps {

  implicit def toCreateBackupRequestBuilderOps(v: CreateBackupRequest.Builder): CreateBackupRequestBuilderOps =
    new CreateBackupRequestBuilderOps(v)

  implicit def toCreateBackupRequestOps(v: CreateBackupRequest): CreateBackupRequestOps = new CreateBackupRequestOps(v)

}
