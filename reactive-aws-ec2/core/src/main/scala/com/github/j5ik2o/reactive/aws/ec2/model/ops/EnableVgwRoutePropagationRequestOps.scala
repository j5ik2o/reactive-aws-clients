// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableVgwRoutePropagationRequestBuilderOps(val self: EnableVgwRoutePropagationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gatewayIdAsScala(value: Option[String]): EnableVgwRoutePropagationRequest.Builder = {
    value.fold(self) { v => self.gatewayId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala(value: Option[String]): EnableVgwRoutePropagationRequest.Builder = {
    value.fold(self) { v => self.routeTableId(v) }
  }

}

final class EnableVgwRoutePropagationRequestOps(val self: EnableVgwRoutePropagationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gatewayIdAsScala: Option[String] = Option(self.gatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableVgwRoutePropagationRequestOps {

  implicit def toEnableVgwRoutePropagationRequestBuilderOps(
      v: EnableVgwRoutePropagationRequest.Builder
  ): EnableVgwRoutePropagationRequestBuilderOps = new EnableVgwRoutePropagationRequestBuilderOps(v)

  implicit def toEnableVgwRoutePropagationRequestOps(
      v: EnableVgwRoutePropagationRequest
  ): EnableVgwRoutePropagationRequestOps = new EnableVgwRoutePropagationRequestOps(v)

}
