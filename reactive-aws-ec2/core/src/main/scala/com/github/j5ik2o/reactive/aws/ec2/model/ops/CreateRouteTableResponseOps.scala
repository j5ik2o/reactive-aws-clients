// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateRouteTableResponseBuilderOps(val self: CreateRouteTableResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableAsScala(value: Option[RouteTable]): CreateRouteTableResponse.Builder = {
    value.fold(self) { v => self.routeTable(v) }
  }

}

final class CreateRouteTableResponseOps(val self: CreateRouteTableResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableAsScala: Option[RouteTable] = Option(self.routeTable)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateRouteTableResponseOps {

  implicit def toCreateRouteTableResponseBuilderOps(
      v: CreateRouteTableResponse.Builder
  ): CreateRouteTableResponseBuilderOps = new CreateRouteTableResponseBuilderOps(v)

  implicit def toCreateRouteTableResponseOps(v: CreateRouteTableResponse): CreateRouteTableResponseOps =
    new CreateRouteTableResponseOps(v)

}
