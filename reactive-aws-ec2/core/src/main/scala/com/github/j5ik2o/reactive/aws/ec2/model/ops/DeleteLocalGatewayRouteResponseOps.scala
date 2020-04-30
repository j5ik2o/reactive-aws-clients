// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLocalGatewayRouteResponseBuilderOps(val self: DeleteLocalGatewayRouteResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeAsScala(value: Option[LocalGatewayRoute]): DeleteLocalGatewayRouteResponse.Builder = {
            value.fold(self){ v => self.route(v) }
            } 


}

final class DeleteLocalGatewayRouteResponseOps(val self: DeleteLocalGatewayRouteResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeAsScala: Option[LocalGatewayRoute] = Option(self.route) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLocalGatewayRouteResponseOps {

implicit def toDeleteLocalGatewayRouteResponseBuilderOps(v: DeleteLocalGatewayRouteResponse.Builder): DeleteLocalGatewayRouteResponseBuilderOps = new DeleteLocalGatewayRouteResponseBuilderOps(v)

implicit def toDeleteLocalGatewayRouteResponseOps(v: DeleteLocalGatewayRouteResponse): DeleteLocalGatewayRouteResponseOps = new DeleteLocalGatewayRouteResponseOps(v)

}

