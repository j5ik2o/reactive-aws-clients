// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnConnectionOptionsBuilderOps(val self: VpnConnectionOptions.Builder) extends AnyVal {

  final def staticRoutesOnlyAsScala(value: Option[Boolean]): VpnConnectionOptions.Builder = {
    value.fold(self) { v =>
      self.staticRoutesOnly(v)
    }
  }

}

final class VpnConnectionOptionsOps(val self: VpnConnectionOptions) extends AnyVal {

  final def staticRoutesOnlyAsScala: Option[Boolean] = Option(self.staticRoutesOnly)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnConnectionOptionsOps {

  implicit def toVpnConnectionOptionsBuilderOps(v: VpnConnectionOptions.Builder): VpnConnectionOptionsBuilderOps =
    new VpnConnectionOptionsBuilderOps(v)

  implicit def toVpnConnectionOptionsOps(v: VpnConnectionOptions): VpnConnectionOptionsOps =
    new VpnConnectionOptionsOps(v)

}
