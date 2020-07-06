// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class OutboundCrossClusterSearchConnectionBuilderOps(val self: OutboundCrossClusterSearchConnection.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDomainInfoAsScala(value: Option[DomainInformation]): OutboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.sourceDomainInfo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationDomainInfoAsScala(
      value: Option[DomainInformation]
  ): OutboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.destinationDomainInfo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala(
      value: Option[String]
  ): OutboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnectionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionAliasAsScala(value: Option[String]): OutboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.connectionAlias(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStatusAsScala(
      value: Option[OutboundCrossClusterSearchConnectionStatus]
  ): OutboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.connectionStatus(v) }
  }

}

final class OutboundCrossClusterSearchConnectionOps(val self: OutboundCrossClusterSearchConnection) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDomainInfoAsScala: Option[DomainInformation] = Option(self.sourceDomainInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationDomainInfoAsScala: Option[DomainInformation] = Option(self.destinationDomainInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala: Option[String] = Option(self.crossClusterSearchConnectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionAliasAsScala: Option[String] = Option(self.connectionAlias)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStatusAsScala: Option[OutboundCrossClusterSearchConnectionStatus] = Option(self.connectionStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutboundCrossClusterSearchConnectionOps {

  implicit def toOutboundCrossClusterSearchConnectionBuilderOps(
      v: OutboundCrossClusterSearchConnection.Builder
  ): OutboundCrossClusterSearchConnectionBuilderOps = new OutboundCrossClusterSearchConnectionBuilderOps(v)

  implicit def toOutboundCrossClusterSearchConnectionOps(
      v: OutboundCrossClusterSearchConnection
  ): OutboundCrossClusterSearchConnectionOps = new OutboundCrossClusterSearchConnectionOps(v)

}
