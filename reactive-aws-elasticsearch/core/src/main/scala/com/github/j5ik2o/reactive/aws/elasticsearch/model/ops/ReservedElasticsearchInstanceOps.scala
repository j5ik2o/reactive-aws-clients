// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ReservedElasticsearchInstanceBuilderOps(val self: ReservedElasticsearchInstance.Builder) extends AnyVal {

  final def reservationNameAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservationName(v)
    }
  }

  final def reservedElasticsearchInstanceIdAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceId(v)
    }
  }

  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  }

  final def elasticsearchInstanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceType(v)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def durationAsScala(value: Option[Int]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def fixedPriceAsScala(value: Option[Double]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  final def usagePriceAsScala(value: Option[Double]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  final def currencyCodeAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def elasticsearchInstanceCountAsScala(value: Option[Int]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceCount(v)
    }
  }

  final def stateAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def paymentOptionAsScala(
      value: Option[ReservedElasticsearchInstancePaymentOption]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  final def recurringChargesAsScala(value: Option[Seq[RecurringCharge]]): ReservedElasticsearchInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.recurringCharges(v.asJava)
    }
  }

}

final class ReservedElasticsearchInstanceOps(val self: ReservedElasticsearchInstance) extends AnyVal {

  final def reservationNameAsScala: Option[String] = Option(self.reservationName)

  final def reservedElasticsearchInstanceIdAsScala: Option[String] = Option(self.reservedElasticsearchInstanceId)

  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId)

  final def elasticsearchInstanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.elasticsearchInstanceType)

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  final def durationAsScala: Option[Int] = Option(self.duration)

  final def fixedPriceAsScala: Option[Double] = Option(self.fixedPrice)

  final def usagePriceAsScala: Option[Double] = Option(self.usagePrice)

  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode)

  final def elasticsearchInstanceCountAsScala: Option[Int] = Option(self.elasticsearchInstanceCount)

  final def stateAsScala: Option[String] = Option(self.state)

  final def paymentOptionAsScala: Option[ReservedElasticsearchInstancePaymentOption] = Option(self.paymentOption)

  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedElasticsearchInstanceOps {

  implicit def toReservedElasticsearchInstanceBuilderOps(
      v: ReservedElasticsearchInstance.Builder
  ): ReservedElasticsearchInstanceBuilderOps = new ReservedElasticsearchInstanceBuilderOps(v)

  implicit def toReservedElasticsearchInstanceOps(v: ReservedElasticsearchInstance): ReservedElasticsearchInstanceOps =
    new ReservedElasticsearchInstanceOps(v)

}
