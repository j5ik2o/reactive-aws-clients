// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateVpcCidrBlockRequestBuilderOps(val self: AssociateVpcCidrBlockRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonProvidedIpv6CidrBlockAsScala(value: Option[Boolean]): AssociateVpcCidrBlockRequest.Builder = {
    value.fold(self) { v =>
      self.amazonProvidedIpv6CidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala(value: Option[String]): AssociateVpcCidrBlockRequest.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): AssociateVpcCidrBlockRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class AssociateVpcCidrBlockRequestOps(val self: AssociateVpcCidrBlockRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonProvidedIpv6CidrBlockAsScala: Option[Boolean] = Option(self.amazonProvidedIpv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateVpcCidrBlockRequestOps {

  implicit def toAssociateVpcCidrBlockRequestBuilderOps(
      v: AssociateVpcCidrBlockRequest.Builder
  ): AssociateVpcCidrBlockRequestBuilderOps = new AssociateVpcCidrBlockRequestBuilderOps(v)

  implicit def toAssociateVpcCidrBlockRequestOps(v: AssociateVpcCidrBlockRequest): AssociateVpcCidrBlockRequestOps =
    new AssociateVpcCidrBlockRequestOps(v)

}
