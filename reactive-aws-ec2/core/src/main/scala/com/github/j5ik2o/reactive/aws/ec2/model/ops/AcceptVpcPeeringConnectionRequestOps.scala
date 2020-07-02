// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptVpcPeeringConnectionRequestBuilderOps(val self: AcceptVpcPeeringConnectionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala(value: Option[String]): AcceptVpcPeeringConnectionRequest.Builder = {
    value.fold(self) { v => self.vpcPeeringConnectionId(v) }
  }

}

final class AcceptVpcPeeringConnectionRequestOps(val self: AcceptVpcPeeringConnectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptVpcPeeringConnectionRequestOps {

  implicit def toAcceptVpcPeeringConnectionRequestBuilderOps(
      v: AcceptVpcPeeringConnectionRequest.Builder
  ): AcceptVpcPeeringConnectionRequestBuilderOps = new AcceptVpcPeeringConnectionRequestBuilderOps(v)

  implicit def toAcceptVpcPeeringConnectionRequestOps(
      v: AcceptVpcPeeringConnectionRequest
  ): AcceptVpcPeeringConnectionRequestOps = new AcceptVpcPeeringConnectionRequestOps(v)

}
