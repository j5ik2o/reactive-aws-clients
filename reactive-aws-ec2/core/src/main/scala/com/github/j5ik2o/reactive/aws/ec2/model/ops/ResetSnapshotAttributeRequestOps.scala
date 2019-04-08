// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResetSnapshotAttributeRequestBuilderOps(val self: ResetSnapshotAttributeRequest.Builder) extends AnyVal {

  final def attributeAsScala(value: Option[SnapshotAttributeName]): ResetSnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): ResetSnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

}

final class ResetSnapshotAttributeRequestOps(val self: ResetSnapshotAttributeRequest) extends AnyVal {

  final def attributeAsScala: Option[SnapshotAttributeName] = Option(self.attribute)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResetSnapshotAttributeRequestOps {

  implicit def toResetSnapshotAttributeRequestBuilderOps(
      v: ResetSnapshotAttributeRequest.Builder
  ): ResetSnapshotAttributeRequestBuilderOps = new ResetSnapshotAttributeRequestBuilderOps(v)

  implicit def toResetSnapshotAttributeRequestOps(v: ResetSnapshotAttributeRequest): ResetSnapshotAttributeRequestOps =
    new ResetSnapshotAttributeRequestOps(v)

}
