// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateClientVpnTargetNetworkResponseBuilderOps(val self: AssociateClientVpnTargetNetworkResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): AssociateClientVpnTargetNetworkResponse.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[AssociationStatus]): AssociateClientVpnTargetNetworkResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class AssociateClientVpnTargetNetworkResponseOps(val self: AssociateClientVpnTargetNetworkResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[AssociationStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateClientVpnTargetNetworkResponseOps {

  implicit def toAssociateClientVpnTargetNetworkResponseBuilderOps(
      v: AssociateClientVpnTargetNetworkResponse.Builder
  ): AssociateClientVpnTargetNetworkResponseBuilderOps = new AssociateClientVpnTargetNetworkResponseBuilderOps(v)

  implicit def toAssociateClientVpnTargetNetworkResponseOps(
      v: AssociateClientVpnTargetNetworkResponse
  ): AssociateClientVpnTargetNetworkResponseOps = new AssociateClientVpnTargetNetworkResponseOps(v)

}
