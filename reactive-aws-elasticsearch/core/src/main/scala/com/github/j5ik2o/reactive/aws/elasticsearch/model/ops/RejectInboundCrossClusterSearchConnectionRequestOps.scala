// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class RejectInboundCrossClusterSearchConnectionRequestBuilderOps(
    val self: RejectInboundCrossClusterSearchConnectionRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala(
      value: Option[String]
  ): RejectInboundCrossClusterSearchConnectionRequest.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnectionId(v) }
  }

}

final class RejectInboundCrossClusterSearchConnectionRequestOps(
    val self: RejectInboundCrossClusterSearchConnectionRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala: Option[String] = Option(self.crossClusterSearchConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectInboundCrossClusterSearchConnectionRequestOps {

  implicit def toRejectInboundCrossClusterSearchConnectionRequestBuilderOps(
      v: RejectInboundCrossClusterSearchConnectionRequest.Builder
  ): RejectInboundCrossClusterSearchConnectionRequestBuilderOps =
    new RejectInboundCrossClusterSearchConnectionRequestBuilderOps(v)

  implicit def toRejectInboundCrossClusterSearchConnectionRequestOps(
      v: RejectInboundCrossClusterSearchConnectionRequest
  ): RejectInboundCrossClusterSearchConnectionRequestOps = new RejectInboundCrossClusterSearchConnectionRequestOps(v)

}
