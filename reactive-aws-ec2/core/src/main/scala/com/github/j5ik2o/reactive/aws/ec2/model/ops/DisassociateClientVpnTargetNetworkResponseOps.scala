// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateClientVpnTargetNetworkResponseBuilderOps(
    val self: DisassociateClientVpnTargetNetworkResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): DisassociateClientVpnTargetNetworkResponse.Builder = {
    value.fold(self) { v => self.associationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[AssociationStatus]): DisassociateClientVpnTargetNetworkResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class DisassociateClientVpnTargetNetworkResponseOps(val self: DisassociateClientVpnTargetNetworkResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[AssociationStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateClientVpnTargetNetworkResponseOps {

  implicit def toDisassociateClientVpnTargetNetworkResponseBuilderOps(
      v: DisassociateClientVpnTargetNetworkResponse.Builder
  ): DisassociateClientVpnTargetNetworkResponseBuilderOps = new DisassociateClientVpnTargetNetworkResponseBuilderOps(v)

  implicit def toDisassociateClientVpnTargetNetworkResponseOps(
      v: DisassociateClientVpnTargetNetworkResponse
  ): DisassociateClientVpnTargetNetworkResponseOps = new DisassociateClientVpnTargetNetworkResponseOps(v)

}
