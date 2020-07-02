// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTableReplicaAutoScalingResponseBuilderOps(val self: UpdateTableReplicaAutoScalingResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAutoScalingDescriptionAsScala(
      value: Option[TableAutoScalingDescription]
  ): UpdateTableReplicaAutoScalingResponse.Builder = {
    value.fold(self) { v => self.tableAutoScalingDescription(v) }
  }

}

final class UpdateTableReplicaAutoScalingResponseOps(val self: UpdateTableReplicaAutoScalingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAutoScalingDescriptionAsScala: Option[TableAutoScalingDescription] =
    Option(self.tableAutoScalingDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTableReplicaAutoScalingResponseOps {

  implicit def toUpdateTableReplicaAutoScalingResponseBuilderOps(
      v: UpdateTableReplicaAutoScalingResponse.Builder
  ): UpdateTableReplicaAutoScalingResponseBuilderOps = new UpdateTableReplicaAutoScalingResponseBuilderOps(v)

  implicit def toUpdateTableReplicaAutoScalingResponseOps(
      v: UpdateTableReplicaAutoScalingResponse
  ): UpdateTableReplicaAutoScalingResponseOps = new UpdateTableReplicaAutoScalingResponseOps(v)

}
