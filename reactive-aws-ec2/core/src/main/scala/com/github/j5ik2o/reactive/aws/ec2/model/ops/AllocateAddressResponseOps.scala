// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllocateAddressResponseBuilderOps(val self: AllocateAddressResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
            value.fold(self){ v => self.allocationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpv4PoolAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
            value.fold(self){ v => self.publicIpv4Pool(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkBorderGroupAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
            value.fold(self){ v => self.networkBorderGroup(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def domainAsScala(value: Option[DomainType]): AllocateAddressResponse.Builder = {
            value.fold(self){ v => self.domain(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerOwnedIpAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
            value.fold(self){ v => self.customerOwnedIp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerOwnedIpv4PoolAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
            value.fold(self){ v => self.customerOwnedIpv4Pool(v) }
            } 


}

final class AllocateAddressResponseOps(val self: AllocateAddressResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala: Option[String] = Option(self.allocationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpv4PoolAsScala: Option[String] = Option(self.publicIpv4Pool) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkBorderGroupAsScala: Option[String] = Option(self.networkBorderGroup) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def domainAsScala: Option[DomainType] = Option(self.domain) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerOwnedIpAsScala: Option[String] = Option(self.customerOwnedIp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerOwnedIpv4PoolAsScala: Option[String] = Option(self.customerOwnedIpv4Pool) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllocateAddressResponseOps {

implicit def toAllocateAddressResponseBuilderOps(v: AllocateAddressResponse.Builder): AllocateAddressResponseBuilderOps = new AllocateAddressResponseBuilderOps(v)

implicit def toAllocateAddressResponseOps(v: AllocateAddressResponse): AllocateAddressResponseOps = new AllocateAddressResponseOps(v)

}

