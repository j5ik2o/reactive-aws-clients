// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DiscoverPollEndpointRequestBuilderOps(val self: DiscoverPollEndpointRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def containerInstanceAsScala(value: Option[String]): DiscoverPollEndpointRequest.Builder = {
            value.fold(self){ v => self.containerInstance(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala(value: Option[String]): DiscoverPollEndpointRequest.Builder = {
            value.fold(self){ v => self.cluster(v) }
            } 


}

final class DiscoverPollEndpointRequestOps(val self: DiscoverPollEndpointRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def containerInstanceAsScala: Option[String] = Option(self.containerInstance) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala: Option[String] = Option(self.cluster) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDiscoverPollEndpointRequestOps {

implicit def toDiscoverPollEndpointRequestBuilderOps(v: DiscoverPollEndpointRequest.Builder): DiscoverPollEndpointRequestBuilderOps = new DiscoverPollEndpointRequestBuilderOps(v)

implicit def toDiscoverPollEndpointRequestOps(v: DiscoverPollEndpointRequest): DiscoverPollEndpointRequestOps = new DiscoverPollEndpointRequestOps(v)

}

