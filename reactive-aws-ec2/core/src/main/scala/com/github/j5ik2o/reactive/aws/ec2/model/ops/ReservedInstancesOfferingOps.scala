// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesOfferingBuilderOps(val self: ReservedInstancesOffering.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala(value: Option[Long]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala(value: Option[Float]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala(value: Option[RIProductDescription]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingIdAsScala(value: Option[String]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesOfferingId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala(value: Option[Float]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala(value: Option[Tenancy]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def marketplaceAsScala(value: Option[Boolean]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.marketplace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala(value: Option[OfferingClassType]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.offeringClass(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringTypeAsScala(value: Option[OfferingTypeValues]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.offeringType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pricingDetailsAsScala(value: Option[Seq[PricingDetail]]): ReservedInstancesOffering.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.pricingDetails(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala(value: Option[Seq[RecurringCharge]]): ReservedInstancesOffering.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.recurringCharges(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala(value: Option[Scope]): ReservedInstancesOffering.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

}

final class ReservedInstancesOfferingOps(val self: ReservedInstancesOffering) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala: Option[Long] = Option(self.duration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala: Option[Float] = Option(self.fixedPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingIdAsScala: Option[String] = Option(self.reservedInstancesOfferingId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala: Option[Float] = Option(self.usagePrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def marketplaceAsScala: Option[Boolean] = Option(self.marketplace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringTypeAsScala: Option[OfferingTypeValues] = Option(self.offeringType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pricingDetailsAsScala: Option[Seq[PricingDetail]] = Option(self.pricingDetails).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
