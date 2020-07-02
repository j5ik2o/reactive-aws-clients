// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociatedTargetNetworkBuilderOps(val self: AssociatedTargetNetwork.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkIdAsScala(value: Option[String]): AssociatedTargetNetwork.Builder = {
    value.fold(self) { v => self.networkId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkTypeAsScala(value: Option[AssociatedNetworkType]): AssociatedTargetNetwork.Builder = {
    value.fold(self) { v => self.networkType(v) }
  }

}

final class AssociatedTargetNetworkOps(val self: AssociatedTargetNetwork) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkIdAsScala: Option[String] = Option(self.networkId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkTypeAsScala: Option[AssociatedNetworkType] = Option(self.networkType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociatedTargetNetworkOps {

  implicit def toAssociatedTargetNetworkBuilderOps(
      v: AssociatedTargetNetwork.Builder
  ): AssociatedTargetNetworkBuilderOps = new AssociatedTargetNetworkBuilderOps(v)

  implicit def toAssociatedTargetNetworkOps(v: AssociatedTargetNetwork): AssociatedTargetNetworkOps =
    new AssociatedTargetNetworkOps(v)

}
