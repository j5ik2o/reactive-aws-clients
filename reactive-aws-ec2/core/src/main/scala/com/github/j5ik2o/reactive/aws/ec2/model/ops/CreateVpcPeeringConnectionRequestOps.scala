// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcPeeringConnectionRequestBuilderOps(val self: CreateVpcPeeringConnectionRequest.Builder)
    extends AnyVal {

  final def peerOwnerIdAsScala(value: Option[String]): CreateVpcPeeringConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.peerOwnerId(v)
    }
  }

  final def peerVpcIdAsScala(value: Option[String]): CreateVpcPeeringConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.peerVpcId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): CreateVpcPeeringConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def peerRegionAsScala(value: Option[String]): CreateVpcPeeringConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.peerRegion(v)
    }
  }

}

final class CreateVpcPeeringConnectionRequestOps(val self: CreateVpcPeeringConnectionRequest) extends AnyVal {

  final def peerOwnerIdAsScala: Option[String] = Option(self.peerOwnerId)

  final def peerVpcIdAsScala: Option[String] = Option(self.peerVpcId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def peerRegionAsScala: Option[String] = Option(self.peerRegion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcPeeringConnectionRequestOps {

  implicit def toCreateVpcPeeringConnectionRequestBuilderOps(
      v: CreateVpcPeeringConnectionRequest.Builder
  ): CreateVpcPeeringConnectionRequestBuilderOps = new CreateVpcPeeringConnectionRequestBuilderOps(v)

  implicit def toCreateVpcPeeringConnectionRequestOps(
      v: CreateVpcPeeringConnectionRequest
  ): CreateVpcPeeringConnectionRequestOps = new CreateVpcPeeringConnectionRequestOps(v)

}
