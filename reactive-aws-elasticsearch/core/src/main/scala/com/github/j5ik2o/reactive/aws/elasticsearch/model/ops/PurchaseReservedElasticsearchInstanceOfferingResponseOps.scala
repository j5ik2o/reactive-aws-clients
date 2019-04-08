// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class PurchaseReservedElasticsearchInstanceOfferingResponseBuilderOps(
    val self: PurchaseReservedElasticsearchInstanceOfferingResponse.Builder
) extends AnyVal {

  final def reservedElasticsearchInstanceIdAsScala(
      value: Option[String]
  ): PurchaseReservedElasticsearchInstanceOfferingResponse.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceId(v)
    }
  }

  final def reservationNameAsScala(
      value: Option[String]
  ): PurchaseReservedElasticsearchInstanceOfferingResponse.Builder = {
    value.fold(self) { v =>
      self.reservationName(v)
    }
  }

}

final class PurchaseReservedElasticsearchInstanceOfferingResponseOps(
    val self: PurchaseReservedElasticsearchInstanceOfferingResponse
) extends AnyVal {

  final def reservedElasticsearchInstanceIdAsScala: Option[String] = Option(self.reservedElasticsearchInstanceId)

  final def reservationNameAsScala: Option[String] = Option(self.reservationName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseReservedElasticsearchInstanceOfferingResponseOps {

  implicit def toPurchaseReservedElasticsearchInstanceOfferingResponseBuilderOps(
      v: PurchaseReservedElasticsearchInstanceOfferingResponse.Builder
  ): PurchaseReservedElasticsearchInstanceOfferingResponseBuilderOps =
    new PurchaseReservedElasticsearchInstanceOfferingResponseBuilderOps(v)

  implicit def toPurchaseReservedElasticsearchInstanceOfferingResponseOps(
      v: PurchaseReservedElasticsearchInstanceOfferingResponse
  ): PurchaseReservedElasticsearchInstanceOfferingResponseOps =
    new PurchaseReservedElasticsearchInstanceOfferingResponseOps(v)

}
