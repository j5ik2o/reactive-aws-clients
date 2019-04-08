// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateRouteResponseBuilderOps(val self: CreateRouteResponse.Builder) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): CreateRouteResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class CreateRouteResponseOps(val self: CreateRouteResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateRouteResponseOps {

  implicit def toCreateRouteResponseBuilderOps(v: CreateRouteResponse.Builder): CreateRouteResponseBuilderOps =
    new CreateRouteResponseBuilderOps(v)

  implicit def toCreateRouteResponseOps(v: CreateRouteResponse): CreateRouteResponseOps = new CreateRouteResponseOps(v)

}
