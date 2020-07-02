// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateNodegroupVersionResponseBuilderOps(val self: UpdateNodegroupVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala(value: Option[Update]): UpdateNodegroupVersionResponse.Builder = {
    value.fold(self) { v => self.update(v) }
  }

}

final class UpdateNodegroupVersionResponseOps(val self: UpdateNodegroupVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala: Option[Update] = Option(self.update)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateNodegroupVersionResponseOps {

  implicit def toUpdateNodegroupVersionResponseBuilderOps(
      v: UpdateNodegroupVersionResponse.Builder
  ): UpdateNodegroupVersionResponseBuilderOps = new UpdateNodegroupVersionResponseBuilderOps(v)

  implicit def toUpdateNodegroupVersionResponseOps(
      v: UpdateNodegroupVersionResponse
  ): UpdateNodegroupVersionResponseOps = new UpdateNodegroupVersionResponseOps(v)

}
