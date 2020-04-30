// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateSubnetCidrBlockRequestBuilderOps(val self: DisassociateSubnetCidrBlockRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala(value: Option[String]): DisassociateSubnetCidrBlockRequest.Builder = {
            value.fold(self){ v => self.associationId(v) }
            } 


}

final class DisassociateSubnetCidrBlockRequestOps(val self: DisassociateSubnetCidrBlockRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala: Option[String] = Option(self.associationId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateSubnetCidrBlockRequestOps {

implicit def toDisassociateSubnetCidrBlockRequestBuilderOps(v: DisassociateSubnetCidrBlockRequest.Builder): DisassociateSubnetCidrBlockRequestBuilderOps = new DisassociateSubnetCidrBlockRequestBuilderOps(v)

implicit def toDisassociateSubnetCidrBlockRequestOps(v: DisassociateSubnetCidrBlockRequest): DisassociateSubnetCidrBlockRequestOps = new DisassociateSubnetCidrBlockRequestOps(v)

}

