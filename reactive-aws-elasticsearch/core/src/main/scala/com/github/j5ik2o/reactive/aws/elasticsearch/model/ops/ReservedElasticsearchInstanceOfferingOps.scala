// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ReservedElasticsearchInstanceOfferingBuilderOps(val self: ReservedElasticsearchInstanceOffering.Builder)
    extends AnyVal {

  final def withReservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  } // String

  final def withElasticsearchInstanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceType(v)
    }
  } // String

  final def withDurationAsScala(value: Option[Int]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  } // Int

  final def withFixedPriceAsScala(value: Option[Double]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  } // Double

  final def withUsagePriceAsScala(value: Option[Double]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  } // Double

  final def withCurrencyCodeAsScala(value: Option[String]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  } // String

  final def withPaymentOptionAsScala(
      value: Option[ReservedElasticsearchInstancePaymentOption]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  } // String

  final def withRecurringChargesAsScala(
      value: Option[Seq[RecurringCharge]]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.recurringCharges(v.asJava)
    } // Seq[RecurringCharge]
  }

}

final class ReservedElasticsearchInstanceOfferingOps(val self: ReservedElasticsearchInstanceOffering) extends AnyVal {

  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId) // String

  final def elasticsearchInstanceTypeAsScala: Option[ESPartitionInstanceType] =
    Option(self.elasticsearchInstanceType) // String

  final def durationAsScala: Option[Int] = Option(self.duration) // Int

  final def fixedPriceAsScala: Option[Double] = Option(self.fixedPrice) // Double

  final def usagePriceAsScala: Option[Double] = Option(self.usagePrice) // Double

  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode) // String

  final def paymentOptionAsScala: Option[ReservedElasticsearchInstancePaymentOption] =
    Option(self.paymentOption) // String

  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[RecurringCharge]

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
