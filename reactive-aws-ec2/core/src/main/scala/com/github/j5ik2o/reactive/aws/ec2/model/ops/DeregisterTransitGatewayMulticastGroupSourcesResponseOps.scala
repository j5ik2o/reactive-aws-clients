// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeregisterTransitGatewayMulticastGroupSourcesResponseBuilderOps(val self: DeregisterTransitGatewayMulticastGroupSourcesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deregisteredMulticastGroupSourcesAsScala(value: Option[TransitGatewayMulticastDeregisteredGroupSources]): DeregisterTransitGatewayMulticastGroupSourcesResponse.Builder = {
            value.fold(self){ v => self.deregisteredMulticastGroupSources(v) }
            } 


}

final class DeregisterTransitGatewayMulticastGroupSourcesResponseOps(val self: DeregisterTransitGatewayMulticastGroupSourcesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deregisteredMulticastGroupSourcesAsScala: Option[TransitGatewayMulticastDeregisteredGroupSources] = Option(self.deregisteredMulticastGroupSources) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterTransitGatewayMulticastGroupSourcesResponseOps {

implicit def toDeregisterTransitGatewayMulticastGroupSourcesResponseBuilderOps(v: DeregisterTransitGatewayMulticastGroupSourcesResponse.Builder): DeregisterTransitGatewayMulticastGroupSourcesResponseBuilderOps = new DeregisterTransitGatewayMulticastGroupSourcesResponseBuilderOps(v)

implicit def toDeregisterTransitGatewayMulticastGroupSourcesResponseOps(v: DeregisterTransitGatewayMulticastGroupSourcesResponse): DeregisterTransitGatewayMulticastGroupSourcesResponseOps = new DeregisterTransitGatewayMulticastGroupSourcesResponseOps(v)

}

