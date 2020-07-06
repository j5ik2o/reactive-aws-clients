// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AcceptInboundCrossClusterSearchConnectionRequestBuilderOps(
    val self: AcceptInboundCrossClusterSearchConnectionRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala(
      value: Option[String]
  ): AcceptInboundCrossClusterSearchConnectionRequest.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnectionId(v) }
  }

}

final class AcceptInboundCrossClusterSearchConnectionRequestOps(
    val self: AcceptInboundCrossClusterSearchConnectionRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala: Option[String] = Option(self.crossClusterSearchConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptInboundCrossClusterSearchConnectionRequestOps {

  implicit def toAcceptInboundCrossClusterSearchConnectionRequestBuilderOps(
      v: AcceptInboundCrossClusterSearchConnectionRequest.Builder
  ): AcceptInboundCrossClusterSearchConnectionRequestBuilderOps =
    new AcceptInboundCrossClusterSearchConnectionRequestBuilderOps(v)

  implicit def toAcceptInboundCrossClusterSearchConnectionRequestOps(
      v: AcceptInboundCrossClusterSearchConnectionRequest
  ): AcceptInboundCrossClusterSearchConnectionRequestOps = new AcceptInboundCrossClusterSearchConnectionRequestOps(v)

}
