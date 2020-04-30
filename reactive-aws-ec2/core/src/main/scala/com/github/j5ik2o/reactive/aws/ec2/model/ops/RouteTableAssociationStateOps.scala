// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RouteTableAssociationStateBuilderOps(val self: RouteTableAssociationState.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[RouteTableAssociationStateCode]): RouteTableAssociationState.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusMessageAsScala(value: Option[String]): RouteTableAssociationState.Builder = {
            value.fold(self){ v => self.statusMessage(v) }
            } 


}

final class RouteTableAssociationStateOps(val self: RouteTableAssociationState) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[RouteTableAssociationStateCode] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusMessageAsScala: Option[String] = Option(self.statusMessage) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRouteTableAssociationStateOps {

implicit def toRouteTableAssociationStateBuilderOps(v: RouteTableAssociationState.Builder): RouteTableAssociationStateBuilderOps = new RouteTableAssociationStateBuilderOps(v)

implicit def toRouteTableAssociationStateOps(v: RouteTableAssociationState): RouteTableAssociationStateOps = new RouteTableAssociationStateOps(v)

}

