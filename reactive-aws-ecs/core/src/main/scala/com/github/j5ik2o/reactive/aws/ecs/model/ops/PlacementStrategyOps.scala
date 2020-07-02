// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PlacementStrategyBuilderOps(val self: PlacementStrategy.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[PlacementStrategyType]): PlacementStrategy.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldAsScala(value: Option[String]): PlacementStrategy.Builder = {
    value.fold(self) { v => self.field(v) }
  }

}

final class PlacementStrategyOps(val self: PlacementStrategy) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[PlacementStrategyType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldAsScala: Option[String] = Option(self.field)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlacementStrategyOps {

  implicit def toPlacementStrategyBuilderOps(v: PlacementStrategy.Builder): PlacementStrategyBuilderOps =
    new PlacementStrategyBuilderOps(v)

  implicit def toPlacementStrategyOps(v: PlacementStrategy): PlacementStrategyOps = new PlacementStrategyOps(v)

}
