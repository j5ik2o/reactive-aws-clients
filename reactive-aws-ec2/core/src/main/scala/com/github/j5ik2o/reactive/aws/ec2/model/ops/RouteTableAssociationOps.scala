// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RouteTableAssociationBuilderOps(val self: RouteTableAssociation.Builder) extends AnyVal {

  final def mainAsScala(value: Option[Boolean]): RouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.main(v)
    }
  }

  final def routeTableAssociationIdAsScala(value: Option[String]): RouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.routeTableAssociationId(v)
    }
  }

  final def routeTableIdAsScala(value: Option[String]): RouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.routeTableId(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): RouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class RouteTableAssociationOps(val self: RouteTableAssociation) extends AnyVal {

  final def mainAsScala: Option[Boolean] = Option(self.main)

  final def routeTableAssociationIdAsScala: Option[String] = Option(self.routeTableAssociationId)

  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRouteTableAssociationOps {

  implicit def toRouteTableAssociationBuilderOps(v: RouteTableAssociation.Builder): RouteTableAssociationBuilderOps =
    new RouteTableAssociationBuilderOps(v)

  implicit def toRouteTableAssociationOps(v: RouteTableAssociation): RouteTableAssociationOps =
    new RouteTableAssociationOps(v)

}
