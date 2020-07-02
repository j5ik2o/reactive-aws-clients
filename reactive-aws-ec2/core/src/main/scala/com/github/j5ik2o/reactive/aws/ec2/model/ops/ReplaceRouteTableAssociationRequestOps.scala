// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceRouteTableAssociationRequestBuilderOps(val self: ReplaceRouteTableAssociationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): ReplaceRouteTableAssociationRequest.Builder = {
    value.fold(self) { v => self.associationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala(value: Option[String]): ReplaceRouteTableAssociationRequest.Builder = {
    value.fold(self) { v => self.routeTableId(v) }
  }

}

final class ReplaceRouteTableAssociationRequestOps(val self: ReplaceRouteTableAssociationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceRouteTableAssociationRequestOps {

  implicit def toReplaceRouteTableAssociationRequestBuilderOps(
      v: ReplaceRouteTableAssociationRequest.Builder
  ): ReplaceRouteTableAssociationRequestBuilderOps = new ReplaceRouteTableAssociationRequestBuilderOps(v)

  implicit def toReplaceRouteTableAssociationRequestOps(
      v: ReplaceRouteTableAssociationRequest
  ): ReplaceRouteTableAssociationRequestOps = new ReplaceRouteTableAssociationRequestOps(v)

}
