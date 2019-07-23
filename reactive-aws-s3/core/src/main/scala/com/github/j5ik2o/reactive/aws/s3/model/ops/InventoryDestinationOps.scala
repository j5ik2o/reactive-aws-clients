// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryDestinationBuilderOps(val self: InventoryDestination.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketDestinationAsScala(value: Option[InventoryS3BucketDestination]): InventoryDestination.Builder = {
    value.fold(self) { v =>
      self.s3BucketDestination(v)
    }
  }

}

final class InventoryDestinationOps(val self: InventoryDestination) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketDestinationAsScala: Option[InventoryS3BucketDestination] = Option(self.s3BucketDestination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryDestinationOps {

  implicit def toInventoryDestinationBuilderOps(v: InventoryDestination.Builder): InventoryDestinationBuilderOps =
    new InventoryDestinationBuilderOps(v)

  implicit def toInventoryDestinationOps(v: InventoryDestination): InventoryDestinationOps =
    new InventoryDestinationOps(v)

}
