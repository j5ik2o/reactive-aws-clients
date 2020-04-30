// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreatePlacementGroupResponseBuilderOps(val self: CreatePlacementGroupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementGroupAsScala(value: Option[PlacementGroup]): CreatePlacementGroupResponse.Builder = {
    value.fold(self) { v =>
      self.placementGroup(v)
    }
  }

}

final class CreatePlacementGroupResponseOps(val self: CreatePlacementGroupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementGroupAsScala: Option[PlacementGroup] = Option(self.placementGroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePlacementGroupResponseOps {

  implicit def toCreatePlacementGroupResponseBuilderOps(
      v: CreatePlacementGroupResponse.Builder
  ): CreatePlacementGroupResponseBuilderOps = new CreatePlacementGroupResponseBuilderOps(v)

  implicit def toCreatePlacementGroupResponseOps(v: CreatePlacementGroupResponse): CreatePlacementGroupResponseOps =
    new CreatePlacementGroupResponseOps(v)

}
