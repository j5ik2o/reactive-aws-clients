// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ReservedElasticsearchInstanceBuilderOps(val self: ReservedElasticsearchInstance.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationNameAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceIdAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala(
      value: Option[String]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.reservedElasticsearchInstanceOfferingId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceTypeAsScala(
      value: Option[ESPartitionInstanceType]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala(value: Option[Int]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala(value: Option[Double]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala(value: Option[Double]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceCountAsScala(value: Option[Int]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.elasticsearchInstanceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala(
      value: Option[ReservedElasticsearchInstancePaymentOption]
  ): ReservedElasticsearchInstance.Builder = {
    value.fold(self) { v =>
      self.paymentOption(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala(value: Option[Seq[RecurringCharge]]): ReservedElasticsearchInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.recurringCharges(v.asJava)
    }
  }

}

final class ReservedElasticsearchInstanceOps(val self: ReservedElasticsearchInstance) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservationNameAsScala: Option[String] = Option(self.reservationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceIdAsScala: Option[String] = Option(self.reservedElasticsearchInstanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedElasticsearchInstanceOfferingIdAsScala: Option[String] =
    Option(self.reservedElasticsearchInstanceOfferingId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceTypeAsScala: Option[ESPartitionInstanceType] = Option(self.elasticsearchInstanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala: Option[Int] = Option(self.duration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala: Option[Double] = Option(self.fixedPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala: Option[Double] = Option(self.usagePrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[String] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchInstanceCountAsScala: Option[Int] = Option(self.elasticsearchInstanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def paymentOptionAsScala: Option[ReservedElasticsearchInstancePaymentOption] = Option(self.paymentOption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
