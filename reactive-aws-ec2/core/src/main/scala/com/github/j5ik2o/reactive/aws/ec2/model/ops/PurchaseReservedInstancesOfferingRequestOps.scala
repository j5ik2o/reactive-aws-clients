// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseReservedInstancesOfferingRequestBuilderOps(
    val self: PurchaseReservedInstancesOfferingRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): PurchaseReservedInstancesOfferingRequest.Builder = {
    value.fold(self) { v => self.instanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingIdAsScala(
      value: Option[String]
  ): PurchaseReservedInstancesOfferingRequest.Builder = {
    value.fold(self) { v => self.reservedInstancesOfferingId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitPriceAsScala(
      value: Option[ReservedInstanceLimitPrice]
  ): PurchaseReservedInstancesOfferingRequest.Builder = {
    value.fold(self) { v => self.limitPrice(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseTimeAsScala(value: Option[java.time.Instant]): PurchaseReservedInstancesOfferingRequest.Builder = {
    value.fold(self) { v => self.purchaseTime(v) }
  }

}

final class PurchaseReservedInstancesOfferingRequestOps(val self: PurchaseReservedInstancesOfferingRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingIdAsScala: Option[String] = Option(self.reservedInstancesOfferingId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitPriceAsScala: Option[ReservedInstanceLimitPrice] = Option(self.limitPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseTimeAsScala: Option[java.time.Instant] = Option(self.purchaseTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseReservedInstancesOfferingRequestOps {

  implicit def toPurchaseReservedInstancesOfferingRequestBuilderOps(
      v: PurchaseReservedInstancesOfferingRequest.Builder
  ): PurchaseReservedInstancesOfferingRequestBuilderOps = new PurchaseReservedInstancesOfferingRequestBuilderOps(v)

  implicit def toPurchaseReservedInstancesOfferingRequestOps(
      v: PurchaseReservedInstancesOfferingRequest
  ): PurchaseReservedInstancesOfferingRequestOps = new PurchaseReservedInstancesOfferingRequestOps(v)

}
