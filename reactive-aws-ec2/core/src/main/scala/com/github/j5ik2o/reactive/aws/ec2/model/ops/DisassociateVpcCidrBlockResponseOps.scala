// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateVpcCidrBlockResponseBuilderOps(val self: DisassociateVpcCidrBlockResponse.Builder)
    extends AnyVal {

  final def ipv6CidrBlockAssociationAsScala(
      value: Option[VpcIpv6CidrBlockAssociation]
  ): DisassociateVpcCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlockAssociation(v)
    }
  }

  final def cidrBlockAssociationAsScala(
      value: Option[VpcCidrBlockAssociation]
  ): DisassociateVpcCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.cidrBlockAssociation(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): DisassociateVpcCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class DisassociateVpcCidrBlockResponseOps(val self: DisassociateVpcCidrBlockResponse) extends AnyVal {

  final def ipv6CidrBlockAssociationAsScala: Option[VpcIpv6CidrBlockAssociation] = Option(self.ipv6CidrBlockAssociation)

  final def cidrBlockAssociationAsScala: Option[VpcCidrBlockAssociation] = Option(self.cidrBlockAssociation)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateVpcCidrBlockResponseOps {

  implicit def toDisassociateVpcCidrBlockResponseBuilderOps(
      v: DisassociateVpcCidrBlockResponse.Builder
  ): DisassociateVpcCidrBlockResponseBuilderOps = new DisassociateVpcCidrBlockResponseBuilderOps(v)

  implicit def toDisassociateVpcCidrBlockResponseOps(
      v: DisassociateVpcCidrBlockResponse
  ): DisassociateVpcCidrBlockResponseOps = new DisassociateVpcCidrBlockResponseOps(v)

}
