// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DeleteNodegroupResponseBuilderOps(val self: DeleteNodegroupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupAsScala(value: Option[Nodegroup]): DeleteNodegroupResponse.Builder = {
    value.fold(self) { v => self.nodegroup(v) }
  }

}

final class DeleteNodegroupResponseOps(val self: DeleteNodegroupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupAsScala: Option[Nodegroup] = Option(self.nodegroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNodegroupResponseOps {

  implicit def toDeleteNodegroupResponseBuilderOps(
      v: DeleteNodegroupResponse.Builder
  ): DeleteNodegroupResponseBuilderOps = new DeleteNodegroupResponseBuilderOps(v)

  implicit def toDeleteNodegroupResponseOps(v: DeleteNodegroupResponse): DeleteNodegroupResponseOps =
    new DeleteNodegroupResponseOps(v)

}
