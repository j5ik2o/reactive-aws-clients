// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcPeeringConnectionResponseBuilderOps(val self: CreateVpcPeeringConnectionResponse.Builder)
    extends AnyVal {

  final def vpcPeeringConnectionAsScala(
      value: Option[VpcPeeringConnection]
  ): CreateVpcPeeringConnectionResponse.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnection(v)
    }
  }

}

final class CreateVpcPeeringConnectionResponseOps(val self: CreateVpcPeeringConnectionResponse) extends AnyVal {

  final def vpcPeeringConnectionAsScala: Option[VpcPeeringConnection] = Option(self.vpcPeeringConnection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcPeeringConnectionResponseOps {

  implicit def toCreateVpcPeeringConnectionResponseBuilderOps(
      v: CreateVpcPeeringConnectionResponse.Builder
  ): CreateVpcPeeringConnectionResponseBuilderOps = new CreateVpcPeeringConnectionResponseBuilderOps(v)

  implicit def toCreateVpcPeeringConnectionResponseOps(
      v: CreateVpcPeeringConnectionResponse
  ): CreateVpcPeeringConnectionResponseOps = new CreateVpcPeeringConnectionResponseOps(v)

}
