// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteSubnetRequestBuilderOps(val self: DeleteSubnetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): DeleteSubnetRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class DeleteSubnetRequestOps(val self: DeleteSubnetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteSubnetRequestOps {

  implicit def toDeleteSubnetRequestBuilderOps(v: DeleteSubnetRequest.Builder): DeleteSubnetRequestBuilderOps =
    new DeleteSubnetRequestBuilderOps(v)

  implicit def toDeleteSubnetRequestOps(v: DeleteSubnetRequest): DeleteSubnetRequestOps = new DeleteSubnetRequestOps(v)

}
