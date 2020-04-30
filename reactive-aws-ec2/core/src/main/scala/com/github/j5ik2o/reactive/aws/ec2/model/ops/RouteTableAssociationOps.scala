// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RouteTableAssociationBuilderOps(val self: RouteTableAssociation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def mainAsScala(value: Option[Boolean]): RouteTableAssociation.Builder = {
            value.fold(self){ v => self.main(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableAssociationIdAsScala(value: Option[String]): RouteTableAssociation.Builder = {
            value.fold(self){ v => self.routeTableAssociationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala(value: Option[String]): RouteTableAssociation.Builder = {
            value.fold(self){ v => self.routeTableId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala(value: Option[String]): RouteTableAssociation.Builder = {
            value.fold(self){ v => self.subnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala(value: Option[String]): RouteTableAssociation.Builder = {
            value.fold(self){ v => self.gatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationStateAsScala(value: Option[RouteTableAssociationState]): RouteTableAssociation.Builder = {
            value.fold(self){ v => self.associationState(v) }
            } 


}

final class RouteTableAssociationOps(val self: RouteTableAssociation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def mainAsScala: Option[Boolean] = Option(self.main) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableAssociationIdAsScala: Option[String] = Option(self.routeTableAssociationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdAsScala: Option[String] = Option(self.routeTableId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala: Option[String] = Option(self.subnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala: Option[String] = Option(self.gatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationStateAsScala: Option[RouteTableAssociationState] = Option(self.associationState) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRouteTableAssociationOps {

implicit def toRouteTableAssociationBuilderOps(v: RouteTableAssociation.Builder): RouteTableAssociationBuilderOps = new RouteTableAssociationBuilderOps(v)

implicit def toRouteTableAssociationOps(v: RouteTableAssociation): RouteTableAssociationOps = new RouteTableAssociationOps(v)

}

