// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class InboundCrossClusterSearchConnectionStatusBuilderOps(
    val self: InboundCrossClusterSearchConnectionStatus.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala(
      value: Option[InboundCrossClusterSearchConnectionStatusCode]
  ): InboundCrossClusterSearchConnectionStatus.Builder = {
    value.fold(self) { v => self.statusCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): InboundCrossClusterSearchConnectionStatus.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class InboundCrossClusterSearchConnectionStatusOps(val self: InboundCrossClusterSearchConnectionStatus)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala: Option[InboundCrossClusterSearchConnectionStatusCode] = Option(self.statusCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInboundCrossClusterSearchConnectionStatusOps {

  implicit def toInboundCrossClusterSearchConnectionStatusBuilderOps(
      v: InboundCrossClusterSearchConnectionStatus.Builder
  ): InboundCrossClusterSearchConnectionStatusBuilderOps = new InboundCrossClusterSearchConnectionStatusBuilderOps(v)

  implicit def toInboundCrossClusterSearchConnectionStatusOps(
      v: InboundCrossClusterSearchConnectionStatus
  ): InboundCrossClusterSearchConnectionStatusOps = new InboundCrossClusterSearchConnectionStatusOps(v)

}
