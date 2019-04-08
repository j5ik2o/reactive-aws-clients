// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ReservedElasticsearchInstanceOfferingBuilderOps(val self: ReservedElasticsearchInstanceOffering.Builder)
    extends AnyVal {

  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  }

  final def elasticsearchInstanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceType(v)
    }
  }

  final def durationAsScala(value: Option[Int]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def fixedPriceAsScala(value: Option[Double]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  final def usagePriceAsScala(value: Option[Double]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  final def currencyCodeAsScala(value: Option[String]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def paymentOptionAsScala(
      value: Option[ReservedElasticsearchInstancePaymentOption]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  final def recurringChargesAsScala(
      value: Option[Seq[RecurringCharge]]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.recurringCharges(v.asJava)
    }
  }

}

final class ReservedElasticsearchInstanceOfferingOps(val self: ReservedElasticsearchInstanceOffering) extends AnyVal {

  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId)

  final def elasticsearchInstanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.elasticsearchInstanceType)

  final def durationAsScala: Option[Int] = Option(self.duration)

  final def fixedPriceAsScala: Option[Double] = Option(self.fixedPrice)

  final def usagePriceAsScala: Option[Double] = Option(self.usagePrice)

  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode)

  final def paymentOptionAsScala: Option[ReservedElasticsearchInstancePaymentOption] = Option(self.paymentOption)

  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedElasticsearchInstanceOfferingOps {

  implicit def toReservedElasticsearchInstanceOfferingBuilderOps(
      v: ReservedElasticsearchInstanceOffering.Builder
  ): ReservedElasticsearchInstanceOfferingBuilderOps = new ReservedElasticsearchInstanceOfferingBuilderOps(v)

  implicit def toReservedElasticsearchInstanceOfferingOps(
      v: ReservedElasticsearchInstanceOffering
  ): ReservedElasticsearchInstanceOfferingOps = new ReservedElasticsearchInstanceOfferingOps(v)

}
