// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateVpcCidrBlockResponseBuilderOps(val self: AssociateVpcCidrBlockResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationAsScala(
      value: Option[VpcIpv6CidrBlockAssociation]
  ): AssociateVpcCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlockAssociation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAssociationAsScala(
      value: Option[VpcCidrBlockAssociation]
  ): AssociateVpcCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.cidrBlockAssociation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): AssociateVpcCidrBlockResponse.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class AssociateVpcCidrBlockResponseOps(val self: AssociateVpcCidrBlockResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAssociationAsScala: Option[VpcIpv6CidrBlockAssociation] = Option(self.ipv6CidrBlockAssociation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAssociationAsScala: Option[VpcCidrBlockAssociation] = Option(self.cidrBlockAssociation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateVpcCidrBlockResponseOps {

  implicit def toAssociateVpcCidrBlockResponseBuilderOps(
      v: AssociateVpcCidrBlockResponse.Builder
  ): AssociateVpcCidrBlockResponseBuilderOps = new AssociateVpcCidrBlockResponseBuilderOps(v)

  implicit def toAssociateVpcCidrBlockResponseOps(v: AssociateVpcCidrBlockResponse): AssociateVpcCidrBlockResponseOps =
    new AssociateVpcCidrBlockResponseOps(v)

}
