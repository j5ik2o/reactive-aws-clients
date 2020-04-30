// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteClientVpnRouteResponseBuilderOps(val self: DeleteClientVpnRouteResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[ClientVpnRouteStatus]): DeleteClientVpnRouteResponse.Builder = {
            value.fold(self){ v => self.status(v) }
            } 


}

final class DeleteClientVpnRouteResponseOps(val self: DeleteClientVpnRouteResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[ClientVpnRouteStatus] = Option(self.status) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClientVpnRouteResponseOps {

implicit def toDeleteClientVpnRouteResponseBuilderOps(v: DeleteClientVpnRouteResponse.Builder): DeleteClientVpnRouteResponseBuilderOps = new DeleteClientVpnRouteResponseBuilderOps(v)

implicit def toDeleteClientVpnRouteResponseOps(v: DeleteClientVpnRouteResponse): DeleteClientVpnRouteResponseOps = new DeleteClientVpnRouteResponseOps(v)

}

