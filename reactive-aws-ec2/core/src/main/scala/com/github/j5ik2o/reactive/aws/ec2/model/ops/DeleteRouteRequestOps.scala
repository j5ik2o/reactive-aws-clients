// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteRouteRequestBuilderOps(val self: DeleteRouteRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): DeleteRouteRequest.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationIpv6CidrBlockAsScala(value: Option[String]): DeleteRouteRequest.Builder = {
            value.fold(self){ v => self.destinationIpv6CidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala(value: Option[String]): DeleteRouteRequest.Builder = {
            value.fold(self){ v => self.routeTableId(v) }
            } 


}

final class DeleteRouteRequestOps(val self: DeleteRouteRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationIpv6CidrBlockAsScala: Option[String] = Option(self.destinationIpv6CidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala: Option[String] = Option(self.routeTableId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRouteRequestOps {

implicit def toDeleteRouteRequestBuilderOps(v: DeleteRouteRequest.Builder): DeleteRouteRequestBuilderOps = new DeleteRouteRequestBuilderOps(v)

implicit def toDeleteRouteRequestOps(v: DeleteRouteRequest): DeleteRouteRequestOps = new DeleteRouteRequestOps(v)

}

