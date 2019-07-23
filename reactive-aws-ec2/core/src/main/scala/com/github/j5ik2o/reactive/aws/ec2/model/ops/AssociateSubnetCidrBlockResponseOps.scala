// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateSubnetCidrBlockResponseBuilderOps(val self: AssociateSubnetCidrBlockResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationAsScala(
      value: Option[SubnetIpv6CidrBlockAssociation]
  ): AssociateSubnetCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlockAssociation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): AssociateSubnetCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class AssociateSubnetCidrBlockResponseOps(val self: AssociateSubnetCidrBlockResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationAsScala: Option[SubnetIpv6CidrBlockAssociation] =
    Option(self.ipv6CidrBlockAssociation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateSubnetCidrBlockResponseOps {

  implicit def toAssociateSubnetCidrBlockResponseBuilderOps(
      v: AssociateSubnetCidrBlockResponse.Builder
  ): AssociateSubnetCidrBlockResponseBuilderOps = new AssociateSubnetCidrBlockResponseBuilderOps(v)

  implicit def toAssociateSubnetCidrBlockResponseOps(
      v: AssociateSubnetCidrBlockResponse
  ): AssociateSubnetCidrBlockResponseOps = new AssociateSubnetCidrBlockResponseOps(v)

}
