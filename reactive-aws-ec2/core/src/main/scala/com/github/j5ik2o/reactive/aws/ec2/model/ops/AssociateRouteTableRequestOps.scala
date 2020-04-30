// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateRouteTableRequestBuilderOps(val self: AssociateRouteTableRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala(value: Option[String]): AssociateRouteTableRequest.Builder = {
            value.fold(self){ v => self.routeTableId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala(value: Option[String]): AssociateRouteTableRequest.Builder = {
            value.fold(self){ v => self.subnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala(value: Option[String]): AssociateRouteTableRequest.Builder = {
            value.fold(self){ v => self.gatewayId(v) }
            } 


}

final class AssociateRouteTableRequestOps(val self: AssociateRouteTableRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala: Option[String] = Option(self.routeTableId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala: Option[String] = Option(self.subnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala: Option[String] = Option(self.gatewayId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateRouteTableRequestOps {

implicit def toAssociateRouteTableRequestBuilderOps(v: AssociateRouteTableRequest.Builder): AssociateRouteTableRequestBuilderOps = new AssociateRouteTableRequestBuilderOps(v)

implicit def toAssociateRouteTableRequestOps(v: AssociateRouteTableRequest): AssociateRouteTableRequestOps = new AssociateRouteTableRequestOps(v)

}

