// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateAddressRequestBuilderOps(val self: AssociateAddressRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
            value.fold(self){ v => self.allocationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allowReassociationAsScala(value: Option[Boolean]): AssociateAddressRequest.Builder = {
            value.fold(self){ v => self.allowReassociation(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
            value.fold(self){ v => self.networkInterfaceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateIpAddressAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
            value.fold(self){ v => self.privateIpAddress(v) }
            } 


}

final class AssociateAddressRequestOps(val self: AssociateAddressRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala: Option[String] = Option(self.allocationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allowReassociationAsScala: Option[Boolean] = Option(self.allowReassociation) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateAddressRequestOps {

implicit def toAssociateAddressRequestBuilderOps(v: AssociateAddressRequest.Builder): AssociateAddressRequestBuilderOps = new AssociateAddressRequestBuilderOps(v)

implicit def toAssociateAddressRequestOps(v: AssociateAddressRequest): AssociateAddressRequestOps = new AssociateAddressRequestOps(v)

}

