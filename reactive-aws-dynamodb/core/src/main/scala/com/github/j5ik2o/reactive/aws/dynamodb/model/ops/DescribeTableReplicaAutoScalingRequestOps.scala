// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeTableReplicaAutoScalingRequestBuilderOps(val self: DescribeTableReplicaAutoScalingRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): DescribeTableReplicaAutoScalingRequest.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

}

final class DescribeTableReplicaAutoScalingRequestOps(val self: DescribeTableReplicaAutoScalingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTableReplicaAutoScalingRequestOps {

  implicit def toDescribeTableReplicaAutoScalingRequestBuilderOps(
      v: DescribeTableReplicaAutoScalingRequest.Builder
  ): DescribeTableReplicaAutoScalingRequestBuilderOps = new DescribeTableReplicaAutoScalingRequestBuilderOps(v)

  implicit def toDescribeTableReplicaAutoScalingRequestOps(
      v: DescribeTableReplicaAutoScalingRequest
  ): DescribeTableReplicaAutoScalingRequestOps = new DescribeTableReplicaAutoScalingRequestOps(v)

}
