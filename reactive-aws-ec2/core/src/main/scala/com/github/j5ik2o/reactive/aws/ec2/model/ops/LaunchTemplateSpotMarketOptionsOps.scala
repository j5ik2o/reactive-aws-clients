// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateSpotMarketOptionsBuilderOps(val self: LaunchTemplateSpotMarketOptions.Builder)
    extends AnyVal {

  final def maxPriceAsScala(value: Option[String]): LaunchTemplateSpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.maxPrice(v)
    }
  }

  final def spotInstanceTypeAsScala(value: Option[SpotInstanceType]): LaunchTemplateSpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.spotInstanceType(v)
    }
  }

  final def blockDurationMinutesAsScala(value: Option[Int]): LaunchTemplateSpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.blockDurationMinutes(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): LaunchTemplateSpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): LaunchTemplateSpotMarketOptions.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

}

final class LaunchTemplateSpotMarketOptionsOps(val self: LaunchTemplateSpotMarketOptions) extends AnyVal {

  final def maxPriceAsScala: Option[String] = Option(self.maxPrice)

  final def spotInstanceTypeAsScala: Option[SpotInstanceType] = Option(self.spotInstanceType)

  final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateSpotMarketOptionsOps {

  implicit def toLaunchTemplateSpotMarketOptionsBuilderOps(
      v: LaunchTemplateSpotMarketOptions.Builder
  ): LaunchTemplateSpotMarketOptionsBuilderOps = new LaunchTemplateSpotMarketOptionsBuilderOps(v)

  implicit def toLaunchTemplateSpotMarketOptionsOps(
      v: LaunchTemplateSpotMarketOptions
  ): LaunchTemplateSpotMarketOptionsOps = new LaunchTemplateSpotMarketOptionsOps(v)

}
