// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyClientVpnEndpointResponseBuilderOps(val self: ModifyClientVpnEndpointResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifyClientVpnEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ModifyClientVpnEndpointResponseOps(val self: ModifyClientVpnEndpointResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyClientVpnEndpointResponseOps {

  implicit def toModifyClientVpnEndpointResponseBuilderOps(
      v: ModifyClientVpnEndpointResponse.Builder
  ): ModifyClientVpnEndpointResponseBuilderOps = new ModifyClientVpnEndpointResponseBuilderOps(v)

  implicit def toModifyClientVpnEndpointResponseOps(
      v: ModifyClientVpnEndpointResponse
  ): ModifyClientVpnEndpointResponseOps = new ModifyClientVpnEndpointResponseOps(v)

}
