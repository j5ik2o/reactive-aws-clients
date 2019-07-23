// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ReservedElasticsearchInstanceOfferingBuilderOps(val self: ReservedElasticsearchInstanceOffering.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala(value: Option[Int]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala(value: Option[Double]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala(value: Option[Double]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[String]): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala(
      value: Option[ReservedElasticsearchInstancePaymentOption]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala(
      value: Option[Seq[RecurringCharge]]
  ): ReservedElasticsearchInstanceOffering.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.recurringCharges(v.asJava)
    }
  }

}

final class ReservedElasticsearchInstanceOfferingOps(val self: ReservedElasticsearchInstanceOffering) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.elasticsearchInstanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala: Option[Int] = Option(self.duration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala: Option[Double] = Option(self.fixedPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala: Option[Double] = Option(self.usagePrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala: Option[ReservedElasticsearchInstancePaymentOption] = Option(self.paymentOption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
