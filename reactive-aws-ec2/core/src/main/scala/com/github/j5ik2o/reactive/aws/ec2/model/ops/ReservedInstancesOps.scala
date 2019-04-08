// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesBuilderOps(val self: ReservedInstances.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def durationAsScala(value: Option[Long]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def endAsScala(value: Option[java.time.Instant]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.end(v)
    }
  }

  final def fixedPriceAsScala(value: Option[Float]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.fixedPrice(v)
    }
  }

  final def instanceCountAsScala(value: Option[Int]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def productDescriptionAsScala(value: Option[RIProductDescription]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  final def reservedInstancesIdAsScala(value: Option[String]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesId(v)
    }
  }

  final def startAsScala(value: Option[java.time.Instant]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.start(v)
    }
  }

  final def stateAsScala(value: Option[ReservedInstanceState]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def usagePriceAsScala(value: Option[Float]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.usagePrice(v)
    }
  }

  final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.currencyCode(v)
    }
  }

  final def instanceTenancyAsScala(value: Option[Tenancy]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

  final def offeringClassAsScala(value: Option[OfferingClassType]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.offeringClass(v)
    }
  }

  final def offeringTypeAsScala(value: Option[OfferingTypeValues]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.offeringType(v)
    }
  }

  final def recurringChargesAsScala(value: Option[Seq[RecurringCharge]]): ReservedInstances.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.recurringCharges(v.asJava)
    }
  }

  final def scopeAsScala(value: Option[Scope]): ReservedInstances.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): ReservedInstances.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ReservedInstancesOps(val self: ReservedInstances) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def durationAsScala: Option[Long] = Option(self.duration)

  final def endAsScala: Option[java.time.Instant] = Option(self.end)

  final def fixedPriceAsScala: Option[Float] = Option(self.fixedPrice)

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

  final def startAsScala: Option[java.time.Instant] = Option(self.start)

  final def stateAsScala: Option[ReservedInstanceState] = Option(self.state)

  final def usagePriceAsScala: Option[Float] = Option(self.usagePrice)

  final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode)

  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  final def offeringTypeAsScala: Option[OfferingTypeValues] = Option(self.offeringType)

  final def recurringChargesAsScala: Option[Seq[RecurringCharge]] = Option(self.recurringCharges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def scopeAsScala: Option[Scope] = Option(self.scope)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesOps {

  implicit def toReservedInstancesBuilderOps(v: ReservedInstances.Builder): ReservedInstancesBuilderOps =
    new ReservedInstancesBuilderOps(v)

  implicit def toReservedInstancesOps(v: ReservedInstances): ReservedInstancesOps = new ReservedInstancesOps(v)

}
