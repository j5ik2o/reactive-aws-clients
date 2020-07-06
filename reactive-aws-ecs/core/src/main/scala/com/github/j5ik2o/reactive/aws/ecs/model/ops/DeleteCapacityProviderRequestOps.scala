// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteCapacityProviderRequestBuilderOps(val self: DeleteCapacityProviderRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala(value: Option[String]): DeleteCapacityProviderRequest.Builder = {
    value.fold(self) { v => self.capacityProvider(v) }
  }

}

final class DeleteCapacityProviderRequestOps(val self: DeleteCapacityProviderRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala: Option[String] = Option(self.capacityProvider)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteCapacityProviderRequestOps {

  implicit def toDeleteCapacityProviderRequestBuilderOps(
      v: DeleteCapacityProviderRequest.Builder
  ): DeleteCapacityProviderRequestBuilderOps = new DeleteCapacityProviderRequestBuilderOps(v)

  implicit def toDeleteCapacityProviderRequestOps(v: DeleteCapacityProviderRequest): DeleteCapacityProviderRequestOps =
    new DeleteCapacityProviderRequestOps(v)

}
