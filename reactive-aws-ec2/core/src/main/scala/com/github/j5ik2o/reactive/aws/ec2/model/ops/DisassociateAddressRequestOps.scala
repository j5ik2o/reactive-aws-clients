// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateAddressRequestBuilderOps(val self: DisassociateAddressRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala(value: Option[String]): DisassociateAddressRequest.Builder = {
            value.fold(self){ v => self.associationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): DisassociateAddressRequest.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 


}

final class DisassociateAddressRequestOps(val self: DisassociateAddressRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala: Option[String] = Option(self.associationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateAddressRequestOps {

implicit def toDisassociateAddressRequestBuilderOps(v: DisassociateAddressRequest.Builder): DisassociateAddressRequestBuilderOps = new DisassociateAddressRequestBuilderOps(v)

implicit def toDisassociateAddressRequestOps(v: DisassociateAddressRequest): DisassociateAddressRequestOps = new DisassociateAddressRequestOps(v)

}

