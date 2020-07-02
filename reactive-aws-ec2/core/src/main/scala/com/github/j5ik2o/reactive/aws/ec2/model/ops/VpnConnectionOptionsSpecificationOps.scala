// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnConnectionOptionsSpecificationBuilderOps(val self: VpnConnectionOptionsSpecification.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableAccelerationAsScala(value: Option[Boolean]): VpnConnectionOptionsSpecification.Builder = {
    value.fold(self) { v => self.enableAcceleration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staticRoutesOnlyAsScala(value: Option[Boolean]): VpnConnectionOptionsSpecification.Builder = {
    value.fold(self) { v => self.staticRoutesOnly(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelOptionsAsScala(
      value: Option[Seq[VpnTunnelOptionsSpecification]]
  ): VpnConnectionOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tunnelOptions(v.asJava)
    }
  }

}

final class VpnConnectionOptionsSpecificationOps(val self: VpnConnectionOptionsSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableAccelerationAsScala: Option[Boolean] = Option(self.enableAcceleration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staticRoutesOnlyAsScala: Option[Boolean] = Option(self.staticRoutesOnly)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelOptionsAsScala: Option[Seq[VpnTunnelOptionsSpecification]] =
    Option(self.tunnelOptions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnConnectionOptionsSpecificationOps {

  implicit def toVpnConnectionOptionsSpecificationBuilderOps(
      v: VpnConnectionOptionsSpecification.Builder
  ): VpnConnectionOptionsSpecificationBuilderOps = new VpnConnectionOptionsSpecificationBuilderOps(v)

  implicit def toVpnConnectionOptionsSpecificationOps(
      v: VpnConnectionOptionsSpecification
  ): VpnConnectionOptionsSpecificationOps = new VpnConnectionOptionsSpecificationOps(v)

}
