// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateClientVpnTargetNetworkRequestBuilderOps(
    val self: DisassociateClientVpnTargetNetworkRequest.Builder
) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): DisassociateClientVpnTargetNetworkRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def associationIdAsScala(value: Option[String]): DisassociateClientVpnTargetNetworkRequest.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

}

final class DisassociateClientVpnTargetNetworkRequestOps(val self: DisassociateClientVpnTargetNetworkRequest)
    extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def associationIdAsScala: Option[String] = Option(self.associationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateClientVpnTargetNetworkRequestOps {

  implicit def toDisassociateClientVpnTargetNetworkRequestBuilderOps(
      v: DisassociateClientVpnTargetNetworkRequest.Builder
  ): DisassociateClientVpnTargetNetworkRequestBuilderOps = new DisassociateClientVpnTargetNetworkRequestBuilderOps(v)

  implicit def toDisassociateClientVpnTargetNetworkRequestOps(
      v: DisassociateClientVpnTargetNetworkRequest
  ): DisassociateClientVpnTargetNetworkRequestOps = new DisassociateClientVpnTargetNetworkRequestOps(v)

}
