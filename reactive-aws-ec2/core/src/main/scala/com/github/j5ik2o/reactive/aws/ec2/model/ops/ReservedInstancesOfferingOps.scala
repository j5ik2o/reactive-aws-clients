// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesOfferingBuilderOps(val self: ReservedInstancesOffering.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def durationAsScala(value: Option[Long]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def fixedPriceAsScala(value: Option[Float]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def productDescriptionAsScala(value: Option[RIProductDescription]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  final def reservedInstancesOfferingIdAsScala(value: Option[String]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesOfferingId(v)
    }
  }

  final def usagePriceAsScala(value: Option[Float]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def instanceTenancyAsScala(value: Option[Tenancy]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

  final def marketplaceAsScala(value: Option[Boolean]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.marketplace(v)
    }
  }

  final def offeringClassAsScala(value: Option[OfferingClassType]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.offeringClass(v)
    }
  }

  final def offeringTypeAsScala(value: Option[OfferingTypeValues]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.offeringType(v)
    }
  }

  final def pricingDetailsAsScala(value: Option[Seq[PricingDetail]]): ReservedInstancesOffering.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.pricingDetails(v.asJava)
    }
  }

  final def recurringChargesAsScala(value: Option[Seq[RecurringCharge]]): ReservedInstancesOffering.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.recurringCharges(v.asJava)
    }
  }

  final def scopeAsScala(value: Option[Scope]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

}

final class ReservedInstancesOfferingOps(val self: ReservedInstancesOffering) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def durationAsScala: Option[Long] = Option(self.duration)

  final def fixedPriceAsScala: Option[Float] = Option(self.fixedPrice)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  final def reservedInstancesOfferingIdAsScala: Option[String] = Option(self.reservedInstancesOfferingId)

  final def usagePriceAsScala: Option[Float] = Option(self.usagePrice)

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  final def marketplaceAsScala: Option[Boolean] = Option(self.marketplace)

  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  final def offeringTypeAsScala: Option[OfferingTypeValues] = Option(self.offeringType)

  final def pricingDetailsAsScala: Option[Seq[PricingDetail]] = Option(self.pricingDetails).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def scopeAsScala: Option[Scope] = Option(self.scope)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesOfferingOps {

  implicit def toReservedInstancesOfferingBuilderOps(
      v: ReservedInstancesOffering.Builder
  ): ReservedInstancesOfferingBuilderOps = new ReservedInstancesOfferingBuilderOps(v)

  implicit def toReservedInstancesOfferingOps(v: ReservedInstancesOffering): ReservedInstancesOfferingOps =
    new ReservedInstancesOfferingOps(v)

}
