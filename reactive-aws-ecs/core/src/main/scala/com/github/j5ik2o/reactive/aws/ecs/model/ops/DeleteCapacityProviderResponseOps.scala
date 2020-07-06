// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteCapacityProviderResponseBuilderOps(val self: DeleteCapacityProviderResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala(value: Option[CapacityProvider]): DeleteCapacityProviderResponse.Builder = {
    value.fold(self) { v => self.capacityProvider(v) }
  }

}

final class DeleteCapacityProviderResponseOps(val self: DeleteCapacityProviderResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala: Option[CapacityProvider] = Option(self.capacityProvider)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteCapacityProviderResponseOps {

  implicit def toDeleteCapacityProviderResponseBuilderOps(
      v: DeleteCapacityProviderResponse.Builder
  ): DeleteCapacityProviderResponseBuilderOps = new DeleteCapacityProviderResponseBuilderOps(v)

  implicit def toDeleteCapacityProviderResponseOps(
      v: DeleteCapacityProviderResponse
  ): DeleteCapacityProviderResponseOps = new DeleteCapacityProviderResponseOps(v)

}
