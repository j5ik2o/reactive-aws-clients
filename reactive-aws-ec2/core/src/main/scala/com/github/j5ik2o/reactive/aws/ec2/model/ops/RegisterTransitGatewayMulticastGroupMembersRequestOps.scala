// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterTransitGatewayMulticastGroupMembersRequestBuilderOps(val self: RegisterTransitGatewayMulticastGroupMembersRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala(value: Option[String]): RegisterTransitGatewayMulticastGroupMembersRequest.Builder = {
            value.fold(self){ v => self.transitGatewayMulticastDomainId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIpAddressAsScala(value: Option[String]): RegisterTransitGatewayMulticastGroupMembersRequest.Builder = {
            value.fold(self){ v => self.groupIpAddress(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdsAsScala(value: Option[Seq[String]]): RegisterTransitGatewayMulticastGroupMembersRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaceIds(v.asJava) } 
            }


}

final class RegisterTransitGatewayMulticastGroupMembersRequestOps(val self: RegisterTransitGatewayMulticastGroupMembersRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIpAddressAsScala: Option[String] = Option(self.groupIpAddress) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def networkInterfaceIdsAsScala: Option[Seq[String]] = Option(self.networkInterfaceIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTransitGatewayMulticastGroupMembersRequestOps {

implicit def toRegisterTransitGatewayMulticastGroupMembersRequestBuilderOps(v: RegisterTransitGatewayMulticastGroupMembersRequest.Builder): RegisterTransitGatewayMulticastGroupMembersRequestBuilderOps = new RegisterTransitGatewayMulticastGroupMembersRequestBuilderOps(v)

implicit def toRegisterTransitGatewayMulticastGroupMembersRequestOps(v: RegisterTransitGatewayMulticastGroupMembersRequest): RegisterTransitGatewayMulticastGroupMembersRequestOps = new RegisterTransitGatewayMulticastGroupMembersRequestOps(v)

}

