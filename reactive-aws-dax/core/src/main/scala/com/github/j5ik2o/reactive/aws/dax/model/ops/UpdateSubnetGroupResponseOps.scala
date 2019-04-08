// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateSubnetGroupResponseBuilderOps(val self: UpdateSubnetGroupResponse.Builder) extends AnyVal {

  final def subnetGroupAsScala(value: Option[SubnetGroup]): UpdateSubnetGroupResponse.Builder = {
    value.fold(self) { v =>
      self.subnetGroup(v)
    }
  }

}

final class UpdateSubnetGroupResponseOps(val self: UpdateSubnetGroupResponse) extends AnyVal {

  final def subnetGroupAsScala: Option[SubnetGroup] = Option(self.subnetGroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateSubnetGroupResponseOps {

  implicit def toUpdateSubnetGroupResponseBuilderOps(
      v: UpdateSubnetGroupResponse.Builder
  ): UpdateSubnetGroupResponseBuilderOps = new UpdateSubnetGroupResponseBuilderOps(v)

  implicit def toUpdateSubnetGroupResponseOps(v: UpdateSubnetGroupResponse): UpdateSubnetGroupResponseOps =
    new UpdateSubnetGroupResponseOps(v)

}
