// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesBuilderOps(val self: ReservedInstances.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala(value: Option[Long]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endAsScala(value: Option[java.time.Instant]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.end(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala(value: Option[Float]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala(value: Option[RIProductDescription]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala(value: Option[String]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAsScala(value: Option[java.time.Instant]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.start(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[ReservedInstanceState]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala(value: Option[Float]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala(value: Option[Tenancy]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala(value: Option[OfferingClassType]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.offeringClass(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringTypeAsScala(value: Option[OfferingTypeValues]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.offeringType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala(value: Option[Seq[RecurringCharge]]): ReservedInstances.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.recurringCharges(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala(value: Option[Scope]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ReservedInstances.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class ReservedInstancesOps(val self: ReservedInstances) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala: Option[Long] = Option(self.duration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endAsScala: Option[java.time.Instant] = Option(self.end)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fixedPriceAsScala: Option[Float] = Option(self.fixedPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAsScala: Option[java.time.Instant] = Option(self.start)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[ReservedInstanceState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usagePriceAsScala: Option[Float] = Option(self.usagePrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringTypeAsScala: Option[OfferingTypeValues] = Option(self.offeringType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala: Option[Scope] = Option(self.scope)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesOps {

  implicit def toReservedInstancesBuilderOps(v: ReservedInstances.Builder): ReservedInstancesBuilderOps =
    new ReservedInstancesBuilderOps(v)

  implicit def toReservedInstancesOps(v: ReservedInstances): ReservedInstancesOps = new ReservedInstancesOps(v)

}
