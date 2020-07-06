// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteOutboundCrossClusterSearchConnectionRequestBuilderOps(
    val self: DeleteOutboundCrossClusterSearchConnectionRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala(
      value: Option[String]
  ): DeleteOutboundCrossClusterSearchConnectionRequest.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnectionId(v) }
  }

}

final class DeleteOutboundCrossClusterSearchConnectionRequestOps(
    val self: DeleteOutboundCrossClusterSearchConnectionRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala: Option[String] = Option(self.crossClusterSearchConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteOutboundCrossClusterSearchConnectionRequestOps {

  implicit def toDeleteOutboundCrossClusterSearchConnectionRequestBuilderOps(
      v: DeleteOutboundCrossClusterSearchConnectionRequest.Builder
  ): DeleteOutboundCrossClusterSearchConnectionRequestBuilderOps =
    new DeleteOutboundCrossClusterSearchConnectionRequestBuilderOps(v)

  implicit def toDeleteOutboundCrossClusterSearchConnectionRequestOps(
      v: DeleteOutboundCrossClusterSearchConnectionRequest
  ): DeleteOutboundCrossClusterSearchConnectionRequestOps = new DeleteOutboundCrossClusterSearchConnectionRequestOps(v)

}
