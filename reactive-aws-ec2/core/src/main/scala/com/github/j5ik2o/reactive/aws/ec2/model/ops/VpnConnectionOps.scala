// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnConnectionBuilderOps(val self: VpnConnection.Builder) extends AnyVal {

  final def customerGatewayConfigurationAsScala(value: Option[String]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.customerGatewayConfiguration(v)
    }
  }

  final def customerGatewayIdAsScala(value: Option[String]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.customerGatewayId(v)
    }
  }

  final def categoryAsScala(value: Option[String]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.category(v)
    }
  }

  final def stateAsScala(value: Option[VpnState]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def typeAsScala(value: Option[GatewayType]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def vpnConnectionIdAsScala(value: Option[String]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.vpnConnectionId(v)
    }
  }

  final def vpnGatewayIdAsScala(value: Option[String]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.vpnGatewayId(v)
    }
  }

  final def transitGatewayIdAsScala(value: Option[String]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def optionsAsScala(value: Option[VpnConnectionOptions]): VpnConnection.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  final def routesAsScala(value: Option[Seq[VpnStaticRoute]]): VpnConnection.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routes(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): VpnConnection.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def vgwTelemetryAsScala(value: Option[Seq[VgwTelemetry]]): VpnConnection.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vgwTelemetry(v.asJava)
    }
  }

}

final class VpnConnectionOps(val self: VpnConnection) extends AnyVal {

  final def customerGatewayConfigurationAsScala: Option[String] = Option(self.customerGatewayConfiguration)

  final def customerGatewayIdAsScala: Option[String] = Option(self.customerGatewayId)

  final def categoryAsScala: Option[String] = Option(self.category)

  final def stateAsScala: Option[VpnState] = Option(self.state)

  final def typeAsScala: Option[GatewayType] = Option(self.`type`)

  final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId)

  final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId)

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def optionsAsScala: Option[VpnConnectionOptions] = Option(self.options)

  final def routesAsScala: Option[Seq[VpnStaticRoute]] = Option(self.routes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vgwTelemetryAsScala: Option[Seq[VgwTelemetry]] = Option(self.vgwTelemetry).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnConnectionOps {

  implicit def toVpnConnectionBuilderOps(v: VpnConnection.Builder): VpnConnectionBuilderOps =
    new VpnConnectionBuilderOps(v)

  implicit def toVpnConnectionOps(v: VpnConnection): VpnConnectionOps = new VpnConnectionOps(v)

}
