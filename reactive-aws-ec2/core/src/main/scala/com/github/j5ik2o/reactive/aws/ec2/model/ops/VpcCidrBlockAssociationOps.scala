// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcCidrBlockAssociationBuilderOps(val self: VpcCidrBlockAssociation.Builder) extends AnyVal {

  final def associationIdAsScala(value: Option[String]): VpcCidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  final def cidrBlockAsScala(value: Option[String]): VpcCidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  final def cidrBlockStateAsScala(value: Option[VpcCidrBlockState]): VpcCidrBlockAssociation.Builder = {
    value.fold(self) { v =>
      self.cidrBlockState(v)
    }
  }

}

final class VpcCidrBlockAssociationOps(val self: VpcCidrBlockAssociation) extends AnyVal {

  final def associationIdAsScala: Option[String] = Option(self.associationId)

  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  final def cidrBlockStateAsScala: Option[VpcCidrBlockState] = Option(self.cidrBlockState)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcCidrBlockAssociationOps {

  implicit def toVpcCidrBlockAssociationBuilderOps(
      v: VpcCidrBlockAssociation.Builder
  ): VpcCidrBlockAssociationBuilderOps = new VpcCidrBlockAssociationBuilderOps(v)

  implicit def toVpcCidrBlockAssociationOps(v: VpcCidrBlockAssociation): VpcCidrBlockAssociationOps =
    new VpcCidrBlockAssociationOps(v)

}
