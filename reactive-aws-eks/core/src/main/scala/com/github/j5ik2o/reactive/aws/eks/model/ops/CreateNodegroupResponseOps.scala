// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class CreateNodegroupResponseBuilderOps(val self: CreateNodegroupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupAsScala(value: Option[Nodegroup]): CreateNodegroupResponse.Builder = {
    value.fold(self) { v => self.nodegroup(v) }
  }

}

final class CreateNodegroupResponseOps(val self: CreateNodegroupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupAsScala: Option[Nodegroup] = Option(self.nodegroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNodegroupResponseOps {

  implicit def toCreateNodegroupResponseBuilderOps(
      v: CreateNodegroupResponse.Builder
  ): CreateNodegroupResponseBuilderOps = new CreateNodegroupResponseBuilderOps(v)

  implicit def toCreateNodegroupResponseOps(v: CreateNodegroupResponse): CreateNodegroupResponseOps =
    new CreateNodegroupResponseOps(v)

}
