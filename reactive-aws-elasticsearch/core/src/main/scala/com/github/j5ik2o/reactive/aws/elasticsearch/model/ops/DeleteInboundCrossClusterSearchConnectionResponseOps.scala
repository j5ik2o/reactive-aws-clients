// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteInboundCrossClusterSearchConnectionResponseBuilderOps(
    val self: DeleteInboundCrossClusterSearchConnectionResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala(
      value: Option[InboundCrossClusterSearchConnection]
  ): DeleteInboundCrossClusterSearchConnectionResponse.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnection(v) }
  }

}

final class DeleteInboundCrossClusterSearchConnectionResponseOps(
    val self: DeleteInboundCrossClusterSearchConnectionResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala: Option[InboundCrossClusterSearchConnection] =
    Option(self.crossClusterSearchConnection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteInboundCrossClusterSearchConnectionResponseOps {

  implicit def toDeleteInboundCrossClusterSearchConnectionResponseBuilderOps(
      v: DeleteInboundCrossClusterSearchConnectionResponse.Builder
  ): DeleteInboundCrossClusterSearchConnectionResponseBuilderOps =
    new DeleteInboundCrossClusterSearchConnectionResponseBuilderOps(v)

  implicit def toDeleteInboundCrossClusterSearchConnectionResponseOps(
      v: DeleteInboundCrossClusterSearchConnectionResponse
  ): DeleteInboundCrossClusterSearchConnectionResponseOps = new DeleteInboundCrossClusterSearchConnectionResponseOps(v)

}
