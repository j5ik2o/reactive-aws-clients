// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateVpcCidrBlockRequestBuilderOps(val self: DisassociateVpcCidrBlockRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): DisassociateVpcCidrBlockRequest.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

}

final class DisassociateVpcCidrBlockRequestOps(val self: DisassociateVpcCidrBlockRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateVpcCidrBlockRequestOps {

  implicit def toDisassociateVpcCidrBlockRequestBuilderOps(
      v: DisassociateVpcCidrBlockRequest.Builder
  ): DisassociateVpcCidrBlockRequestBuilderOps = new DisassociateVpcCidrBlockRequestBuilderOps(v)

  implicit def toDisassociateVpcCidrBlockRequestOps(
      v: DisassociateVpcCidrBlockRequest
  ): DisassociateVpcCidrBlockRequestOps = new DisassociateVpcCidrBlockRequestOps(v)

}
