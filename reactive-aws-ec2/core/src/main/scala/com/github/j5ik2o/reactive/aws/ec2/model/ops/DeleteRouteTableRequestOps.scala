// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteRouteTableRequestBuilderOps(val self: DeleteRouteTableRequest.Builder) extends AnyVal {

  final def routeTableIdAsScala(value: Option[String]): DeleteRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.routeTableId(v)
    }
  }

}

final class DeleteRouteTableRequestOps(val self: DeleteRouteTableRequest) extends AnyVal {

  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRouteTableRequestOps {

  implicit def toDeleteRouteTableRequestBuilderOps(
      v: DeleteRouteTableRequest.Builder
  ): DeleteRouteTableRequestBuilderOps = new DeleteRouteTableRequestBuilderOps(v)

  implicit def toDeleteRouteTableRequestOps(v: DeleteRouteTableRequest): DeleteRouteTableRequestOps =
    new DeleteRouteTableRequestOps(v)

}
