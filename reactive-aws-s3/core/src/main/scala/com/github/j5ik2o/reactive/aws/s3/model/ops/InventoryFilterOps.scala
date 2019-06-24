// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryFilterBuilderOps(val self: InventoryFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): InventoryFilter.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

}

final class InventoryFilterOps(val self: InventoryFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryFilterOps {

  implicit def toInventoryFilterBuilderOps(v: InventoryFilter.Builder): InventoryFilterBuilderOps =
    new InventoryFilterBuilderOps(v)

  implicit def toInventoryFilterOps(v: InventoryFilter): InventoryFilterOps = new InventoryFilterOps(v)

}
