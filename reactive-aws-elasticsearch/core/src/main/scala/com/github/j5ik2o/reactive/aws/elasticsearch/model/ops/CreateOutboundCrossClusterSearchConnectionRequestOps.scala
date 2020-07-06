// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CreateOutboundCrossClusterSearchConnectionRequestBuilderOps(
    val self: CreateOutboundCrossClusterSearchConnectionRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDomainInfoAsScala(
      value: Option[DomainInformation]
  ): CreateOutboundCrossClusterSearchConnectionRequest.Builder = {
    value.fold(self) { v => self.sourceDomainInfo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationDomainInfoAsScala(
      value: Option[DomainInformation]
  ): CreateOutboundCrossClusterSearchConnectionRequest.Builder = {
    value.fold(self) { v => self.destinationDomainInfo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionAliasAsScala(value: Option[String]): CreateOutboundCrossClusterSearchConnectionRequest.Builder = {
    value.fold(self) { v => self.connectionAlias(v) }
  }

}

final class CreateOutboundCrossClusterSearchConnectionRequestOps(
    val self: CreateOutboundCrossClusterSearchConnectionRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDomainInfoAsScala: Option[DomainInformation] = Option(self.sourceDomainInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationDomainInfoAsScala: Option[DomainInformation] = Option(self.destinationDomainInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionAliasAsScala: Option[String] = Option(self.connectionAlias)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateOutboundCrossClusterSearchConnectionRequestOps {

  implicit def toCreateOutboundCrossClusterSearchConnectionRequestBuilderOps(
      v: CreateOutboundCrossClusterSearchConnectionRequest.Builder
  ): CreateOutboundCrossClusterSearchConnectionRequestBuilderOps =
    new CreateOutboundCrossClusterSearchConnectionRequestBuilderOps(v)

  implicit def toCreateOutboundCrossClusterSearchConnectionRequestOps(
      v: CreateOutboundCrossClusterSearchConnectionRequest
  ): CreateOutboundCrossClusterSearchConnectionRequestOps = new CreateOutboundCrossClusterSearchConnectionRequestOps(v)

}
