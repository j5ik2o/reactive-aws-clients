// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class InboundCrossClusterSearchConnectionBuilderOps(val self: InboundCrossClusterSearchConnection.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDomainInfoAsScala(value: Option[DomainInformation]): InboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.sourceDomainInfo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationDomainInfoAsScala(
      value: Option[DomainInformation]
  ): InboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.destinationDomainInfo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala(
      value: Option[String]
  ): InboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnectionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStatusAsScala(
      value: Option[InboundCrossClusterSearchConnectionStatus]
  ): InboundCrossClusterSearchConnection.Builder = {
    value.fold(self) { v => self.connectionStatus(v) }
  }

}

final class InboundCrossClusterSearchConnectionOps(val self: InboundCrossClusterSearchConnection) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDomainInfoAsScala: Option[DomainInformation] = Option(self.sourceDomainInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationDomainInfoAsScala: Option[DomainInformation] = Option(self.destinationDomainInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala: Option[String] = Option(self.crossClusterSearchConnectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStatusAsScala: Option[InboundCrossClusterSearchConnectionStatus] = Option(self.connectionStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInboundCrossClusterSearchConnectionOps {

  implicit def toInboundCrossClusterSearchConnectionBuilderOps(
      v: InboundCrossClusterSearchConnection.Builder
  ): InboundCrossClusterSearchConnectionBuilderOps = new InboundCrossClusterSearchConnectionBuilderOps(v)

  implicit def toInboundCrossClusterSearchConnectionOps(
      v: InboundCrossClusterSearchConnection
  ): InboundCrossClusterSearchConnectionOps = new InboundCrossClusterSearchConnectionOps(v)

}
