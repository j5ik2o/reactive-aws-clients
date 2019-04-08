// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotMarketOptionsBuilderOps(val self: SpotMarketOptions.Builder) extends AnyVal {

  final def maxPriceAsScala(value: Option[String]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.maxPrice(v)
    }
  }

  final def spotInstanceTypeAsScala(value: Option[SpotInstanceType]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.spotInstanceType(v)
    }
  }

  final def blockDurationMinutesAsScala(value: Option[Int]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.blockDurationMinutes(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): SpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

}

final class SpotMarketOptionsOps(val self: SpotMarketOptions) extends AnyVal {

  final def maxPriceAsScala: Option[String] = Option(self.maxPrice)

  final def spotInstanceTypeAsScala: Option[SpotInstanceType] = Option(self.spotInstanceType)

  final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotMarketOptionsOps {

  implicit def toSpotMarketOptionsBuilderOps(v: SpotMarketOptions.Builder): SpotMarketOptionsBuilderOps =
    new SpotMarketOptionsBuilderOps(v)

  implicit def toSpotMarketOptionsOps(v: SpotMarketOptions): SpotMarketOptionsOps = new SpotMarketOptionsOps(v)

}
