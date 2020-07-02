// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateClientVpnTargetNetworkRequestBuilderOps(val self: AssociateClientVpnTargetNetworkRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): AssociateClientVpnTargetNetworkRequest.Builder = {
    value.fold(self) { v => self.clientVpnEndpointId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): AssociateClientVpnTargetNetworkRequest.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): AssociateClientVpnTargetNetworkRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class AssociateClientVpnTargetNetworkRequestOps(val self: AssociateClientVpnTargetNetworkRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateClientVpnTargetNetworkRequestOps {

  implicit def toAssociateClientVpnTargetNetworkRequestBuilderOps(
      v: AssociateClientVpnTargetNetworkRequest.Builder
  ): AssociateClientVpnTargetNetworkRequestBuilderOps = new AssociateClientVpnTargetNetworkRequestBuilderOps(v)

  implicit def toAssociateClientVpnTargetNetworkRequestOps(
      v: AssociateClientVpnTargetNetworkRequest
  ): AssociateClientVpnTargetNetworkRequestOps = new AssociateClientVpnTargetNetworkRequestOps(v)

}
