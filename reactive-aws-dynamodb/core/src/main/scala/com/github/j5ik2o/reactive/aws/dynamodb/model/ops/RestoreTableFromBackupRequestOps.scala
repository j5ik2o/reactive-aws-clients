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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingModeOverrideAsScala(value: Option[BillingMode]): RestoreTableFromBackupRequest.Builder = {
    value.fold(self) { v =>
      self.billingModeOverride(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexOverrideAsScala(
      value: Option[Seq[GlobalSecondaryIndex]]
  ): RestoreTableFromBackupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexOverride(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexOverrideAsScala(
      value: Option[Seq[LocalSecondaryIndex]]
  ): RestoreTableFromBackupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localSecondaryIndexOverride(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala(
      value: Option[ProvisionedThroughput]
  ): RestoreTableFromBackupRequest.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughputOverride(v)
    }
  }

}

final class RestoreTableFromBackupRequestOps(val self: RestoreTableFromBackupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTableNameAsScala: Option[String] = Option(self.targetTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala: Option[String] = Option(self.backupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingModeOverrideAsScala: Option[BillingMode] = Option(self.billingModeOverride)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexOverrideAsScala: Option[Seq[GlobalSecondaryIndex]] =
    Option(self.globalSecondaryIndexOverride).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexOverrideAsScala: Option[Seq[LocalSecondaryIndex]] =
    Option(self.localSecondaryIndexOverride).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughputOverride)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreTableFromBackupRequestOps {

  implicit def toRestoreTableFromBackupRequestBuilderOps(
      v: RestoreTableFromBackupRequest.Builder
  ): RestoreTableFromBackupRequestBuilderOps = new RestoreTableFromBackupRequestBuilderOps(v)

  implicit def toRestoreTableFromBackupRequestOps(v: RestoreTableFromBackupRequest): RestoreTableFromBackupRequestOps =
    new RestoreTableFromBackupRequestOps(v)

}
