// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalTableSettingsRequestBuilderOps(val self: UpdateGlobalTableSettingsRequest.Builder)
    extends AnyVal {

  final def withGlobalTableNameAsScala(value: Option[String]): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  } // String

  final def withGlobalTableBillingModeAsScala(value: Option[BillingMode]): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableBillingMode(v)
    }
  } // String

  final def withGlobalTableProvisionedWriteCapacityUnitsAsScala(
      value: Option[Long]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableProvisionedWriteCapacityUnits(v)
    }
  } // Long

  final def withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(v)
    }
  } // AutoScalingSettingsUpdate

  final def withGlobalTableGlobalSecondaryIndexSettingsUpdateAsScala(
      value: Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalTableGlobalSecondaryIndexSettingsUpdate(v.asJava)
    } // Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  }

  final def withReplicaSettingsUpdateAsScala(
      value: Option[Seq[ReplicaSettingsUpdate]]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicaSettingsUpdate(v.asJava)
    } // Seq[ReplicaSettingsUpdate]
  }

}

final class UpdateGlobalTableSettingsRequestOps(val self: UpdateGlobalTableSettingsRequest) extends AnyVal {

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName) // String

  final def globalTableBillingModeAsScala: Option[BillingMode] = Option(self.globalTableBillingMode) // String

  final def globalTableProvisionedWriteCapacityUnitsAsScala: Option[Long] =
    Option(self.globalTableProvisionedWriteCapacityUnits) // Long

  final def globalTableProvisionedWriteCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate) // AutoScalingSettingsUpdate

  final def globalTableGlobalSecondaryIndexSettingsUpdateAsScala
    : Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]] =
    Option(self.globalTableGlobalSecondaryIndexSettingsUpdate).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]

  final def replicaSettingsUpdateAsScala: Option[Seq[ReplicaSettingsUpdate]] = Option(self.replicaSettingsUpdate).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  } // Seq[ReplicaSettingsUpdate]

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
