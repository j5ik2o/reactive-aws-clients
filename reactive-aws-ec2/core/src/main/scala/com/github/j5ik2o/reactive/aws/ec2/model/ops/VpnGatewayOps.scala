// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnGatewayBuilderOps(val self: VpnGateway.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): VpnGateway.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def stateAsScala(value: Option[VpnState]): VpnGateway.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def typeAsScala(value: Option[GatewayType]): VpnGateway.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def vpcAttachmentsAsScala(value: Option[Seq[VpcAttachment]]): VpnGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpcAttachments(v.asJava)
    }
  }

  final def vpnGatewayIdAsScala(value: Option[String]): VpnGateway.Builder = {
    value.fold(self) { v =>
      self.vpnGatewayId(v)
    }
  }

  final def amazonSideAsnAsScala(value: Option[Long]): VpnGateway.Builder = {
    value.fold(self) { v =>
      self.amazonSideAsn(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): VpnGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class VpnGatewayOps(val self: VpnGateway) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def stateAsScala: Option[VpnState] = Option(self.state)

  final def typeAsScala: Option[GatewayType] = Option(self.`type`)

  final def vpcAttachmentsAsScala: Option[Seq[VpcAttachment]] = Option(self.vpcAttachments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId)

  final def amazonSideAsnAsScala: Option[Long] = Option(self.amazonSideAsn)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnGatewayOps {

  implicit def toVpnGatewayBuilderOps(v: VpnGateway.Builder): VpnGatewayBuilderOps = new VpnGatewayBuilderOps(v)

  implicit def toVpnGatewayOps(v: VpnGateway): VpnGatewayOps = new VpnGatewayOps(v)

}
