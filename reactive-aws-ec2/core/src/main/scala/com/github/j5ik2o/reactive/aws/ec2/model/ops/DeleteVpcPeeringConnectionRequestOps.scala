// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcPeeringConnectionRequestBuilderOps(val self: DeleteVpcPeeringConnectionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala(value: Option[String]): DeleteVpcPeeringConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class DeleteVpcPeeringConnectionRequestOps(val self: DeleteVpcPeeringConnectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcPeeringConnectionRequestOps {

  implicit def toDeleteVpcPeeringConnectionRequestBuilderOps(
      v: DeleteVpcPeeringConnectionRequest.Builder
  ): DeleteVpcPeeringConnectionRequestBuilderOps = new DeleteVpcPeeringConnectionRequestBuilderOps(v)

  implicit def toDeleteVpcPeeringConnectionRequestOps(
      v: DeleteVpcPeeringConnectionRequest
  ): DeleteVpcPeeringConnectionRequestOps = new DeleteVpcPeeringConnectionRequestOps(v)

}
