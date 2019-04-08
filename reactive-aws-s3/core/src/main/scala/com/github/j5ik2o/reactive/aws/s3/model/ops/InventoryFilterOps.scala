// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryFilterBuilderOps(val self: InventoryFilter.Builder) extends AnyVal {

  final def prefixAsScala(value: Option[String]): InventoryFilter.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

}

final class InventoryFilterOps(val self: InventoryFilter) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryFilterOps {

  implicit def toInventoryFilterBuilderOps(v: InventoryFilter.Builder): InventoryFilterBuilderOps =
    new InventoryFilterBuilderOps(v)

  implicit def toInventoryFilterOps(v: InventoryFilter): InventoryFilterOps = new InventoryFilterOps(v)

}
