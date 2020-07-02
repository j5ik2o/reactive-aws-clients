// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeTableReplicaAutoScalingResponseBuilderOps(val self: DescribeTableReplicaAutoScalingResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAutoScalingDescriptionAsScala(
      value: Option[TableAutoScalingDescription]
  ): DescribeTableReplicaAutoScalingResponse.Builder = {
    value.fold(self) { v => self.tableAutoScalingDescription(v) }
  }

}

final class DescribeTableReplicaAutoScalingResponseOps(val self: DescribeTableReplicaAutoScalingResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAutoScalingDescriptionAsScala: Option[TableAutoScalingDescription] =
    Option(self.tableAutoScalingDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTableReplicaAutoScalingResponseOps {

  implicit def toDescribeTableReplicaAutoScalingResponseBuilderOps(
      v: DescribeTableReplicaAutoScalingResponse.Builder
  ): DescribeTableReplicaAutoScalingResponseBuilderOps = new DescribeTableReplicaAutoScalingResponseBuilderOps(v)

  implicit def toDescribeTableReplicaAutoScalingResponseOps(
      v: DescribeTableReplicaAutoScalingResponse
  ): DescribeTableReplicaAutoScalingResponseOps = new DescribeTableReplicaAutoScalingResponseOps(v)

}
