// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CapacityProviderStrategyItemBuilderOps(val self: CapacityProviderStrategyItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala(value: Option[String]): CapacityProviderStrategyItem.Builder = {
    value.fold(self) { v => self.capacityProvider(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def weightAsScala(value: Option[Int]): CapacityProviderStrategyItem.Builder = {
    value.fold(self) { v => self.weight(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baseAsScala(value: Option[Int]): CapacityProviderStrategyItem.Builder = {
    value.fold(self) { v => self.base(v) }
  }

}

final class CapacityProviderStrategyItemOps(val self: CapacityProviderStrategyItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderAsScala: Option[String] = Option(self.capacityProvider)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def weightAsScala: Option[Int] = Option(self.weight)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baseAsScala: Option[Int] = Option(self.base)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityProviderStrategyItemOps {

  implicit def toCapacityProviderStrategyItemBuilderOps(
      v: CapacityProviderStrategyItem.Builder
  ): CapacityProviderStrategyItemBuilderOps = new CapacityProviderStrategyItemBuilderOps(v)

  implicit def toCapacityProviderStrategyItemOps(v: CapacityProviderStrategyItem): CapacityProviderStrategyItemOps =
    new CapacityProviderStrategyItemOps(v)

}
