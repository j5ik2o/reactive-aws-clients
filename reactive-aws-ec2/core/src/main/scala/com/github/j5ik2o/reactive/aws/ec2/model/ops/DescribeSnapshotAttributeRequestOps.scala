// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSnapshotAttributeRequestBuilderOps(val self: DescribeSnapshotAttributeRequest.Builder)
    extends AnyVal {

  final def attributeAsScala(value: Option[SnapshotAttributeName]): DescribeSnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): DescribeSnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

}

final class DescribeSnapshotAttributeRequestOps(val self: DescribeSnapshotAttributeRequest) extends AnyVal {

  final def attributeAsScala: Option[SnapshotAttributeName] = Option(self.attribute)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSnapshotAttributeRequestOps {

  implicit def toDescribeSnapshotAttributeRequestBuilderOps(
      v: DescribeSnapshotAttributeRequest.Builder
  ): DescribeSnapshotAttributeRequestBuilderOps = new DescribeSnapshotAttributeRequestBuilderOps(v)

  implicit def toDescribeSnapshotAttributeRequestOps(
      v: DescribeSnapshotAttributeRequest
  ): DescribeSnapshotAttributeRequestOps = new DescribeSnapshotAttributeRequestOps(v)

}
