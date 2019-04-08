// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateSubnetCidrBlockRequestBuilderOps(val self: AssociateSubnetCidrBlockRequest.Builder)
    extends AnyVal {

  final def ipv6CidrBlockAsScala(value: Option[String]): AssociateSubnetCidrBlockRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlock(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): AssociateSubnetCidrBlockRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class AssociateSubnetCidrBlockRequestOps(val self: AssociateSubnetCidrBlockRequest) extends AnyVal {

  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateSubnetCidrBlockRequestOps {

  implicit def toAssociateSubnetCidrBlockRequestBuilderOps(
      v: AssociateSubnetCidrBlockRequest.Builder
  ): AssociateSubnetCidrBlockRequestBuilderOps = new AssociateSubnetCidrBlockRequestBuilderOps(v)

  implicit def toAssociateSubnetCidrBlockRequestOps(
      v: AssociateSubnetCidrBlockRequest
  ): AssociateSubnetCidrBlockRequestOps = new AssociateSubnetCidrBlockRequestOps(v)

}
