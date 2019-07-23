// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalTableGlobalSecondaryIndexSettingsUpdateBuilderOps(
    val self: GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityUnitsAsScala(
      value: Option[Long]
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedWriteCapacityUnits(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedWriteCapacityAutoScalingSettingsUpdate(v)
    }
  }

}

final class GlobalTableGlobalSecondaryIndexSettingsUpdateOps(val self: GlobalTableGlobalSecondaryIndexSettingsUpdate)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityUnitsAsScala: Option[Long] = Option(self.provisionedWriteCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.provisionedWriteCapacityAutoScalingSettingsUpdate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalTableGlobalSecondaryIndexSettingsUpdateOps {

  implicit def toGlobalTableGlobalSecondaryIndexSettingsUpdateBuilderOps(
      v: GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder
  ): GlobalTableGlobalSecondaryIndexSettingsUpdateBuilderOps =
    new GlobalTableGlobalSecondaryIndexSettingsUpdateBuilderOps(v)

  implicit def toGlobalTableGlobalSecondaryIndexSettingsUpdateOps(
      v: GlobalTableGlobalSecondaryIndexSettingsUpdate
  ): GlobalTableGlobalSecondaryIndexSettingsUpdateOps = new GlobalTableGlobalSecondaryIndexSettingsUpdateOps(v)

}
