// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateSubnetCidrBlockResponseBuilderOps(val self: DisassociateSubnetCidrBlockResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationAsScala(
      value: Option[SubnetIpv6CidrBlockAssociation]
  ): DisassociateSubnetCidrBlockResponse.Builder = {
    value.fold(self) { v => self.ipv6CidrBlockAssociation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): DisassociateSubnetCidrBlockResponse.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

}

final class DisassociateSubnetCidrBlockResponseOps(val self: DisassociateSubnetCidrBlockResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationAsScala: Option[SubnetIpv6CidrBlockAssociation] =
    Option(self.ipv6CidrBlockAssociation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateSubnetCidrBlockResponseOps {

  implicit def toDisassociateSubnetCidrBlockResponseBuilderOps(
      v: DisassociateSubnetCidrBlockResponse.Builder
  ): DisassociateSubnetCidrBlockResponseBuilderOps = new DisassociateSubnetCidrBlockResponseBuilderOps(v)

  implicit def toDisassociateSubnetCidrBlockResponseOps(
      v: DisassociateSubnetCidrBlockResponse
  ): DisassociateSubnetCidrBlockResponseOps = new DisassociateSubnetCidrBlockResponseOps(v)

}
