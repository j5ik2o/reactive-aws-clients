// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfaceAssociationBuilderOps(val self: NetworkInterfaceAssociation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
            value.fold(self){ v => self.allocationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
            value.fold(self){ v => self.associationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipOwnerIdAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
            value.fold(self){ v => self.ipOwnerId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicDnsNameAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
            value.fold(self){ v => self.publicDnsName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): NetworkInterfaceAssociation.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 


}

final class NetworkInterfaceAssociationOps(val self: NetworkInterfaceAssociation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala: Option[String] = Option(self.allocationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationIdAsScala: Option[String] = Option(self.associationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipOwnerIdAsScala: Option[String] = Option(self.ipOwnerId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicDnsNameAsScala: Option[String] = Option(self.publicDnsName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceAssociationOps {

implicit def toNetworkInterfaceAssociationBuilderOps(v: NetworkInterfaceAssociation.Builder): NetworkInterfaceAssociationBuilderOps = new NetworkInterfaceAssociationBuilderOps(v)

implicit def toNetworkInterfaceAssociationOps(v: NetworkInterfaceAssociation): NetworkInterfaceAssociationOps = new NetworkInterfaceAssociationOps(v)

}

