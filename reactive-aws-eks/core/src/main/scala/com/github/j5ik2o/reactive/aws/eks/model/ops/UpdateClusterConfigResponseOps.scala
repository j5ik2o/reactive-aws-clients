// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateClusterConfigResponseBuilderOps(val self: UpdateClusterConfigResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala(value: Option[Update]): UpdateClusterConfigResponse.Builder = {
    value.fold(self) { v => self.update(v) }
  }

}

final class UpdateClusterConfigResponseOps(val self: UpdateClusterConfigResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala: Option[Update] = Option(self.update)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterConfigResponseOps {

  implicit def toUpdateClusterConfigResponseBuilderOps(
      v: UpdateClusterConfigResponse.Builder
  ): UpdateClusterConfigResponseBuilderOps = new UpdateClusterConfigResponseBuilderOps(v)

  implicit def toUpdateClusterConfigResponseOps(v: UpdateClusterConfigResponse): UpdateClusterConfigResponseOps =
    new UpdateClusterConfigResponseOps(v)

}
