// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LocalGatewayVirtualInterfaceBuilderOps(val self: LocalGatewayVirtualInterface.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceIdAsScala(value: Option[String]): LocalGatewayVirtualInterface.Builder = {
    value.fold(self) { v =>
      self.localGatewayVirtualInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala(value: Option[String]): LocalGatewayVirtualInterface.Builder = {
    value.fold(self) { v =>
      self.localGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vlanAsScala(value: Option[Int]): LocalGatewayVirtualInterface.Builder = {
    value.fold(self) { v =>
      self.vlan(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localAddressAsScala(value: Option[String]): LocalGatewayVirtualInterface.Builder = {
    value.fold(self) { v =>
      self.localAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peerAddressAsScala(value: Option[String]): LocalGatewayVirtualInterface.Builder = {
    value.fold(self) { v =>
      self.peerAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localBgpAsnAsScala(value: Option[Int]): LocalGatewayVirtualInterface.Builder = {
    value.fold(self) { v =>
      self.localBgpAsn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peerBgpAsnAsScala(value: Option[Int]): LocalGatewayVirtualInterface.Builder = {
    value.fold(self) { v =>
      self.peerBgpAsn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): LocalGatewayVirtualInterface.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class LocalGatewayVirtualInterfaceOps(val self: LocalGatewayVirtualInterface) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceIdAsScala: Option[String] = Option(self.localGatewayVirtualInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala: Option[String] = Option(self.localGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vlanAsScala: Option[Int] = Option(self.vlan)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localAddressAsScala: Option[String] = Option(self.localAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peerAddressAsScala: Option[String] = Option(self.peerAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localBgpAsnAsScala: Option[Int] = Option(self.localBgpAsn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peerBgpAsnAsScala: Option[Int] = Option(self.peerBgpAsn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalGatewayVirtualInterfaceOps {

  implicit def toLocalGatewayVirtualInterfaceBuilderOps(
      v: LocalGatewayVirtualInterface.Builder
  ): LocalGatewayVirtualInterfaceBuilderOps = new LocalGatewayVirtualInterfaceBuilderOps(v)

  implicit def toLocalGatewayVirtualInterfaceOps(v: LocalGatewayVirtualInterface): LocalGatewayVirtualInterfaceOps =
    new LocalGatewayVirtualInterfaceOps(v)

}
