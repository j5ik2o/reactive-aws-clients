// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateNodegroupConfigResponseBuilderOps(val self: UpdateNodegroupConfigResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala(value: Option[Update]): UpdateNodegroupConfigResponse.Builder = {
    value.fold(self) { v =>
      self.update(v)
    }
  }

}

final class UpdateNodegroupConfigResponseOps(val self: UpdateNodegroupConfigResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala: Option[Update] = Option(self.update)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateNodegroupConfigResponseOps {

  implicit def toUpdateNodegroupConfigResponseBuilderOps(
      v: UpdateNodegroupConfigResponse.Builder
  ): UpdateNodegroupConfigResponseBuilderOps = new UpdateNodegroupConfigResponseBuilderOps(v)

  implicit def toUpdateNodegroupConfigResponseOps(v: UpdateNodegroupConfigResponse): UpdateNodegroupConfigResponseOps =
    new UpdateNodegroupConfigResponseOps(v)

}
