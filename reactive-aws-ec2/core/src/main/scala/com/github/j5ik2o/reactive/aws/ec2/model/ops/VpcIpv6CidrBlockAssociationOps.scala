// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcIpv6CidrBlockAssociationBuilderOps(val self: VpcIpv6CidrBlockAssociation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): VpcIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala(value: Option[String]): VpcIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockStateAsScala(value: Option[VpcCidrBlockState]): VpcIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlockState(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala(value: Option[String]): VpcIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.networkBorderGroup(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6PoolAsScala(value: Option[String]): VpcIpv6CidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.ipv6Pool(v)
    }
  }

}

final class VpcIpv6CidrBlockAssociationOps(val self: VpcIpv6CidrBlockAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6CidrBlockStateAsScala: Option[VpcCidrBlockState] = Option(self.ipv6CidrBlockState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala: Option[String] = Option(self.networkBorderGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6PoolAsScala: Option[String] = Option(self.ipv6Pool)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcIpv6CidrBlockAssociationOps {

  implicit def toVpcIpv6CidrBlockAssociationBuilderOps(
      v: VpcIpv6CidrBlockAssociation.Builder
  ): VpcIpv6CidrBlockAssociationBuilderOps = new VpcIpv6CidrBlockAssociationBuilderOps(v)

  implicit def toVpcIpv6CidrBlockAssociationOps(v: VpcIpv6CidrBlockAssociation): VpcIpv6CidrBlockAssociationOps =
    new VpcIpv6CidrBlockAssociationOps(v)

}
