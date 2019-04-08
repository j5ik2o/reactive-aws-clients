// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeletePlacementGroupRequestBuilderOps(val self: DeletePlacementGroupRequest.Builder) extends AnyVal {

  final def groupNameAsScala(value: Option[String]): DeletePlacementGroupRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

}

final class DeletePlacementGroupRequestOps(val self: DeletePlacementGroupRequest) extends AnyVal {

  final def groupNameAsScala: Option[String] = Option(self.groupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletePlacementGroupRequestOps {

  implicit def toDeletePlacementGroupRequestBuilderOps(
      v: DeletePlacementGroupRequest.Builder
  ): DeletePlacementGroupRequestBuilderOps = new DeletePlacementGroupRequestBuilderOps(v)

  implicit def toDeletePlacementGroupRequestOps(v: DeletePlacementGroupRequest): DeletePlacementGroupRequestOps =
    new DeletePlacementGroupRequestOps(v)

}
