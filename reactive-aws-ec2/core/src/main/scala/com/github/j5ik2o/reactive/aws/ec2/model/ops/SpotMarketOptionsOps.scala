// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotMarketOptionsBuilderOps(val self: SpotMarketOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxPriceAsScala(value: Option[String]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.maxPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceTypeAsScala(value: Option[SpotInstanceType]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.spotInstanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDurationMinutesAsScala(value: Option[Int]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.blockDurationMinutes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validUntilAsScala(value: Option[java.time.Instant]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

}

final class SpotMarketOptionsOps(val self: SpotMarketOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxPriceAsScala: Option[String] = Option(self.maxPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceTypeAsScala: Option[SpotInstanceType] = Option(self.spotInstanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotMarketOptionsOps {

  implicit def toSpotMarketOptionsBuilderOps(v: SpotMarketOptions.Builder): SpotMarketOptionsBuilderOps =
    new SpotMarketOptionsBuilderOps(v)

  implicit def toSpotMarketOptionsOps(v: SpotMarketOptions): SpotMarketOptionsOps = new SpotMarketOptionsOps(v)

}
