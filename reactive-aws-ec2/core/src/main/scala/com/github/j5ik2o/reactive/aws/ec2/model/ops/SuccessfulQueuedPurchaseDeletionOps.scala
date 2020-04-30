// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SuccessfulQueuedPurchaseDeletionBuilderOps(val self: SuccessfulQueuedPurchaseDeletion.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservedInstancesIdAsScala(value: Option[String]): SuccessfulQueuedPurchaseDeletion.Builder = {
            value.fold(self){ v => self.reservedInstancesId(v) }
            } 


}

final class SuccessfulQueuedPurchaseDeletionOps(val self: SuccessfulQueuedPurchaseDeletion) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSuccessfulQueuedPurchaseDeletionOps {

implicit def toSuccessfulQueuedPurchaseDeletionBuilderOps(v: SuccessfulQueuedPurchaseDeletion.Builder): SuccessfulQueuedPurchaseDeletionBuilderOps = new SuccessfulQueuedPurchaseDeletionBuilderOps(v)

implicit def toSuccessfulQueuedPurchaseDeletionOps(v: SuccessfulQueuedPurchaseDeletion): SuccessfulQueuedPurchaseDeletionOps = new SuccessfulQueuedPurchaseDeletionOps(v)

}

