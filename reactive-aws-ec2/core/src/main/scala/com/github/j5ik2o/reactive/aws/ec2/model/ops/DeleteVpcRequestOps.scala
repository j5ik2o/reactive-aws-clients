// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcRequestBuilderOps(val self: DeleteVpcRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): DeleteVpcRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class DeleteVpcRequestOps(val self: DeleteVpcRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcRequestOps {

  implicit def toDeleteVpcRequestBuilderOps(v: DeleteVpcRequest.Builder): DeleteVpcRequestBuilderOps =
    new DeleteVpcRequestBuilderOps(v)

  implicit def toDeleteVpcRequestOps(v: DeleteVpcRequest): DeleteVpcRequestOps = new DeleteVpcRequestOps(v)

}
