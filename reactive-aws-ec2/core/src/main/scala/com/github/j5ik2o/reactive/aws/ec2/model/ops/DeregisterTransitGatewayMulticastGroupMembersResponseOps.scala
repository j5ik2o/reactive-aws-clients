// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeregisterTransitGatewayMulticastGroupMembersResponseBuilderOps(val self: DeregisterTransitGatewayMulticastGroupMembersResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deregisteredMulticastGroupMembersAsScala(value: Option[TransitGatewayMulticastDeregisteredGroupMembers]): DeregisterTransitGatewayMulticastGroupMembersResponse.Builder = {
            value.fold(self){ v => self.deregisteredMulticastGroupMembers(v) }
            } 


}

final class DeregisterTransitGatewayMulticastGroupMembersResponseOps(val self: DeregisterTransitGatewayMulticastGroupMembersResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deregisteredMulticastGroupMembersAsScala: Option[TransitGatewayMulticastDeregisteredGroupMembers] = Option(self.deregisteredMulticastGroupMembers) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterTransitGatewayMulticastGroupMembersResponseOps {

implicit def toDeregisterTransitGatewayMulticastGroupMembersResponseBuilderOps(v: DeregisterTransitGatewayMulticastGroupMembersResponse.Builder): DeregisterTransitGatewayMulticastGroupMembersResponseBuilderOps = new DeregisterTransitGatewayMulticastGroupMembersResponseBuilderOps(v)

implicit def toDeregisterTransitGatewayMulticastGroupMembersResponseOps(v: DeregisterTransitGatewayMulticastGroupMembersResponse): DeregisterTransitGatewayMulticastGroupMembersResponseOps = new DeregisterTransitGatewayMulticastGroupMembersResponseOps(v)

}

