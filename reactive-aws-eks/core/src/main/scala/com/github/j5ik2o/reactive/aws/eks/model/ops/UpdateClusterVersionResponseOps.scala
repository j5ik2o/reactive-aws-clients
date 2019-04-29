// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateClusterVersionResponseBuilderOps(val self: UpdateClusterVersionResponse.Builder) extends AnyVal {

  final def updateAsScala(value: Option[Update]): UpdateClusterVersionResponse.Builder = {
    value.fold(self) { v =>
      self.update(v)
    }
  }

}

final class UpdateClusterVersionResponseOps(val self: UpdateClusterVersionResponse) extends AnyVal {

  final def updateAsScala: Option[Update] = Option(self.update)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterVersionResponseOps {

  implicit def toUpdateClusterVersionResponseBuilderOps(
      v: UpdateClusterVersionResponse.Builder
  ): UpdateClusterVersionResponseBuilderOps = new UpdateClusterVersionResponseBuilderOps(v)

  implicit def toUpdateClusterVersionResponseOps(v: UpdateClusterVersionResponse): UpdateClusterVersionResponseOps =
    new UpdateClusterVersionResponseOps(v)

}
