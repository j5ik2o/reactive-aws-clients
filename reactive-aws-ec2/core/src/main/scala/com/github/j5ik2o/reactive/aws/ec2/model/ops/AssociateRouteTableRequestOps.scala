// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateRouteTableRequestBuilderOps(val self: AssociateRouteTableRequest.Builder) extends AnyVal {

  final def routeTableIdAsScala(value: Option[String]): AssociateRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.routeTableId(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): AssociateRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class AssociateRouteTableRequestOps(val self: AssociateRouteTableRequest) extends AnyVal {

  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateRouteTableRequestOps {

  implicit def toAssociateRouteTableRequestBuilderOps(
      v: AssociateRouteTableRequest.Builder
  ): AssociateRouteTableRequestBuilderOps = new AssociateRouteTableRequestBuilderOps(v)

  implicit def toAssociateRouteTableRequestOps(v: AssociateRouteTableRequest): AssociateRouteTableRequestOps =
    new AssociateRouteTableRequestOps(v)

}
