// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseReservedInstancesOfferingRequestBuilderOps(
    val self: PurchaseReservedInstancesOfferingRequest.Builder
) extends AnyVal {

  final def instanceCountAsScala(value: Option[Int]): PurchaseReservedInstancesOfferingRequest.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def reservedInstancesOfferingIdAsScala(
      value: Option[String]
  ): PurchaseReservedInstancesOfferingRequest.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesOfferingId(v)
    }
  }

  final def limitPriceAsScala(
      value: Option[ReservedInstanceLimitPrice]
  ): PurchaseReservedInstancesOfferingRequest.Builder = {
    value.fold(self) { v =>
      self.limitPrice(v)
    }
  }

}

final class PurchaseReservedInstancesOfferingRequestOps(val self: PurchaseReservedInstancesOfferingRequest)
    extends AnyVal {

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def reservedInstancesOfferingIdAsScala: Option[String] = Option(self.reservedInstancesOfferingId)

  final def limitPriceAsScala: Option[ReservedInstanceLimitPrice] = Option(self.limitPrice)

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
