// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class RejectInboundCrossClusterSearchConnectionResponseBuilderOps(
    val self: RejectInboundCrossClusterSearchConnectionResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala(
      value: Option[InboundCrossClusterSearchConnection]
  ): RejectInboundCrossClusterSearchConnectionResponse.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnection(v) }
  }

}

final class RejectInboundCrossClusterSearchConnectionResponseOps(
    val self: RejectInboundCrossClusterSearchConnectionResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala: Option[InboundCrossClusterSearchConnection] =
    Option(self.crossClusterSearchConnection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectInboundCrossClusterSearchConnectionResponseOps {

  implicit def toRejectInboundCrossClusterSearchConnectionResponseBuilderOps(
      v: RejectInboundCrossClusterSearchConnectionResponse.Builder
  ): RejectInboundCrossClusterSearchConnectionResponseBuilderOps =
    new RejectInboundCrossClusterSearchConnectionResponseBuilderOps(v)

  implicit def toRejectInboundCrossClusterSearchConnectionResponseOps(
      v: RejectInboundCrossClusterSearchConnectionResponse
  ): RejectInboundCrossClusterSearchConnectionResponseOps = new RejectInboundCrossClusterSearchConnectionResponseOps(v)

}
