// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BackupDescriptionBuilderOps(val self: BackupDescription.Builder) extends AnyVal {

  final def backupDetailsAsScala(value: Option[BackupDetails]): BackupDescription.Builder = {
    value.fold(self) { v =>
      self.backupDetails(v)
    }
  }

  final def sourceTableDetailsAsScala(value: Option[SourceTableDetails]): BackupDescription.Builder = {
    value.fold(self) { v =>
      self.sourceTableDetails(v)
    }
  }

  final def sourceTableFeatureDetailsAsScala(value: Option[SourceTableFeatureDetails]): BackupDescription.Builder = {
    value.fold(self) { v =>
      self.sourceTableFeatureDetails(v)
    }
  }

}

final class BackupDescriptionOps(val self: BackupDescription) extends AnyVal {

  final def backupDetailsAsScala: Option[BackupDetails] = Option(self.backupDetails)

  final def sourceTableDetailsAsScala: Option[SourceTableDetails] = Option(self.sourceTableDetails)

  final def sourceTableFeatureDetailsAsScala: Option[SourceTableFeatureDetails] = Option(self.sourceTableFeatureDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBackupDescriptionOps {

  implicit def toBackupDescriptionBuilderOps(v: BackupDescription.Builder): BackupDescriptionBuilderOps =
    new BackupDescriptionBuilderOps(v)

  implicit def toBackupDescriptionOps(v: BackupDescription): BackupDescriptionOps = new BackupDescriptionOps(v)

}
