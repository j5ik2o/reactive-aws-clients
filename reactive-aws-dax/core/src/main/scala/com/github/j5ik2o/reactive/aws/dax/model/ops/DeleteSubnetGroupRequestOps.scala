// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DeleteSubnetGroupRequestBuilderOps(val self: DeleteSubnetGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala(value: Option[String]): DeleteSubnetGroupRequest.Builder = {
    value.fold(self) { v => self.subnetGroupName(v) }
  }

}

final class DeleteSubnetGroupRequestOps(val self: DeleteSubnetGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteSubnetGroupRequestOps {

  implicit def toDeleteSubnetGroupRequestBuilderOps(
      v: DeleteSubnetGroupRequest.Builder
  ): DeleteSubnetGroupRequestBuilderOps = new DeleteSubnetGroupRequestBuilderOps(v)

  implicit def toDeleteSubnetGroupRequestOps(v: DeleteSubnetGroupRequest): DeleteSubnetGroupRequestOps =
    new DeleteSubnetGroupRequestOps(v)

}
