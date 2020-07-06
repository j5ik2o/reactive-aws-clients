// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class OutboundCrossClusterSearchConnectionStatusBuilderOps(
    val self: OutboundCrossClusterSearchConnectionStatus.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala(
      value: Option[OutboundCrossClusterSearchConnectionStatusCode]
  ): OutboundCrossClusterSearchConnectionStatus.Builder = {
    value.fold(self) { v => self.statusCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): OutboundCrossClusterSearchConnectionStatus.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class OutboundCrossClusterSearchConnectionStatusOps(val self: OutboundCrossClusterSearchConnectionStatus)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala: Option[OutboundCrossClusterSearchConnectionStatusCode] = Option(self.statusCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutboundCrossClusterSearchConnectionStatusOps {

  implicit def toOutboundCrossClusterSearchConnectionStatusBuilderOps(
      v: OutboundCrossClusterSearchConnectionStatus.Builder
  ): OutboundCrossClusterSearchConnectionStatusBuilderOps = new OutboundCrossClusterSearchConnectionStatusBuilderOps(v)

  implicit def toOutboundCrossClusterSearchConnectionStatusOps(
      v: OutboundCrossClusterSearchConnectionStatus
  ): OutboundCrossClusterSearchConnectionStatusOps = new OutboundCrossClusterSearchConnectionStatusOps(v)

}
