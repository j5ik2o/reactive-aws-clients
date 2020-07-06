// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AcceptInboundCrossClusterSearchConnectionResponseBuilderOps(
    val self: AcceptInboundCrossClusterSearchConnectionResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala(
      value: Option[InboundCrossClusterSearchConnection]
  ): AcceptInboundCrossClusterSearchConnectionResponse.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnection(v) }
  }

}

final class AcceptInboundCrossClusterSearchConnectionResponseOps(
    val self: AcceptInboundCrossClusterSearchConnectionResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala: Option[InboundCrossClusterSearchConnection] =
    Option(self.crossClusterSearchConnection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptInboundCrossClusterSearchConnectionResponseOps {

  implicit def toAcceptInboundCrossClusterSearchConnectionResponseBuilderOps(
      v: AcceptInboundCrossClusterSearchConnectionResponse.Builder
  ): AcceptInboundCrossClusterSearchConnectionResponseBuilderOps =
    new AcceptInboundCrossClusterSearchConnectionResponseBuilderOps(v)

  implicit def toAcceptInboundCrossClusterSearchConnectionResponseOps(
      v: AcceptInboundCrossClusterSearchConnectionResponse
  ): AcceptInboundCrossClusterSearchConnectionResponseOps = new AcceptInboundCrossClusterSearchConnectionResponseOps(v)

}
