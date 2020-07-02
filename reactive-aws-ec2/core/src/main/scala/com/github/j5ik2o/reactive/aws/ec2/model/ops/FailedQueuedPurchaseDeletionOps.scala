// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FailedQueuedPurchaseDeletionBuilderOps(val self: FailedQueuedPurchaseDeletion.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorAsScala(value: Option[DeleteQueuedReservedInstancesError]): FailedQueuedPurchaseDeletion.Builder = {
    value.fold(self) { v => self.error(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala(value: Option[String]): FailedQueuedPurchaseDeletion.Builder = {
    value.fold(self) { v => self.reservedInstancesId(v) }
  }

}

final class FailedQueuedPurchaseDeletionOps(val self: FailedQueuedPurchaseDeletion) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorAsScala: Option[DeleteQueuedReservedInstancesError] = Option(self.error)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFailedQueuedPurchaseDeletionOps {

  implicit def toFailedQueuedPurchaseDeletionBuilderOps(
      v: FailedQueuedPurchaseDeletion.Builder
  ): FailedQueuedPurchaseDeletionBuilderOps = new FailedQueuedPurchaseDeletionBuilderOps(v)

  implicit def toFailedQueuedPurchaseDeletionOps(v: FailedQueuedPurchaseDeletion): FailedQueuedPurchaseDeletionOps =
    new FailedQueuedPurchaseDeletionOps(v)

}
