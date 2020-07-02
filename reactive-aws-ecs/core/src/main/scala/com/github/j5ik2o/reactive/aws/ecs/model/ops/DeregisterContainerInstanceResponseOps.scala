// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeregisterContainerInstanceResponseBuilderOps(val self: DeregisterContainerInstanceResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala(value: Option[ContainerInstance]): DeregisterContainerInstanceResponse.Builder = {
    value.fold(self) { v => self.containerInstance(v) }
  }

}

final class DeregisterContainerInstanceResponseOps(val self: DeregisterContainerInstanceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala: Option[ContainerInstance] = Option(self.containerInstance)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterContainerInstanceResponseOps {

  implicit def toDeregisterContainerInstanceResponseBuilderOps(
      v: DeregisterContainerInstanceResponse.Builder
  ): DeregisterContainerInstanceResponseBuilderOps = new DeregisterContainerInstanceResponseBuilderOps(v)

  implicit def toDeregisterContainerInstanceResponseOps(
      v: DeregisterContainerInstanceResponse
  ): DeregisterContainerInstanceResponseOps = new DeregisterContainerInstanceResponseOps(v)

}
