// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RegisterContainerInstanceResponseBuilderOps(val self: RegisterContainerInstanceResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala(value: Option[ContainerInstance]): RegisterContainerInstanceResponse.Builder = {
    value.fold(self) { v =>
      self.containerInstance(v)
    }
  }

}

final class RegisterContainerInstanceResponseOps(val self: RegisterContainerInstanceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala: Option[ContainerInstance] = Option(self.containerInstance)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterContainerInstanceResponseOps {

  implicit def toRegisterContainerInstanceResponseBuilderOps(
      v: RegisterContainerInstanceResponse.Builder
  ): RegisterContainerInstanceResponseBuilderOps = new RegisterContainerInstanceResponseBuilderOps(v)

  implicit def toRegisterContainerInstanceResponseOps(
      v: RegisterContainerInstanceResponse
  ): RegisterContainerInstanceResponseOps = new RegisterContainerInstanceResponseOps(v)

}
