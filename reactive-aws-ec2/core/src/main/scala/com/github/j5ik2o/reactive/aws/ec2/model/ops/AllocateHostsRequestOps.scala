// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllocateHostsRequestBuilderOps(val self: AllocateHostsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def autoPlacementAsScala(value: Option[AutoPlacement]): AllocateHostsRequest.Builder = {
            value.fold(self){ v => self.autoPlacement(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): AllocateHostsRequest.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): AllocateHostsRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[String]): AllocateHostsRequest.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala(value: Option[String]): AllocateHostsRequest.Builder = {
            value.fold(self){ v => self.instanceFamily(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def quantityAsScala(value: Option[Int]): AllocateHostsRequest.Builder = {
            value.fold(self){ v => self.quantity(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): AllocateHostsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hostRecoveryAsScala(value: Option[HostRecovery]): AllocateHostsRequest.Builder = {
            value.fold(self){ v => self.hostRecovery(v) }
            } 


}

final class AllocateHostsRequestOps(val self: AllocateHostsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def autoPlacementAsScala: Option[AutoPlacement] = Option(self.autoPlacement) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[String] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala: Option[String] = Option(self.instanceFamily) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def quantityAsScala: Option[Int] = Option(self.quantity) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hostRecoveryAsScala: Option[HostRecovery] = Option(self.hostRecovery) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllocateHostsRequestOps {

implicit def toAllocateHostsRequestBuilderOps(v: AllocateHostsRequest.Builder): AllocateHostsRequestBuilderOps = new AllocateHostsRequestBuilderOps(v)

implicit def toAllocateHostsRequestOps(v: AllocateHostsRequest): AllocateHostsRequestOps = new AllocateHostsRequestOps(v)

}

