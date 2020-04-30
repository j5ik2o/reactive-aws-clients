// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableVgwRoutePropagationRequestBuilderOps(val self: DisableVgwRoutePropagationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala(value: Option[String]): DisableVgwRoutePropagationRequest.Builder = {
            value.fold(self){ v => self.gatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala(value: Option[String]): DisableVgwRoutePropagationRequest.Builder = {
            value.fold(self){ v => self.routeTableId(v) }
            } 


}

final class DisableVgwRoutePropagationRequestOps(val self: DisableVgwRoutePropagationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala: Option[String] = Option(self.gatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala: Option[String] = Option(self.routeTableId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableVgwRoutePropagationRequestOps {

implicit def toDisableVgwRoutePropagationRequestBuilderOps(v: DisableVgwRoutePropagationRequest.Builder): DisableVgwRoutePropagationRequestBuilderOps = new DisableVgwRoutePropagationRequestBuilderOps(v)

implicit def toDisableVgwRoutePropagationRequestOps(v: DisableVgwRoutePropagationRequest): DisableVgwRoutePropagationRequestOps = new DisableVgwRoutePropagationRequestOps(v)

}

