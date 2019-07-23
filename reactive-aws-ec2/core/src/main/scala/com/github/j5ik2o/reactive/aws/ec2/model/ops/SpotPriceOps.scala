// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotPriceBuilderOps(val self: SpotPrice.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala(value: Option[RIProductDescription]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala(value: Option[String]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): SpotPrice.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class SpotPriceOps(val self: SpotPrice) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotPriceOps {

  implicit def toSpotPriceBuilderOps(v: SpotPrice.Builder): SpotPriceBuilderOps = new SpotPriceBuilderOps(v)

  implicit def toSpotPriceOps(v: SpotPrice): SpotPriceOps = new SpotPriceOps(v)

}
