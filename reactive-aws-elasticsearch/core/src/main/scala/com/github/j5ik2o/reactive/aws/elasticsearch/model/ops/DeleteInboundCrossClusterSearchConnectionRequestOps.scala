// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteInboundCrossClusterSearchConnectionRequestBuilderOps(
    val self: DeleteInboundCrossClusterSearchConnectionRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala(
      value: Option[String]
  ): DeleteInboundCrossClusterSearchConnectionRequest.Builder = {
    value.fold(self) { v => self.crossClusterSearchConnectionId(v) }
  }

}

final class DeleteInboundCrossClusterSearchConnectionRequestOps(
    val self: DeleteInboundCrossClusterSearchConnectionRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def crossClusterSearchConnectionIdAsScala: Option[String] = Option(self.crossClusterSearchConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteInboundCrossClusterSearchConnectionRequestOps {

  implicit def toDeleteInboundCrossClusterSearchConnectionRequestBuilderOps(
      v: DeleteInboundCrossClusterSearchConnectionRequest.Builder
  ): DeleteInboundCrossClusterSearchConnectionRequestBuilderOps =
    new DeleteInboundCrossClusterSearchConnectionRequestBuilderOps(v)

  implicit def toDeleteInboundCrossClusterSearchConnectionRequestOps(
      v: DeleteInboundCrossClusterSearchConnectionRequest
  ): DeleteInboundCrossClusterSearchConnectionRequestOps = new DeleteInboundCrossClusterSearchConnectionRequestOps(v)

}
