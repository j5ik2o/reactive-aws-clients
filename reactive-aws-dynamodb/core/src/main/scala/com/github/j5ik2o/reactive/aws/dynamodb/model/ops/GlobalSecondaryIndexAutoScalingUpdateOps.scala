// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexAutoScalingUpdateBuilderOps(val self: GlobalSecondaryIndexAutoScalingUpdate.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): GlobalSecondaryIndexAutoScalingUpdate.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingUpdateAsScala(
      value: Option[AutoScalingSettingsUpdate]
  ): GlobalSecondaryIndexAutoScalingUpdate.Builder = {
    value.fold(self) { v =>
      self.provisionedWriteCapacityAutoScalingUpdate(v)
    }
  }

}

final class GlobalSecondaryIndexAutoScalingUpdateOps(val self: GlobalSecondaryIndexAutoScalingUpdate) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedWriteCapacityAutoScalingUpdateAsScala: Option[AutoScalingSettingsUpdate] =
    Option(self.provisionedWriteCapacityAutoScalingUpdate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalSecondaryIndexAutoScalingUpdateOps {

  implicit def toGlobalSecondaryIndexAutoScalingUpdateBuilderOps(
      v: GlobalSecondaryIndexAutoScalingUpdate.Builder
  ): GlobalSecondaryIndexAutoScalingUpdateBuilderOps = new GlobalSecondaryIndexAutoScalingUpdateBuilderOps(v)

  implicit def toGlobalSecondaryIndexAutoScalingUpdateOps(
      v: GlobalSecondaryIndexAutoScalingUpdate
  ): GlobalSecondaryIndexAutoScalingUpdateOps = new GlobalSecondaryIndexAutoScalingUpdateOps(v)

}
