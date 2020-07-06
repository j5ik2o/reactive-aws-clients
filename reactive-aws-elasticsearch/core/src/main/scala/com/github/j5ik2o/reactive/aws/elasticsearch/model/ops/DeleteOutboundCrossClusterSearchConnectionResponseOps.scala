// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteOutboundCrossClusterSearchConnectionResponseBuilderOps(
    val self: DeleteOutboundCrossClusterSearchConnectionResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala(
      value: Option[OutboundCrossClusterSearchConnection]
  ): DeleteOutboundCrossClusterSearchConnectionResponse.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnection(v) }
  }

}

final class DeleteOutboundCrossClusterSearchConnectionResponseOps(
    val self: DeleteOutboundCrossClusterSearchConnectionResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionAsScala: Option[OutboundCrossClusterSearchConnection] =
    Option(self.crossClusterSearchConnection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteOutboundCrossClusterSearchConnectionResponseOps {

  implicit def toDeleteOutboundCrossClusterSearchConnectionResponseBuilderOps(
      v: DeleteOutboundCrossClusterSearchConnectionResponse.Builder
  ): DeleteOutboundCrossClusterSearchConnectionResponseBuilderOps =
    new DeleteOutboundCrossClusterSearchConnectionResponseBuilderOps(v)

  implicit def toDeleteOutboundCrossClusterSearchConnectionResponseOps(
      v: DeleteOutboundCrossClusterSearchConnectionResponse
  ): DeleteOutboundCrossClusterSearchConnectionResponseOps =
    new DeleteOutboundCrossClusterSearchConnectionResponseOps(v)

}
