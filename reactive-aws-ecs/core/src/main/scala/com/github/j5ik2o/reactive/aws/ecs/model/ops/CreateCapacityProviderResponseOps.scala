// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateCapacityProviderResponseBuilderOps(val self: CreateCapacityProviderResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala(value: Option[CapacityProvider]): CreateCapacityProviderResponse.Builder = {
    value.fold(self) { v => self.capacityProvider(v) }
  }

}

final class CreateCapacityProviderResponseOps(val self: CreateCapacityProviderResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala: Option[CapacityProvider] = Option(self.capacityProvider)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCapacityProviderResponseOps {

  implicit def toCreateCapacityProviderResponseBuilderOps(
      v: CreateCapacityProviderResponse.Builder
  ): CreateCapacityProviderResponseBuilderOps = new CreateCapacityProviderResponseBuilderOps(v)

  implicit def toCreateCapacityProviderResponseOps(
      v: CreateCapacityProviderResponse
  ): CreateCapacityProviderResponseOps = new CreateCapacityProviderResponseOps(v)

}
