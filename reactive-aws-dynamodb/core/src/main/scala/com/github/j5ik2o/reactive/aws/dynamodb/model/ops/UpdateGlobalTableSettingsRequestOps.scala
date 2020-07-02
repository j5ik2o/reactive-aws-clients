// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalTableSettingsRequestBuilderOps(val self: UpdateGlobalTableSettingsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala(value: Option[String]): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v => self.globalTableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableBillingModeAsScala(value: Option[BillingMode]): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v => self.globalTableBillingMode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableProvisionedWriteCapacityUnitsAsScala(
      value: Option[Long]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v => self.globalTableProvisionedWriteCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableProvisionedWriteCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v => self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableGlobalSecondaryIndexSettingsUpdateAsScala(
      value: Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.globalTableGlobalSecondaryIndexSettingsUpdate(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaSettingsUpdateAsScala(
      value: Option[Seq[ReplicaSettingsUpdate]]
  ): UpdateGlobalTableSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicaSettingsUpdate(v.asJava)
    }
  }

}

final class UpdateGlobalTableSettingsRequestOps(val self: UpdateGlobalTableSettingsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableBillingModeAsScala: Option[BillingMode] = Option(self.globalTableBillingMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableProvisionedWriteCapacityUnitsAsScala: Option[Long] =
    Option(self.globalTableProvisionedWriteCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableProvisionedWriteCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableGlobalSecondaryIndexSettingsUpdateAsScala
      : Option[Seq[GlobalTableGlobalSecondaryIndexSettingsUpdate]] =
    Option(self.globalTableGlobalSecondaryIndexSettingsUpdate).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicaSettingsUpdateAsScala: Option[Seq[ReplicaSettingsUpdate]] =
    Option(self.replicaSettingsUpdate).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
