// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class PurchaseReservedElasticsearchInstanceOfferingRequestBuilderOps(
    val self: PurchaseReservedElasticsearchInstanceOfferingRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): PurchaseReservedElasticsearchInstanceOfferingRequest.Builder = {
    value.fold(self) { v => self.reservedElasticsearchInstanceOfferingId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationNameAsScala(
      value: Option[String]
  ): PurchaseReservedElasticsearchInstanceOfferingRequest.Builder = {
    value.fold(self) { v => self.reservationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): PurchaseReservedElasticsearchInstanceOfferingRequest.Builder = {
    value.fold(self) { v => self.instanceCount(v) }
  }

}

final class PurchaseReservedElasticsearchInstanceOfferingRequestOps(
    val self: PurchaseReservedElasticsearchInstanceOfferingRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationNameAsScala: Option[String] = Option(self.reservationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseReservedElasticsearchInstanceOfferingRequestOps {

  implicit def toPurchaseReservedElasticsearchInstanceOfferingRequestBuilderOps(
      v: PurchaseReservedElasticsearchInstanceOfferingRequest.Builder
  ): PurchaseReservedElasticsearchInstanceOfferingRequestBuilderOps =
    new PurchaseReservedElasticsearchInstanceOfferingRequestBuilderOps(v)

  implicit def toPurchaseReservedElasticsearchInstanceOfferingRequestOps(
      v: PurchaseReservedElasticsearchInstanceOfferingRequest
  ): PurchaseReservedElasticsearchInstanceOfferingRequestOps =
    new PurchaseReservedElasticsearchInstanceOfferingRequestOps(v)

}
