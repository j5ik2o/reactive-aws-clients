// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalTableSettingsRequestBuilderOps(val self: UpdateGlobalTableSettingsRequest.Builder)
    extends AnyVal {

  final def globalTableNameAsScala(value: Option[String]): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  }

  final def globalTableBillingModeAsScala(value: Option[BillingMode]): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableBillingMode(v)
    }
  }

  final def globalTableProvisionedWriteCapacityUnitsAsScala(
      value: Option[Long]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableProvisionedWriteCapacityUnits(v)
    }
  }

  final def globalTableProvisionedWriteCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(v)
    }
  }

  final def globalTableGlobalSecondaryIndexSettingsUpdateAsScala(
      value: Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalTableGlobalSecondaryIndexSettingsUpdate(v.asJava)
    }
  }

  final def replicaSettingsUpdateAsScala(
      value: Option[Seq[ReplicaSettingsUpdate]]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaSettingsUpdate(v.asJava)
    }
  }

}

final class UpdateGlobalTableSettingsRequestOps(val self: UpdateGlobalTableSettingsRequest) extends AnyVal {

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName)

  final def globalTableBillingModeAsScala: Option[BillingMode] = Option(self.globalTableBillingMode)

  final def globalTableProvisionedWriteCapacityUnitsAsScala: Option[Long] =
    Option(self.globalTableProvisionedWriteCapacityUnits)

  final def globalTableProvisionedWriteCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate)

  final def globalTableGlobalSecondaryIndexSettingsUpdateAsScala
    : Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]] =
    Option(self.globalTableGlobalSecondaryIndexSettingsUpdate).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def replicaSettingsUpdateAsScala: Option[Seq[ReplicaSettingsUpdate]] = Option(self.replicaSettingsUpdate).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGlobalTableSettingsRequestOps {

  implicit def toUpdateGlobalTableSettingsRequestBuilderOps(
      v: UpdateGlobalTableSettingsRequest.Builder
  ): UpdateGlobalTableSettingsRequestBuilderOps = new UpdateGlobalTableSettingsRequestBuilderOps(v)

  implicit def toUpdateGlobalTableSettingsRequestOps(
      v: UpdateGlobalTableSettingsRequest
  ): UpdateGlobalTableSettingsRequestOps = new UpdateGlobalTableSettingsRequestOps(v)

}
