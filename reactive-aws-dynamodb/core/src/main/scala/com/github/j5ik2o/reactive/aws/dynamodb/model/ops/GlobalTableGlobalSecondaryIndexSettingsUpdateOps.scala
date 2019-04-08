// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalTableGlobalSecondaryIndexSettingsUpdateBuilderOps(
    val self: GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder
) extends AnyVal {

  final def indexNameAsScala(value: Option[String]): GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def provisionedWriteCapacityUnitsAsScala(
      value: Option[Long]
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedWriteCapacityUnits(v)
    }
  } // Long

  final def provisionedWriteCapacityAutoScalingSettingsUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedWriteCapacityAutoScalingSettingsUpdate(v)
    }
  } // AutoScalingSettingsUpdate

}

final class GlobalTableGlobalSecondaryIndexSettingsUpdateOps(val self: GlobalTableGlobalSecondaryIndexSettingsUpdate)
    extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def provisionedWriteCapacityUnitsAsScala: Option[Long] = Option(self.provisionedWriteCapacityUnits) // Long

  final def provisionedWriteCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.provisionedWriteCapacityAutoScalingSettingsUpdate) // AutoScalingSettingsUpdate

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
