// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SubnetIpv6CidrBlockAssociationBuilderOps(val self: SubnetIpv6CidrBlockAssociation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): SubnetIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala(value: Option[String]): SubnetIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockStateAsScala(value: Option[SubnetCidrBlockState]): SubnetIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlockState(v)
    }
  }

}

final class SubnetIpv6CidrBlockAssociationOps(val self: SubnetIpv6CidrBlockAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockStateAsScala: Option[SubnetCidrBlockState] = Option(self.ipv6CidrBlockState)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetIpv6CidrBlockAssociationOps {

  implicit def toSubnetIpv6CidrBlockAssociationBuilderOps(
      v: SubnetIpv6CidrBlockAssociation.Builder
  ): SubnetIpv6CidrBlockAssociationBuilderOps = new SubnetIpv6CidrBlockAssociationBuilderOps(v)

  implicit def toSubnetIpv6CidrBlockAssociationOps(
      v: SubnetIpv6CidrBlockAssociation
  ): SubnetIpv6CidrBlockAssociationOps = new SubnetIpv6CidrBlockAssociationOps(v)

}
