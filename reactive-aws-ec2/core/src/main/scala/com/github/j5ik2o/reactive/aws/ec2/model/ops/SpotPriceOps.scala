// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotPriceBuilderOps(val self: SpotPrice.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def productDescriptionAsScala(value: Option[RIProductDescription]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  final def spotPriceAsScala(value: Option[String]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class SpotPriceOps(val self: SpotPrice) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotPriceOps {

  implicit def toSpotPriceBuilderOps(v: SpotPrice.Builder): SpotPriceBuilderOps = new SpotPriceBuilderOps(v)

  implicit def toSpotPriceOps(v: SpotPrice): SpotPriceOps = new SpotPriceOps(v)

}
