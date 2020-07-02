// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseReservedInstancesOfferingResponseBuilderOps(
    val self: PurchaseReservedInstancesOfferingResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala(value: Option[String]): PurchaseReservedInstancesOfferingResponse.Builder = {
    value.fold(self) { v => self.reservedInstancesId(v) }
  }

}

final class PurchaseReservedInstancesOfferingResponseOps(val self: PurchaseReservedInstancesOfferingResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseReservedInstancesOfferingResponseOps {

  implicit def toPurchaseReservedInstancesOfferingResponseBuilderOps(
      v: PurchaseReservedInstancesOfferingResponse.Builder
  ): PurchaseReservedInstancesOfferingResponseBuilderOps = new PurchaseReservedInstancesOfferingResponseBuilderOps(v)

  implicit def toPurchaseReservedInstancesOfferingResponseOps(
      v: PurchaseReservedInstancesOfferingResponse
  ): PurchaseReservedInstancesOfferingResponseOps = new PurchaseReservedInstancesOfferingResponseOps(v)

}
