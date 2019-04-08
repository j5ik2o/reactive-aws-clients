// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateSubnetGroupResponseBuilderOps(val self: CreateSubnetGroupResponse.Builder) extends AnyVal {

  final def subnetGroupAsScala(value: Option[SubnetGroup]): CreateSubnetGroupResponse.Builder = {
    value.fold(self) { v =>
      self.subnetGroup(v)
    }
  }

}

final class CreateSubnetGroupResponseOps(val self: CreateSubnetGroupResponse) extends AnyVal {

  final def subnetGroupAsScala: Option[SubnetGroup] = Option(self.subnetGroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSubnetGroupResponseOps {

  implicit def toCreateSubnetGroupResponseBuilderOps(
      v: CreateSubnetGroupResponse.Builder
  ): CreateSubnetGroupResponseBuilderOps = new CreateSubnetGroupResponseBuilderOps(v)

  implicit def toCreateSubnetGroupResponseOps(v: CreateSubnetGroupResponse): CreateSubnetGroupResponseOps =
    new CreateSubnetGroupResponseOps(v)

}
