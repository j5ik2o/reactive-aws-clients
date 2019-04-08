// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ReservedElasticsearchInstanceBuilderOps(val self: ReservedElasticsearchInstance.Builder) extends AnyVal {

  final def reservationNameAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservationName(v)
    }
  } // String

  final def reservedElasticsearchInstanceIdAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceId(v)
    }
  } // String

  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  } // String

  final def elasticsearchInstanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceType(v)
    }
  } // String

  final def startTimeAsScala(value: Option[java.time.Instant]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // Instant

  final def durationAsScala(value: Option[Int]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  } // Int

  final def fixedPriceAsScala(value: Option[Double]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  } // Double

  final def usagePriceAsScala(value: Option[Double]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  } // Double

  final def currencyCodeAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  } // String

  final def elasticsearchInstanceCountAsScala(value: Option[Int]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceCount(v)
    }
  } // Int

  final def stateAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def paymentOptionAsScala(
      value: Option[ReservedElasticsearchInstancePaymentOption]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  } // String

  final def recurringChargesAsScala(value: Option[Seq[RecurringCharge]]): ReservedElasticsearchInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.recurringCharges(v.asJava)
    } // Seq[RecurringCharge]
  }

}

final class ReservedElasticsearchInstanceOps(val self: ReservedElasticsearchInstance) extends AnyVal {

  final def reservationNameAsScala: Option[String] = Option(self.reservationName) // String

  final def reservedElasticsearchInstanceIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceId) // String

  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId) // String

  final def elasticsearchInstanceTypeAsScala: Option[ESPartitionInstanceType] =
    Option(self.elasticsearchInstanceType) // String

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime) // Instant

  final def durationAsScala: Option[Int] = Option(self.duration) // Int

  final def fixedPriceAsScala: Option[Double] = Option(self.fixedPrice) // Double

  final def usagePriceAsScala: Option[Double] = Option(self.usagePrice) // Double

  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode) // String

  final def elasticsearchInstanceCountAsScala: Option[Int] = Option(self.elasticsearchInstanceCount) // Int

  final def stateAsScala: Option[String] = Option(self.state) // String

  final def paymentOptionAsScala: Option[ReservedElasticsearchInstancePaymentOption] =
    Option(self.paymentOption) // String

  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[RecurringCharge]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedElasticsearchInstanceOps {

  implicit def toReservedElasticsearchInstanceBuilderOps(
      v: ReservedElasticsearchInstance.Builder
  ): ReservedElasticsearchInstanceBuilderOps = new ReservedElasticsearchInstanceBuilderOps(v)

  implicit def toReservedElasticsearchInstanceOps(v: ReservedElasticsearchInstance): ReservedElasticsearchInstanceOps =
    new ReservedElasticsearchInstanceOps(v)

}
