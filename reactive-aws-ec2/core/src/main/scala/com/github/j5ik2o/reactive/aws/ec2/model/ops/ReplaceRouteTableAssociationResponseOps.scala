// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceRouteTableAssociationResponseBuilderOps(val self: ReplaceRouteTableAssociationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newAssociationIdAsScala(value: Option[String]): ReplaceRouteTableAssociationResponse.Builder = {
    value.fold(self) { v =>
      self.newAssociationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationStateAsScala(
      value: Option[RouteTableAssociationState]
  ): ReplaceRouteTableAssociationResponse.Builder = {
    value.fold(self) { v =>
      self.associationState(v)
    }
  }

}

final class ReplaceRouteTableAssociationResponseOps(val self: ReplaceRouteTableAssociationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newAssociationIdAsScala: Option[String] = Option(self.newAssociationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationStateAsScala: Option[RouteTableAssociationState] = Option(self.associationState)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceRouteTableAssociationResponseOps {

  implicit def toReplaceRouteTableAssociationResponseBuilderOps(
      v: ReplaceRouteTableAssociationResponse.Builder
  ): ReplaceRouteTableAssociationResponseBuilderOps = new ReplaceRouteTableAssociationResponseBuilderOps(v)

  implicit def toReplaceRouteTableAssociationResponseOps(
      v: ReplaceRouteTableAssociationResponse
  ): ReplaceRouteTableAssociationResponseOps = new ReplaceRouteTableAssociationResponseOps(v)

}
