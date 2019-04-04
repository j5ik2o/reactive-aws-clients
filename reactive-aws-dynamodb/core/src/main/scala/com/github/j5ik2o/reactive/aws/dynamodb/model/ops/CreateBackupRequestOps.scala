// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateBackupRequestBuilderOps(val self: CreateBackupRequest.Builder) extends AnyVal {

  final def withTableNameAsScala(value: Option[String]): CreateBackupRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withBackupNameAsScala(value: Option[String]): CreateBackupRequest.Builder = {
    value.fold(self) { v =>
      self.backupName(v)
    }
  } // String

}

final class CreateBackupRequestOps(val self: CreateBackupRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def backupNameAsScala: Option[String] = Option(self.backupName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBackupRequestOps {

  implicit def toCreateBackupRequestBuilderOps(v: CreateBackupRequest.Builder): CreateBackupRequestBuilderOps =
    new CreateBackupRequestBuilderOps(v)

  implicit def toCreateBackupRequestOps(v: CreateBackupRequest): CreateBackupRequestOps = new CreateBackupRequestOps(v)

}
